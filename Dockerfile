FROM openjdk:17-alpine
COPY ./target/aws1.jar aws1.jar
ENTRYPOINT ["java", "-jar" , "/aws1.jar"]