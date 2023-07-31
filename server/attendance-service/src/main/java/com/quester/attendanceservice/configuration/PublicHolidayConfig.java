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
    public JobDetail publicJobDetail() {
        return JobBuilder.newJob(PublicHoliday.class)
                .withIdentity("PublicHolidayJob")
                .build();
    }

    @Bean
    public Trigger startPublicHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("startPublicHolidayTrigger")
                .startAt(PublicHoliday.startDate!=null?PublicHoliday.startDate:new Date())
                .build();
    }
    @Bean
    public Trigger endPublicHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("endPublicHolidayTrigger")
                .startAt(PublicHoliday.endDate!=null?PublicHoliday.getNextDay(PublicHoliday.endDate):new Date())
                .build();
    }
}
