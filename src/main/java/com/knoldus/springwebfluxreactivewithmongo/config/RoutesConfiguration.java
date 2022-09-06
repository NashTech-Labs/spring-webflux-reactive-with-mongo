package com.knoldus.springwebfluxreactivewithmongo.config;

import com.knoldus.springwebfluxreactivewithmongo.models.Person;
import com.knoldus.springwebfluxreactivewithmongo.repo.PersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;

import static org.springframework.web.servlet.function.RequestPredicates.method;
import static org.springframework.web.servlet.function.RequestPredicates.path;
import static org.springframework.web.servlet.function.RouterFunctions.nest;
import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@Configuration
public class RoutesConfiguration {

    @Bean
    RouterFunction<?> routes(PersonRepository personRepository) {
        return nest(path("/person"),

                route(RequestPredicates.GET("/{id}"),
                        request -> ok().body(personRepository.findById(request.pathVariable("id"))))

                        .andRoute(method(HttpMethod.POST),
                                request -> {
                                    personRepository.insert(request.body(Person.class)).subscribe();
                                    return ok().build();
                                })
        );
    }
}
