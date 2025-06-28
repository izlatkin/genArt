# genArt

![CI](https://github.com/izlatkin/genArt/actions/workflows/ci.yml/badge.svg)

# Build
```mvn clean package```


# Run 
`mvn spring-boot:run`
or
`java -jar target/genart-0.0.1-SNAPSHOT.jar`

# Endpoint(tmp)
`http://localhost:8081/hello`
expected response:
```json
{
  "message": "Hello, GenArt!"
}
```