ARG JAVA_BUILD_VERSION="11"
FROM --platform=linux/amd64 gcr.io/distroless/java17-debian11

COPY target/*.jar run_deployer.jar

# Defines the entrypoint that will be executed when starting the container.
ENTRYPOINT ["java","-jar"]

# Defines additional parameter for entrypoint execution.
EXPOSE 3060

CMD ["/run_deployer.jar"]