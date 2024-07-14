package com.mivors.model.bi.integration.type.collection;

import com.mivors.model.bi.integration.type.PRRejNotification;

import com.mivors.model.bi.integration.type.RejectedPRList;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROWSET")
@XmlAccessorType(XmlAccessType.FIELD)

public class RejectedPRListCollection implements TatweerCollection{
    
    @XmlElement(name = "ROW")
    private List<RejectedPRList> rejectedPR;
    
    public RejectedPRListCollection() {
        super();
    }

    public void setRejectedPR(List<RejectedPRList> rejectedPR) {
        this.rejectedPR = rejectedPR;
    }

    public List<RejectedPRList> getRejectedPR() {
        return rejectedPR;
    }
}
