FROM openjdk:17-jdk
WORKDIR /app
COPY target/dockerize-springboot-with-mysql-0.0.1-SNAPSHOT.jar /app/springboot-app-with-mysql.jar
EXPOSE 8081
CMD ["java", "-jar", "dockerize-springboot-mysql.jar"]