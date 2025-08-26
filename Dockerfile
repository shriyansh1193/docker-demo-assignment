FROM openjdk:17-jdk-oracle
LABEL authors="shriyanshkasoundhan"

#set the working directory inside the container
WORKDIR /app

#Copy the JAR file into the container
COPY target/dockerDemo-0.0.1-SNAPSHOT.jar app.jar

#Expose the port you SpringBoot application listens on
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]