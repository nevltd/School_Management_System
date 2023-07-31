package com.quester.attendanceservice.configuration;

import com.quester.attendanceservice.service.Overtime;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class OvertimeConfig {
    @Bean
    public JobDetail overtimeJobDetail() {
        return JobBuilder.newJob(Overtime.class)
                .withIdentity("OvertimeJob")
                .build();
    }

    @Bean
    public Trigger startOvertimeTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("startOvertimeTrigger")
                .startAt(Overtime.eventDate!=null?Overtime.eventDate:new Date())
                .build();
    }
    @Bean
    public Trigger endOvertimeTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("endOvertimeTrigger")
                .startAt(Overtime.eventDate!=null?Overtime.getNextDay(Overtime.eventDate):new Date())
                .build();
    }
}