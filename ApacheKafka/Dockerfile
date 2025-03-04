# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from target/ directory
COPY ApacheKafka/target/ApacheKafka-0.0.1-SNAPSHOT.jar /app/ApacheKafka.jar

# Expose the application port
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "ApacheKafka.jar"]