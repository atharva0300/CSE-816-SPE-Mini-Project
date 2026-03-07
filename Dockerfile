FROM openjdk:11

WORKDIR /app

COPY target/*.jar calculator.jar

CMD ["java","-jar","calculator.jar"]