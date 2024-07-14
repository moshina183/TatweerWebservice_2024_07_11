package com.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class PRPaymentNotifyJob {
    public PRPaymentNotifyJob() {
        super();
    }
    
    public void prPaymentNotificationJob(Boolean stop) {
           try {
               JobDetail jb = JobBuilder.newJob(PRPaymentNotify.class)
                       .withIdentity("prPaymentJob", "prPaymentGroup").build();

               Trigger trigger1 = TriggerBuilder.newTrigger()
                        .withIdentity("prPaymentTrigger", "prPaymentGroup")
                        .withSchedule(CronScheduleBuilder.cronSchedule("0 0 14 ? * * *"))
//                        .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMinutes(2).repeatForever())
                        .build();

               Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
               if (stop) {
                   scheduler1.shutdown();
               }else{
                   scheduler1.start();
                   scheduler1.scheduleJob(jb, trigger1);    
               }

           } catch (Exception e) {
               e.printStackTrace();
           }
       }
}
