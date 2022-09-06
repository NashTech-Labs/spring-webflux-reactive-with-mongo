package com.knoldus.springwebfluxreactivewithmongo.repo;

import com.knoldus.springwebfluxreactivewithmongo.models.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

    Flux<Person> findByName(String name);
}
