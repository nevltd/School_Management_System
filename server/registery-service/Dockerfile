FROM openjdk:11-jdk

RUN mkdir /opt/app

COPY target/registry-service.jar /opt/app/

WORKDIR /opt/app
EXPOSE 81

ENTRYPOINT ["java", "-jar", "registry-service.jar"]
