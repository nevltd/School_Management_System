package com.quester.attendanceservice.configuration;

import com.quester.attendanceservice.service.Holiday;
import com.quester.attendanceservice.service.Overtime;
import com.quester.attendanceservice.service.PublicHoliday;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class HolidayConfig {
    @Bean
    public JobDetail holidayJobDetail() {
        return JobBuilder.newJob(PublicHoliday.class)
                .withIdentity("HolidayJob")
                .build();
    }

    @Bean
    public Trigger startHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("startHolidayTrigger")
                .startAt(Holiday.startDate !=null ? Holiday.startDate:new Date())
                .build();
    }
    @Bean
    public Trigger endHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("endHolidayTrigger")
                .startAt(Holiday.resumptionDate != null?Holiday.resumptionDate:new Date())
                .build();
    }

}
