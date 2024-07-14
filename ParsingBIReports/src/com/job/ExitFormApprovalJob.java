package com.job;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ExitFormApprovalJob {
    public ExitFormApprovalJob() {
        super();
    }
    
    
    public void approvalExitFormJob(Boolean stop) {
           try {
               JobDetail jb = JobBuilder.newJob(AutoApprovalExitForm.class)
                       .withIdentity("exitJob", "exitGroup").build();

               Trigger trigger1 = TriggerBuilder.newTrigger()
                        .withIdentity("exitTrigger", "exitGroup")
                        .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInMinutes(30).repeatForever())
//               .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInHours(1).repeatForever())
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