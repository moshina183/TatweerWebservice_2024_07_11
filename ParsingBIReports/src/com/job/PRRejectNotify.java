package com.job;

import com.dbcall.CallDbObject;

import com.mivors.model.bi.integration.BiReportAccess;

import java.sql.Blob;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.sql.rowset.serial.SerialBlob;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PRRejectNotify implements Job {
    public PRRejectNotify() {
        super();
    }
    
    /**
     *
     * @param job
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext job) throws JobExecutionException {
        System.err.println("Execute in PRRejectNotify Job...");
        this.sendPRNotification();
    }
    
    public void sendPRNotification(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String sysdate = formatter.format(new Date());
//        sysdate = "12-03-2020";
        System.err.println("Sysdate is :"+sysdate);
        
        List<Map> aproverMap = new ArrayList<Map>();
        BiReportAccess reports = new BiReportAccess();
        try {
            List<Map> prList = reports.getRejectedPRLists(sysdate);
            System.err.println("Rejected list is :"+prList);
            String reqNo = "";
            String performedBy = "";
            for (Map prMap : prList){
                reqNo = prMap.get("REQUISITION_NUMBER") != null ? prMap.get("REQUISITION_NUMBER").toString() : "";
                performedBy = prMap.get("APPROVER") != null ? prMap.get("APPROVER").toString() : "";
                System.err.println("For PR-NO ::"+reqNo);
                if(!"".equals(reqNo)){
                    aproverMap = reports.getRejectedPRApprovers(sysdate, reqNo);
                    byte[] bytes = reports.getRejectedPRAttachment(sysdate, reqNo); 
                    String approverName = "";
                    String approverEmail = "";
                    HashSet<String> hashSet = new HashSet<String>();
                    for (Map approver : aproverMap){
                        
                        approverName = approver.get("APPROVER") != null ? approver.get("APPROVER").toString() : "";
                        approverEmail = approver.get("EMAIL_ADDRESS") != null ? approver.get("EMAIL_ADDRESS").toString() : "";                     
//                        System.err.println("For approver ::"+approverName);
                        if(hashSet.add(approverEmail)){
                            System.err.println("Added approver ::"+approverEmail);
                            CallDbObject.sendPRRejectedNotification(approverEmail, reqNo, approverName, performedBy, bytes);   
                        }
                    }
                    hashSet.clear();
                }
            } 
        } catch (Exception e) {
            System.err.println("Error :"+e.toString());
        }
    }
}
