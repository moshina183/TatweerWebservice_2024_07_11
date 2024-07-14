package com.mivors.model.bi.integration;

import com.mivors.elaf.bi.ExternalReportWSSService;
import com.mivors.elaf.bi.ExternalReportWSSService_Service;

import com.mivors.elaf.bi.type.ArrayOfParamNameValue;
import com.mivors.elaf.bi.type.ArrayOfString;
import com.mivors.elaf.bi.type.ObjectFactory;

import com.mivors.elaf.bi.type.ParamNameValue;
import com.mivors.elaf.bi.type.ParamNameValues;
import com.mivors.elaf.bi.type.ReportRequest;
import com.mivors.elaf.bi.type.ReportResponse;

import com.mivors.model.bi.integration.type.collection.AllInvoiceCollection;
import com.mivors.model.bi.integration.type.collection.TatweerCollection;

import com.mivors.model.bi.integration.type.collection.DepartmentCollection;

import com.mivors.model.bi.integration.type.collection.PRPaymentAlertCollection;
import com.mivors.model.bi.integration.type.collection.PRRejNotificationCollection;

import com.mivors.model.bi.integration.type.collection.RejectedPRListCollection;

import java.io.StringReader;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;

import javax.xml.bind.Unmarshaller;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class BiReportAccess {
    private ExternalReportWSSService_Service externalReportWSSService_Service;
    private ExternalReportWSSService externalReportWSSService;
    private SecurityPoliciesFeature securityFeatures;

    public static final String DEPARTMENTS_REPORT = "DepartmentsReport.xdo"; 
    private static final String ALL_INVOICE_STATUS="All Invoice Status.xdo";
    private static final String PR_REJECTED_REPORT ="copy of PR Rejection Notification 10OCT.xdo";
    private static final String PR_REJECTED_REPORT_ATTACH ="PR Rejection Notification Attachment10OCT.xdo";
    private static final String PR_PAYMENT_ALERT_REPORT ="PR Payable Report.xdo";
    private static final String PR_PAYMENT_ALERT_ATTACH ="PR Payable Attachment Report.xdo";
    
    private String REPORT_BASE_PATH ="/Custom/";
    private String REPORT_PASS_BASE_PATH ="/Custom/PAAS/";
    private String wsdlURL="https://egwo.fa.em2.oraclecloud.com/xmlpserver/services/ExternalReportWSSService";    
         
    private String userName="PaaS.Self Service@tatweer.sa"; 
     
    private String password="PAASTatweer@2020";
   

    public BiReportAccess() {
        super();
        
//        this.wsdlURL=wsdlUrl;
//        this.userName=username;
//        this.password=password;
        
        securityFeatures =
                new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
        externalReportWSSService_Service =
                new ExternalReportWSSService_Service();
        externalReportWSSService =
                externalReportWSSService_Service.getExternalReportWSSService(securityFeatures);
        javax.xml.ws.BindingProvider  wsbp = (javax.xml.ws.BindingProvider )externalReportWSSService;
        Map<String, Object> requestContext = wsbp.getRequestContext();
        requestContext.put( javax.xml.ws.BindingProvider.USERNAME_PROPERTY,
                           this.userName); 
        requestContext.put( javax.xml.ws.BindingProvider.PASSWORD_PROPERTY,
                           this.password); 
        requestContext.put( javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                           this.wsdlURL);
        
        
    }
    
//    private int isValidParam(String paramName,ArrayOfParamNameValue params){
//        if(params==null)return -1;
//        int index=-1;
//        for(ParamNameValue paramV :params.getItem()){
//            index++;
//            if(paramV.getName().equalsIgnoreCase(paramName))return index;
//           
//        }
//        return -1;
//    }

    private byte[] getReportBytes(String report,boolean flattenXml) throws Exception {
        ObjectFactory of = new ObjectFactory();
        ReportRequest reportRequest = of.createReportRequest();
        ReportResponse reportResponse;
        reportRequest.setReportAbsolutePath(report);
        reportRequest.setSizeOfDataChunkDownload(-1);
        reportRequest.setAttributeFormat("xml");
        reportRequest.setFlattenXML(flattenXml);
    
        reportRequest.setByPassCache(true);        
//        ParamNameValues p = externalReportWSSService.getReportParameters(reportRequest);
         
        reportResponse =
                externalReportWSSService.runReport(reportRequest,null);
        String data = new String(reportResponse.getReportBytes());
        return reportResponse.getReportBytes();
    }
    
    private byte[] getReportBytesPDF(String report, Map<String,Object> params,boolean flattenXml) throws Exception {
        ObjectFactory of = new ObjectFactory();
        ReportRequest reportRequest = of.createReportRequest();
        ReportResponse reportResponse;
        reportRequest.setReportAbsolutePath(report);
        reportRequest.setSizeOfDataChunkDownload(-1);
        reportRequest.setAttributeFormat("pdf");
        reportRequest.setFlattenXML(flattenXml);
    
        reportRequest.setByPassCache(true);        
        ParamNameValues p = externalReportWSSService.getReportParameters(reportRequest);
        ArrayOfParamNameValue paramValues=p.getListOfParamNameValues();
        ArrayOfParamNameValue ourParamValues = new ArrayOfParamNameValue();
         if (params != null){
            for (String k : params.keySet()) {
                
                int index =isValidParam( k,paramValues);
                if(index>-1){
                    ParamNameValue currentParam = paramValues.getItem().get(index);
                    ArrayOfString valuesArr = new ArrayOfString();
                    valuesArr.getItem().add(params.get(k).toString());
                    currentParam.setValues(valuesArr);
                    currentParam.setLovLabels(valuesArr);
                    paramValues.getItem().remove(currentParam);
                    paramValues.getItem().add(currentParam);
                    ourParamValues.getItem().add(currentParam);
                }   
            }
    
         reportRequest.setParameterNameValues(ourParamValues);
         }
        reportResponse =
                externalReportWSSService.runReport(reportRequest,null);
        String data = new String(reportResponse.getReportBytes());
        return reportResponse.getReportBytes();
    }
    
    private int isValidParam(String paramName,ArrayOfParamNameValue params){
        if(params==null)return -1;
        int index=-1;
        for(ParamNameValue paramV :params.getItem()){
            index++;
            if(paramV.getName().equalsIgnoreCase(paramName))return index;
           
        }
        return -1;
    }
    
    private byte[] getReportBytes(String report, Map<String,Object> params,boolean flattenXml) throws Exception {
        ObjectFactory of = new ObjectFactory();
        ReportRequest reportRequest = of.createReportRequest();
        ReportResponse reportResponse;
        reportRequest.setReportAbsolutePath(report);
        reportRequest.setSizeOfDataChunkDownload(-1);
        reportRequest.setAttributeFormat("xml");
        reportRequest.setFlattenXML(flattenXml);
    
        reportRequest.setByPassCache(true);        
        ParamNameValues p = externalReportWSSService.getReportParameters(reportRequest);
        ArrayOfParamNameValue paramValues=p.getListOfParamNameValues();
        ArrayOfParamNameValue ourParamValues = new ArrayOfParamNameValue();
         if (params != null){
            for (String k : params.keySet()) {
                
                int index =isValidParam( k,paramValues);
                if(index>-1){
                    ParamNameValue currentParam = paramValues.getItem().get(index);
                    ArrayOfString valuesArr = new ArrayOfString();
                    valuesArr.getItem().add(params.get(k).toString());
                    currentParam.setValues(valuesArr);
                    currentParam.setLovLabels(valuesArr);
                    paramValues.getItem().remove(currentParam);
                    paramValues.getItem().add(currentParam);
                    ourParamValues.getItem().add(currentParam);
                }   
            }
    
         reportRequest.setParameterNameValues(ourParamValues);
         }
        reportResponse =
                externalReportWSSService.runReport(reportRequest,null);
        String data = new String(reportResponse.getReportBytes());
        System.out.println(data);
        return reportResponse.getReportBytes();
    }
    
    
  
    
    private TatweerCollection parseXml(byte[] xml,Class type)throws Exception{
        
        String output = new String(xml);
        StringReader sr = new StringReader(output);
        
        JAXBContext jaxbContext = JAXBContext.newInstance(type);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();               
        TatweerCollection result = (TatweerCollection) jaxbUnmarshaller.unmarshal(sr);
        return result;
    }

    public List<Map> getDepartmentsData() throws Exception {
       
        	
        byte[] results =
            this.getReportBytes(REPORT_BASE_PATH+DEPARTMENTS_REPORT,
                                true); 
        DepartmentCollection departments = (DepartmentCollection) this.parseXml(results,  DepartmentCollection.class);
        int size=departments.getDepartments().size();
        System.err.println("Size is >> "+departments.getDepartments().size());
        Map department ;
        List<Map> listOfDepartments=new ArrayList<Map>();
        if(departments!=null && departments.getDepartments().size()>0){
            for(int i =0;i<size;i++){
                    department = new HashMap();
                    department.put("ORGANIZATION_ID",departments.getDepartments().get(i).getORGANIZATION_ID());
                    department.put("NAME",departments.getDepartments().get(i).getNAME());
                    department.put("SEGMENT4",departments.getDepartments().get(i).getSEGMENT4());
                    department.put("SEGMENT2",departments.getDepartments().get(i).getSEGMENT2());
                    department.put("SEGMENT3",departments.getDepartments().get(i).getSEGMENT3());
                    listOfDepartments.add(department);
                }
            
        }
        return  listOfDepartments;
    }
    
    public List<Map> getAllInvoiceStatusReport() throws Exception {
       
                
        byte[] results =
            this.getReportBytes(REPORT_PASS_BASE_PATH + ALL_INVOICE_STATUS,
                                true); 
        AllInvoiceCollection allInvoices = (AllInvoiceCollection) this.parseXml(results,  AllInvoiceCollection.class);
        int size=allInvoices.getAllInvoiceStatus().size();
        System.err.println("All invoice status report : Size is >> "+size);
        Map invStatusList ;
        List<Map> listOfInvoices = new ArrayList<Map>();
        if(allInvoices!=null && size >0){
            for(int i =0;i<size;i++){
                    invStatusList = new HashMap();
                    invStatusList.put("INVOICE_NUM",allInvoices.getAllInvoiceStatus().get(i).getINVOICE_NUM());
                    invStatusList.put("PAYMENT_STATUS",allInvoices.getAllInvoiceStatus().get(i).getPAYMENT_STATUS());
                    listOfInvoices.add(invStatusList);
                }
        }
        return  listOfInvoices;
    }
    
    public List<Map> getRejectedPRLists(String actionDate) throws Exception {
       
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("P_ACTION_DATE", actionDate);
        
        byte[] results =
            this.getReportBytes(REPORT_PASS_BASE_PATH + PR_REJECTED_REPORT, params,
                                true); 
        RejectedPRListCollection coll = (RejectedPRListCollection) this.parseXml(results,  RejectedPRListCollection.class);
        int size=coll.getRejectedPR().size();
        System.err.println("RejectedPRListCollection report : Size is >> "+size);
        Map prList ;
        List<Map> rejectedPRList = new ArrayList<Map>();
        if(coll!=null && size >0){
            for(int i =0;i<size;i++){
                    prList = new HashMap();
                    prList.put("REQUISITION_NUMBER",coll.getRejectedPR().get(i).getREQUISITION_NUMBER());
                    prList.put("APPROVER",coll.getRejectedPR().get(i).getAPPROVER());
                    rejectedPRList.add(prList);
                }
        }
        return  rejectedPRList;
    }
    
    public List<Map> getRejectedPRApprovers(String actionDate, String prNumber) throws Exception {
       
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("P_ACTION_DATE", actionDate);
        params.put("p_PR_NUM", prNumber);
        
        byte[] results =
            this.getReportBytes(REPORT_PASS_BASE_PATH + PR_REJECTED_REPORT_ATTACH, params,
                                true); 
        PRRejNotificationCollection coll = (PRRejNotificationCollection) this.parseXml(results,  PRRejNotificationCollection.class);
        int size=coll.getRejectedPR().size();
        System.err.println("PRRejNotificationCollection report : Size is >> "+size);
        Map prList ;
        List<Map> rejectedPRList = new ArrayList<Map>();
        if(coll!=null && size >0){
            for(int i =0;i<size;i++){
                    prList = new HashMap();
                    prList.put("ACTION_DATE",coll.getRejectedPR().get(i).getACTION_DATE());
                    prList.put("ACTION_CODE",coll.getRejectedPR().get(i).getACTION_CODE());
                    prList.put("APPROVER",coll.getRejectedPR().get(i).getAPPROVER());
                    prList.put("REQUISITION_NUMBER",coll.getRejectedPR().get(i).getREQUISITION_NUMBER());
                    prList.put("EMAIL_ADDRESS",coll.getRejectedPR().get(i).getEMAIL_ADDRESS());
                    rejectedPRList.add(prList);
                }
        }
        return  rejectedPRList;
    }
    
    public List<Map> getPRPaymentList(String actionDate) throws Exception {
       
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("P_PAY_DATE", actionDate);
        
        byte[] results =
            this.getReportBytes(REPORT_PASS_BASE_PATH + PR_PAYMENT_ALERT_REPORT, params,
                                true); 
        PRPaymentAlertCollection coll = (PRPaymentAlertCollection) this.parseXml(results,  PRPaymentAlertCollection.class);
        int size=coll.getPRPayment().size();
        System.err.println("PRPaymentAlertCollection report : Size is >> "+size);
        Map prList ;
        List<Map> paymentList = new ArrayList<Map>();
        if(coll!=null && size >0){
            for(int i =0;i<size;i++){
                    prList = new HashMap();
                    prList.put("REQUISITION_NUMBER",coll.getPRPayment().get(i).getREQUISITION_NUMBER());
                    prList.put("REQUESTER_NAME",coll.getPRPayment().get(i).getREQUESTER_NAME());
                    prList.put("PO_NUMBER",coll.getPRPayment().get(i).getPO_NUMBER());
                    prList.put("INVOICE_NUM",coll.getPRPayment().get(i).getINVOICE_NUM());
                    prList.put("EMAIL_ADDRESS",coll.getPRPayment().get(i).getEMAIL_ADDRESS());
                    paymentList.add(prList);
                }
        }
        return  paymentList;
    }
    
    public byte[] getRejectedPRAttachment(String actionDate, String prNumber) throws Exception {
       
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("P_ACTION_DATE", actionDate);
        params.put("p_PR_NUM", prNumber);
        
        byte[] results =
            this.getReportBytesPDF(REPORT_PASS_BASE_PATH + PR_REJECTED_REPORT_ATTACH, params,
                                true); 
       return results;
    }
    
    public byte[] getPRPaymentAttachment(String actionDate, String prNumber, String reqName) throws Exception {
       
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("P_PAY_DATE", actionDate);
        params.put("P_REQ_NUM", prNumber);
        params.put("REQ_NAME", reqName);
        
        byte[] results =
            this.getReportBytesPDF(REPORT_PASS_BASE_PATH + PR_PAYMENT_ALERT_ATTACH , params,
                                true); 
       return results;
    }
         
    public static void main(String[] args) { 
        
} 
        
}
