package com.mivors.model.bi.integration.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROW")
@XmlAccessorType(XmlAccessType.FIELD)

public class PRRejNotification {
    
    @XmlElement(name = "ACTION_DATE")
    private String ACTION_DATE; 
    
    @XmlElement(name = "ACTION_CODE")
    private String ACTION_CODE; 
    
    @XmlElement(name = "APPROVER")
    private String APPROVER; 
    
    @XmlElement(name = "REQUISITION_NUMBER")
    private String REQUISITION_NUMBER; 
        
    @XmlElement(name = "EMAIL_ADDRESS")
    private String EMAIL_ADDRESS; 
    
    
    public PRRejNotification() {
        super();
    }

    public void setACTION_DATE(String ACTION_DATE) {
        this.ACTION_DATE = ACTION_DATE;
    }

    public String getACTION_DATE() {
        return ACTION_DATE;
    }

    public void setACTION_CODE(String ACTION_CODE) {
        this.ACTION_CODE = ACTION_CODE;
    }

    public String getACTION_CODE() {
        return ACTION_CODE;
    }

    public void setAPPROVER(String APPROVER) {
        this.APPROVER = APPROVER;
    }

    public String getAPPROVER() {
        return APPROVER;
    }

    public void setREQUISITION_NUMBER(String REQUISITION_NUMBER) {
        this.REQUISITION_NUMBER = REQUISITION_NUMBER;
    }

    public String getREQUISITION_NUMBER() {
        return REQUISITION_NUMBER;
    }

    public void setEMAIL_ADDRESS(String EMAIL_ADDRESS) {
        this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    }

    public String getEMAIL_ADDRESS() {
        return EMAIL_ADDRESS;
    }
}
