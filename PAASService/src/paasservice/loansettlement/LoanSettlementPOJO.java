package paasservice.loansettlement;

public class LoanSettlementPOJO {
    
    private String LOAN_PRECLOSURE_ID;
    private String LOAN_ID;
    private String LOAN_CREATION_DATE;
    private String LOAN_TOTAL_AMOUNT;
    private String LOAN_REMAINING_AMOUNT;
    private String LOAN_NO_OF_MONTHS;
    private String LOAN_DIVISION;
    private String PERSON_JOB;
    private String PERSON_POSITION;
    private String PERSON_LOCATION;
    private String PERSON_DEPARTMENT;
    private String PERSON_GRADE;
    private String PERSON_NAME;
    private String PERSON_NUMBER;
    private String STEP_ID;
    private String ASSIGNEE;
    private String ASSIGNEE_NAME;
    private String REQUEST_STATUS;
    private String ACTION_TAKEN;
    private String REJECT_COMMENT;
    private String CREATED_BY;
    private String LAST_UPDATED_BY;
    private String CREATED_ON;
    private String LAST_UPDATED_ON;
    
    public LoanSettlementPOJO() {
        super();
    }

    public LoanSettlementPOJO(String LOAN_PRECLOSURE_ID, String LOAN_ID,
                              String LOAN_CREATION_DATE,
                              String LOAN_TOTAL_AMOUNT,
                              String LOAN_REMAINING_AMOUNT,
                              String LOAN_NO_OF_MONTHS, String LOAN_DIVISION,
                              String PERSON_JOB, String PERSON_POSITION,
                              String PERSON_LOCATION, String PERSON_DEPARTMENT,
                              String PERSON_GRADE, String PERSON_NAME,
                              String PERSON_NUMBER, String STEP_ID,
                              String ASSIGNEE, String ASSIGNEE_NAME,
                              String REQUEST_STATUS, String ACTION_TAKEN,
                              String REJECT_COMMENT, String CREATED_BY,
                              String LAST_UPDATED_BY, String CREATED_ON,
                              String LAST_UPDATED_ON) {
        super();
        this.LOAN_PRECLOSURE_ID =( LOAN_PRECLOSURE_ID == null ? "" : LOAN_PRECLOSURE_ID );
        this.LOAN_ID =( LOAN_ID == null ? "" : LOAN_ID );
        this.LOAN_CREATION_DATE =( LOAN_CREATION_DATE == null ? "" : LOAN_CREATION_DATE );
        this.LOAN_TOTAL_AMOUNT =( LOAN_TOTAL_AMOUNT == null ? "" : LOAN_TOTAL_AMOUNT );
        this.LOAN_REMAINING_AMOUNT=( LOAN_REMAINING_AMOUNT == null ? "" : LOAN_REMAINING_AMOUNT );
        this.LOAN_NO_OF_MONTHS =( LOAN_NO_OF_MONTHS == null ? "" : LOAN_NO_OF_MONTHS );
        this.LOAN_DIVISION =( LOAN_DIVISION == null ? "" : LOAN_DIVISION );
        this.PERSON_JOB =( PERSON_JOB == null ? "" : PERSON_JOB );
        this.PERSON_POSITION =( PERSON_POSITION == null ? "" : PERSON_POSITION );
        this.PERSON_LOCATION =( PERSON_LOCATION == null ? "" : PERSON_LOCATION );
        this.PERSON_DEPARTMENT =( PERSON_DEPARTMENT == null ? "" : PERSON_DEPARTMENT );
        this.PERSON_GRADE =( PERSON_GRADE == null ? "" : PERSON_GRADE );
        this.PERSON_NAME =( PERSON_NAME == null ? "" : PERSON_NAME );
        this.PERSON_NUMBER =( PERSON_NUMBER == null ? "" : PERSON_NUMBER );
        this.STEP_ID =( STEP_ID == null ? "" : STEP_ID );
        this.ASSIGNEE =( ASSIGNEE == null ? "" : ASSIGNEE );
        this.ASSIGNEE_NAME =( ASSIGNEE_NAME == null ? "" : ASSIGNEE_NAME );
        this.REQUEST_STATUS =( REQUEST_STATUS == null ? "" : REQUEST_STATUS );
        this.ACTION_TAKEN =( ACTION_TAKEN == null ? "" : ACTION_TAKEN );
        this.REJECT_COMMENT =( REJECT_COMMENT == null ? "" : REJECT_COMMENT );
        this.CREATED_BY =( CREATED_BY == null ? "" : CREATED_BY );
        this.LAST_UPDATED_BY =( LAST_UPDATED_BY == null ? "" : LAST_UPDATED_BY );
        this.CREATED_ON =( CREATED_ON == null ? "" : CREATED_ON );
        this.LAST_UPDATED_ON =( LAST_UPDATED_ON == null ? "" : LAST_UPDATED_ON );
        
    }

