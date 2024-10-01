FROM gradle:jdk21 AS build
WORKDIR /app
COPY . .
ENTRYPOINT ["./gradlew", "build"]

FROM openjdk:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar /app/service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/service.jar"]