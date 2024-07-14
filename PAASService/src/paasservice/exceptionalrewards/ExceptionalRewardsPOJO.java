package paasservice.exceptionalrewards;

public class ExceptionalRewardsPOJO {

    private String CREATION_DATE;
    private String LAST_REWARD_DATE;
    private String HR_RECOMENDATIONS;
    private String REWARD_AMOUNT;
    private String PERCENTAGE_FROM_BASIC_SAL;
    private String BASIC_SALARY;
    private String STEP_ID;
    private String EXCEPTIONAL_REWARD_ID;
    private String PERSON_NAME;
    private String CREATED_BY_NAME;
    private String PERSON_NUMBER;
    private String CREATED_BY_NO;
    private String PERSON_JOB;
    private String PERSON_DEPARTMENT;
    private String PERSON_LOCATION;
    private String PERSON_POSITION;
    private String ASSIGNEE;
    private String ASSIGNEE_NAME;
    private String EMP_BASIC_SALARY;
    private String LAST_REWARD_DATE_STRING;
    private String REQUEST_STATUS;
    private String REJECTION_REASON;
    private String ACTION_TAKEN;
    private String PERSON_GRADE;
    private String JUSTIFICATION;

    public ExceptionalRewardsPOJO() {
        super();
    }

    public ExceptionalRewardsPOJO(String CREATION_DATE,
                                  String LAST_REWARD_DATE,
                                  String HR_RECOMENDATIONS,
                                  String REWARD_AMOUNT,
                                  String PERCENTAGE_FROM_BASIC_SAL,
                                  String BASIC_SALARY, String STEP_ID,
                                  String EXCEPTIONAL_REWARD_ID,
                                  String PERSON_NAME, String CREATED_BY_NAME,
                                  String PERSON_NUMBER, String CREATED_BY_NO,
                                  String PERSON_JOB, String PERSON_DEPARTMENT,
                                  String PERSON_LOCATION,
                                  String PERSON_POSITION, String ASSIGNEE,
                                  String ASSIGNEE_NAME,
                                  String EMP_BASIC_SALARY,
                                  String LAST_REWARD_DATE_STRING,
                                  String REQUEST_STATUS,
                                  String REJECTION_REASON, String ACTION_TAKEN,
                                  String PERSON_GRADE, String JUSTIFICATION) {
        super();
        this.CREATION_DATE = (CREATION_DATE == null ? "" : CREATION_DATE);
        this.LAST_REWARD_DATE =
                (LAST_REWARD_DATE == null ? "" : LAST_REWARD_DATE);
        this.HR_RECOMENDATIONS =
                (HR_RECOMENDATIONS == null ? "" : HR_RECOMENDATIONS);
        this.REWARD_AMOUNT = (REWARD_AMOUNT == null ? "" : REWARD_AMOUNT);
        this.PERCENTAGE_FROM_BASIC_SAL =
                (PERCENTAGE_FROM_BASIC_SAL == null ? "" :
                 PERCENTAGE_FROM_BASIC_SAL);
        this.BASIC_SALARY = (BASIC_SALARY == null ? "" : BASIC_SALARY);
        this.STEP_ID = (STEP_ID == null ? "" : STEP_ID);
        this.EXCEPTIONAL_REWARD_ID =
                (EXCEPTIONAL_REWARD_ID == null ? "" : EXCEPTIONAL_REWARD_ID);
        this.PERSON_NAME = (PERSON_NAME == null ? "" : PERSON_NAME);
        this.CREATED_BY_NAME =
                (CREATED_BY_NAME == null ? "" : CREATED_BY_NAME);
        this.PERSON_NUMBER = (PERSON_NUMBER == null ? "" : PERSON_NUMBER);
        this.CREATED_BY_NO = (CREATED_BY_NO == null ? "" : CREATED_BY_NO);
        this.PERSON_JOB = (PERSON_JOB == null ? "" : PERSON_JOB);
        this.PERSON_DEPARTMENT =
                (PERSON_DEPARTMENT == null ? "" : PERSON_DEPARTMENT);
        this.PERSON_LOCATION =
                (PERSON_LOCATION == null ? "" : PERSON_LOCATION);
        this.PERSON_POSITION =
                (PERSON_POSITION == null ? "" : PERSON_POSITION);
        this.ASSIGNEE = (ASSIGNEE == null ? "" : ASSIGNEE);
        this.ASSIGNEE_NAME = (ASSIGNEE_NAME == null ? "" : ASSIGNEE_NAME);
        this.EMP_BASIC_SALARY =
                (EMP_BASIC_SALARY == null ? "" : EMP_BASIC_SALARY);
        this.LAST_REWARD_DATE_STRING =
                (LAST_REWARD_DATE_STRING == null ? "" : LAST_REWARD_DATE_STRING);
        this.REQUEST_STATUS = (REQUEST_STATUS == null ? "" : REQUEST_STATUS);
        this.REJECTION_REASON =
                (REJECTION_REASON == null ? "" : REJECTION_REASON);
        this.ACTION_TAKEN = (ACTION_TAKEN == null ? "" : ACTION_TAKEN);
        this.PERSON_GRADE = (PERSON_GRADE == null ? "" : PERSON_GRADE);
        this.JUSTIFICATION = (JUSTIFICATION == null ? "" : JUSTIFICATION);
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setLAST_REWARD_DATE(String LAST_REWARD_DATE) {
        this.LAST_REWARD_DATE = LAST_REWARD_DATE;
    }

    public String getLAST_REWARD_DATE() {
        return LAST_REWARD_DATE;
    }

    public void setHR_RECOMENDATIONS(String HR_RECOMENDATIONS) {
        this.HR_RECOMENDATIONS = HR_RECOMENDATIONS;
    }

    public String getHR_RECOMENDATIONS() {
        return HR_RECOMENDATIONS;
    }

    public void setREWARD_AMOUNT(String REWARD_AMOUNT) {
        this.REWARD_AMOUNT = REWARD_AMOUNT;
    }

    public String getREWARD_AMOUNT() {
        return REWARD_AMOUNT;
    }

    public void setPERCENTAGE_FROM_BASIC_SAL(String PERCENTAGE_FROM_BASIC_SAL) {
        this.PERCENTAGE_FROM_BASIC_SAL = PERCENTAGE_FROM_BASIC_SAL;
    }

    public String getPERCENTAGE_FROM_BASIC_SAL() {
        return PERCENTAGE_FROM_BASIC_SAL;
    }

    public void setBASIC_SALARY(String BASIC_SALARY) {
        this.BASIC_SALARY = BASIC_SALARY;
    }

    public String getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setSTEP_ID(String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getSTEP_ID() {
        return STEP_ID;
    }

    public void setEXCEPTIONAL_REWARD_ID(String EXCEPTIONAL_REWARD_ID) {
        this.EXCEPTIONAL_REWARD_ID = EXCEPTIONAL_REWARD_ID;
    }

    public String getEXCEPTIONAL_REWARD_ID() {
        return EXCEPTIONAL_REWARD_ID;
    }

    public void setPERSON_NAME(String PERSON_NAME) {
        this.PERSON_NAME = PERSON_NAME;
    }

    public String getPERSON_NAME() {
        return PERSON_NAME;
    }

    public void setCREATED_BY_NAME(String CREATED_BY_NAME) {
        this.CREATED_BY_NAME = CREATED_BY_NAME;
    }

    public String getCREATED_BY_NAME() {
        return CREATED_BY_NAME;
    }

    public void setPERSON_NUMBER(String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getPERSON_NUMBER() {
        return PERSON_NUMBER;
    }

    public void setCREATED_BY_NO(String CREATED_BY_NO) {
        this.CREATED_BY_NO = CREATED_BY_NO;
    }

    public String getCREATED_BY_NO() {
        return CREATED_BY_NO;
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

    public void setPERSON_POSITION(String PERSON_POSITION) {
        this.PERSON_POSITION = PERSON_POSITION;
    }

    public String getPERSON_POSITION() {
        return PERSON_POSITION;
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

    public void setEMP_BASIC_SALARY(String EMP_BASIC_SALARY) {
        this.EMP_BASIC_SALARY = EMP_BASIC_SALARY;
    }

    public String getEMP_BASIC_SALARY() {
        return EMP_BASIC_SALARY;
    }

    public void setLAST_REWARD_DATE_STRING(String LAST_REWARD_DATE_STRING) {
        this.LAST_REWARD_DATE_STRING = LAST_REWARD_DATE_STRING;
    }

    public String getLAST_REWARD_DATE_STRING() {
        return LAST_REWARD_DATE_STRING;
    }

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
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

    public void setJUSTIFICATION(String JUSTIFICATION) {
        this.JUSTIFICATION = JUSTIFICATION;
    }

    public String getJUSTIFICATION() {
        return JUSTIFICATION;
    }
}
