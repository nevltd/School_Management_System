package com.quester.attendanceservice.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.cache.annotation.Cacheable;

import java.util.Date;

public class Holiday implements Job {

        static public Date startDate;
        static public Date resumptionDate;
        public Boolean isHoliday;
        public void setIsHoliday() {
            this.isHoliday = changeHoliday();
        }

        @Cacheable(value = "dayAttendanceStatus", key = "cachedIsHoliday")
        public Boolean changeHoliday() {
            return !isHoliday;

        }

        @Override
        public void execute(JobExecutionContext context) throws JobExecutionException {
            setIsHoliday();
        }
}
