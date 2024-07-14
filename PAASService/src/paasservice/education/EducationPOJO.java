package paasservice.education;

public class EducationPOJO {
    private String EDUCATION_ALLOWANCE_ID;
    private String CREATION_DATE;
    private String NUMBER_OF_CHILDREN;
    private String FIRST_CHILD;
    private String SECOND_CHILD;
    private String THIRD_CHILD;
    private String FOURTH_CHILD;
    private String FIFTH_CHILD;
    private String SIXTH_CHILD;
    private String SEVENTH_CHILD;
    private String EIGHTTH_CHILD;
    private String NINTH_CHILD;
    private String TENTH_CHILD;
    private String PAYMENT_METHOD;
    private String IBAN_EMPLOYEE;
    private String IBAN_SCHOOL;
    private String COMMENTS;
    private String TOTAL_AMOUNT;
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
    private String ACTION_TAKEN;
    private String NAME_OF_CHILD_ONE;
    private String NAME_OF_CHILD_TWO;
    private String NAME_OF_CHILD_THREE;
    private String NAME_OF_CHILD_FOUR;
    private String NAME_OF_CHILD_FIVE;
    private String NAME_OF_CHILD_SIX;
    private String NAME_OF_CHILD_SEVEN;
    private String NAME_OF_CHILD_EIGHT;
    private String NAME_OF_CHILD_NINE;
    private String NAME_OF_CHILD_TEN;
    private String NID_OF_CHILD_ONE;
    private String NID_OF_CHILD_TWO;
    private String NID_OF_CHILD_THREE;
    private String NID_OF_CHILD_FOUR;
    private String NID_OF_CHILD_FIVE;
    private String NID_OF_CHILD_SIX;
    private String NID_OF_CHILD_SEVEN;
    private String NID_OF_CHILD_EIGHT;
    private String NID_OF_CHILD_NINE;
    private String NID_OF_CHILD_TEN;
    private String FROM_DATE;
    private String TO_DATE;
    private String NAME_OF_CHILD;
    private String TOTAL_CHILDREN;
    private String ISACTIVE;


    public EducationPOJO() {
    }

