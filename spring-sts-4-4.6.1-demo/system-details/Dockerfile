FROM openjdk:8-jdk-alpine
MAINTAINER pradipta.basu1@dxc.com
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS=""
EXPOSE 8080
#RUN 
ENTRYPOINT ["java","-jar","/app.jar"]
#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]