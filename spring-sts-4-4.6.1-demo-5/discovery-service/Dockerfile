# docker build -f Dockerfile -t discovery-service .
# docker run -d -p 8061:8061 --name discovery-service discovery-service  

FROM openjdk:8-jdk-alpine
MAINTAINER pradipta.basu1@dxc.com
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#ARG DEPENDENCY=target/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh
RUN apk update && apk add bash
ENV JAVA_OPTS=""
#ENV PORT 8080
EXPOSE 8061
ENTRYPOINT ["./wait-for-it.sh", "config-service", "8088"]
#ENTRYPOINT ["./wait-for-it.sh", "config-service", "8088", "&&", "java", "-jar", "/app.jar"]
#ENTRYPOINT ["java","-jar","/app.jar"]
# Actuator health check
#HEALTHCHECK --interval=15m --timeout=10s --retries=3 --start-period=1m CMD curl --fail http://localhost:8080/restaurantscores/health || exit 1
