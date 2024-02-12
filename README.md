# Swagger generated server for Architecture Services

Architecture Services

## Setup
Make sure you have maven installed which can talk to maven central mirror within Bosch
Make sure you have spring boot installed on your machine 

https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.introducing-spring-boot
you can try the manual installation part in the above link.
Please look carefully in the install.txt file for instructions and setting path variables and environment variables "SPRING_HOME" to complete the setup

run command - mvn clean install - on the project

You can use VSCode or any other IDE with spring boot tooling installed for running your local server after the build above. 
In VSCode - its the Spring boot extension pack, for others you need to check which is best suited. 

The Opn API definitions are in the folder openapiyaml. Any change in the API must reflect here first, and then the server generated code should be updated. 
For more details on generating server code from openAPI please go through https://swagger.io/tools/swagger-editor/


## Overview  
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  
By using the [OpenAPI-Spec](https://github.com/swagger-api/swagger-core), you can easily generate a server stub.  
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.

The underlying library integrating swagger to SpringBoot is [springdoc-openapi](https://github.com/springdoc/springdoc-openapi)

Start your server as an simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  

Change default port value in application.properties