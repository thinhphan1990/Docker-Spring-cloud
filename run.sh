cd ./eureka-server/
 gradle clean build -x test

cd ..
cd ./service\ 1/
 gradle clean build -x test
cd ..

cd ./Service\ 2/
 gradle clean build -x test
cd ..

cd ./zuul/
gradle clean build -x test
cd ..

# cd ./Deploy/Docker-compose
docker-compose build
docker-compose up