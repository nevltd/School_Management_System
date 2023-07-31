package com.quester.attendanceservice.configuration;

import com.quester.attendanceservice.service.Overtime;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OvertimeConfig {
    @Bean
    public JobDetail overtimeJobDetail() {
        return JobBuilder.newJob(Overtime.class)
                .withIdentity("dateJob")
                .build();
    }

    @Bean
    public Trigger overtimeTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("dateTrigger")
                .startAt(Overtime.eventDate)
                .build();
    }
    @Bean
    public Trigger endOverTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("dateTrigger")
                .startAt(Overtime.getNextDay(Overtime.eventDate))
                .build();
    }
}