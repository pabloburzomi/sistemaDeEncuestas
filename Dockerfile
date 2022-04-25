FROM openjdk:8

COPY ./target/sistemaDeEncuestas-0.0.1-SNAPSHOT.war sistemaDeEncuestas-0.0.1-SNAPSHOT.war

CMD ["java","-jar","sistemaDeEncuestas-0.0.1-SNAPSHOT.war"]
