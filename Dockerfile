FROM openjdk:11-jdk-slim

RUN mkdir /app

WORKDIR /app

COPY ./target/infnet-app-gateway*.jar /app/infnet-app-gateway.jar

EXPOSE 8080
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.country=BR -Duser.language=pt -Duser.timezone=America/Sao_Paulo
CMD ["java", "-jar", "-Xmx512M", "-Xms256M","-XX:MaxMetaspaceSize=256m", "infnet-app-gateway.jar"]
