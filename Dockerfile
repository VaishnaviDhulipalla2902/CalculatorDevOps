FROM openjdk:8
COPY ./target/CalculatorDevops-1.0-SNAPSHOT.jar ./
RUN mvn package
CMD ["java","-cp","target/CalculatorDevops-1.0-SNAPSHOT.jar","calculator.App"]
