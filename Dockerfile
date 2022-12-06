FROM azul/zulu-openjdk:11

RUN mkdir /app

WORKDIR /app

COPY /build/libs/app-gateway-*.jar /app/app-gateway.jar

EXPOSE 8080
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.country=BR -Duser.language=pt -Duser.timezone=America/Sao_Paulo
CMD ["java", "-jar", "-Xmx512M", "-Xms256M","-XX:MaxMetaspaceSize=256m", "app-gateway.jar"]
