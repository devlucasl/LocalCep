#!/bin/bash
apt-get update && apt-get install -y maven
chmod +x mvnw
./mvnw clean package
chmod +x render-build.sh

