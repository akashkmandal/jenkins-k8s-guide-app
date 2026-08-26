FROM tomcat:10.1-jre17-temurin

RUN rm -rf /usr/local/tomcat/webapps/*

COPY jenkins-k8s-guide-app/target/ROOT.war \
     /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
