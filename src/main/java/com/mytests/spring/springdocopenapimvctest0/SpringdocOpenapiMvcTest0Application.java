package com.mytests.spring.springdocopenapimvctest0;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdocOpenapiMvcTest0Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringdocOpenapiMvcTest0Application.class, args);
    }
    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI()
                .info(new Info().title("mvc-test0 openapi").version(appVersion).description(
                                "test swagger annotations on endpoints")
                        .license(new License().name("personal ip license").url("https://ip.me")));
    }
}
