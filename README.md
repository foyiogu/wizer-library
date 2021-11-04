# Wizer Library
This is a simple REST API for a simple library.  The API shows CRUD operations between Book Category and the Books

Every book falls under a category

### Technologies
- Java
- Maven
- Springboot
- Swagger
- PostgreSQL
- Docker


### Requirements

You need the following to build and run the application:

- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven 3.8.1](https://maven.apache.org) (Optional as code already contains maven wrapper)
- [PostgreSQL](https://www.postgresql.org/download)

You could also run it on docker. Hence, it would require you to install [docker](https://www.docker.com/products/docker-desktop)

## How to run (with docker)
### step 1 - clone project with from [here](https://github.com/foyiogu/wizer-library.git)

```
git clone https://github.com/foyiogu/wizer-library.git
```


### step 2 - move into the project directory
```
cd wizer-library/
```

### step 3 - Generate the .jar file
```
mvn clean install 
OR
./mvnw clean install
```

### step 4 - run the project on docker
```
docker-compose up
OR
docker compose up
```

For ease of use and to test the functionality, I have made documents of the endpoints here 

### Full PostMan documentation can be found [here](https://documenter.getpostman.com/view/15910567/Tzz7PHri)

After running the Application, You can also see the documentation on swagger and test the end points

### Full Swagger documentation can be found [here](http://localhost:8080/swagger-ui/)
