docker build -t mysql_image .
docker run -i -d -p 3307:3306 --name mysql_container mysql_image mysqld --character-set-server=utf8 --collation-server=utf8_general_ci

docker run -i -d -p 3308:3306 --name mysql_container2 mysql_image mysqld --character-set-server=utf8 --collation-server=utf8_general_ci