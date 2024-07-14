package paasservice.manpower;

public class ManPowerPOJO {
    public ManPowerPOJO() {
        super();
    }
    
    private String MAN_POWER_REQ_ID;
    private String CREATION_DATE;
    private String REQUISITION_TITLE;
    private String NUMBER_OF_OPENING;
    private String TARGET_START_DATE;
    private String JUSTIFICATIONS;
    private String DEPARTMENT;
    private String JOB;
    private String GRADE;
    private String JOB_DESCRIPTION;
    private String QUALIFICATIONS;
    private String POSITION_CATEGORY;
    private String DURATION;
    private String DURATION_TYPE;
    private String NATIONALITY;
    private String LANGUAGE;
    private String OTHER_LANGUAGE;
    private String REPLACEMENT;
    private String ADDITIONAL_COMMENTS;
        private String PERSON_NUMBER; 
        private String PERSON_NAME; 
        private String STEP_ID; 
        private String ASSIGNEE; 
        private String ASSIGNEE_NAME; 
        private String PERSON_POSITION; 
        private String PERSON_JOB; 
        private String PERSON_DEPARTMENT; 
        private String PERSON_LOCATION; 
        private String PERSON_GRADE; 
        private String REQUEST_STATUS; 
        private String REJECTION_REASON; 
        private String YEARS; 
        private String MONTHS; 
        private String DAYS; 
        private String ACTION_TAKEN; 
        private String BASIC_SALARY; 
        private String EXPERIENCE;
    private String WORK_TYPE;
    private String AVAILABLE_BUDGECT;

