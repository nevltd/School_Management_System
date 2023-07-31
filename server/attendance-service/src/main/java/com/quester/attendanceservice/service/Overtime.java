package com.quester.attendanceservice.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.cache.annotation.Cacheable;

import java.util.Calendar;
import java.util.Date;

public class Overtime implements Job {

    static public Date eventDate;
    public Boolean isOvertime;

    public void setIsOvertime() {
        this.isOvertime = changeOvertime();
    }
    @Cacheable(value = "dayAttendanceStatus", key = "cachedIsOvertime")
    public Boolean changeOvertime() {
        return !isOvertime;
    }
    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        setIsOvertime();
    }

}
