package com.example.quiz.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(
                new Info().title("Crud Application").version("0.1").description("Swagger for crud operations don't need to use postman")
        );
    }

}
