FROM eclipse-temurin:21-jdk

WORKDIR /app 

COPY . . 

RUN javac src/Main.java src/Code.java 

CMD ["java", "src.Main"]