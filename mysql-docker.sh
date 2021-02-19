docker pull mysql
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=qq --name mysql mysql:latest
sleep 5
docker exec -it mysql bash

#mysql -u root -pqq
#create database hoonick
