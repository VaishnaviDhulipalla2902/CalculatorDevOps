FROM openjdk:8
COPY ./target/CalculatorDevops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","calculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar","calculator.App"]
