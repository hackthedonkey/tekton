FROM adoptopenjdk/openjdk11
ADD /build/libs/web_sample_01-0.0.1-SNAPSHOT.jar webAppTest.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","webAppTest.jar"]
