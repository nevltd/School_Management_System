package com.quester.attendanceservice.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.cache.annotation.Cacheable;

import java.util.Calendar;
import java.util.Date;

public class PublicHoliday implements Job {

    static public Date startDate;
    static public Date endDate;
    public Boolean isPublicHoliday;
    public void setIsPublicHoliday() {
        this.isPublicHoliday = changePublicHoliday();
    }
    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
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