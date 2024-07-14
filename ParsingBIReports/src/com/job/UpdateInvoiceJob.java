package com.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class UpdateInvoiceJob {
    public UpdateInvoiceJob() {
        super();
    }
    
    public void invoiceStatusUpdateJob(Boolean stop) {
           try {
               JobDetail jb = JobBuilder.newJob(UpdateInvoice.class)
                       .withIdentity("invoiceJob", "invoiceGroup").build();

               Trigger trigger1 = TriggerBuilder.newTrigger()
                        .withIdentity("invoiceTrigger", "invoiceGroup")
//                       .withSchedule(CronScheduleBuilder.cronSchedule("0 0/2 0 ? * * *"))
                        .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInHours(1).repeatForever())
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
