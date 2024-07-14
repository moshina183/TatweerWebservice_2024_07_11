package com.job;

import com.dbcall.CallDbObject;

import com.mivors.model.bi.integration.BiReportAccess;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PRPaymentNotify implements Job {
    public PRPaymentNotify() {
        super();
    }
    /**
     *
     * @param job
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext job) throws JobExecutionException {
        System.err.println("Execute in PRPaymentNotify Job...");
        this.sendPRPaymentNotification();
    }
    
    public void sendPRPaymentNotification(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String sysdate = formatter.format(new Date());
//        sysdate = "12-10-2020";
        System.err.println("Sysdate is :"+sysdate);
         
        BiReportAccess reports = new BiReportAccess();
        try {
            List<Map> prList = reports.getPRPaymentList(sysdate);
            HashSet<String> hashSet = new HashSet<String>();
            System.err.println("Payment list is :"+prList);
            for (Map prMap : prList){
                String reqNo = prMap.get("REQUISITION_NUMBER") != null ? prMap.get("REQUISITION_NUMBER").toString() : "";
                String reqName = prMap.get("REQUESTER_NAME") != null ? prMap.get("REQUESTER_NAME").toString() : "";
                String poNumber = prMap.get("PO_NUMBER") != null ? prMap.get("PO_NUMBER").toString() : "";
                String invNo = prMap.get("INVOICE_NUM") != null ? prMap.get("INVOICE_NUM").toString() : "";
                String reqEmail = prMap.get("EMAIL_ADDRESS") != null ? prMap.get("EMAIL_ADDRESS").toString() : "";
                if(!"".equals(reqNo)){
//                    if(hashSet.add(reqNo)){
                        byte[] bytes = reports.getPRPaymentAttachment(sysdate, reqNo, reqName);
                        CallDbObject.sendPRPaymentAlert(reqEmail, reqNo, reqName, poNumber, invNo, bytes);
//                    }
                }
            }
            hashSet.clear();
        } catch (Exception e) {
            System.err.println("Error :"+e.toString());
        }
    }
}
