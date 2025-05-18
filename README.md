# MinecraftRPC

MinecraftRPC is a modern plugin that enables efficient and type-safe communication with Minecraft servers using gRPC. It offers superior performance, real-time event streaming, and robust security features compared to traditional RCON connections.

## 🚀 Features

* **High Performance**: Utilizes gRPC's efficient protocol buffers and HTTP/2 for faster communication.
* **Type Safety**: Auto-generated client libraries ensure type safety across various programming languages.
* **Bidirectional Streaming**: Subscribe to server events in real-time, enabling responsive applications and dashboards.
* **Enhanced Security**: Built-in authentication and granular permission controls provide high-grade security for your Minecraft servers.

## ⚙️ Why Choose MinecraftRPC Over RCON?

| Feature                 | RCON      | MinecraftRPC                            |
| ----------------------- | --------- | --------------------------------------- |
| Bidirectional Streaming | ❌ No      | ✅ Yes                                   |
| Strong Type Safety      | ❌ No      | ✅ Yes                                   |
| Efficient Protocol      | ✅ TCP/IP  | ✅ HTTP/2 with Protocol Buffers          |
| Concurrent Requests     | ❌ No      | ✅ Yes                                   |
| Modern Authentication   | ❌ Basic   | ✅ JWT, OAuth, etc.                      |
| Error Handling          | ❌ Limited | ✅ Rich error handling with status codes |

## 🧩 Getting Started

1. **Install the Plugin**: Download and install the MinecraftRPC plugin on your Minecraft server.
2. **Configure Your Server**: Set up your gRPC endpoint and authentication options.
3. **Connect Client**: Use our auto-generated client libraries to connect and start sending commands and receiving events.

For detailed instructions, refer to the [documentation](https://minecraftrpc.yplugins.com/docs).

## 📦 Supported Platforms

* **Paper**: High-performance Spigot fork.
* **Spigot**: The most popular Minecraft plugin platform.

## 🛠️ Client Libraries

MinecraftRPC provides auto-generated client libraries for multiple languages, including:

* Java
* TypeScript
* Python
* C#

These libraries ensure type safety and offer comprehensive IDE support.

## 🤝 Contributing

MinecraftRPC is open-source and maintained by a passionate community of developers. We welcome contributions of all sizes:

* Submit bug reports and feature requests.
* Improve documentation and examples.
* Write code and fix bugs.
* Share your success stories.

For more details, visit our [GitHub repository](https://github.com/YPlugins/MinecraftRPC).

## 🌐 Join the Community

Engage with other developers and stay updated:

* [Discord Server](https://discord.gg/hKBHvxMt2S)
* [GitHub Discussions](https://github.com/YPlugins/MinecraftRPC/discussions)
