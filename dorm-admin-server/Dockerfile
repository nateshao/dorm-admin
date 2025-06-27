# 后端Spring Boot Dockerfile
FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"] 