    public EducationPOJO(final String EDUCATION_ALLOWANCE_ID, final String CREATION_DATE,
                         final String NUMBER_OF_CHILDREN, final String FIRST_CHILD, final String SECOND_CHILD,
                         final String THIRD_CHILD, final String FOURTH_CHILD, final String FIFTH_CHILD,
                         final String SIXTH_CHILD, final String SEVENTH_CHILD, final String EIGHTTH_CHILD,
                         final String NINTH_CHILD, final String TENTH_CHILD, final String COMMENTS,
                         final String PAYMENT_METHOD, final String IBAN_SCHOOL, final String IBAN_EMPLOYEE,
                         final String PERSON_NUMBER, final String PERSON_NAME, final String STEP_ID,
                         final String ASSIGNEE, final String ASSIGNEE_NAME, final String PERSON_POSITION,
                         final String PERSON_JOB, final String PERSON_DEPARTMENT, final String PERSON_LOCATION,
                         final String PERSON_GRADE, final String REQUEST_STATUS, final String REJECTION_REASON,
                         final String TOTAL_AMOUNT, final String ACTION_TAKEN, final String NAME_OF_CHILD_ONE,
                         final String NAME_OF_CHILD_TWO, final String NAME_OF_CHILD_THREE,
                         final String NAME_OF_CHILD_FOUR, final String NAME_OF_CHILD_FIVE,
                         final String NAME_OF_CHILD_SIX, final String NAME_OF_CHILD_SEVEN,
                         final String NAME_OF_CHILD_EIGHT, final String NAME_OF_CHILD_NINE,
                         final String NAME_OF_CHILD_TEN, final String NID_OF_CHILD_ONE, final String NID_OF_CHILD_TWO,
                         final String NID_OF_CHILD_THREE, final String NID_OF_CHILD_FOUR,
                         final String NID_OF_CHILD_FIVE, final String NID_OF_CHILD_SIX, final String NID_OF_CHILD_SEVEN,
                         final String NID_OF_CHILD_EIGHT, final String NID_OF_CHILD_NINE, final String NID_OF_CHILD_TEN,
                         final String NAME_OF_CHILD, final String ISACTIVE) {
        this.EDUCATION_ALLOWANCE_ID = EDUCATION_ALLOWANCE_ID;
        this.CREATION_DATE = ((CREATION_DATE == null) ? "" : CREATION_DATE);
        this.NUMBER_OF_CHILDREN = ((NUMBER_OF_CHILDREN == null) ? "" : NUMBER_OF_CHILDREN);
        this.COMMENTS = ((COMMENTS == null) ? "" : COMMENTS);
        this.FIRST_CHILD = ((FIRST_CHILD == null) ? "" : FIRST_CHILD);
        this.SECOND_CHILD = ((SECOND_CHILD == null) ? "" : SECOND_CHILD);
        this.THIRD_CHILD = ((THIRD_CHILD == null) ? "" : THIRD_CHILD);
        this.FOURTH_CHILD = ((FOURTH_CHILD == null) ? "" : FOURTH_CHILD);
        this.FIFTH_CHILD = ((FIFTH_CHILD == null) ? "" : FIFTH_CHILD);
        this.SIXTH_CHILD = ((SIXTH_CHILD == null) ? "" : SIXTH_CHILD);
        this.SEVENTH_CHILD = ((SEVENTH_CHILD == null) ? "" : SEVENTH_CHILD);
        this.EIGHTTH_CHILD = ((EIGHTTH_CHILD == null) ? "" : EIGHTTH_CHILD);
        this.NINTH_CHILD = ((NINTH_CHILD == null) ? "" : NINTH_CHILD);
        this.TENTH_CHILD = ((TENTH_CHILD == null) ? "" : TENTH_CHILD);
        this.PAYMENT_METHOD = ((PAYMENT_METHOD == null) ? "" : PAYMENT_METHOD);
        this.IBAN_SCHOOL = ((IBAN_SCHOOL == null) ? "" : IBAN_SCHOOL);
        this.IBAN_EMPLOYEE = ((IBAN_EMPLOYEE == null) ? "" : IBAN_EMPLOYEE);
        this.PERSON_NUMBER = ((PERSON_NUMBER == null) ? "" : PERSON_NUMBER);
        this.PERSON_NAME = ((PERSON_NAME == null) ? "" : PERSON_NAME);
        this.STEP_ID = ((STEP_ID == null) ? "" : STEP_ID);
        this.ASSIGNEE = ((ASSIGNEE == null) ? "" : ASSIGNEE);
        this.ASSIGNEE_NAME = ((ASSIGNEE_NAME == null) ? "" : ASSIGNEE_NAME);
        this.PERSON_POSITION = ((PERSON_POSITION == null) ? "" : PERSON_POSITION);
        this.PERSON_JOB = ((PERSON_JOB == null) ? "" : PERSON_JOB);
        this.PERSON_DEPARTMENT = ((PERSON_DEPARTMENT == null) ? "" : PERSON_DEPARTMENT);
        this.PERSON_LOCATION = ((PERSON_LOCATION == null) ? "" : PERSON_LOCATION);
        this.PERSON_GRADE = ((PERSON_GRADE == null) ? "" : PERSON_GRADE);
        this.REQUEST_STATUS = ((REQUEST_STATUS == null) ? "" : REQUEST_STATUS);
        this.REJECTION_REASON = ((REJECTION_REASON == null) ? "" : REJECTION_REASON);
        this.TOTAL_AMOUNT = ((TOTAL_AMOUNT == null) ? "" : TOTAL_AMOUNT);
        this.ACTION_TAKEN = ((ACTION_TAKEN == null) ? "" : ACTION_TAKEN);
        this.NAME_OF_CHILD_ONE = ((NAME_OF_CHILD_ONE == null) ? "" : NAME_OF_CHILD_ONE);
        this.NAME_OF_CHILD_TWO = ((NAME_OF_CHILD_TWO == null) ? "" : NAME_OF_CHILD_TWO);
        this.NAME_OF_CHILD_THREE = ((NAME_OF_CHILD_THREE == null) ? "" : NAME_OF_CHILD_THREE);
        this.NAME_OF_CHILD_FOUR = ((NAME_OF_CHILD_FOUR == null) ? "" : NAME_OF_CHILD_FOUR);
        this.NAME_OF_CHILD_FIVE = ((NAME_OF_CHILD_FIVE == null) ? "" : NAME_OF_CHILD_FIVE);
        this.NAME_OF_CHILD_SIX = ((NAME_OF_CHILD_SIX == null) ? "" : NAME_OF_CHILD_SIX);
        this.NAME_OF_CHILD_SEVEN = ((NAME_OF_CHILD_SEVEN == null) ? "" : NAME_OF_CHILD_SEVEN);
        this.NAME_OF_CHILD_EIGHT = ((NAME_OF_CHILD_EIGHT == null) ? "" : NAME_OF_CHILD_EIGHT);
        this.NAME_OF_CHILD_NINE = ((NAME_OF_CHILD_NINE == null) ? "" : NAME_OF_CHILD_NINE);
        this.NAME_OF_CHILD_TEN = ((NAME_OF_CHILD_TEN == null) ? "" : NAME_OF_CHILD_TEN);
        this.NID_OF_CHILD_ONE = ((NID_OF_CHILD_ONE == null) ? "" : NID_OF_CHILD_ONE);
        this.NID_OF_CHILD_TWO = ((NID_OF_CHILD_TWO == null) ? "" : NID_OF_CHILD_TWO);
        this.NID_OF_CHILD_THREE = ((NID_OF_CHILD_THREE == null) ? "" : NID_OF_CHILD_THREE);
        this.NID_OF_CHILD_FOUR = ((NID_OF_CHILD_FOUR == null) ? "" : NID_OF_CHILD_FOUR);
        this.NID_OF_CHILD_FIVE = ((NID_OF_CHILD_FIVE == null) ? "" : NID_OF_CHILD_FIVE);
        this.NID_OF_CHILD_SIX = ((NID_OF_CHILD_SIX == null) ? "" : NID_OF_CHILD_SIX);
        this.NID_OF_CHILD_SEVEN = ((NID_OF_CHILD_SEVEN == null) ? "" : NID_OF_CHILD_SEVEN);
        this.NID_OF_CHILD_EIGHT = ((NID_OF_CHILD_EIGHT == null) ? "" : NID_OF_CHILD_EIGHT);
        this.NID_OF_CHILD_NINE = ((NID_OF_CHILD_EIGHT == null) ? "" : NID_OF_CHILD_NINE);
        this.NID_OF_CHILD_TEN = ((NID_OF_CHILD_TEN == null) ? "" : NID_OF_CHILD_TEN);
        this.FROM_DATE = ((FROM_DATE == null) ? "" : FROM_DATE);
        this.TO_DATE = ((TO_DATE == null) ? "" : TO_DATE);
        this.NAME_OF_CHILD = ((NAME_OF_CHILD == null) ? "" : NAME_OF_CHILD);
        this.TOTAL_CHILDREN = ((TOTAL_CHILDREN == null) ? "" : TOTAL_CHILDREN);
        this.ISACTIVE = ((ISACTIVE == null) ? "" : ISACTIVE);
    }

