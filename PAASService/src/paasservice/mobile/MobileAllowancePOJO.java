package paasservice.mobile;

public class MobileAllowancePOJO
{
    private String REQUEST_ID;
    private String CREATION_DATE;
    private String REQUEST_REASON;
    private String PERSONE_NUMBER;
    private String PERSONE_NAME;
    private String STEP_ID;
    private String ASSIGNEE;
    private String ASSIGNEE_NAME;
    private String PERSON_POSITION;
    private String PERSON_JOB;
    private String PERSON_DEPARTMENT;
    private String PERSON_LOCATION;
    private String PERSON_GRADE;
    private String REQUEST_STATUS;
    private String REJECT_COMMENTS;
    private String ACTION_TAKEN;
    private String NUMBER_OF_MONTHS;
    
    public MobileAllowancePOJO() {
    }
    
    public MobileAllowancePOJO(final String REQUEST_ID, final String CREATION_DATE, final String REQUEST_REASON, final String PERSONE_NUMBER, final String PERSONE_NAME, final String STEP_ID, final String ASSIGNEE, final String ASSIGNEE_NAME, final String PERSON_POSITION, final String PERSON_JOB, final String PERSON_DEPARTMENT, final String PERSON_LOCATION, final String PERSON_GRADE, final String REQUEST_STATUS, final String REJECT_COMMENTS, final String ACTION_TAKEN, final String NUMBER_OF_MONTHS) {
        this.REQUEST_ID = REQUEST_ID;
        this.CREATION_DATE = ((CREATION_DATE == null) ? "" : CREATION_DATE);
        this.REQUEST_REASON = ((REQUEST_REASON == null) ? "" : REQUEST_REASON);
        this.PERSONE_NUMBER = ((PERSONE_NUMBER == null) ? "" : PERSONE_NUMBER);
        this.PERSONE_NAME = ((PERSONE_NAME == null) ? "" : PERSONE_NAME);
        this.STEP_ID = ((STEP_ID == null) ? "" : STEP_ID);
        this.ASSIGNEE = ((ASSIGNEE == null) ? "" : ASSIGNEE);
        this.ASSIGNEE_NAME = ((ASSIGNEE_NAME == null) ? "" : ASSIGNEE_NAME);
        this.PERSON_POSITION = ((PERSON_POSITION == null) ? "" : PERSON_POSITION);
        this.PERSON_JOB = ((PERSON_JOB == null) ? "" : PERSON_JOB);
        this.PERSON_DEPARTMENT = ((PERSON_DEPARTMENT == null) ? "" : PERSON_DEPARTMENT);
        this.PERSON_LOCATION = ((PERSON_LOCATION == null) ? "" : PERSON_LOCATION);
        this.PERSON_GRADE = ((PERSON_GRADE == null) ? "" : PERSON_GRADE);
        this.REQUEST_STATUS = ((REQUEST_STATUS == null) ? "" : REQUEST_STATUS);
        this.REJECT_COMMENTS = ((REJECT_COMMENTS == null) ? "" : REJECT_COMMENTS);
        this.NUMBER_OF_MONTHS = ((NUMBER_OF_MONTHS == null) ? "" : NUMBER_OF_MONTHS);
        this.ACTION_TAKEN = ((ACTION_TAKEN == null) ? "" : ACTION_TAKEN);
    }
    
    public void setREQUEST_ID(final String REQUEST_ID) {
        this.REQUEST_ID = REQUEST_ID;
    }
    
    public String getREQUEST_ID() {
        return this.REQUEST_ID;
    }
    
    public void setCREATION_DATE(final String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }
    
    public String getCREATION_DATE() {
        return this.CREATION_DATE;
    }
    
    public void setREQUEST_REASON(final String REQUEST_REASON) {
        this.REQUEST_REASON = REQUEST_REASON;
    }
    
    public String getREQUEST_REASON() {
        return this.REQUEST_REASON;
    }
    
    public void setPERSONE_NUMBER(final String PERSONE_NUMBER) {
        this.PERSONE_NUMBER = PERSONE_NUMBER;
    }
    
    public String getPERSONE_NUMBER() {
        return this.PERSONE_NUMBER;
    }
    
    public void setPERSONE_NAME(final String PERSONE_NAME) {
        this.PERSONE_NAME = PERSONE_NAME;
    }
    
    public String getPERSONE_NAME() {
        return this.PERSONE_NAME;
    }
    
    public void setSTEP_ID(final String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }
    
    public String getSTEP_ID() {
        return this.STEP_ID;
    }
    
    public void setASSIGNEE(final String ASSIGNEE) {
        this.ASSIGNEE = ASSIGNEE;
    }
    
    public String getASSIGNEE() {
        return this.ASSIGNEE;
    }
    
    public void setASSIGNEE_NAME(final String ASSIGNEE_NAME) {
        this.ASSIGNEE_NAME = ASSIGNEE_NAME;
    }
    
    public String getASSIGNEE_NAME() {
        return this.ASSIGNEE_NAME;
    }
    
    public void setPERSON_POSITION(final String PERSON_POSITION) {
        this.PERSON_POSITION = PERSON_POSITION;
    }
    
    public String getPERSON_POSITION() {
        return this.PERSON_POSITION;
    }
    
    public void setPERSON_JOB(final String PERSON_JOB) {
        this.PERSON_JOB = PERSON_JOB;
    }
    
    public String getPERSON_JOB() {
        return this.PERSON_JOB;
    }
    
    public void setPERSON_DEPARTMENT(final String PERSON_DEPARTMENT) {
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT;
    }
    
    public String getPERSON_DEPARTMENT() {
        return this.PERSON_DEPARTMENT;
    }
    
    public void setPERSON_LOCATION(final String PERSON_LOCATION) {
        this.PERSON_LOCATION = PERSON_LOCATION;
    }
    
    public String getPERSON_LOCATION() {
        return this.PERSON_LOCATION;
    }
    
    public void setPERSON_GRADE(final String PERSON_GRADE) {
        this.PERSON_GRADE = PERSON_GRADE;
    }
    
    public String getPERSON_GRADE() {
        return this.PERSON_GRADE;
    }
    
    public void setREQUEST_STATUS(final String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }
    
    public String getREQUEST_STATUS() {
        return this.REQUEST_STATUS;
    }
    
    public void setREJECT_COMMENTS(final String REJECT_COMMENTS) {
        this.REJECT_COMMENTS = REJECT_COMMENTS;
    }
    
    public String getREJECT_COMMENTS() {
        return this.REJECT_COMMENTS;
    }
    
    public void setACTION_TAKEN(final String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }
    
    public String getACTION_TAKEN() {
        return this.ACTION_TAKEN;
    }
    
    public void setNUMBER_OF_MONTHS(final String NUMBER_OF_MONTHS) {
        this.NUMBER_OF_MONTHS = NUMBER_OF_MONTHS;
    }
    
    public String getNUMBER_OF_MONTHS() {
        return this.NUMBER_OF_MONTHS;
    }
}
