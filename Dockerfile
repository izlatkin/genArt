# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Define build argument for build type
ARG BUILD_TYPE=regular

# Copy the appropriate JAR file based on the build type
COPY target/genart-${BUILD_TYPE}.jar app.jar

# Expose the application's port
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]