package com.job;

import com.dbcall.CallDbObject;

import com.mivors.model.bi.integration.BiReportAccess;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class UpdateInvoice implements Job {
    public UpdateInvoice() {
        super();
    }

    /**
     *
     * @param job
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext job) throws JobExecutionException {
        System.err.println("Execute in Update Invoice Job...");
        this.updateInvoiceStatus();
    }

    public void updateInvoiceStatus() {
        SimpleDateFormat formatter =
            new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.err.println("Invoice Status Updating : " +
                           formatter.format(new Date()));

        BiReportAccess report = new BiReportAccess();
        List<Map> allInvoices = new ArrayList<Map>();
        try {
            allInvoices = report.getAllInvoiceStatusReport();
            if (allInvoices.size() > 0) {
                this.callUpdateProcess(allInvoices);
            }
            
        } catch (Exception e) {
            System.err.println("Exception in UpdateInvoice : " + e.toString());
        }
    }

    public void callUpdateProcess(List<Map> inv) {

        //        List<Map> inv = new ArrayList<Map>();
        //        Map in = new HashMap();
        //        Map in1 = new HashMap();
        //        Map in2 = new HashMap();
        //        in.put("INVOICE_NUM", "1366-755-BT");
        //        in.put("PAYMENT_STATUS", "Y");
        //        inv.add(in);
        //        in1.put("INVOICE_NUM", "1064-756-EducationAllowance");
        //        in1.put("PAYMENT_STATUS", "N");
        //        inv.add(in1);
        //        in2.put("INVOICE_NUM", "1064-756-RepaymentTickets");
        //        in2.put("PAYMENT_STATUS", "N");
        //        inv.add(in2);
        //        System.err.println("Inv map::"+inv);
        for (Map map : inv) {

            String invNo = map.get("INVOICE_NUM").toString();
            String invStatus = map.get("PAYMENT_STATUS").toString();
            String type = "";
            if (invNo.contains("-BT")) {
                type = "BT";
            }
            if (invNo.contains("-EducationAllowance")) {
                type = "EDUCATION";
            }
            if (invNo.contains("-RepaymentTickets")) {
                type = "REPAYMENT";
            }
            if (invNo.contains("-SpecialNeed")) {
                type = "SPECIAL";
            }
            if (!"".equals(type)) { 
                CallDbObject.updateInvoice(invNo, invStatus, type);
            }
        }
    }
}
