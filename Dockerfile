FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/*.jar calculator.jar

CMD ["java","-jar","calculator.jar"]