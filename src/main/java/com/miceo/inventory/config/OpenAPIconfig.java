package com.miceo.inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIconfig {
    @Bean
    public OpenAPI productServiceAPI(){
        return new OpenAPI()
        .info(new Info().title("Inventory Service API")
                    .description("this is the REST API for Inventory Service")
                    .version("v0.0.1")
                    .license(new License().name("Apache 2.0")))
                    .externalDocs(new ExternalDocumentation()
                                    .description("You can refer to the Inventory Service Wiki Documentation")
                                    .url("https://inv-service-dummy-url.com/docs"));
    }
}