    public void setLOAN_PRECLOSURE_ID(String LOAN_PRECLOSURE_ID) {
        this.LOAN_PRECLOSURE_ID = LOAN_PRECLOSURE_ID;
    }

    public String getLOAN_PRECLOSURE_ID() {
        return LOAN_PRECLOSURE_ID;
    }

    public void setLOAN_ID(String LOAN_ID) {
        this.LOAN_ID = LOAN_ID;
    }

    public String getLOAN_ID() {
        return LOAN_ID;
    }

    public void setLOAN_CREATION_DATE(String LOAN_CREATION_DATE) {
        this.LOAN_CREATION_DATE = LOAN_CREATION_DATE;
    }

    public String getLOAN_CREATION_DATE() {
        return LOAN_CREATION_DATE;
    }

    public void setLOAN_TOTAL_AMOUNT(String LOAN_TOTAL_AMOUNT) {
        this.LOAN_TOTAL_AMOUNT = LOAN_TOTAL_AMOUNT;
    }

    public String getLOAN_TOTAL_AMOUNT() {
        return LOAN_TOTAL_AMOUNT;
    }

    public void setLOAN_REMAINING_AMOUNT(String LOAN_REMAINING_AMOUNT) {
        this.LOAN_REMAINING_AMOUNT = LOAN_REMAINING_AMOUNT;
    }

    public String getLOAN_REMAINING_AMOUNT() {
        return LOAN_REMAINING_AMOUNT;
    }

    public void setLOAN_NO_OF_MONTHS(String LOAN_NO_OF_MONTHS) {
        this.LOAN_NO_OF_MONTHS = LOAN_NO_OF_MONTHS;
    }

    public String getLOAN_NO_OF_MONTHS() {
        return LOAN_NO_OF_MONTHS;
    }

    public void setLOAN_DIVISION(String LOAN_DIVISION) {
        this.LOAN_DIVISION = LOAN_DIVISION;
    }

    public String getLOAN_DIVISION() {
        return LOAN_DIVISION;
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

    public void setPERSON_GRADE(String PERSON_GRADE) {
        this.PERSON_GRADE = PERSON_GRADE;
    }

    public String getPERSON_GRADE() {
        return PERSON_GRADE;
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

    public void setSTEP_ID(String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getSTEP_ID() {
        return STEP_ID;
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

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
    }

    public void setACTION_TAKEN(String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }

    public String getACTION_TAKEN() {
        return ACTION_TAKEN;
    }

    public void setREJECT_COMMENT(String REJECT_COMMENT) {
        this.REJECT_COMMENT = REJECT_COMMENT;
    }

    public String getREJECT_COMMENT() {
        return REJECT_COMMENT;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setLAST_UPDATED_BY(String LAST_UPDATED_BY) {
        this.LAST_UPDATED_BY = LAST_UPDATED_BY;
    }

    public String getLAST_UPDATED_BY() {
        return LAST_UPDATED_BY;
    }

    public void setCREATED_ON(String CREATED_ON) {
        this.CREATED_ON = CREATED_ON;
    }

    public String getCREATED_ON() {
        return CREATED_ON;
    }

    public void setLAST_UPDATED_ON(String LAST_UPDATED_ON) {
        this.LAST_UPDATED_ON = LAST_UPDATED_ON;
    }

    public String getLAST_UPDATED_ON() {
        return LAST_UPDATED_ON;
    }
}
