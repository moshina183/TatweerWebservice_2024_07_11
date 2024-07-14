package com.job;

import com.dbcall.CallDbObject;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class AutoApprovalTraineesExit implements Job {
    public AutoApprovalTraineesExit() {
        super();
    }
    
    /**
     *
     * @param job
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext job) throws JobExecutionException {
        CallDbObject.callAutoApprovalTraineesExitFrom();
    } 
}

