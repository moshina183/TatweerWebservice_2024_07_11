package com.mivors.model.bi.integration.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROW")
@XmlAccessorType(XmlAccessType.FIELD)

public class RejectedPRList {
    public RejectedPRList() {
        super();
    }
    @XmlElement(name = "REQUISITION_NUMBER")
    private String REQUISITION_NUMBER;
    
    @XmlElement(name = "APPROVER")
    private String APPROVER;

    public void setREQUISITION_NUMBER(String REQUISITION_NUMBER) {
        this.REQUISITION_NUMBER = REQUISITION_NUMBER;
    }

    public String getREQUISITION_NUMBER() {
        return REQUISITION_NUMBER;
    }

    public void setAPPROVER(String APPROVER) {
        this.APPROVER = APPROVER;
    }

    public String getAPPROVER() {
        return APPROVER;
    }
}
