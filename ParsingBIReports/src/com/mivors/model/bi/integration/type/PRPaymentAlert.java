package com.mivors.model.bi.integration.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROW")
@XmlAccessorType(XmlAccessType.FIELD)

public class PRPaymentAlert {
    
    @XmlElement(name = "REQUISITION_NUMBER")
    private String REQUISITION_NUMBER;
    
    @XmlElement(name = "DESCRIPTION")
    private String DESCRIPTION; 
    
    @XmlElement(name = "REQUESTER_NAME")
    private String REQUESTER_NAME; 
    
    @XmlElement(name = "EMAIL_ADDRESS")
    private String EMAIL_ADDRESS;
    
    @XmlElement(name = "PO_NUMBER")
    private String PO_NUMBER; 
    
    @XmlElement(name = "INVOICE_NUM")
    private String INVOICE_NUM; 
    
    @XmlElement(name = "INVOICE_AMOUNT")
    private String INVOICE_AMOUNT; 
    
    @XmlElement(name = "INVOICE_DATE")
    private String INVOICE_DATE; 
    
    public PRPaymentAlert() {
        super();
    }

    public void setREQUISITION_NUMBER(String REQUISITION_NUMBER) {
        this.REQUISITION_NUMBER = REQUISITION_NUMBER;
    }

    public String getREQUISITION_NUMBER() {
        return REQUISITION_NUMBER;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setREQUESTER_NAME(String REQUESTER_NAME) {
        this.REQUESTER_NAME = REQUESTER_NAME;
    }

    public String getREQUESTER_NAME() {
        return REQUESTER_NAME;
    }

    public void setEMAIL_ADDRESS(String EMAIL_ADDRESS) {
        this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    }

    public String getEMAIL_ADDRESS() {
        return EMAIL_ADDRESS;
    }

    public void setPO_NUMBER(String PO_NUMBER) {
        this.PO_NUMBER = PO_NUMBER;
    }

    public String getPO_NUMBER() {
        return PO_NUMBER;
    }

    public void setINVOICE_NUM(String INVOICE_NUM) {
        this.INVOICE_NUM = INVOICE_NUM;
    }

    public String getINVOICE_NUM() {
        return INVOICE_NUM;
    }

    public void setINVOICE_AMOUNT(String INVOICE_AMOUNT) {
        this.INVOICE_AMOUNT = INVOICE_AMOUNT;
    }

    public String getINVOICE_AMOUNT() {
        return INVOICE_AMOUNT;
    }

    public void setINVOICE_DATE(String INVOICE_DATE) {
        this.INVOICE_DATE = INVOICE_DATE;
    }

    public String getINVOICE_DATE() {
        return INVOICE_DATE;
    }
}
