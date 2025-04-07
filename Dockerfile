FROM openjdk:17
EXPOSE 8081
ADD target/cata.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]