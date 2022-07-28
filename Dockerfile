FROM openjdk
MAINTAINER Marconi
WORKDIR /app
COPY target/opuserp-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 61
ENTRYPOINT ["java", "-jar", "app.jar"]