    public ManPowerPOJO(String MAN_POWER_REQ_ID, String CREATION_DATE,
                        String REQUISITION_TITLE, String NUMBER_OF_OPENING,
                        String TARGET_START_DATE, String JUSTIFICATIONS,
                        String DEPARTMENT, String JOB, String GRADE,
                        String JOB_DESCRIPTION, String QUALIFICATIONS,
                        String POSITION_CATEGORY, String DURATION,
                        String DURATION_TYPE, String NATIONALITY,
                        String LANGUAGE, String OTHER_LANGUAGE,
                        String REPLACEMENT, String ADDITIONAL_COMMENTS,
                        String PERSON_NUMBER, String PERSON_NAME,
                        String STEP_ID, String ASSIGNEE, String ASSIGNEE_NAME,
                        String PERSON_POSITION, String PERSON_JOB,
                        String PERSON_DEPARTMENT, String PERSON_LOCATION,
                        String PERSON_GRADE, String REQUEST_STATUS,
                        String REJECTION_REASON, String YEARS, String MONTHS,
                        String DAYS, String ACTION_TAKEN, String BASIC_SALARY,
                        String EXPERIENCE, String WORK_TYPE, String AVAILABLE_BUDGECT) {
        super();
        this.MAN_POWER_REQ_ID = MAN_POWER_REQ_ID;
        this.CREATION_DATE = CREATION_DATE==null ? "" : CREATION_DATE;
        this.REQUISITION_TITLE = REQUISITION_TITLE==null ? "" : REQUISITION_TITLE;
        this.NUMBER_OF_OPENING = NUMBER_OF_OPENING==null ? "" : NUMBER_OF_OPENING;
        this.TARGET_START_DATE = TARGET_START_DATE==null ? "" : TARGET_START_DATE;
        this.JUSTIFICATIONS = JUSTIFICATIONS==null ? "" : JUSTIFICATIONS;
        this.DEPARTMENT = DEPARTMENT==null ? "" : DEPARTMENT;
        this.JOB = JOB==null ? "" : JOB;
        this.GRADE = GRADE==null ? "" : GRADE;
        this.JOB_DESCRIPTION = JOB_DESCRIPTION==null ? "" : JOB_DESCRIPTION;
        this.QUALIFICATIONS = QUALIFICATIONS==null ? "" : QUALIFICATIONS;
        this.POSITION_CATEGORY = POSITION_CATEGORY==null ? "" : POSITION_CATEGORY;
        this.DURATION = DURATION==null ? "" : DURATION;
        this.DURATION_TYPE = DURATION_TYPE==null ? "" : DURATION_TYPE;
        this.NATIONALITY = NATIONALITY==null ? "" : NATIONALITY;
        this.LANGUAGE = LANGUAGE==null ? "" : LANGUAGE;
        this.OTHER_LANGUAGE = OTHER_LANGUAGE==null ? "" : OTHER_LANGUAGE;
        this.REPLACEMENT = REPLACEMENT==null ? "" : REPLACEMENT;
        this.ADDITIONAL_COMMENTS = ADDITIONAL_COMMENTS==null ? "" : ADDITIONAL_COMMENTS;
        this.PERSON_NUMBER = PERSON_NUMBER==null ? "" : PERSON_NUMBER;
        this.PERSON_NAME = PERSON_NAME==null ? "" : PERSON_NAME;
        this.STEP_ID = STEP_ID==null ? "" : STEP_ID;
        this.ASSIGNEE = ASSIGNEE==null ? "" : ASSIGNEE;;
        this.ASSIGNEE_NAME = ASSIGNEE_NAME==null ? "" : ASSIGNEE_NAME;;
        this.PERSON_POSITION = PERSON_POSITION==null ? "" : PERSON_POSITION;;
        this.PERSON_JOB = PERSON_JOB==null ? "" : PERSON_JOB;;
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT==null ? "" : PERSON_DEPARTMENT;;
        this.PERSON_LOCATION = PERSON_LOCATION==null ? "" : PERSON_LOCATION;;
        this.PERSON_GRADE = PERSON_GRADE==null ? "" : PERSON_GRADE;;
        this.REQUEST_STATUS = REQUEST_STATUS==null ? "" : REQUEST_STATUS;;
        this.REJECTION_REASON = REJECTION_REASON==null ? "" : REJECTION_REASON;;
        this.YEARS = YEARS==null ? "" : YEARS;;
        this.MONTHS = MONTHS==null ? "" : MONTHS;;
        this.DAYS = DAYS==null ? "" : DAYS;;
        this.ACTION_TAKEN = ACTION_TAKEN==null ? "" : ACTION_TAKEN;
        this.BASIC_SALARY = BASIC_SALARY==null ? "" : BASIC_SALARY;
        this.EXPERIENCE = EXPERIENCE==null ? "" : EXPERIENCE;
        this.WORK_TYPE = WORK_TYPE==null ? "" : WORK_TYPE;
        this.AVAILABLE_BUDGECT = AVAILABLE_BUDGECT==null ? "" : AVAILABLE_BUDGECT;
    }

    public void setMAN_POWER_REQ_ID(String MAN_POWER_REQ_ID) {
        this.MAN_POWER_REQ_ID = MAN_POWER_REQ_ID;
    }

