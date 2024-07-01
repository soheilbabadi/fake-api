FROM docker.arvancloud.ir/maven:3.9.6-amazoncorretto-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -U -DskipTests -Dmaven.javadoc.skip=true

FROM docker.arvancloud.ir/amazoncorretto:21-alpine3.19
WORKDIR /app
COPY --from=build /app/target/*.jar ./app.jar
RUN touch /app/app.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","/app/app.jar"]
