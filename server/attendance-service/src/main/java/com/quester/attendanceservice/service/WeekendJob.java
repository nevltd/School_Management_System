package com.quester.attendanceservice.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.cache.annotation.Cacheable;

public class WeekendJob implements Job {
    Boolean isWeekend;
    public void setIsWeekend(){
        this.isWeekend = changeWeekend();
    }
    @Cacheable(value = "dayAttendanceStatus",key = "cachedIsWeekend")
    public Boolean changeWeekend(){
        return !isWeekend;
    }
    @Override
    public void execute(JobExecutionContext context)  {
        setIsWeekend();

    }
}

