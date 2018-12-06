# Blog [![Build Status](https://travis-ci.org/daggerok/java-ee-microservices.svg?branch=master)](https://travis-ci.org/daggerok/java-ee-microservices)
JavaEE microservices

```bash
./mvnw clean ; ./mvnw ; ./mvnw -pl :parent -Pup ; docker-compose logs -ft
http :8080/blog/health
./mvnw -pl :parent -Pdown
```
