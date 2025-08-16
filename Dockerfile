FROM eclipse-temurin:17.0.15_6-jdk-ubi9-minimal

COPY /build/libs/patrones2025-2-0.0.1-SNAPSHOT.jar ./cualquiercosa.jar

EXPOSE 8080
#Comando que se va a ejecutar
ENTRYPOINT ["java", "-jar" , "./cualquiercosa.jar"]
