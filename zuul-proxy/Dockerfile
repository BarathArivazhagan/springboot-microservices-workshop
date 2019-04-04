FROM openjdk:8-jdk-alpine
ADD target/zuul-proxy-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]