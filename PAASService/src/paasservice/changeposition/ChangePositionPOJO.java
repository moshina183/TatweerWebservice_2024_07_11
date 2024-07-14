package paasservice.changeposition;

public class ChangePositionPOJO {

    private String CREATION_DATE;
    private String EFFECTIVE_START_DATE;
    private String HR_FLAG4;
    private String CHANGE_POSITION_ID;
    private String HR_FLAG3;
    private String HR_FLAG2;
    private String HR_FLAG1;
    private String STEP_ID;
    private String PERSON_NAME;
    private String PERSON_NUMBER;
    private String PERSON_LOCATION;
    private String PERSON_DEPARTMENT;
    private String PERSON_POSITION;
    private String PERSON_JOB;
    private String ASSIGNEE;
    private String ASSIGNEE_NAME;
    private String OTHER;
    private String PROPOSED_POSITION_HR;
    private String CURRENT_POSITION;
    private String PROPOSED_POSITION_EMP;
    private String REQUEST_STATUS;
    private String REJECTION_REASON;
    private String ACTION_TAKEN;
    private String PERSON_GRADE;
    private String REQUEST_DETAILS;

    public ChangePositionPOJO() {
        super();
    }

    public ChangePositionPOJO(String CREATION_DATE,
                              String EFFECTIVE_START_DATE, String HR_FLAG4,
                              String CHANGE_POSITION_ID, String HR_FLAG3,
                              String HR_FLAG2, String HR_FLAG1, String STEP_ID,
                              String PERSON_NAME, String PERSON_NUMBER,
                              String PERSON_LOCATION, String PERSON_DEPARTMENT,
                              String PERSON_POSITION, String PERSON_JOB,
                              String ASSIGNEE, String ASSIGNEE_NAME,
                              String OTHER, String PROPOSED_POSITION_HR,
                              String CURRENT_POSITION,
                              String PROPOSED_POSITION_EMP,
                              String REQUEST_STATUS, String REJECTION_REASON,
                              String ACTION_TAKEN, String PERSON_GRADE,
                              String REQUEST_DETAILS) {
        super();
        this.CREATION_DATE = (CREATION_DATE == null ? "" : CREATION_DATE);
        this.EFFECTIVE_START_DATE =
                (EFFECTIVE_START_DATE == null ? "" : EFFECTIVE_START_DATE);
        this.HR_FLAG4 = (HR_FLAG4 == null ? "" : HR_FLAG4);
        this.CHANGE_POSITION_ID =
                (CHANGE_POSITION_ID == null ? "" : CHANGE_POSITION_ID);
        this.HR_FLAG3 = (HR_FLAG3 == null ? "" : HR_FLAG3);
        this.HR_FLAG2 = (HR_FLAG2 == null ? "" : HR_FLAG2);
        this.HR_FLAG1 = (HR_FLAG1 == null ? "" : HR_FLAG1);
        this.STEP_ID = (STEP_ID == null ? "" : STEP_ID);
        this.PERSON_NAME = (PERSON_NAME == null ? "" : PERSON_NAME);
        this.PERSON_NUMBER = (PERSON_NUMBER == null ? "" : PERSON_NUMBER);
        this.PERSON_LOCATION =
                (PERSON_LOCATION == null ? "" : PERSON_LOCATION);
        this.PERSON_DEPARTMENT =
                (PERSON_DEPARTMENT == null ? "" : PERSON_DEPARTMENT);
        this.PERSON_POSITION =
                (PERSON_POSITION == null ? "" : PERSON_POSITION);
        this.PERSON_JOB = (PERSON_JOB == null ? "" : PERSON_JOB);
        this.ASSIGNEE = (ASSIGNEE == null ? "" : ASSIGNEE);
        this.ASSIGNEE_NAME = (ASSIGNEE_NAME == null ? "" : ASSIGNEE_NAME);
        this.OTHER = (OTHER == null ? "" : OTHER);
        this.PROPOSED_POSITION_HR =
                (PROPOSED_POSITION_HR == null ? "" : PROPOSED_POSITION_HR);
        this.CURRENT_POSITION =
                (CURRENT_POSITION == null ? "" : CURRENT_POSITION);
        this.PROPOSED_POSITION_EMP =
                (PROPOSED_POSITION_EMP == null ? "" : PROPOSED_POSITION_EMP);
        this.REQUEST_STATUS = (REQUEST_STATUS == null ? "" : REQUEST_STATUS);
        this.REJECTION_REASON =
                (REJECTION_REASON == null ? "" : REJECTION_REASON);
        this.ACTION_TAKEN = (ACTION_TAKEN == null ? "" : ACTION_TAKEN);
        this.PERSON_GRADE = (PERSON_GRADE == null ? "" : PERSON_GRADE);
        this.REQUEST_DETAILS =
                (REQUEST_DETAILS == null ? "" : REQUEST_DETAILS);
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setEFFECTIVE_START_DATE(String EFFECTIVE_START_DATE) {
        this.EFFECTIVE_START_DATE = EFFECTIVE_START_DATE;
    }

    public String getEFFECTIVE_START_DATE() {
        return EFFECTIVE_START_DATE;
    }

    public void setHR_FLAG4(String HR_FLAG4) {
        this.HR_FLAG4 = HR_FLAG4;
    }

    public String getHR_FLAG4() {
        return HR_FLAG4;
    }

    public void setCHANGE_POSITION_ID(String CHANGE_POSITION_ID) {
        this.CHANGE_POSITION_ID = CHANGE_POSITION_ID;
    }

    public String getCHANGE_POSITION_ID() {
        return CHANGE_POSITION_ID;
    }

    public void setHR_FLAG3(String HR_FLAG3) {
        this.HR_FLAG3 = HR_FLAG3;
    }

    public String getHR_FLAG3() {
        return HR_FLAG3;
    }

    public void setHR_FLAG2(String HR_FLAG2) {
        this.HR_FLAG2 = HR_FLAG2;
    }

    public String getHR_FLAG2() {
        return HR_FLAG2;
    }

    public void setHR_FLAG1(String HR_FLAG1) {
        this.HR_FLAG1 = HR_FLAG1;
    }

    public String getHR_FLAG1() {
        return HR_FLAG1;
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

    public void setPERSON_DEPARTMENT(String PERSON_DEPARTMENT) {
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT;
    }

    public String getPERSON_DEPARTMENT() {
        return PERSON_DEPARTMENT;
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

    public void setOTHER(String OTHER) {
        this.OTHER = OTHER;
    }

    public String getOTHER() {
        return OTHER;
    }

    public void setPROPOSED_POSITION_HR(String PROPOSED_POSITION_HR) {
        this.PROPOSED_POSITION_HR = PROPOSED_POSITION_HR;
    }

    public String getPROPOSED_POSITION_HR() {
        return PROPOSED_POSITION_HR;
    }

    public void setCURRENT_POSITION(String CURRENT_POSITION) {
        this.CURRENT_POSITION = CURRENT_POSITION;
    }

    public String getCURRENT_POSITION() {
        return CURRENT_POSITION;
    }

    public void setPROPOSED_POSITION_EMP(String PROPOSED_POSITION_EMP) {
        this.PROPOSED_POSITION_EMP = PROPOSED_POSITION_EMP;
    }

    public String getPROPOSED_POSITION_EMP() {
        return PROPOSED_POSITION_EMP;
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

    public void setREQUEST_DETAILS(String REQUEST_DETAILS) {
        this.REQUEST_DETAILS = REQUEST_DETAILS;
    }

    public String getREQUEST_DETAILS() {
        return REQUEST_DETAILS;
    }
}
