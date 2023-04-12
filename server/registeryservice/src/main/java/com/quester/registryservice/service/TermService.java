package com.quester.registryservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TermService {
    public static String [] terms= {"first","second","third"};
    /*@Autowired
    TermRepository repository;
    @Autowired
    TheSessionService sessionService;

    Integer count;
     /*public Term createTerm(String termType,Session session,Integer count){
        Term term = new Term(termType, session,count);
        repository.save(term);
        return term;
    }

    public void setCurrentTermAuto() {
        Session session = sessionRepository.findByCurrent;
        Set<Term> initialTerms = session.getTerms();
        List<Term> terms = new ArrayList<>();
        Term termToLeave;
        Integer termNumberToSwitchTo=null;
        int termCount;
        for (termCount = 0; termCount < terms.size(); termCount++) {
            if (terms.get(termCount).getCurrent() == "current") {
                termToLeave = terms.get(termCount);
                if (termToLeave.getNumber() != 2) {
                    termNumberToSwitchTo = termToLeave.getNumber() + 1;
                    termToLeave.setCurrent("past");
                } else {
                    sessionService.changeSession(session);
                }
            }
        }
        for (termCount = 0; termCount < terms.size(); termCount++) {
            if (terms.get(termCount).getNumber() == termNumberToSwitchTo) {
                terms.get(termCount).setCurrent("current");
            }
        }
    }

    public void initCurrentTerm(Term term){
        term.setCurrent("current");
    }//update session
        */
}

