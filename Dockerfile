FROM maven:3.8.3-openjdk:11-jdk-alpine AS build

COPY src /home/sistemaDeEncuestas/src

copy pom.xml /home/sistemaDeEncuestas

RUN mvn -f /home/sistemaDeEncuestas/pom.xml clean package


FROM openjdk:11-alpine

COPY --from=build "home/sistemaDeEncuestas/target/sistemaDeEncuestas-0.0.1-SNAPSHOT.war"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "\sistemaDeEncuestas-0.0.1-SNAPSHOT.war"]