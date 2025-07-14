package com.example.WebShop.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI userWebShop(){
        return new OpenAPI()
                .info(new Info()
                        .title("Web Shop")
                        .description("API para sistema de vendas")
                        .version("1.0.0"));
    }
}