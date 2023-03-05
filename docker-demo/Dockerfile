FROM openjdk:17-jdk-slim-buster
VOLUME /tmp
COPY target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar
EXPOSE 8080
#ADD target/docker-demo.jar docker-demo.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /docker-demo.jar --debug
