FROM openjdk:8-jdk-alpine
VOLUME /tmp

ADD calc.jar calc.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/calc.jar"]