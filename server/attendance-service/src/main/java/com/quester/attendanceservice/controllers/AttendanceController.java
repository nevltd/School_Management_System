package com.quester.attendanceservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
    @GetMapping("/")
    public String Hello(){
        return "hello from attendance service";
    }
}
