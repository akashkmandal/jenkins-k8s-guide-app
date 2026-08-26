# Stage 1: Build the artifact
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

COPY jenkins-k8s-guide-app/pom.xml .
COPY jenkins-k8s-guide-app/src ./src

RUN mvn clean package

# Stage 2: Run inside Tomcat
FROM tomcat:10.1-jre17-temurin

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=builder /app/target/ROOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
