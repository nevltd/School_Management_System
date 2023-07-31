package com.quester.attendanceservice.configuration;

import com.quester.attendanceservice.service.WeekendJob;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import static org.quartz.CronScheduleBuilder.cronSchedule;

@Configuration
public class WeekendJobConfig {
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setAutoStartup(true);
        return schedulerFactoryBean;
    }
        @Bean
        public JobDetail myFridayJobDetail() {
            return JobBuilder.newJob(WeekendJob.class)
                    .withIdentity("myFridayJob")
                    .storeDurably()
                    .build();
        }

        @Bean
        public Trigger weekendJobTrigger() {
            return TriggerBuilder.newTrigger()
                    .withIdentity("WeekendJobTrigger")
                    .withSchedule(cronSchedule("0 0 16 ? * FRI")) // 4 PM every Friday
                    .build();
        }
    @Bean
    public Trigger weekdayJobTrigger() {
        return TriggerBuilder.newTrigger()
                .withIdentity("WeekendJobTrigger")
                .withSchedule(cronSchedule("0 0 4 ? * MON")) // 4 PM every Friday
                .build();
    }
    }


