package com.knoldus.springwebfluxreactivewithmongo.config;

import static org.mockito.Mockito.mock;

import com.knoldus.springwebfluxreactivewithmongo.repo.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {RoutesConfiguration.class})
@ExtendWith(SpringExtension.class)
class RoutesConfigurationTest {
    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private RoutesConfiguration routesConfiguration;

    /**
     * Method under test: {@link RoutesConfiguration#routes(PersonRepository)}
     */
    @Test
    void testRoutes() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by routes(PersonRepository)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        routesConfiguration.routes(mock(PersonRepository.class));
    }
}