    public void setEDUCATION_ALLOWANCE_ID(final String EDUCATION_ALLOWANCE_ID) {
        this.EDUCATION_ALLOWANCE_ID = EDUCATION_ALLOWANCE_ID;
    }

    public String getEDUCATION_ALLOWANCE_ID() {
        return this.EDUCATION_ALLOWANCE_ID;
    }

    public void setCREATION_DATE(final String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return this.CREATION_DATE;
    }

    public void setNUMBER_OF_CHILDREN(final String NUMBER_OF_CHILDREN) {
        this.NUMBER_OF_CHILDREN = NUMBER_OF_CHILDREN;
    }

    public String getNUMBER_OF_CHILDREN() {
        return this.NUMBER_OF_CHILDREN;
    }

    public void setFIRST_CHILD(final String FIRST_CHILD) {
        this.FIRST_CHILD = FIRST_CHILD;
    }

    public String getFIRST_CHILD() {
        return this.FIRST_CHILD;
    }

    public void setSECOND_CHILD(final String SECOND_CHILD) {
        this.SECOND_CHILD = SECOND_CHILD;
    }

    public String getSECOND_CHILD() {
        return this.SECOND_CHILD;
    }

    public void setTHIRD_CHILD(final String THIRD_CHILD) {
        this.THIRD_CHILD = THIRD_CHILD;
    }

