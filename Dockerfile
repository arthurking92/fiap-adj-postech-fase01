# Build stage
FROM maven:3.9.8-eclipse-temurin-17 AS builder
WORKDIR /workspace
COPY pom.xml .
RUN mvn -q -e -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -e -DskipTests package

# Run stage
FROM eclipse-temurin:17-jre
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=70.0"
ENV SPRING_PROFILES_ACTIVE=prod
WORKDIR /app
COPY --from=builder /workspace/target/restaurantmanager-0.0.1-SNAPSHOT.jar app.jar
VOLUME ["/data"]
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]



