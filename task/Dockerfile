FROM openjdk:8-alpine
MAINTAINER "Nikita Krivitski" <hax2033@gmail.com>
ADD ./target/task-0.0.1-SNAPSHOT.jar /task.jar
RUN sh -c 'touch /task.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/task.jar"]
