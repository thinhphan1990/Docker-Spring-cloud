# FROM gradle:jdk8-alpine as build

# USER 0
# WORKDIR /app


# COPY . .

# RUN chmod +x ./gradlew

# RUN gradle build

FROM openjdk:8-jre-alpine

WORKDIR /opt/

COPY ./build/libs/eureka-server-0.0.1-SNAPSHOT.jar /opt/eureka-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/eureka-server.jar"]
