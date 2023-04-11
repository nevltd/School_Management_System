package com.quester.sms.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ProductControllerTest {
    @Autowired
    MockMvc mvc;
    public void given_when_home_is_visited_return_200 () throws Exception {
        mvc.perform(get("/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
        
    }

}
