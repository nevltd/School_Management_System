package com.quester.attendanceservice.configuration;

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
public class PublicHolidayConfig {
    @Bean
    public JobDetail dateJobDetail() {
        return JobBuilder.newJob(PublicHoliday.class)
                .withIdentity("dateJob")
                .build();
    }

    @Bean
    public Trigger startPublicHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("dateTrigger")
                .startAt(PublicHoliday.startDate)
                .build();
    }
    @Bean
    public Trigger endHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("dateTrigger")
                .startAt(Overtime.getNextDay(Overtime.eventDate))
                .build();
    }
}
