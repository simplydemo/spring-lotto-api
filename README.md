# spring-lotto-api
Build the spring-lotto-api backend application with the spring-boot framework and deploy it to an ecs cluster using the github-actions workflow.

## Git
```
git clone https://github.com/chiwoo-samples/spring-lotto-router-handler.git

cd spring-lotto-router-handler

git config --local user.name <YOUR_NAME>
git config --local user.email <YOUR_EMAIL>
git config --local --list
```

## Generate Maven Wrapper
```
mvn -N io.takari:maven:wrapper
```


## Build
```
./mvnw clean package -DskipTests=true
```

## Run
```
./mvnw -DskipTests=true spring-boot:run
```

## Run with jar
```
java -jar target/spring-lotto-api.jar
```

## Build Image
```
docker build -t "symplesims/spring-lotto-api:1.0.0" -f ./cicd/docker/Dockerfile-local .
```

## Run Docker Container

```
# run
docker run -d --rm --name spring-lotto-api -p 8080:8080 symplesims/spring-lotto-api:1.0.0

# stop
docker stop spring-lotto-api
```

## Appendix

### health check

```
curl --location -X GET 'http://localhost:8080/actuator/health'
```

### generate lotto-645

```
curl --location -X GET 'http://localhost:8080/api/lotto/lucky' -H 'Content-Type: application/json'
```

