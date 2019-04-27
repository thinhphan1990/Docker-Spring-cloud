### BUILD PROJECT ###
FROM gradle:jdk8-alpine as build

USER 0
WORKDIR /app


COPY . .

RUN chmod +x ./gradlew

RUN gradle build
### RUN APP ###
FROM openjdk:8-jre-alpine

WORKDIR /opt

COPY --from=build /app/build/libs/app*.jar /opt/app.jar

EXPOSE 9000
CMD	java -jar /opt/app.jar