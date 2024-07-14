package paasservice.repayment;

public class RepaymentTicketsPOJO {

    private String CREATION_DATE;
    private String TRAVEL_DATE;
    private String LAST_UPDATED_ON;
    private String TO_DATE;
    private String COMPENSATION_PRICE;
    private String AMOUNT;
    private String REPAYMENT_TICKETS_ID;
    private String END_BALANCE;
    private String STEP_ID;
    private String PERSON_NAME;
    private String DESTINATION;
    private String OTHER_REASON;
    private String PERSON_NUMBER;
    private String PERSON_DEPARTMENT;
    private String ASSIGNEE;
    private String ASSIGNEE_NAME;
    private String PERSON_LOCATION;
    private String PERSON_JOB;
    private String PERSON_POSITION;
    private String PAYMENT_METHOD;
    private String REQUEST_REASON;
    private String REQUEST_STATUS;
    private String PAYMENT_STATUS;
    private String INVOICE_NUMBER;
    private String REJECTION_REASON;
    private String ACTION_TAKEN;
    private String PERSON_GRADE;
    private String COMMENTS;

    public RepaymentTicketsPOJO() {
        super();
    }

    public RepaymentTicketsPOJO(String CREATION_DATE, String TRAVEL_DATE,
                                String LAST_UPDATED_ON, String TO_DATE,
                                String COMPENSATION_PRICE, String AMOUNT,
                                String REPAYMENT_TICKETS_ID,
                                String END_BALANCE, String STEP_ID,
                                String PERSON_NAME, String DESTINATION,
                                String OTHER_REASON, String PERSON_NUMBER,
                                String PERSON_DEPARTMENT, String ASSIGNEE,
                                String ASSIGNEE_NAME, String PERSON_LOCATION,
                                String PERSON_JOB, String PERSON_POSITION,
                                String PAYMENT_METHOD, String REQUEST_REASON,
                                String REQUEST_STATUS, String PAYMENT_STATUS,
                                String INVOICE_NUMBER, String REJECTION_REASON,
                                String ACTION_TAKEN, String PERSON_GRADE,
                                String COMMENTS) {
        super();
        this.CREATION_DATE = (CREATION_DATE == null ? "" : CREATION_DATE);
        this.TRAVEL_DATE = (TRAVEL_DATE == null ? "" : TRAVEL_DATE);
        this.LAST_UPDATED_ON =
                (LAST_UPDATED_ON == null ? "" : LAST_UPDATED_ON);
        this.TO_DATE = (TO_DATE == null ? "" : TO_DATE);
        this.COMPENSATION_PRICE =
                (COMPENSATION_PRICE == null ? "" : COMPENSATION_PRICE);
        this.AMOUNT = (AMOUNT == null ? "" : AMOUNT);
        this.REPAYMENT_TICKETS_ID =
                (REPAYMENT_TICKETS_ID == null ? "" : REPAYMENT_TICKETS_ID);
        this.END_BALANCE = (END_BALANCE == null ? "" : END_BALANCE);
        this.STEP_ID = (STEP_ID == null ? "" : STEP_ID);
        this.PERSON_NAME = (PERSON_NAME == null ? "" : PERSON_NAME);
        this.DESTINATION = (DESTINATION == null ? "" : DESTINATION);
        this.OTHER_REASON = (OTHER_REASON == null ? "" : OTHER_REASON);
        this.PERSON_NUMBER = (PERSON_NUMBER == null ? "" : PERSON_NUMBER);
        this.PERSON_DEPARTMENT =
                (PERSON_DEPARTMENT == null ? "" : PERSON_DEPARTMENT);
        this.ASSIGNEE = (ASSIGNEE == null ? "" : ASSIGNEE);
        this.ASSIGNEE_NAME = (ASSIGNEE_NAME == null ? "" : ASSIGNEE_NAME);
        this.PERSON_LOCATION =
                (PERSON_LOCATION == null ? "" : PERSON_LOCATION);
        this.PERSON_JOB = (PERSON_JOB == null ? "" : PERSON_JOB);
        this.PERSON_POSITION =
                (PERSON_POSITION == null ? "" : PERSON_POSITION);
        this.PAYMENT_METHOD = (PAYMENT_METHOD == null ? "" : PAYMENT_METHOD);
        this.REQUEST_REASON = (REQUEST_REASON == null ? "" : REQUEST_REASON);
        this.REQUEST_STATUS = (REQUEST_STATUS == null ? "" : REQUEST_STATUS);
        this.PAYMENT_STATUS = (PAYMENT_STATUS == null ? "" : PAYMENT_STATUS);
        this.INVOICE_NUMBER = (INVOICE_NUMBER == null ? "" : INVOICE_NUMBER);
        this.REJECTION_REASON =
                (REJECTION_REASON == null ? "" : REJECTION_REASON);
        this.ACTION_TAKEN = (ACTION_TAKEN == null ? "" : ACTION_TAKEN);
        this.PERSON_GRADE = (PERSON_GRADE == null ? "" : PERSON_GRADE);
        this.COMMENTS = (COMMENTS == null ? "" : COMMENTS);
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setTRAVEL_DATE(String TRAVEL_DATE) {
        this.TRAVEL_DATE = TRAVEL_DATE;
    }

    public String getTRAVEL_DATE() {
        return TRAVEL_DATE;
    }

    public void setLAST_UPDATED_ON(String LAST_UPDATED_ON) {
        this.LAST_UPDATED_ON = LAST_UPDATED_ON;
    }

    public String getLAST_UPDATED_ON() {
        return LAST_UPDATED_ON;
    }

    public void setTO_DATE(String TO_DATE) {
        this.TO_DATE = TO_DATE;
    }

    public String getTO_DATE() {
        return TO_DATE;
    }

    public void setCOMPENSATION_PRICE(String COMPENSATION_PRICE) {
        this.COMPENSATION_PRICE = COMPENSATION_PRICE;
    }

    public String getCOMPENSATION_PRICE() {
        return COMPENSATION_PRICE;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setREPAYMENT_TICKETS_ID(String REPAYMENT_TICKETS_ID) {
        this.REPAYMENT_TICKETS_ID = REPAYMENT_TICKETS_ID;
    }

    public String getREPAYMENT_TICKETS_ID() {
        return REPAYMENT_TICKETS_ID;
    }

    public void setEND_BALANCE(String END_BALANCE) {
        this.END_BALANCE = END_BALANCE;
    }

    public String getEND_BALANCE() {
        return END_BALANCE;
    }

    public void setSTEP_ID(String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getSTEP_ID() {
        return STEP_ID;
    }

    public void setPERSON_NAME(String PERSON_NAME) {
        this.PERSON_NAME = PERSON_NAME;
    }

    public String getPERSON_NAME() {
        return PERSON_NAME;
    }

    public void setDESTINATION(String DESTINATION) {
        this.DESTINATION = DESTINATION;
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setOTHER_REASON(String OTHER_REASON) {
        this.OTHER_REASON = OTHER_REASON;
    }

    public String getOTHER_REASON() {
        return OTHER_REASON;
    }

    public void setPERSON_NUMBER(String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getPERSON_NUMBER() {
        return PERSON_NUMBER;
    }

    public void setPERSON_DEPARTMENT(String PERSON_DEPARTMENT) {
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT;
    }

    public String getPERSON_DEPARTMENT() {
        return PERSON_DEPARTMENT;
    }

    public void setASSIGNEE(String ASSIGNEE) {
        this.ASSIGNEE = ASSIGNEE;
    }

    public String getASSIGNEE() {
        return ASSIGNEE;
    }

    public void setASSIGNEE_NAME(String ASSIGNEE_NAME) {
        this.ASSIGNEE_NAME = ASSIGNEE_NAME;
    }

    public String getASSIGNEE_NAME() {
        return ASSIGNEE_NAME;
    }

    public void setPERSON_LOCATION(String PERSON_LOCATION) {
        this.PERSON_LOCATION = PERSON_LOCATION;
    }

    public String getPERSON_LOCATION() {
        return PERSON_LOCATION;
    }

    public void setPERSON_JOB(String PERSON_JOB) {
        this.PERSON_JOB = PERSON_JOB;
    }

    public String getPERSON_JOB() {
        return PERSON_JOB;
    }

    public void setPERSON_POSITION(String PERSON_POSITION) {
        this.PERSON_POSITION = PERSON_POSITION;
    }

    public String getPERSON_POSITION() {
        return PERSON_POSITION;
    }

    public void setPAYMENT_METHOD(String PAYMENT_METHOD) {
        this.PAYMENT_METHOD = PAYMENT_METHOD;
    }

    public String getPAYMENT_METHOD() {
        return PAYMENT_METHOD;
    }

    public void setREQUEST_REASON(String REQUEST_REASON) {
        this.REQUEST_REASON = REQUEST_REASON;
    }

    public String getREQUEST_REASON() {
        return REQUEST_REASON;
    }

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
    }

    public void setPAYMENT_STATUS(String PAYMENT_STATUS) {
        this.PAYMENT_STATUS = PAYMENT_STATUS;
    }

    public String getPAYMENT_STATUS() {
        return PAYMENT_STATUS;
    }

    public void setINVOICE_NUMBER(String INVOICE_NUMBER) {
        this.INVOICE_NUMBER = INVOICE_NUMBER;
    }

    public String getINVOICE_NUMBER() {
        return INVOICE_NUMBER;
    }

    public void setREJECTION_REASON(String REJECTION_REASON) {
        this.REJECTION_REASON = REJECTION_REASON;
    }

    public String getREJECTION_REASON() {
        return REJECTION_REASON;
    }

    public void setACTION_TAKEN(String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }

    public String getACTION_TAKEN() {
        return ACTION_TAKEN;
    }

    public void setPERSON_GRADE(String PERSON_GRADE) {
        this.PERSON_GRADE = PERSON_GRADE;
    }

    public String getPERSON_GRADE() {
        return PERSON_GRADE;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }
}
