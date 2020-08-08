FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/app.jar"]
