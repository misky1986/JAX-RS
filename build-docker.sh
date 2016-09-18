#!/usr/bin/env bash
mvn clean install

#docker rmi $(docker images -q --filter "dangling=true")

docker build -t misky1986/restapi .
docker run -d -p 8080:8080 misky1986/restapi