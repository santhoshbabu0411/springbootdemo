#!/bin/bash

# Clean and package the Maven project
mvn clean package

# Copy the generated WAR and JAR files to a /test/ directory
cp -r target/*.war target/*.jar /test/ || true

# Retrieve the short commit hash using Git
get_id=$(git rev-parse --short HEAD)

# Store the commit hash in an environment variable
export GET_ID=$get_id
