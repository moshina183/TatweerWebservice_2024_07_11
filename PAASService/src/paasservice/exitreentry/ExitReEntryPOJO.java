package paasservice.exitreentry;

public class ExitReEntryPOJO {

    private String EXIT_RE_ENTRY_ID;
    private String TRAVEL_DATE;
    private String CREATION_DATE;
    private String NO_OF_CHILDS;
    private String RELATED_BT_NO;
    private String AMOUNT;
    private String SELF_FLAG;
    private String SPOUSE_FLAG;
    private String CHILDS_FLAG;
    private String TOTAL_WANTED_AMOUNT;
    private String STEP_ID;
    private String MARITAL_STATUS;
    private String PAYMENT_REQUEST;
    private String FAMILY_PERIOD;
    private String VISA_INFORMATION;
    private String PERSON_NAME;
    private String PERSON_NUMBER;
    private String ASSIGNEE;
    private String OTHER_REQUEST_REASON;
    private String ASSIGNEE_NAME;
    private String PERSON_POSITION;
    private String PERSON_JOB;
    private String PERSON_LOCATION;
    private String PERSON_DEPARTMENT;
    private String NATIONALITY;
    private String REQUEST_STATUS;
    private String TYPE_OF_EXIT_RE_ENTRY;
    private String REJECTION_REASON;
    private String ONLIN_PAYMENT;
    private String REQUEST_REASON;
    private String ACTION_TAKEN;
    private String PERSON_GRADE;
    private String COMMENTS;

    public ExitReEntryPOJO() {
        super();
    }

    public ExitReEntryPOJO(String EXIT_RE_ENTRY_ID,
                           String TRAVEL_DATE, String CREATION_DATE,
                           String NO_OF_CHILDS, String RELATED_BT_NO,
                           String AMOUNT, String SELF_FLAG, String SPOUSE_FLAG,
                           String CHILDS_FLAG, String TOTAL_WANTED_AMOUNT,
                           String STEP_ID, String MARITAL_STATUS,
                           String PAYMENT_REQUEST, String FAMILY_PERIOD,
                           String VISA_INFORMATION, String PERSON_NAME,
                           String PERSON_NUMBER,
                           String ASSIGNEE, String OTHER_REQUEST_REASON,
                           String ASSIGNEE_NAME, String PERSON_POSITION,
                           String PERSON_JOB, String PERSON_LOCATION,
                           String PERSON_DEPARTMENT, String NATIONALITY,
                           String REQUEST_STATUS, String TYPE_OF_EXIT_RE_ENTRY,
                           String REJECTION_REASON, String ONLIN_PAYMENT,
                           String REQUEST_REASON, String ACTION_TAKEN,
                           String PERSON_GRADE, String COMMENTS) {
        super();
        this.EXIT_RE_ENTRY_ID = EXIT_RE_ENTRY_ID;
        this.TRAVEL_DATE = (TRAVEL_DATE == null ? "" : TRAVEL_DATE);
        this.CREATION_DATE = (CREATION_DATE == null ? "" : CREATION_DATE);
        this.NO_OF_CHILDS = (NO_OF_CHILDS == null ? "" : NO_OF_CHILDS);
        this.RELATED_BT_NO = (RELATED_BT_NO == null ? "" : RELATED_BT_NO);
        this.AMOUNT = (AMOUNT == null ? "" : AMOUNT);
        this.SELF_FLAG = (SELF_FLAG == null ? "" : SELF_FLAG);
        this.SPOUSE_FLAG = (SPOUSE_FLAG == null ? "" : SPOUSE_FLAG);
        this.CHILDS_FLAG = (CHILDS_FLAG == null ? "" : CHILDS_FLAG);
        this.TOTAL_WANTED_AMOUNT = (TOTAL_WANTED_AMOUNT == null ? "" : TOTAL_WANTED_AMOUNT);
        this.STEP_ID = (STEP_ID == null ? "" : STEP_ID);
        this.EXIT_RE_ENTRY_ID = (EXIT_RE_ENTRY_ID == null ? "" : EXIT_RE_ENTRY_ID);
        this.MARITAL_STATUS = (MARITAL_STATUS == null ? "" : MARITAL_STATUS);
        this.PAYMENT_REQUEST = (PAYMENT_REQUEST == null ? "" : PAYMENT_REQUEST);
        this.FAMILY_PERIOD = (FAMILY_PERIOD == null ? "" : FAMILY_PERIOD);
        this.VISA_INFORMATION = (VISA_INFORMATION == null ? "" : VISA_INFORMATION);
        this.PERSON_NAME = (PERSON_NAME == null ? "" : PERSON_NAME);
        this.PERSON_NUMBER = (PERSON_NUMBER == null ? "" : PERSON_NUMBER);
        this.ASSIGNEE = (ASSIGNEE == null ? "" : ASSIGNEE);
        this.OTHER_REQUEST_REASON = (OTHER_REQUEST_REASON == null ? "" : OTHER_REQUEST_REASON);
        this.ASSIGNEE_NAME = (ASSIGNEE_NAME == null ? "" : ASSIGNEE_NAME);
        this.PERSON_POSITION = (PERSON_POSITION == null ? "" : PERSON_POSITION);
        this.PERSON_JOB = (PERSON_JOB == null ? "" : PERSON_JOB);
        this.PERSON_LOCATION = (PERSON_LOCATION == null ? "" : PERSON_LOCATION);
        this.PERSON_DEPARTMENT = (PERSON_DEPARTMENT == null ? "" : PERSON_DEPARTMENT);
        this.NATIONALITY = (NATIONALITY == null ? "" : NATIONALITY);
        this.REQUEST_STATUS = (REQUEST_STATUS == null ? "" : REQUEST_STATUS);
        this.TYPE_OF_EXIT_RE_ENTRY = (TYPE_OF_EXIT_RE_ENTRY == null ? "" : TYPE_OF_EXIT_RE_ENTRY);
        this.REJECTION_REASON = (REJECTION_REASON == null ? "" : REJECTION_REASON);
        this.ONLIN_PAYMENT = (ONLIN_PAYMENT == null ? "" : ONLIN_PAYMENT);
        this.REQUEST_REASON = (REQUEST_REASON == null ? "" : REQUEST_REASON);
        this.ACTION_TAKEN = (ACTION_TAKEN == null ? "" : ACTION_TAKEN);
        this.PERSON_GRADE = (PERSON_GRADE == null ? "" : PERSON_GRADE);
        this.COMMENTS = (COMMENTS == null ? "" : COMMENTS);
    }

