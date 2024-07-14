package paasservice.Loan;

public class LoanPOJO {
    public LoanPOJO() {
        super();
    }
    
    private String LOAN_ID; 
    private String NO_OF_MONTHS; 
    private String DIVISION; 
    private String CREATION_DATE; 
    private String CREATED_BY; 
    private String PERSON_ID;
    private String STEP_ID; 
    private String PERSON_NAME; 
    private String REQUEST_STATUS; 
    private String REJECT_COMMENT; 
    private String ASSIGNEE; 
    private String CANCEL_REASON; 
    private String ASSIGNEE_NAME; 
    private String PERSON_POSITION; 
    private String PERSON_JOB; 
    private String PERSON_DEPARTMENT; 
    private String PERSON_LOCATION; 
    private String PERSON_GRADE; 
    private String BASIC_SALARY; 
    private String EMP_BASIC_SALARY; 
    private String TOTAL_AMOUNT; 
    private String YEAR_END; 
    private String AMOUNT_IN_YEAR; 
    private String ACTION_TAKEN;

    public LoanPOJO(String LOAN_ID, String NO_OF_MONTHS, String DIVISION,
                    String CREATION_DATE, String CREATED_BY, String PERSON_ID,
                    String STEP_ID, String PERSON_NAME, String REQUEST_STATUS,
                    String REJECT_COMMENT, String ASSIGNEE,
                    String CANCEL_REASON, String ASSIGNEE_NAME,
                    String PERSON_POSITION, String PERSON_JOB,
                    String PERSON_DEPARTMENT, String PERSON_LOCATION,
                    String PERSON_GRADE, String BASIC_SALARY,
                    String EMP_BASIC_SALARY, String TOTAL_AMOUNT,
                    String YEAR_END, String AMOUNT_IN_YEAR,
                    String ACTION_TAKEN) {
        super();
        this.LOAN_ID = LOAN_ID!=null ? LOAN_ID : "";
        this.NO_OF_MONTHS = NO_OF_MONTHS!=null ? NO_OF_MONTHS : "";
        this.DIVISION = DIVISION!=null ? DIVISION : "";
        this.CREATION_DATE = CREATION_DATE!=null ? CREATION_DATE : "";
        this.CREATED_BY = CREATED_BY!=null ? CREATED_BY : "";
        this.PERSON_ID = PERSON_ID!=null ? PERSON_ID : "";
        this.STEP_ID = STEP_ID!=null ? STEP_ID : "";
        this.PERSON_NAME = PERSON_NAME!=null ? PERSON_NAME : "";
        this.REQUEST_STATUS = REQUEST_STATUS!=null ? REQUEST_STATUS : "";
        this.REJECT_COMMENT = REJECT_COMMENT!=null ? REJECT_COMMENT : "";
        this.ASSIGNEE = ASSIGNEE!=null ? ASSIGNEE : "";
        this.CANCEL_REASON = CANCEL_REASON!=null ? CANCEL_REASON : "";
        this.ASSIGNEE_NAME = ASSIGNEE_NAME!=null ? ASSIGNEE_NAME : "";
        this.PERSON_POSITION = PERSON_POSITION!=null ? PERSON_POSITION : "";
        this.PERSON_JOB = PERSON_JOB!=null ? PERSON_JOB : "";
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT!=null ? PERSON_DEPARTMENT : "";
        this.PERSON_LOCATION = PERSON_LOCATION!=null ? PERSON_LOCATION : "";
        this.PERSON_GRADE = PERSON_GRADE!=null ? PERSON_GRADE : "";
        this.BASIC_SALARY = BASIC_SALARY!=null ? BASIC_SALARY : "";
        this.EMP_BASIC_SALARY = EMP_BASIC_SALARY!=null ? EMP_BASIC_SALARY : "";
        this.TOTAL_AMOUNT = TOTAL_AMOUNT!=null ? TOTAL_AMOUNT : "";
        this.YEAR_END = YEAR_END!=null ? YEAR_END : "";
        this.AMOUNT_IN_YEAR = AMOUNT_IN_YEAR!=null ? AMOUNT_IN_YEAR : "";
        this.ACTION_TAKEN = ACTION_TAKEN!=null ? ACTION_TAKEN : "";
    }

    public void setLOAN_ID(String LOAN_ID) {
        this.LOAN_ID = LOAN_ID;
    }

    public String getLOAN_ID() {
        return LOAN_ID;
    }

    public void setNO_OF_MONTHS(String NO_OF_MONTHS) {
        this.NO_OF_MONTHS = NO_OF_MONTHS;
    }

    public String getNO_OF_MONTHS() {
        return NO_OF_MONTHS;
    }

    public void setDIVISION(String DIVISION) {
        this.DIVISION = DIVISION;
    }

    public String getDIVISION() {
        return DIVISION;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setPERSON_ID(String PERSON_ID) {
        this.PERSON_ID = PERSON_ID;
    }

    public String getPERSON_ID() {
        return PERSON_ID;
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

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
    }

    public void setREJECT_COMMENT(String REJECT_COMMENT) {
        this.REJECT_COMMENT = REJECT_COMMENT;
    }

    public String getREJECT_COMMENT() {
        return REJECT_COMMENT;
    }

    public void setASSIGNEE(String ASSIGNEE) {
        this.ASSIGNEE = ASSIGNEE;
    }

    public String getASSIGNEE() {
        return ASSIGNEE;
    }

    public void setCANCEL_REASON(String CANCEL_REASON) {
        this.CANCEL_REASON = CANCEL_REASON;
    }

    public String getCANCEL_REASON() {
        return CANCEL_REASON;
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

    public void setPERSON_LOCATION(String PERSON_LOCATION) {
        this.PERSON_LOCATION = PERSON_LOCATION;
    }

    public String getPERSON_LOCATION() {
        return PERSON_LOCATION;
    }

    public void setPERSON_GRADE(String PERSON_GRADE) {
        this.PERSON_GRADE = PERSON_GRADE;
    }

    public String getPERSON_GRADE() {
        return PERSON_GRADE;
    }

    public void setBASIC_SALARY(String BASIC_SALARY) {
        this.BASIC_SALARY = BASIC_SALARY;
    }

    public String getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setEMP_BASIC_SALARY(String EMP_BASIC_SALARY) {
        this.EMP_BASIC_SALARY = EMP_BASIC_SALARY;
    }

    public String getEMP_BASIC_SALARY() {
        return EMP_BASIC_SALARY;
    }

    public void setTOTAL_AMOUNT(String TOTAL_AMOUNT) {
        this.TOTAL_AMOUNT = TOTAL_AMOUNT;
    }

    public String getTOTAL_AMOUNT() {
        return TOTAL_AMOUNT;
    }

    public void setYEAR_END(String YEAR_END) {
        this.YEAR_END = YEAR_END;
    }

    public String getYEAR_END() {
        return YEAR_END;
    }

    public void setAMOUNT_IN_YEAR(String AMOUNT_IN_YEAR) {
        this.AMOUNT_IN_YEAR = AMOUNT_IN_YEAR;
    }

    public String getAMOUNT_IN_YEAR() {
        return AMOUNT_IN_YEAR;
    }

    public void setACTION_TAKEN(String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }

    public String getACTION_TAKEN() {
        return ACTION_TAKEN;
    }
}
