# Sistema De Encuestas

 Sistema de encuestas es un microservicio desarrollado en java, que entrega y recibe encuestas, preguntas, respuestas y login de usuarios. La persistencia de los datos es con MySQL.
 
# Modo de ejecución:

Crear una base de datos en MySQL 8 llamada "encuestas"

En una consola de comandos, entrar al directorio donde se encuentra el proyecto.

En el directorio  \src\main\resources  modificar el archivo application.properties con su usuario y contraseña de la base de datos.

En la raiz principal del directorio del proyecto ejecutar $mvn clean install

Ejecutar  $java -jar target\sistemaDeEncuestas-0.0.1-SNAPSHOT.war

NOTA: en \src\main\resources se encuentra el archivo sistemaEncuestas.postman_collection.json que es el resultado de algunos de los tests realizados desde postman a los endopoints de la aplicación
