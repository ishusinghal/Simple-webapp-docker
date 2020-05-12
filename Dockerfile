FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
ADD app.jar /opt/app/
EXPOSE 8080
ENTRYPOINT ["/lib/runtime/bin/java", "-jar", "/opt/app/app.jar"]
