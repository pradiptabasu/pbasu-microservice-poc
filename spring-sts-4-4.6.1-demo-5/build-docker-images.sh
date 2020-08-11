#!/bin/bash
docker build -f /home/ubuntu/microservices/admin-server/Dockerfile -t admin-server /home/ubuntu/microservices/admin-server/
docker build -f /home/ubuntu/microservices/config-service/Dockerfile -t config-service /home/ubuntu/microservices/config-service/
docker build -f /home/ubuntu/microservices/department-service/Dockerfile -t department-service /home/ubuntu/microservices/department-service/
docker build -f /home/ubuntu/microservices/discovery-service/Dockerfile -t discovery-service /home/ubuntu/microservices/discovery-service/
docker build -f /home/ubuntu/microservices/employee-service/Dockerfile -t employee-service /home/ubuntu/microservices/employee-service/
docker build -f /home/ubuntu/microservices/gateway-service/Dockerfile -t gateway-service /home/ubuntu/microservices/gateway-service/
docker build -f /home/ubuntu/microservices/hystrix-server/Dockerfile -t hystrix-server /home/ubuntu/microservices/hystrix-server/
docker build -f /home/ubuntu/microservices/organization-service/Dockerfile -t organization-service /home/ubuntu/microservices/organization-service/
docker build -f /home/ubuntu/microservices/turbine-server/Dockerfile -t turbine-server /home/ubuntu/microservices/turbine-server/