package paasservice.specialneed;

public class SpecialNeedsPOJO {

    private String CREATION_DATE;
    private String LAST_UPDATED_ON;
    private String STEP_ID;
    private String HR_RECOMENDATIONS_NO;
    private String SPECIAL_NEED_SUPPORT_ID;
    private String TAKEN_AMOUNT;
    private String AMOUNT;
    private String PERSON_NAME;
    private String PERSON_NUMBER;
    private String PERSON_LOCATION;
    private String ASSIGNEE;
    private String ASSIGNEE_NAME;
    private String PERSON_POSITION;
    private String PERSON_JOB;
    private String PERSON_DEPARTMENT;
    private String REQUEST_STATUS;
    private String PAYMENT_STATUS;
    private String INVOICE_NUMBER;
    private String HR_RECOMENDATIONS;
    private String REJECTION_REASON;
    private String ACTION_TAKEN;
    private String PERSON_GRADE;
    private String COMMENTS;

    public SpecialNeedsPOJO() {
        super();
    }

    public SpecialNeedsPOJO(String CREATION_DATE, String LAST_UPDATED_ON,
                            String STEP_ID, String HR_RECOMENDATIONS_NO,
                            String SPECIAL_NEED_SUPPORT_ID,
                            String TAKEN_AMOUNT, String AMOUNT,
                            String PERSON_NAME, String PERSON_NUMBER,
                            String PERSON_LOCATION, String ASSIGNEE,
                            String ASSIGNEE_NAME, String PERSON_POSITION,
                            String PERSON_JOB, String PERSON_DEPARTMENT,
                            String REQUEST_STATUS, String PAYMENT_STATUS,
                            String INVOICE_NUMBER, String HR_RECOMENDATIONS,
                            String REJECTION_REASON, String ACTION_TAKEN,
                            String PERSON_GRADE, String COMMENTS) {
        super();
        this.CREATION_DATE            = ( CREATION_DATE            == null ? "" : CREATION_DATE           );
        this.LAST_UPDATED_ON          = ( LAST_UPDATED_ON          == null ? "" : LAST_UPDATED_ON         );
        this.STEP_ID                  = ( STEP_ID                  == null ? "" : STEP_ID                 );
        this.HR_RECOMENDATIONS_NO     = ( HR_RECOMENDATIONS_NO     == null ? "" : HR_RECOMENDATIONS_NO    );
        this.SPECIAL_NEED_SUPPORT_ID  = ( SPECIAL_NEED_SUPPORT_ID  == null ? "" : SPECIAL_NEED_SUPPORT_ID );
        this.TAKEN_AMOUNT             = ( TAKEN_AMOUNT             == null ? "" : TAKEN_AMOUNT            );
        this.AMOUNT                   = ( AMOUNT                   == null ? "" : AMOUNT                  );
        this.PERSON_NAME              = ( PERSON_NAME              == null ? "" : PERSON_NAME             );
        this.PERSON_NUMBER            = ( PERSON_NUMBER            == null ? "" : PERSON_NUMBER           );
        this.PERSON_LOCATION          = ( PERSON_LOCATION          == null ? "" : PERSON_LOCATION         );
        this.ASSIGNEE                 = ( ASSIGNEE                 == null ? "" : ASSIGNEE                );
        this.ASSIGNEE_NAME            = ( ASSIGNEE_NAME            == null ? "" : ASSIGNEE_NAME           );
        this.PERSON_POSITION          = ( PERSON_POSITION          == null ? "" : PERSON_POSITION         );
        this.PERSON_JOB               = ( PERSON_JOB               == null ? "" : PERSON_JOB              );
        this.PERSON_DEPARTMENT        = ( PERSON_DEPARTMENT        == null ? "" : PERSON_DEPARTMENT       );
        this.REQUEST_STATUS           = ( REQUEST_STATUS           == null ? "" : REQUEST_STATUS          );
        this.PAYMENT_STATUS           = ( PAYMENT_STATUS           == null ? "" : PAYMENT_STATUS          );
        this.INVOICE_NUMBER           = ( INVOICE_NUMBER           == null ? "" : INVOICE_NUMBER          );
        this.HR_RECOMENDATIONS        = ( HR_RECOMENDATIONS        == null ? "" : HR_RECOMENDATIONS       );
        this.REJECTION_REASON         = ( REJECTION_REASON         == null ? "" : REJECTION_REASON        );
        this.ACTION_TAKEN             = ( ACTION_TAKEN             == null ? "" : ACTION_TAKEN            );
        this.PERSON_GRADE             = ( PERSON_GRADE             == null ? "" : PERSON_GRADE            );
        this.COMMENTS                 = ( COMMENTS                 == null ? "" : COMMENTS                );
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setLAST_UPDATED_ON(String LAST_UPDATED_ON) {
        this.LAST_UPDATED_ON = LAST_UPDATED_ON;
    }

    public String getLAST_UPDATED_ON() {
        return LAST_UPDATED_ON;
    }

    public void setSTEP_ID(String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getSTEP_ID() {
        return STEP_ID;
    }

    public void setHR_RECOMENDATIONS_NO(String HR_RECOMENDATIONS_NO) {
        this.HR_RECOMENDATIONS_NO = HR_RECOMENDATIONS_NO;
    }

    public String getHR_RECOMENDATIONS_NO() {
        return HR_RECOMENDATIONS_NO;
    }

    public void setSPECIAL_NEED_SUPPORT_ID(String SPECIAL_NEED_SUPPORT_ID) {
        this.SPECIAL_NEED_SUPPORT_ID = SPECIAL_NEED_SUPPORT_ID;
    }

    public String getSPECIAL_NEED_SUPPORT_ID() {
        return SPECIAL_NEED_SUPPORT_ID;
    }

    public void setTAKEN_AMOUNT(String TAKEN_AMOUNT) {
        this.TAKEN_AMOUNT = TAKEN_AMOUNT;
    }

    public String getTAKEN_AMOUNT() {
        return TAKEN_AMOUNT;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setPERSON_NAME(String PERSON_NAME) {
        this.PERSON_NAME = PERSON_NAME;
    }

    public String getPERSON_NAME() {
        return PERSON_NAME;
    }

    public void setPERSON_NUMBER(String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getPERSON_NUMBER() {
        return PERSON_NUMBER;
    }

    public void setPERSON_LOCATION(String PERSON_LOCATION) {
        this.PERSON_LOCATION = PERSON_LOCATION;
    }

    public String getPERSON_LOCATION() {
        return PERSON_LOCATION;
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

    public void setPERSON_DEPARTMENT(String PERSON_DEPARTMENT) {
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT;
    }

    public String getPERSON_DEPARTMENT() {
        return PERSON_DEPARTMENT;
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

    public void setHR_RECOMENDATIONS(String HR_RECOMENDATIONS) {
        this.HR_RECOMENDATIONS = HR_RECOMENDATIONS;
    }

    public String getHR_RECOMENDATIONS() {
        return HR_RECOMENDATIONS;
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
