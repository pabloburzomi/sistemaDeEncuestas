docker run --name mysql-tpa \
e MYSQL_DATABASE=tpa \
e MYSQL_USER=pablo \
e MYSQL_PASSWORD=1234 \
d -p 3306:3306 mysql/mysql-server:8.0