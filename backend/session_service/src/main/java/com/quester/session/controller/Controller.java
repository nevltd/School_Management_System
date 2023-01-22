package com.quester.session.controller;

import com.quester.session.model.Session;
import com.quester.session.model.Term;
import com.quester.session.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/sessions")
public class Controller {
    SessionService service;
    @Autowired
    public void controller(SessionService sessionService){
        this.service = sessionService;
    }
    @PostMapping("")
    public Session createNewSession(@RequestBody Session session){
        return service.saveSession(session);
    }

}
