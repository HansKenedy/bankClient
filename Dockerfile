FROM openjdk:19
VOLUME /tmp
EXPOSE 9043
ADD ./target/client-0.0.1-SNAPSHOT-exec.jar ms-client.jar
ENTRYPOINT ["java","-jar","ms-client.jar"]