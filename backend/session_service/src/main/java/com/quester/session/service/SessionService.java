package com.quester.session.service;

import com.quester.session.dataAccessLayer.SessionRepository;
import com.quester.session.dataAccessLayer.TermRepository;
import com.quester.session.model.Session;
import com.quester.session.model.Term;

import org.springframework.beans.factory.annotation.Autowired;

public class SessionService {
    SessionRepository repository;
    TermRepository termRepository;
    Term firstTerm;
    Term secondTerm;
    Term thirdTerm;
    @Autowired
    public void sessionService(SessionRepository sessionRepository,TermRepository termRepository){
        this.repository = sessionRepository;
        this.termRepository = termRepository;
    }
     public Session  save(Session session){
         Session savedSession = repository.save(session);
         return savedSession;
     }
     enum Terms{
        FIRST,SECOND,THIRD
     }
     @Autowired
     public Session saveSession(Session session){
        Session savedSession =repository.save(session);
         saveTerms(savedSession,firstTerm,secondTerm,thirdTerm);
         return savedSession;
     }
     @Autowired
     public void saveTerms(Session session,Term firstTerm,Term secondTerm,Term thirdTerm){
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;
        this.thirdTerm = thirdTerm;
        int i=0,termNumber = session.getTermNumber();
        for (;i < termNumber;i++){
            switch (i){
                case 0:
                    firstTerm.setSession(session);
                    firstTerm.setTerm("first");
                    termRepository.save(firstTerm);
                    break;
                case 1:
                    secondTerm.setSession(session);
                    secondTerm.setTerm("second");
                    termRepository.save(secondTerm);
                    break;

                case 2:
                    thirdTerm.setSession(session);
                    secondTerm.setTerm("third");
                    termRepository.save(thirdTerm);
                    break;
            }
        }
     }




}
