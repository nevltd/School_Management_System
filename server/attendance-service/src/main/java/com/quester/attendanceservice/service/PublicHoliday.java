package com.quester.attendanceservice.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.cache.annotation.Cacheable;

import java.util.Date;

public class PublicHoliday implements Job {

    static public Date startDate;
    public Boolean isPublicHoliday;
    public void setIsPublicHoliday() {
        this.isPublicHoliday = changePublicHoliday();
    }

    @Cacheable(value = "dayAttendanceStatus", key = "cachedIsPublicHoliday")
    public Boolean changePublicHoliday() {
        return !isPublicHoliday;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        setIsPublicHoliday();
    }
}