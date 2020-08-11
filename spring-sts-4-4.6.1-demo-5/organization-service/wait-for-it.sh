#!/bin/bash
while ! echo exit | nc $1 $2; do sleep 10; done
java -jar /app.jar
