package com.minkyu.springjpa.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(
////            authorize -> authorize
////                    .requestMatchers("/",
////                            "/hello",
////                            "/api",
////                            "/api/name",
////                            "api/request1",
////                            "api/request2",
////                            "api/request3",
////                            "api/variable1/",
////                            "api/variable2/")
////                    .permitAll()
////                    .anyRequest()
////                    .authenticated()
////        );

        http
                .authorizeHttpRequests(
                        authorize -> authorize
                                .anyRequest().permitAll()
                );

        return http.build();
    }

//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return webSecurity -> webSecurity.ignoring()
//                .requestMatchers(PathRequest.toStaticResources().atCommonLocations());
//    }

}
