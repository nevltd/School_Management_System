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

@Configuration
public class HolidayConfig {
    @Bean
    public JobDetail dateJobDetail() {
        return JobBuilder.newJob(PublicHoliday.class)
                .withIdentity("dateJob")
                .build();
    }

    @Bean
    public Trigger startHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("dateTrigger")
                .startAt(Holiday.startDate)
                .build();
    }
    @Bean
    public Trigger endHolidayTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("dateTrigger")
                .startAt(Holiday.resumptionDate)
                .build();
    }
}
