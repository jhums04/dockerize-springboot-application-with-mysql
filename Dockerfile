#FROM openjdk:17-jdk
#WORKDIR /app
#COPY target/dockerize-springboot-with-mysql-0.0.1-SNAPSHOT.jar /app/dockerize-springboot-mysql.jar
#EXPOSE 8081
#CMD ["java", "-jar", "dockerize-springboot-mysql.jar"]

FROM openjdk:17-jdk

# Copy the JAR package into the image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the application port
EXPOSE 8080

# Run the App
ENTRYPOINT ["java", "-jar", "/app.jar"]