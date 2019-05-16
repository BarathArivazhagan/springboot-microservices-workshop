#!/bin/bash

echo "BUILD EUREKA SERVER"

cd eureka-server
mvn clean install -DskipTests

echo "BUILD EUREKA SERVER SUCCESSFUL"

cd ../

echo "BUILD EUREKA CLIENT APP1 SERVICE"

cd eureka-client-app1
mvn clean install -DskipTests

echo "BUILD EUREKA CLIENT APP1 SERVICE SUCCESSFUL"


cd ../

echo "BUILD EUREKA CLIENT APP2 SERVICE"

cd eureka-client-app2
mvn clean install -DskipTests

echo "BUILD EUREKA CLIENT APP2 SERVICE SUCCESSFUL"

cd ../

echo "BUILD ZUUL PROXY"

cd zuul-proxy
mvn clean install -DskipTests

echo "BUILD ZUUL PROXY SUCCESSFUL"

cd ../

echo "BUILD CONFIG SERVER"

cd config-server
npm install
npm run build

echo "BUILD CONFIG SERVER SUCCESSFUL"