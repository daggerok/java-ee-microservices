# Blog [![Build Status](https://travis-ci.org/daggerok/java-ee-microservices.svg?branch=master)](https://travis-ci.org/daggerok/java-ee-microservices)
JavaEE microservices

In progress: building blog applications..

```bash
./mvnw clean ; ./mvnw ; ./mvnw -pl :parent -Pup ; docker-compose logs -ft
http :8080/ui/health
./mvnw -pl :parent -Pdown
```
