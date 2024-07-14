package com.mivors.model.bi.integration.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROW")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllInvoiceReport {
    
    @XmlElement(name = "INVOICE_NUM")
    private String INVOICE_NUM; 
    
    @XmlElement(name = "PAYMENT_STATUS")
    private String PAYMENT_STATUS; 
    
    public AllInvoiceReport() {
        super();
    }

    public void setINVOICE_NUM(String INVOICE_NUM) {
        this.INVOICE_NUM = INVOICE_NUM;
    }

    public String getINVOICE_NUM() {
        return INVOICE_NUM;
    }

    public void setPAYMENT_STATUS(String PAYMENT_STATUS) {
        this.PAYMENT_STATUS = PAYMENT_STATUS;
    }

    public String getPAYMENT_STATUS() {
        return PAYMENT_STATUS;
    }
}
