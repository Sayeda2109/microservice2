package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-02-06T05:25:35.369626841Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("MobCo CF Architecture Service")
                .description("APIs for Architecture Service  These APIs describe how The Common Framework's architecture service can be accessed. These services would be used for validating, updating and generating artefacts from architecture repos.      Addressing Classic Autosar    Addressing Adaptive Autosar     - [Detailed Description can be found here](https://wonderful-mushroom-0eb8b6b10.4.azurestaticapps.net/common-framework/0.1/services/arch/contents.html)")
                .termsOfService("")
                .version("0.0.1")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
