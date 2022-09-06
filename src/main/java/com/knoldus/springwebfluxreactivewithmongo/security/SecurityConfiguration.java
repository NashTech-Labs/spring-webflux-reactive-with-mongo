package com.knoldus.springwebfluxreactivewithmongo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;

import static org.springframework.security.core.userdetails.User.withUsername;

@Configuration
public class SecurityConfiguration {

    @Bean
    MapReactiveUserDetailsService personRepository() {
        UserDetails tom = withUsername("skt").password("password").roles("USER").build();
        UserDetails harry = withUsername("deepu").password("password").roles("USER", "ADMIN").build();
        return new MapReactiveUserDetailsService(tom, harry) {
        };
    }
}
