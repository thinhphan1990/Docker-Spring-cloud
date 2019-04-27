# Docker-Spring-cloud




![alt text](/IMG/Diagram.png)


---------
Run the demo 

open the terminal and run the statement below:

git clone https://github.com/thinhphan1990/Docker-Spring-cloud.git

cd Docker-Spring-cloud

Docker-compose up 

	

http://localhost:8761/ => eureka service

http://localhost:8080/ => zull

use postman call the api below: 
------------

call client => AIP zull  => service 1

http://localhost:8080/service1/hello-world

call client => AIP zull  => service 2

http://localhost:8080/service2/hello-world