    public String getTHIRD_CHILD() {
        return this.THIRD_CHILD;
    }

    public void setFOURTH_CHILD(final String FOURTH_CHILD) {
        this.FOURTH_CHILD = FOURTH_CHILD;
    }

    public String getFOURTH_CHILD() {
        return this.FOURTH_CHILD;
    }

    public void setFIFTH_CHILD(final String FIFTH_CHILD) {
        this.FIFTH_CHILD = FIFTH_CHILD;
    }

    public String getFIFTH_CHILD() {
        return this.FIFTH_CHILD;
    }

    public void setSIXTH_CHILD(final String SIXTH_CHILD) {
        this.SIXTH_CHILD = SIXTH_CHILD;
    }

    public String getSIXTH_CHILD() {
        return this.SIXTH_CHILD;
    }

    public void setSEVENTH_CHILD(final String SEVENTH_CHILD) {
        this.SEVENTH_CHILD = SEVENTH_CHILD;
    }

    public String getSEVENTH_CHILD() {
        return this.SEVENTH_CHILD;
    }

    public void setEIGHTTH_CHILD(final String EIGHTTH_CHILD) {
        this.EIGHTTH_CHILD = EIGHTTH_CHILD;
    }

    public String getEIGHTTH_CHILD() {
        return this.EIGHTTH_CHILD;
    }

    public void setNINTH_CHILD(final String NINTH_CHILD) {
        this.NINTH_CHILD = NINTH_CHILD;
    }

    public String getNINTH_CHILD() {
        return this.NINTH_CHILD;
    }

    public void setTENTH_CHILD(final String TENTH_CHILD) {
        this.TENTH_CHILD = TENTH_CHILD;
    }

    public String getTENTH_CHILD() {
        return this.TENTH_CHILD;
    }

    public void setPAYMENT_METHOD(final String PAYMENT_METHOD) {
        this.PAYMENT_METHOD = PAYMENT_METHOD;
    }

    public String getPAYMENT_METHOD() {
        return this.PAYMENT_METHOD;
    }

    public void setIBAN_EMPLOYEE(final String IBAN_EMPLOYEE) {
        this.IBAN_EMPLOYEE = IBAN_EMPLOYEE;
    }

    public String getIBAN_EMPLOYEE() {
        return this.IBAN_EMPLOYEE;
    }

    public void setIBAN_SCHOOL(final String IBAN_SCHOOL) {
        this.IBAN_SCHOOL = IBAN_SCHOOL;
    }

    public String getIBAN_SCHOOL() {
        return this.IBAN_SCHOOL;
    }

    public void setTOTAL_AMOUNT(final String TOTAL_AMOUNT) {
        this.TOTAL_AMOUNT = TOTAL_AMOUNT;
    }

    public String getTOTAL_AMOUNT() {
        return this.TOTAL_AMOUNT;
    }

    public void setPERSON_NUMBER(final String PERSON_NUMBER) {
        this.PERSON_NUMBER = PERSON_NUMBER;
    }

    public String getPERSON_NUMBER() {
        return this.PERSON_NUMBER;
    }

