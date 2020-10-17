FROM openjdk:8

COPY /demoretobcp-api/target/demoretobcp.jar /

WORKDIR /

EXPOSE 8080

CMD ["sh", "-c", "java -jar demoretobcp.jar"]
