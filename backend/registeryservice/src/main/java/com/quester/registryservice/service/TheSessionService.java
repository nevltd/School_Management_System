package com.quester.registryservice.service;

import org.springframework.stereotype.Service;

@Service
public class TheSessionService {
    /*@Autowired

    @Autowired
    TermService termService;
    public static String[] terms = {"first","second","third"};
    public void initSessions(InitSessionDto initSessionDto) {
        Integer startSession = initSessionDto.currentSessionStartYear());
        Integer start = startSession-2;
        for (; start <= startSession; start++){
            Integer end = start + 1;
            Session session = new Session(start,end);
            Integer count;
            Integer numberOfTerms = terms.length;
            for (count=0;count<numberOfTerms;count++){
                String termType = terms[count];
                Term term = termService.createTerm(termType,session,count);
                if(termType == initSessionDto.getCurrentTerm()) {
                    termService.initCurrentTerm(term);
                }
            }
            if(start==startSession){
                session.setCurrent("current");
            }
            else{
                session.setCurrent("past");
            }

            repository.save(session);
        }
    }
    public void createNewSessionAuto(){
        Session current = repository.find;//where current= true
        Integer start = current.getEnd();
        Integer end = current.getEnd()+1;
        Integer numberOfTerms = current.getTerms().size();
        Session newSession = new Session(start,end);
        Integer count;

        for (count=0;count<numberOfTerms;count++){
            String termType = terms[count];
            termService.createTerm(termType,newSession,count);
        }
        repository.save(newSession);
    }
    public void changeSession(Session session){
        Long nextSessionId = session.getId()+1;
        Optional<Session> nextSession = repository.findById(nextSessionId);
        Set<Term> initialTerms = nextSession.get().getTerms();
        List<Term> terms = new ArrayList<>();
        terms.addAll(initialTerms);
        int count;
        for(count=0;count< terms.size();count++) {
            Term term = terms.get(count);
            if(term.getNumber()== 0) {
                term.setCurrent("current");
            }
        }
        session.setCurrent("past");
        nextSession.get().setCurrent("current");
    }


*/





}