    public void setPERSON_NAME(final String PERSON_NAME) {
        this.PERSON_NAME = PERSON_NAME;
    }

    public String getPERSON_NAME() {
        return this.PERSON_NAME;
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

    public void setREJECTION_REASON(final String REJECTION_REASON) {
        this.REJECTION_REASON = REJECTION_REASON;
    }

    public String getREJECTION_REASON() {
        return this.REJECTION_REASON;
    }

    public void setACTION_TAKEN(final String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }

    public String getACTION_TAKEN() {
        return this.ACTION_TAKEN;
    }

    public void setCOMMENTS(final String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public String getCOMMENTS() {
        return this.COMMENTS;
    }

    public void setNAME_OF_CHILD_ONE(String NAME_OF_CHILD_ONE) {
        this.NAME_OF_CHILD_ONE = NAME_OF_CHILD_ONE;
    }

    public String getNAME_OF_CHILD_ONE() {
        return NAME_OF_CHILD_ONE;
    }

    public void setNAME_OF_CHILD_THREE(String NAME_OF_CHILD_THREE) {
        this.NAME_OF_CHILD_THREE = NAME_OF_CHILD_THREE;
    }

    public String getNAME_OF_CHILD_THREE() {
        return NAME_OF_CHILD_THREE;
    }

    public void setNAME_OF_CHILD_FOUR(String NAME_OF_CHILD_FOUR) {
        this.NAME_OF_CHILD_FOUR = NAME_OF_CHILD_FOUR;
    }

    public String getNAME_OF_CHILD_FOUR() {
        return NAME_OF_CHILD_FOUR;
    }

    public void setNAME_OF_CHILD_FIVE(String NAME_OF_CHILD_FIVE) {
        this.NAME_OF_CHILD_FIVE = NAME_OF_CHILD_FIVE;
    }

    public String getNAME_OF_CHILD_FIVE() {
        return NAME_OF_CHILD_FIVE;
    }

    public void setNAME_OF_CHILD_SIX(String NAME_OF_CHILD_SIX) {
        this.NAME_OF_CHILD_SIX = NAME_OF_CHILD_SIX;
    }

    public String getNAME_OF_CHILD_SIX() {
        return NAME_OF_CHILD_SIX;
    }

    public void setNAME_OF_CHILD_SEVEN(String NAME_OF_CHILD_SEVEN) {
        this.NAME_OF_CHILD_SEVEN = NAME_OF_CHILD_SEVEN;
    }

    public String getNAME_OF_CHILD_SEVEN() {
        return NAME_OF_CHILD_SEVEN;
    }

    public void setNAME_OF_CHILD_EIGHT(String NAME_OF_CHILD_EIGHT) {
        this.NAME_OF_CHILD_EIGHT = NAME_OF_CHILD_EIGHT;
    }

    public String getNAME_OF_CHILD_EIGHT() {
        return NAME_OF_CHILD_EIGHT;
    }

    public void setNAME_OF_CHILD_NINE(String NAME_OF_CHILD_NINE) {
        this.NAME_OF_CHILD_NINE = NAME_OF_CHILD_NINE;
    }

    public String getNAME_OF_CHILD_NINE() {
        return NAME_OF_CHILD_NINE;
    }

    public void setNAME_OF_CHILD_TEN(String NAME_OF_CHILD_TEN) {
        this.NAME_OF_CHILD_TEN = NAME_OF_CHILD_TEN;
    }

    public String getNAME_OF_CHILD_TEN() {
        return NAME_OF_CHILD_TEN;
    }

    public void setNID_OF_CHILD_ONE(String NID_OF_CHILD_ONE) {
        this.NID_OF_CHILD_ONE = NID_OF_CHILD_ONE;
    }

    public String getNID_OF_CHILD_ONE() {
        return NID_OF_CHILD_ONE;
    }

    public void setNID_OF_CHILD_TWO(String NID_OF_CHILD_TWO) {
        this.NID_OF_CHILD_TWO = NID_OF_CHILD_TWO;
    }

    public String getNID_OF_CHILD_TWO() {
        return NID_OF_CHILD_TWO;
    }

    public void setNID_OF_CHILD_THREE(String NID_OF_CHILD_THREE) {
        this.NID_OF_CHILD_THREE = NID_OF_CHILD_THREE;
    }

    public String getNID_OF_CHILD_THREE() {
        return NID_OF_CHILD_THREE;
    }

    public void setNID_OF_CHILD_FOUR(String NID_OF_CHILD_FOUR) {
        this.NID_OF_CHILD_FOUR = NID_OF_CHILD_FOUR;
    }

    public String getNID_OF_CHILD_FOUR() {
        return NID_OF_CHILD_FOUR;
    }

    public void setNID_OF_CHILD_FIVE(String NID_OF_CHILD_FIVE) {
        this.NID_OF_CHILD_FIVE = NID_OF_CHILD_FIVE;
    }

    public String getNID_OF_CHILD_FIVE() {
        return NID_OF_CHILD_FIVE;
    }

    public void setNID_OF_CHILD_SIX(String NID_OF_CHILD_SIX) {
        this.NID_OF_CHILD_SIX = NID_OF_CHILD_SIX;
    }

    public String getNID_OF_CHILD_SIX() {
        return NID_OF_CHILD_SIX;
    }

    public void setNID_OF_CHILD_SEVEN(String NID_OF_CHILD_SEVEN) {
        this.NID_OF_CHILD_SEVEN = NID_OF_CHILD_SEVEN;
    }

    public String getNID_OF_CHILD_SEVEN() {
        return NID_OF_CHILD_SEVEN;
    }

    public void setNID_OF_CHILD_EIGHT(String NID_OF_CHILD_EIGHT) {
        this.NID_OF_CHILD_EIGHT = NID_OF_CHILD_EIGHT;
    }

    public String getNID_OF_CHILD_EIGHT() {
        return NID_OF_CHILD_EIGHT;
    }

    public void setNID_OF_CHILD_NINE(String NID_OF_CHILD_NINE) {
        this.NID_OF_CHILD_NINE = NID_OF_CHILD_NINE;
    }

    public String getNID_OF_CHILD_NINE() {
        return NID_OF_CHILD_NINE;
    }

    public void setNID_OF_CHILD_TEN(String NID_OF_CHILD_TEN) {
        this.NID_OF_CHILD_TEN = NID_OF_CHILD_TEN;
    }

    public String getNID_OF_CHILD_TEN() {
        return NID_OF_CHILD_TEN;
    }

    public void setNAME_OF_CHILD_TWO(String NAME_OF_CHILD_TWO) {
        this.NAME_OF_CHILD_TWO = NAME_OF_CHILD_TWO;
    }

    public String getNAME_OF_CHILD_TWO() {
        return NAME_OF_CHILD_TWO;
    }

    public void setFROM_DATE(String FROM_DATE) {
        this.FROM_DATE = FROM_DATE;
    }

    public String getFROM_DATE() {
        return FROM_DATE;
    }

    public void setTO_DATE(String TO_DATE) {
        this.TO_DATE = TO_DATE;
    }

    public String getTO_DATE() {
        return TO_DATE;
    }

    public void setNAME_OF_CHILD(String NAME_OF_CHILD) {
        this.NAME_OF_CHILD = NAME_OF_CHILD;
    }

    public String getNAME_OF_CHILD() {
        return NAME_OF_CHILD;
    }

    public void setTOTAL_CHILDREN(String TOTAL_CHILDREN) {
        this.TOTAL_CHILDREN = TOTAL_CHILDREN;
    }

    public String getTOTAL_CHILDREN() {
        return TOTAL_CHILDREN;
    }

    public void setISACTIVE(String ISACTIVE) {
        this.ISACTIVE = ISACTIVE;
    }

    public String getISACTIVE() {
        return ISACTIVE;
    }

}
