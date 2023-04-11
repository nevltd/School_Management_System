package com.quester.registryservice.serviceTests;

import com.quester.registryservice.entity.School;
import com.quester.registryservice.entity.SchoolGroup;
import com.quester.registryservice.repository.SchoolGroupRepository;
import com.quester.registryservice.service.SchoolGroupService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SchoolGroupServiceTests {

    @Mock
    SchoolGroupRepository repository = Mockito.mock(SchoolGroupRepository.class);

    @BeforeEach
    void init (){
        SchoolGroupService service = new SchoolGroupService(repository);

    }
    @Test
    void savedSchoolGroupHasName(){
        SchoolGroup group = new SchoolGroup("nnamdi school");
        when(repository.save(any(SchoolGroup.class))).then(returnsFirstArg());
        SchoolGroup savedGroup = repository.save(group);
        assertThat(savedGroup.getName().equals("nnamdi school"));
    }

    @Test
    void setSchools(){
        SchoolGroup group = new SchoolGroup("nnamdi school");
        HashSet<School> schools= new HashSet<>();
        group.setSchools(schools);
        assertThat(group.getSchools().equals(schools));
    }
}

