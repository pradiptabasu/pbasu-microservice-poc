# docker build -f Dockerfile -t gateway-service .
# docker run -d -p 8060:8060 --name gateway-service gateway-service  

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
EXPOSE 8060
ENTRYPOINT ["./wait-for-it.sh", "organization-service", "8021"]
#ENTRYPOINT ["java","-jar","/app.jar"]
# Actuator health check
#HEALTHCHECK --interval=15m --timeout=10s --retries=3 --start-period=1m CMD curl --fail http://localhost:8080/restaurantscores/health || exit 1