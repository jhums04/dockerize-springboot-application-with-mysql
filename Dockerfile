FROM openjdk:17-jdk

RUN echo "Current directory: $(pwd)"

# Copy the JAR package into the image
COPY ./target/dockerize-springboot-with-mysql-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the App
ENTRYPOINT ["java", "-jar", "/app.jar"]