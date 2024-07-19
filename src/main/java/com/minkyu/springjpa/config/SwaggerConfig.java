package com.minkyu.springjpa.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 @author Minkyu
 @version 1.0.0
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("내가 만든 API 문서")
                        .description("강의에서 들은 내용 바탕으로 API를 문서화 시킴")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Minkyu")
                                .email("uxchampaign@gmail.com")
                                .url("http://localhost:8081/hello"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("내 github 주소")
                        .url("https://github.com/uxshane"));
    }

}
