package com.yplugins.minecraftrpc.rpc.interceptors;

import io.grpc.*;

/**
 * A gRPC {@link ServerInterceptor} implementation that enforces authentication
 * using a Bearer token provided in the "Authorization" metadata header.
 * <p>
 * This interceptor checks for the presence of the "Authorization" header,
 * validates that it starts with "Bearer ", and compares the extracted token
 * against a pre-configured valid token.
 * <p>
 * If the token is missing, malformed, or invalid, the call is closed with
 * {@link io.grpc.Status#UNAUTHENTICATED}. Otherwise, the call proceeds.
 * <p>
 * Note: Token validation is currently a simple string comparison. In the future,
 * JWT or other robust validation mechanisms should be implemented.
 *
 * @author YourName
 */
public class AuthInterceptor implements ServerInterceptor {

    private static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
    private final String validToken;

    public AuthInterceptor(String token) {
        this.validToken = token;
    }

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
        ServerCall<ReqT, RespT> call,
        Metadata headers,
        ServerCallHandler<ReqT, RespT> next) {

        String authHeader = headers.get(AUTHORIZATION_METADATA_KEY);
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            call.close(Status.UNAUTHENTICATED.withDescription("Missing or invalid Authorization header"), headers);
            return new ServerCall.Listener<ReqT>() {}; // no-op listener
        }

        String token = authHeader.substring("Bearer ".length());

        if (!isValidToken(token)) {
            call.close(Status.UNAUTHENTICATED.withDescription("Invalid token"), headers);
            return new ServerCall.Listener<ReqT>() {};
        }

        // Token is valid, proceed with the call
        return next.startCall(call, headers);
    }

    private boolean isValidToken(String token) {
        // In the future we should implement JWT token validation.
        return this.validToken.equals(token);
    }
}