#FROM openjdk:17-jdk
#
## Copy the JAR package into the image
#COPY target/dockerize-springboot-with-mysql-0.0.1-SNAPSHOT.jar app.jar
#
## Expose the application port
#EXPOSE 8080
#
## Run the App
#ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR demo
COPY --from=build target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]