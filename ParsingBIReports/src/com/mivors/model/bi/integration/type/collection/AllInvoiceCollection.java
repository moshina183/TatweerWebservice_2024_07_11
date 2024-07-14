package com.mivors.model.bi.integration.type.collection;

import com.mivors.model.bi.integration.type.AllInvoiceReport;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROWSET")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllInvoiceCollection implements TatweerCollection {

    @XmlElement(name = "ROW")
    private List<AllInvoiceReport> allInvoiceStatus;

    public AllInvoiceCollection() {
        super();
    }

    public void setAllInvoiceStatus(List<AllInvoiceReport> allInvoiceStatus) {
        this.allInvoiceStatus = allInvoiceStatus;
    }

    public List<AllInvoiceReport> getAllInvoiceStatus() {
        return allInvoiceStatus;
    }
}
