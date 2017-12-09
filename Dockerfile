FROM openjdk:8
ADD build/libs/bb-0.0.1-SNAPSHOT.jar bb.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "bb.jar"]