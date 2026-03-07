FROM eclipse-temurin:11-jre

WORKDIR /app

COPY target/*.jar calculator.jar

CMD ["java","-jar","calculator.jar"]