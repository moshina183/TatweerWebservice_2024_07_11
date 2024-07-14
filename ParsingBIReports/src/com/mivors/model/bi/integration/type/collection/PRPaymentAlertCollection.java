package com.mivors.model.bi.integration.type.collection;

import com.mivors.model.bi.integration.type.PRPaymentAlert;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROWSET")
@XmlAccessorType(XmlAccessType.FIELD)

public class PRPaymentAlertCollection implements TatweerCollection {
    public PRPaymentAlertCollection() {
        super();
    }
    
    @XmlElement(name = "ROW")
    private List<PRPaymentAlert> PRPayment;

    public void setPRPayment(List<PRPaymentAlert> PRPayment) {
        this.PRPayment = PRPayment;
    }

    public List<PRPaymentAlert> getPRPayment() {
        return PRPayment;
    }
}
