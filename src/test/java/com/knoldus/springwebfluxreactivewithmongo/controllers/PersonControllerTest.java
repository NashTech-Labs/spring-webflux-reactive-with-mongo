package com.knoldus.springwebfluxreactivewithmongo.controllers;

import static org.mockito.Mockito.when;

import com.knoldus.springwebfluxreactivewithmongo.repo.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import reactor.core.publisher.DirectProcessor;

@ContextConfiguration(classes = {PersonController.class})
@ExtendWith(SpringExtension.class)
class PersonControllerTest {
    @Autowired
    private PersonController personController;

    @MockBean
    private PersonRepository personRepository;

    /**
     * Method under test: {@link PersonController#index()}
     */
    @Test
    void testIndex() throws Exception {
        when(personRepository.findAll()).thenReturn(DirectProcessor.create());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/person");
        MockMvcBuilders.standaloneSetup(personController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

