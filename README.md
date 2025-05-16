# grpclib

A Spigot plugin library for integrating gRPC and Protocol Buffers into Minecraft server plugins.

## Features
- Provides gRPC server/client support for Spigot plugins
- Bundles all dependencies into a single shaded JAR for easy deployment
- Compatible with Java 21 and Spigot API 1.20.5

## Dependencies
- [Spigot API 1.20.5-R0.1-SNAPSHOT](https://hub.spigotmc.org/nexus/content/repositories/snapshots/)
- [gRPC (grpc-netty-shaded, grpc-protobuf, grpc-stub, grpc-services) 1.72.0](https://mvnrepository.com/artifact/io.grpc)
- [Google Protocol Buffers 4.30.2](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java)
- [Tomcat Annotations API 6.0.53](https://mvnrepository.com/artifact/org.apache.tomcat/annotations-api) (provided)

## Building
This project uses Maven for building and dependency management. To build the plugin, run:

```
powershell
mvn clean package
```

The shaded JAR will be generated at `target/grpclib-{VERSION}-SNAPSHOT-shaded.jar`.

## Usage
1. Place the shaded JAR in your Spigot server's `plugins` directory.
2. Configure your plugin as needed (see `plugin.yml`).
3. Use the provided gRPC and protobuf utilities in your plugin code.

## Project Structure
- `src/main/java/` - Java source code
- `src/main/resources/plugin.yml` - Spigot plugin descriptor
- `pom.xml` - Maven build configuration

## Main Class
The plugin's main class is `com.yplugins.GrpcLibPlugin.GrpcLib`.