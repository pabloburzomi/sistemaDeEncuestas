# Sistema De Encuestas

 Sistema de encuestas es un microservicio desarrollado en java, que entrega y recibe encuestas, preguntas, respuestas y login de usuarios. La persistencia de los datos es con MySQL.
 
# Modo de ejecución:

Crear una base de datos en MySQL 8 llamada "encuestas"

En una consola de comandos, entrar al directorio donde se encuentra el proyecto.

En el directorio  \src\main\resources  modificar el archivo application.properties con su usuario y contraseña de la base de datos.

En la raiz principal del directorio del proyecto ejecutar $mvn clean install

Ejecutar  java -jar target\sistemaDeEncuestas-0.0.1-SNAPSHOT.war

# Lo más desafiante:

Considero que lo más desafiante fue el diseño del sistema, y el desarrollo de la seguridad para el login de usuarios.