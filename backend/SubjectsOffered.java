package com.quester.registryservice.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;
@Entity
public class SubjectsOffered{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "sessionId")
    private Session session;

    @OneToOne
    @JoinColumn(name = "formId")
    private Form form;
    @ManyToOne
    @JoinColumn(name="studentId")
    private Student student;
    @ManyToOne
    @JoinColumn(name="termId")
    private Term term;
    @OneToMany(mappedBy = "subjectsOffered")
    Set<Subject> subjects;

    /*@Autowired
    private FormRepository formRepository;*/
  /*  public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Session getSession() {
        return session;
    }*/

    /*public void setSession(Session session) {
        this.session = session;
    }*/

    /*public SubjectsOffered(Form form,Set<Subject>subjects,Student student,Term term){
        this.subjects = subjects;
        this.session = session;
        this.form = form;
    }*/


}
