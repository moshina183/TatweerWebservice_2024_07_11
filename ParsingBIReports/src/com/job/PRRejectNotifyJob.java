package com.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class PRRejectNotifyJob {
    public PRRejectNotifyJob() {
        super();
    }
    
    public void prRejectNotificationJob(Boolean stop) {
           try {
               JobDetail jb = JobBuilder.newJob(PRRejectNotify.class)
                       .withIdentity("prRejJob", "prRejGroup").build();

               Trigger trigger1 = TriggerBuilder.newTrigger()
                        .withIdentity("prRejTrigger", "prRejGroup")
                        .withSchedule(CronScheduleBuilder.cronSchedule("0 0 14 ? * * *"))
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
