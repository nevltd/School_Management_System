package com.quester.registryservice.service;

//import com.quester.academic_records.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CompulsorySubjectService {
   /* public void makeCompulsory(MakeCompusloryDto makeCompulsoryDto{
        Section section = makeCompulsoryDto.getSection();
        List<Form> forms = new ArrayList<>();
        List<Arm> arms= new ArrayList<>();
        Set<Subject> initialSubjects = makeCompulsoryDto.getSubjects();
        List<Subject> subjects = new ArrayList<>();
        subjects.addAll(initialSubjects);

        if(makeCompulsoryDto.getFormState()=="all forms"){
           forms = formRepository.findbySectionId(section.getId());
        }
        else{
            Set<Form> initialForms = makeCompulsoryDto.getForms();
            forms.addAll(initialForms);
        }

        if(makeCompulsoryDto.getArmState() == "all arms"){
            int count;
            for(count=0;count<forms.size();count++) {
                Form form = forms.get(count);
                Set<Arm>initialArms = form.getArms();
                arms.addAll(initialArms);
            }
        }
        else {
            Set<Arm> initArms = makeCompulsoryDto.getArms();
            arms.addAll(initArms);
        }
        CompulsorySubject compulsorySubject = new CompulsorySubject(subjects,arms,forms);
    }*/
}
