FROM openjdk:8
COPY ./target/calculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","calculatorDevops-1.0-SNAPSHOT-jar-with-dependencies.jar","App"]
