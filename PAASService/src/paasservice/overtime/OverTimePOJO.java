package paasservice.overtime;

public class OverTimePOJO
{
    private String OVERTIME_REQUEST_ID;
    private String PERSONE_ID;
    private String NUMBER_OF_HOURS;
    private String PERSONE_NAME;
    private String REJECT_COMMENTS;
    private String REQ_DATE;
    private String STEP_ID;
    private String OVERTIME_LINE_REQUEST_ID;
    private String REQUEST_STATUS;
    private String ASSIGNEE;
    private String CANCEL_REASON;
    private String ASSIGNEE_NAME;
    private String PERSON_POSITION;
    private String PERSON_JOB;
    private String PERSON_DEPARTMENT;
    private String PERSON_LOCATION;
    private String PERSON_GRADE;
    private String HOURS;
    private String OVER_TIME_DATE;
    private String DESCRIPTION;
    
    public OverTimePOJO() {
    }
    
    public OverTimePOJO(final String OVERTIME_REQUEST_ID, final String PERSONE_ID, final String NUMBER_OF_HOURS, final String PERSONE_NAME, final String REJECT_COMMENTS, final String REQ_DATE, final String STEP_ID, final String OVERTIME_LINE_REQUEST_ID, final String REQUEST_STATUS, final String ASSIGNEE, final String CANCEL_REASON, final String ASSIGNEE_NAME, final String PERSON_POSITION, final String PERSON_JOB, final String PERSON_DEPARTMENT, final String PERSON_LOCATION, final String PERSON_GRADE, final String HOURS, final String OVER_TIME_DATE, final String DESCRIPTION) {
        this.OVERTIME_REQUEST_ID = ((OVERTIME_REQUEST_ID != null) ? OVERTIME_REQUEST_ID : "");
        this.PERSONE_ID = ((PERSONE_ID != null) ? PERSONE_ID : "");
        this.NUMBER_OF_HOURS = ((NUMBER_OF_HOURS != null) ? NUMBER_OF_HOURS : "");
        this.PERSONE_NAME = ((PERSONE_NAME != null) ? PERSONE_NAME : "");
        this.REJECT_COMMENTS = ((REJECT_COMMENTS != null) ? REJECT_COMMENTS : "");
        this.REQ_DATE = ((REQ_DATE != null) ? REQ_DATE : "");
        this.STEP_ID = ((STEP_ID != null) ? STEP_ID : "");
        this.OVERTIME_LINE_REQUEST_ID = ((OVERTIME_LINE_REQUEST_ID != null) ? OVERTIME_LINE_REQUEST_ID : "");
        this.REQUEST_STATUS = ((REQUEST_STATUS != null) ? REQUEST_STATUS : "");
        this.ASSIGNEE = ((ASSIGNEE != null) ? ASSIGNEE : "");
        this.CANCEL_REASON = ((CANCEL_REASON != null) ? CANCEL_REASON : "");
        this.ASSIGNEE_NAME = ((ASSIGNEE_NAME != null) ? ASSIGNEE_NAME : "");
        this.PERSON_POSITION = ((PERSON_POSITION != null) ? PERSON_POSITION : "");
        this.PERSON_JOB = ((PERSON_JOB != null) ? PERSON_JOB : "");
        this.PERSON_DEPARTMENT = ((PERSON_DEPARTMENT != null) ? PERSON_DEPARTMENT : "");
        this.PERSON_LOCATION = ((PERSON_LOCATION != null) ? PERSON_LOCATION : "");
        this.PERSON_GRADE = ((PERSON_GRADE != null) ? PERSON_GRADE : "");
        this.HOURS = ((HOURS != null) ? HOURS : "");
        this.OVER_TIME_DATE = ((OVER_TIME_DATE != null) ? OVER_TIME_DATE : "");
        this.DESCRIPTION = ((DESCRIPTION != null) ? DESCRIPTION : "");
    }
    
    public void setOVERTIME_REQUEST_ID(final String OVERTIME_REQUEST_ID) {
        this.OVERTIME_REQUEST_ID = OVERTIME_REQUEST_ID;
    }
    
    public String getOVERTIME_REQUEST_ID() {
        return this.OVERTIME_REQUEST_ID;
    }
    
    public void setPERSONE_ID(final String PERSONE_ID) {
        this.PERSONE_ID = PERSONE_ID;
    }
    
    public String getPERSONE_ID() {
        return this.PERSONE_ID;
    }
    
    public void setNUMBER_OF_HOURS(final String NUMBER_OF_HOURS) {
        this.NUMBER_OF_HOURS = NUMBER_OF_HOURS;
    }
    
    public String getNUMBER_OF_HOURS() {
        return this.NUMBER_OF_HOURS;
    }
    
    public void setPERSONE_NAME(final String PERSONE_NAME) {
        this.PERSONE_NAME = PERSONE_NAME;
    }
    
    public String getPERSONE_NAME() {
        return this.PERSONE_NAME;
    }
    
    public void setREJECT_COMMENTS(final String REJECT_COMMENTS) {
        this.REJECT_COMMENTS = REJECT_COMMENTS;
    }
    
    public String getREJECT_COMMENTS() {
        return this.REJECT_COMMENTS;
    }
    
    public void setREQ_DATE(final String REQ_DATE) {
        this.REQ_DATE = REQ_DATE;
    }
    
    public String getREQ_DATE() {
        return this.REQ_DATE;
    }
    
    public void setSTEP_ID(final String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }
    
    public String getSTEP_ID() {
        return this.STEP_ID;
    }
    
    public void setOVERTIME_LINE_REQUEST_ID(final String OVERTIME_LINE_REQUEST_ID) {
        this.OVERTIME_LINE_REQUEST_ID = OVERTIME_LINE_REQUEST_ID;
    }
    
    public String getOVERTIME_LINE_REQUEST_ID() {
        return this.OVERTIME_LINE_REQUEST_ID;
    }
    
    public void setREQUEST_STATUS(final String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }
    
    public String getREQUEST_STATUS() {
        return this.REQUEST_STATUS;
    }
    
    public void setASSIGNEE(final String ASSIGNEE) {
        this.ASSIGNEE = ASSIGNEE;
    }
    
    public String getASSIGNEE() {
        return this.ASSIGNEE;
    }
    
    public void setCANCEL_REASON(final String CANCEL_REASON) {
        this.CANCEL_REASON = CANCEL_REASON;
    }
    
    public String getCANCEL_REASON() {
        return this.CANCEL_REASON;
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
    
    public void setHOURS(final String HOURS) {
        this.HOURS = HOURS;
    }
    
    public String getHOURS() {
        return this.HOURS;
    }
    
    public void setOVER_TIME_DATE(final String OVER_TIME_DATE) {
        this.OVER_TIME_DATE = OVER_TIME_DATE;
    }
    
    public String getOVER_TIME_DATE() {
        return this.OVER_TIME_DATE;
    }
    
    public void setDESCRIPTION(final String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    public String getDESCRIPTION() {
        return this.DESCRIPTION;
    }
}
