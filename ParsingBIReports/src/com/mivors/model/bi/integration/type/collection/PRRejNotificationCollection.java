package com.mivors.model.bi.integration.type.collection;

import com.mivors.model.bi.integration.type.PRRejNotification;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROWSET")
@XmlAccessorType(XmlAccessType.FIELD)
public class PRRejNotificationCollection implements TatweerCollection {
    
    @XmlElement(name = "ROW")
    private List<PRRejNotification> rejectedPR;
    
    public PRRejNotificationCollection() {
        super();
    }

    public void setRejectedPR(List<PRRejNotification> rejectedPR) {
        this.rejectedPR = rejectedPR;
    }

    public List<PRRejNotification> getRejectedPR() {
        return rejectedPR;
    }
}
