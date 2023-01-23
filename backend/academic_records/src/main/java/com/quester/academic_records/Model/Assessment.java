package com.quester.academic_records.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Assessment {

    @ManyToMany
    @JoinColumn(name = "subjectId")
    private Set<Subject> subjects;

    private Integer termId;
    private Integer classId;

}