    public void setEXIT_RE_ENTRY_ID(String EXIT_RE_ENTRY_ID) {
        this.EXIT_RE_ENTRY_ID = EXIT_RE_ENTRY_ID;
    }

    public String getEXIT_RE_ENTRY_ID() {
        return EXIT_RE_ENTRY_ID;
    }

    public void setPERSON_NUMBER(String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getPERSON_NUMBER() {
        return PERSON_NUMBER;
    }

    public void setTRAVEL_DATE(String TRAVEL_DATE) {
        this.TRAVEL_DATE = TRAVEL_DATE;
    }

    public String getTRAVEL_DATE() {
        return TRAVEL_DATE;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setNO_OF_CHILDS(String NO_OF_CHILDS) {
        this.NO_OF_CHILDS = NO_OF_CHILDS;
    }

    public String getNO_OF_CHILDS() {
        return NO_OF_CHILDS;
    }

    public void setRELATED_BT_NO(String RELATED_BT_NO) {
        this.RELATED_BT_NO = RELATED_BT_NO;
    }

    public String getRELATED_BT_NO() {
        return RELATED_BT_NO;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setSELF_FLAG(String SELF_FLAG) {
        this.SELF_FLAG = SELF_FLAG;
    }

    public String getSELF_FLAG() {
        return SELF_FLAG;
    }

    public void setSPOUSE_FLAG(String SPOUSE_FLAG) {
        this.SPOUSE_FLAG = SPOUSE_FLAG;
    }

    public String getSPOUSE_FLAG() {
        return SPOUSE_FLAG;
    }

    public void setCHILDS_FLAG(String CHILDS_FLAG) {
        this.CHILDS_FLAG = CHILDS_FLAG;
    }

    public String getCHILDS_FLAG() {
        return CHILDS_FLAG;
    }

    public void setTOTAL_WANTED_AMOUNT(String TOTAL_WANTED_AMOUNT) {
        this.TOTAL_WANTED_AMOUNT = TOTAL_WANTED_AMOUNT;
    }

    public String getTOTAL_WANTED_AMOUNT() {
        return TOTAL_WANTED_AMOUNT;
    }

    public void setSTEP_ID(String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getSTEP_ID() {
        return STEP_ID;
    }

    public void setMARITAL_STATUS(String MARITAL_STATUS) {
        this.MARITAL_STATUS = MARITAL_STATUS;
    }

    public String getMARITAL_STATUS() {
        return MARITAL_STATUS;
    }

    public void setPAYMENT_REQUEST(String PAYMENT_REQUEST) {
        this.PAYMENT_REQUEST = PAYMENT_REQUEST;
    }

    public String getPAYMENT_REQUEST() {
        return PAYMENT_REQUEST;
    }

    public void setFAMILY_PERIOD(String FAMILY_PERIOD) {
        this.FAMILY_PERIOD = FAMILY_PERIOD;
    }

    public String getFAMILY_PERIOD() {
        return FAMILY_PERIOD;
    }

    public void setVISA_INFORMATION(String VISA_INFORMATION) {
        this.VISA_INFORMATION = VISA_INFORMATION;
    }

    public String getVISA_INFORMATION() {
        return VISA_INFORMATION;
    }

    public void setPERSON_NAME(String PERSON_NAME) {
        this.PERSON_NAME = PERSON_NAME;
    }

    public String getPERSON_NAME() {
        return PERSON_NAME;
    }

    public void setASSIGNEE(String ASSIGNEE) {
        this.ASSIGNEE = ASSIGNEE;
    }

    public String getASSIGNEE() {
        return ASSIGNEE;
    }

    public void setOTHER_REQUEST_REASON(String OTHER_REQUEST_REASON) {
        this.OTHER_REQUEST_REASON = OTHER_REQUEST_REASON;
    }

    public String getOTHER_REQUEST_REASON() {
        return OTHER_REQUEST_REASON;
    }

    public void setASSIGNEE_NAME(String ASSIGNEE_NAME) {
        this.ASSIGNEE_NAME = ASSIGNEE_NAME;
    }

    public String getASSIGNEE_NAME() {
        return ASSIGNEE_NAME;
    }

    public void setPERSON_POSITION(String PERSON_POSITION) {
        this.PERSON_POSITION = PERSON_POSITION;
    }

    public String getPERSON_POSITION() {
        return PERSON_POSITION;
    }

    public void setPERSON_JOB(String PERSON_JOB) {
        this.PERSON_JOB = PERSON_JOB;
    }

    public String getPERSON_JOB() {
        return PERSON_JOB;
    }

    public void setPERSON_LOCATION(String PERSON_LOCATION) {
        this.PERSON_LOCATION = PERSON_LOCATION;
    }

    public String getPERSON_LOCATION() {
        return PERSON_LOCATION;
    }

    public void setPERSON_DEPARTMENT(String PERSON_DEPARTMENT) {
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT;
    }

    public String getPERSON_DEPARTMENT() {
        return PERSON_DEPARTMENT;
    }

    public void setNATIONALITY(String NATIONALITY) {
        this.NATIONALITY = NATIONALITY;
    }

    public String getNATIONALITY() {
        return NATIONALITY;
    }

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
    }

    public void setTYPE_OF_EXIT_RE_ENTRY(String TYPE_OF_EXIT_RE_ENTRY) {
        this.TYPE_OF_EXIT_RE_ENTRY = TYPE_OF_EXIT_RE_ENTRY;
    }

    public String getTYPE_OF_EXIT_RE_ENTRY() {
        return TYPE_OF_EXIT_RE_ENTRY;
    }

    public void setREJECTION_REASON(String REJECTION_REASON) {
        this.REJECTION_REASON = REJECTION_REASON;
    }

    public String getREJECTION_REASON() {
        return REJECTION_REASON;
    }

    public void setONLIN_PAYMENT(String ONLIN_PAYMENT) {
        this.ONLIN_PAYMENT = ONLIN_PAYMENT;
    }

    public String getONLIN_PAYMENT() {
        return ONLIN_PAYMENT;
    }

    public void setREQUEST_REASON(String REQUEST_REASON) {
        this.REQUEST_REASON = REQUEST_REASON;
    }

    public String getREQUEST_REASON() {
        return REQUEST_REASON;
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
