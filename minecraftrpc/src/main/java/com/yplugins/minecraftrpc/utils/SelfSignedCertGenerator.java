package com.yplugins.minecraftrpc.utils;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

import java.security.cert.X509Certificate;

public class SelfSignedCertGenerator {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "BC");
        keyGen.initialize(2048, new SecureRandom());
        return keyGen.generateKeyPair();
    }

    public static X509Certificate generateSelfSignedCertificate(KeyPair keyPair) throws Exception {
        // Certificate details
        X500Name issuer = new X500Name("CN=MinecraftRPC, O=YPlugins, C=US");
        BigInteger serial = BigInteger.valueOf(new SecureRandom().nextInt() & 0x7fffffff);
        Date notBefore = new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
        Date notAfter = new Date(System.currentTimeMillis() + 365L * 24 * 60 * 60 * 1000); // valid 1 year
        X500Name subject = issuer;

        // Build the certificate
        JcaX509v3CertificateBuilder certBuilder = new JcaX509v3CertificateBuilder(
            issuer, serial, notBefore, notAfter, subject, keyPair.getPublic());

        // Sign with SHA256withRSA
        ContentSigner signer = new JcaContentSignerBuilder("SHA256withRSA").setProvider("BC").build(keyPair.getPrivate());

        X509CertificateHolder certHolder = certBuilder.build(signer);

        // Convert to X509Certificate object
        X509Certificate cert = new JcaX509CertificateConverter().setProvider("BC").getCertificate(certHolder);

        cert.checkValidity(new Date());
        cert.verify(keyPair.getPublic());

        return cert;
    }
}