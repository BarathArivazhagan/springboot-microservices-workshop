FROM openjdk:8-jdk-alpine
ADD target/config-service-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]