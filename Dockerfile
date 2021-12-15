FROM openjdk:8-jdk-alpine

MAINTAINER pablo.perezburzomi@gmail.com

ARG JAR_FILE=target\*.war

COPY ${JAR_FILE} sistemaDeEncuestas-0.0.1-SNAPSHOT.war

ENTRYPOINT ["java", "-jar", "\sistemaDeEncuestas-0.0.1-SNAPSHOT.war"]