package com.kshitij.bookflipster.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @author Kshitij
 * @created 12-Jun-2025
 */
@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Bookflipster Application")
                        .version("v1")
                        .description("API documentation for Bookflipster Application"));
    }
}
