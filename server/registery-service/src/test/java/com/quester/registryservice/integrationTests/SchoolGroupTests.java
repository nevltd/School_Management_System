package com.quester.registryservice.integrationTests;

import com.google.gson.Gson;
import com.quester.registryservice.RegistryServiceApplication;
import com.quester.registryservice.entity.SchoolGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.GsonTester;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.http.RequestEntity.post;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = RegistryServiceApplication.class)
@AutoConfigureMockMvc
@EnableAutoConfiguration(exclude= SecurityAutoConfiguration.class)
@AutoConfigureTestDatabase
public class SchoolGroupTests {

   /* @Autowired
    private MockMvc mvc;



    @Test
    public void when_passed_schoolGroup_persist_to_DataBase() throws Exception {
        SchoolGroup group = new SchoolGroup("nnamdi private schools");
        mvc.perform((RequestBuilder) post("/schoolgroups").contentType(MediaType.APPLICATION_JSON)).content(new Gson().toJson(group));

    }*/

}