    public String getMAN_POWER_REQ_ID() {
        return MAN_POWER_REQ_ID;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setREQUISITION_TITLE(String REQUISITION_TITLE) {
        this.REQUISITION_TITLE = REQUISITION_TITLE;
    }

    public String getREQUISITION_TITLE() {
        return REQUISITION_TITLE;
    }

    public void setNUMBER_OF_OPENING(String NUMBER_OF_OPENING) {
        this.NUMBER_OF_OPENING = NUMBER_OF_OPENING;
    }

    public String getNUMBER_OF_OPENING() {
        return NUMBER_OF_OPENING;
    }

    public void setTARGET_START_DATE(String TARGET_START_DATE) {
        this.TARGET_START_DATE = TARGET_START_DATE;
    }

    public String getTARGET_START_DATE() {
        return TARGET_START_DATE;
    }

    public void setJUSTIFICATIONS(String JUSTIFICATIONS) {
        this.JUSTIFICATIONS = JUSTIFICATIONS;
    }

    public String getJUSTIFICATIONS() {
        return JUSTIFICATIONS;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public String getJOB() {
        return JOB;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setJOB_DESCRIPTION(String JOB_DESCRIPTION) {
        this.JOB_DESCRIPTION = JOB_DESCRIPTION;
    }

    public String getJOB_DESCRIPTION() {
        return JOB_DESCRIPTION;
    }

    public void setQUALIFICATIONS(String QUALIFICATIONS) {
        this.QUALIFICATIONS = QUALIFICATIONS;
    }

    public String getQUALIFICATIONS() {
        return QUALIFICATIONS;
    }

    public void setPOSITION_CATEGORY(String POSITION_CATEGORY) {
        this.POSITION_CATEGORY = POSITION_CATEGORY;
    }

    public String getPOSITION_CATEGORY() {
        return POSITION_CATEGORY;
    }

    public void setDURATION(String DURATION) {
        this.DURATION = DURATION;
    }

    public String getDURATION() {
        return DURATION;
    }

    public void setDURATION_TYPE(String DURATION_TYPE) {
        this.DURATION_TYPE = DURATION_TYPE;
    }

    public String getDURATION_TYPE() {
        return DURATION_TYPE;
    }

    public void setNATIONALITY(String NATIONALITY) {
        this.NATIONALITY = NATIONALITY;
    }

    public String getNATIONALITY() {
        return NATIONALITY;
    }

    public void setLANGUAGE(String LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public String getLANGUAGE() {
        return LANGUAGE;
    }

    public void setOTHER_LANGUAGE(String OTHER_LANGUAGE) {
        this.OTHER_LANGUAGE = OTHER_LANGUAGE;
    }

    public String getOTHER_LANGUAGE() {
        return OTHER_LANGUAGE;
    }

    public void setREPLACEMENT(String REPLACEMENT) {
        this.REPLACEMENT = REPLACEMENT;
    }

    public String getREPLACEMENT() {
        return REPLACEMENT;
    }

    public void setADDITIONAL_COMMENTS(String ADDITIONAL_COMMENTS) {
        this.ADDITIONAL_COMMENTS = ADDITIONAL_COMMENTS;
    }

    public String getADDITIONAL_COMMENTS() {
        return ADDITIONAL_COMMENTS;
    }

    public void setPERSON_NUMBER(String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getPERSON_NUMBER() {
        return PERSON_NUMBER;
    }

    public void setPERSON_NAME(String PERSON_NAME) {
        this.PERSON_NAME = PERSON_NAME;
    }

    public String getPERSON_NAME() {
        return PERSON_NAME;
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

    public void setYEARS(String YEARS) {
        this.YEARS = YEARS;
    }

    public String getYEARS() {
        return YEARS;
    }

    public void setMONTHS(String MONTHS) {
        this.MONTHS = MONTHS;
    }

    public String getMONTHS() {
        return MONTHS;
    }

    public void setDAYS(String DAYS) {
        this.DAYS = DAYS;
    }

    public String getDAYS() {
        return DAYS;
    }

    public void setACTION_TAKEN(String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }

    public String getACTION_TAKEN() {
        return ACTION_TAKEN;
    }

    public void setBASIC_SALARY(String BASIC_SALARY) {
        this.BASIC_SALARY = BASIC_SALARY;
    }

    public String getBASIC_SALARY() {
        return BASIC_SALARY;
    }

    public void setEXPERIENCE(String EXPERIENCE) {
        this.EXPERIENCE = EXPERIENCE;
    }

    public String getEXPERIENCE() {
        return EXPERIENCE;
    }

    public void setWORK_TYPE(String WORK_TYPE) {
        this.WORK_TYPE = WORK_TYPE;
    }

    public String getWORK_TYPE() {
        return WORK_TYPE;
    }

    public void setAVAILABLE_BUDGECT(String AVAILABLE_BUDGECT) {
        this.AVAILABLE_BUDGECT = AVAILABLE_BUDGECT;
    }

    public String getAVAILABLE_BUDGECT() {
        return AVAILABLE_BUDGECT;
    }
}
