# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the project's build artifact (JAR file) into the container
COPY target/eurekaServer-*.jar eurekaServer.jar

# Expose the port that the Eureka server will run on
EXPOSE 8781

# Command to run the application
ENTRYPOINT ["java", "-jar", "eurekaServer.jar"]