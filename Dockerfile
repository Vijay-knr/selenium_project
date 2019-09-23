FROM maven:3-jdk-8
WORKDIR /usr/src/app
COPY . .
CMD ["mvn", "clean", "test"]

#docker run -it --rm --name my-maven-project -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.3-jdk-8 mvn clean install

# build
#FROM maven
#WORKDIR /usr/src/app
#COPY pom.xml .
#RUN mvn -B -e -C -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.0.2:go-offline
#COPY . .
#RUN mvn -B -e -o -T 1C verify
#
## package without maven
#FROM openjdk
#COPY --from=0 /usr/src/app/target/*.jar ./