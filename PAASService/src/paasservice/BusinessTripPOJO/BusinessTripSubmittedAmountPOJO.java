package paasservice.BusinessTripPOJO;

public class BusinessTripSubmittedAmountPOJO {
    public BusinessTripSubmittedAmountPOJO() {
        super();
    }
    
    private String SUBMITTED_AMOUNT;
    private String DIVISION;
    private String LOB;
    private String COST_CENTER_NUMBER;
    private String COST_CENTER;
    private String CODE_COMBINATION;

    public BusinessTripSubmittedAmountPOJO(String SUBMITTED_AMOUNT,
                                           String DIVISION, String LOB,
                                           String COST_CENTER_NUMBER,
                                           String COST_CENTER,
                                           String CODE_COMBINATION) {
        super();
        this.SUBMITTED_AMOUNT = SUBMITTED_AMOUNT!=null ? SUBMITTED_AMOUNT : "";
        this.DIVISION = DIVISION!=null ? DIVISION : "";
        this.LOB =  LOB!=null ? LOB : "";
        this.COST_CENTER_NUMBER =  COST_CENTER_NUMBER!=null ? COST_CENTER_NUMBER : "";
        this.COST_CENTER =  COST_CENTER!=null ? COST_CENTER : "";
        this.CODE_COMBINATION =  CODE_COMBINATION!=null ? CODE_COMBINATION : "";
    }

    public void setSUBMITTED_AMOUNT(String SUBMITTED_AMOUNT) {
        this.SUBMITTED_AMOUNT = SUBMITTED_AMOUNT;
    }

    public String getSUBMITTED_AMOUNT() {
        return SUBMITTED_AMOUNT;
    }

    public void setDIVISION(String DIVISION) {
        this.DIVISION = DIVISION;
    }

    public String getDIVISION() {
        return DIVISION;
    }

    public void setLOB(String LOB) {
        this.LOB = LOB;
    }

    public String getLOB() {
        return LOB;
    }

    public void setCOST_CENTER_NUMBER(String COST_CENTER_NUMBER) {
        this.COST_CENTER_NUMBER = COST_CENTER_NUMBER;
    }

    public String getCOST_CENTER_NUMBER() {
        return COST_CENTER_NUMBER;
    }

    public void setCOST_CENTER(String COST_CENTER) {
        this.COST_CENTER = COST_CENTER;
    }

    public String getCOST_CENTER() {
        return COST_CENTER;
    }

    public void setCODE_COMBINATION(String CODE_COMBINATION) {
        this.CODE_COMBINATION = CODE_COMBINATION;
    }

    public String getCODE_COMBINATION() {
        return CODE_COMBINATION;
    }
}
