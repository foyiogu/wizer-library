FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/wizer-library.jar wizer-library.jar
ENTRYPOINT ["java", "-jar", "wizer-library.jar"]

