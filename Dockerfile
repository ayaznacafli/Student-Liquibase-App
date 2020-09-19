FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/demo-1.0.1b1a048.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/demo-1.0.1b1a048.jar"]
