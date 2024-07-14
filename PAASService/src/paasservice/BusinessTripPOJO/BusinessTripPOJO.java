package paasservice.BusinessTripPOJO;

public class BusinessTripPOJO {
    public BusinessTripPOJO() {
        super();
    }
    
    private String BUSINESS_TRIP_ID; 
    private String PERSONE_ID; 
    private String STEP_ID; 
    private String START_DATE; 
    private String END_DATE; 
    private String DAYS; 
    private String COUNTRY_NAME; 
    private String LAUNDRY_ALLOWANCE_AMOUNT; 
    private String TRANSPORTATION_ALLOWANCE_TYPE; 
    private String TRANS_ALLOWANCE_AMOUNT; 
    private String HOUSING_ALLOWANCE_TYPE; 
    private String HOUSING_ALLOWANCE_AMOUNT; 
    private String FOOD_ALLOWANCE_TYPE; 
    private String FOOD_ALLOWANCE_AMOUNT; 
    private String MEANS_TRAVEL; 
    private String VISA_COST; 
    private String OTHER_COST; 
    private String BUDGET_FLAG; 
    private String TRIP_TYPE; 
    private String PERSONE_NAME; 
    private String REQUEST_STATUS; 
    private String REJECT_COMMENTS; 
    private String ASSIGNEE; 
    private String TRIP_REASON; 
    private String EVENT_SUBJECT; 
    private String EVENT_TYPE; 
    private String REQUIRED_VISA; 
    private String TARGETED_COMPETENCIES; 
    private String COURSE_NAME; 
    private String EXPENSE_BUSINESS_TRIP_ID; 
    private String EXPENSE_FLAG; 
    private String EXPENSE_TYPE; 
    private String CANCEL_REASON; 
    private String SUB_TYPE; 
    private String NEW_CITY; 
    private String DESTINATION_TYPE; 
    private String CREATION_DATE; 
    private String COST_CENTER; 
    private String COST_CENTER_NUMBER; 
    private String TRAINING_COST; 
    private String OTHER_MEANS_TRAVEL; 
    private String TRAVEL_COST; 
    private String EVENT_COST; 
    private String TRIP_COMMENT; 
    private String PERSON_POSITION; 
    private String PERSON_JOB; 
    private String PERSON_DEPARTMENT; 
    private String PERSON_LOCATION; 
    private String OTHER_CITIES; 
    private String TO_CITY; 
    private String ACTION_TAKEN; 
    private String TOTAL_FOR_INVOICE; 
    private String ASSIGNEE_NAME; 
    private String PER_DIEM_AMOUNT; 
    private String LOB; 
    private String DIVISION; 
    private String TOTAL_AMOUNT; 
    private String BENEFIT_TYPE;

    public BusinessTripPOJO(String BUSINESS_TRIP_ID, String PERSONE_ID,
                            String STEP_ID, String START_DATE, String END_DATE,
                            String DAYS, String COUNTRY_NAME,
                            String LAUNDRY_ALLOWANCE_AMOUNT,
                            String TRANSPORTATION_ALLOWANCE_TYPE,
                            String TRANS_ALLOWANCE_AMOUNT,
                            String HOUSING_ALLOWANCE_TYPE,
                            String HOUSING_ALLOWANCE_AMOUNT,
                            String FOOD_ALLOWANCE_TYPE,
                            String FOOD_ALLOWANCE_AMOUNT, String MEANS_TRAVEL,
                            String VISA_COST, String OTHER_COST,
                            String BUDGET_FLAG, String TRIP_TYPE,
                            String PERSONE_NAME, String REQUEST_STATUS,
                            String REJECT_COMMENTS, String ASSIGNEE,
                            String TRIP_REASON, String EVENT_SUBJECT,
                            String EVENT_TYPE, String REQUIRED_VISA,
                            String TARGETED_COMPETENCIES, String COURSE_NAME,
                            String EXPENSE_BUSINESS_TRIP_ID,
                            String EXPENSE_FLAG, String EXPENSE_TYPE,
                            String CANCEL_REASON, String SUB_TYPE,
                            String NEW_CITY, String DESTINATION_TYPE,
                            String CREATION_DATE, String COST_CENTER,
                            String COST_CENTER_NUMBER, String TRAINING_COST,
                            String OTHER_MEANS_TRAVEL, String TRAVEL_COST,
                            String EVENT_COST, String TRIP_COMMENT,
                            String PERSON_POSITION, String PERSON_JOB,
                            String PERSON_DEPARTMENT, String PERSON_LOCATION,
                            String OTHER_CITIES, String TO_CITY,
                            String ACTION_TAKEN, String TOTAL_FOR_INVOICE,
                            String ASSIGNEE_NAME, String PER_DIEM_AMOUNT,
                            String LOB, String DIVISION, String TOTAL_AMOUNT,
                            String BENEFIT_TYPE) {
        super();
        this.BUSINESS_TRIP_ID = BUSINESS_TRIP_ID;
        this.PERSONE_ID = PERSONE_ID;
        this.STEP_ID = STEP_ID!=null ? STEP_ID : "";
        this.START_DATE = START_DATE!=null ? START_DATE : "";
        this.END_DATE = END_DATE!=null ? END_DATE : "";
        this.DAYS = DAYS!=null ? DAYS : "";
        this.COUNTRY_NAME = COUNTRY_NAME!=null ? COUNTRY_NAME : "";
        this.LAUNDRY_ALLOWANCE_AMOUNT = LAUNDRY_ALLOWANCE_AMOUNT!=null ? LAUNDRY_ALLOWANCE_AMOUNT : "";
        this.TRANSPORTATION_ALLOWANCE_TYPE = TRANSPORTATION_ALLOWANCE_TYPE!=null ? TRANSPORTATION_ALLOWANCE_TYPE : "";
        this.TRANS_ALLOWANCE_AMOUNT = TRANS_ALLOWANCE_AMOUNT!=null ? TRANS_ALLOWANCE_AMOUNT : "";
        this.HOUSING_ALLOWANCE_TYPE = HOUSING_ALLOWANCE_TYPE!=null ? HOUSING_ALLOWANCE_TYPE : "";
        this.HOUSING_ALLOWANCE_AMOUNT = HOUSING_ALLOWANCE_AMOUNT!=null ? HOUSING_ALLOWANCE_AMOUNT : "";
        this.FOOD_ALLOWANCE_TYPE = FOOD_ALLOWANCE_TYPE!=null ? FOOD_ALLOWANCE_TYPE : "";
        this.FOOD_ALLOWANCE_AMOUNT = FOOD_ALLOWANCE_AMOUNT!=null ? FOOD_ALLOWANCE_AMOUNT : "";
        this.MEANS_TRAVEL = MEANS_TRAVEL!=null ? MEANS_TRAVEL : "";
        this.VISA_COST = VISA_COST!=null ? VISA_COST : "";
        this.OTHER_COST = OTHER_COST!=null ? OTHER_COST : "";
        this.BUDGET_FLAG = BUDGET_FLAG!=null ? BUDGET_FLAG : "";
        this.TRIP_TYPE = TRIP_TYPE!=null ? TRIP_TYPE : "";
        this.PERSONE_NAME = PERSONE_NAME!=null ? PERSONE_NAME : "";
        this.REQUEST_STATUS = REQUEST_STATUS!=null ? REQUEST_STATUS : "";
        this.REJECT_COMMENTS = REJECT_COMMENTS!=null ? REJECT_COMMENTS : "";
        this.ASSIGNEE = ASSIGNEE!=null ? ASSIGNEE : "";
        this.TRIP_REASON = TRIP_REASON!=null ? TRIP_REASON : "";
        this.EVENT_SUBJECT = EVENT_SUBJECT!=null ? EVENT_SUBJECT : "";
        this.EVENT_TYPE = EVENT_TYPE!=null ? EVENT_TYPE : "";
        this.REQUIRED_VISA = REQUIRED_VISA!=null ? REQUIRED_VISA : "";
        this.TARGETED_COMPETENCIES = TARGETED_COMPETENCIES!=null ? TARGETED_COMPETENCIES : "";
        this.COURSE_NAME = COURSE_NAME!=null ? COURSE_NAME : "";
        this.EXPENSE_BUSINESS_TRIP_ID = EXPENSE_BUSINESS_TRIP_ID!=null ? EXPENSE_BUSINESS_TRIP_ID : "";
        this.EXPENSE_FLAG = EXPENSE_FLAG!=null ? EXPENSE_FLAG : "";
        this.EXPENSE_TYPE = EXPENSE_TYPE!=null ? EXPENSE_TYPE : "";
        this.CANCEL_REASON = CANCEL_REASON!=null ? CANCEL_REASON : "";
        this.SUB_TYPE = SUB_TYPE!=null ? SUB_TYPE : "";
        this.NEW_CITY = NEW_CITY!=null ? NEW_CITY :"";
        this.DESTINATION_TYPE = DESTINATION_TYPE!=null ? DESTINATION_TYPE : "";
        this.CREATION_DATE = CREATION_DATE!=null ? CREATION_DATE : "";
        this.COST_CENTER = COST_CENTER!=null ? COST_CENTER : "";
        this.COST_CENTER_NUMBER = COST_CENTER_NUMBER!=null ? COST_CENTER_NUMBER : "";
        this.TRAINING_COST = TRAINING_COST!=null ? TRAINING_COST : "";
        this.OTHER_MEANS_TRAVEL = OTHER_MEANS_TRAVEL!=null ? OTHER_MEANS_TRAVEL : "";
        this.TRAVEL_COST = TRAVEL_COST!=null ? TRAVEL_COST : "";
        this.EVENT_COST = EVENT_COST!=null ? EVENT_COST : "";
        this.TRIP_COMMENT = TRIP_COMMENT!=null ? TRIP_COMMENT : "";
        this.PERSON_POSITION = PERSON_POSITION!=null ? PERSON_POSITION : "";
        this.PERSON_JOB = PERSON_JOB!=null ? PERSON_JOB : "";
        this.PERSON_DEPARTMENT = PERSON_DEPARTMENT!=null ? PERSON_DEPARTMENT : "";
        this.PERSON_LOCATION = PERSON_LOCATION!=null ? PERSON_LOCATION : "";
        this.OTHER_CITIES = OTHER_CITIES!=null ? OTHER_CITIES : "";
        this.TO_CITY = TO_CITY!=null ? TO_CITY : "";
        this.ACTION_TAKEN = ACTION_TAKEN!=null ? ACTION_TAKEN : "";
        this.TOTAL_FOR_INVOICE = TOTAL_FOR_INVOICE!=null ? TOTAL_FOR_INVOICE : "";
        this.ASSIGNEE_NAME = ASSIGNEE_NAME!=null ? ASSIGNEE_NAME : "";
        this.PER_DIEM_AMOUNT = PER_DIEM_AMOUNT!=null ? PER_DIEM_AMOUNT : "";
        this.LOB = LOB!=null ? LOB : "";
        this.DIVISION = DIVISION!=null ? DIVISION : "";
        this.TOTAL_AMOUNT = TOTAL_AMOUNT!=null ? TOTAL_AMOUNT : "";
        this.BENEFIT_TYPE = BENEFIT_TYPE!=null ? BENEFIT_TYPE : "";
    }

    public void setBUSINESS_TRIP_ID(String BUSINESS_TRIP_ID) {
        this.BUSINESS_TRIP_ID = BUSINESS_TRIP_ID;
    }

    public String getBUSINESS_TRIP_ID() {
        return BUSINESS_TRIP_ID;
    }

    public void setPERSONE_ID(String PERSONE_ID) {
        this.PERSONE_ID = PERSONE_ID;
    }

    public String getPERSONE_ID() {
        return PERSONE_ID;
    }

    public void setSTEP_ID(String STEP_ID) {
        this.STEP_ID = STEP_ID;
    }

    public String getSTEP_ID() {
        return STEP_ID;
    }

    public void setSTART_DATE(String START_DATE) {
        this.START_DATE = START_DATE;
    }

    public String getSTART_DATE() {
        return START_DATE;
    }

    public void setEND_DATE(String END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getEND_DATE() {
        return END_DATE;
    }

    public void setDAYS(String DAYS) {
        this.DAYS = DAYS;
    }

    public String getDAYS() {
        return DAYS;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setLAUNDRY_ALLOWANCE_AMOUNT(String LAUNDRY_ALLOWANCE_AMOUNT) {
        this.LAUNDRY_ALLOWANCE_AMOUNT = LAUNDRY_ALLOWANCE_AMOUNT;
    }

    public String getLAUNDRY_ALLOWANCE_AMOUNT() {
        return LAUNDRY_ALLOWANCE_AMOUNT;
    }

    public void setTRANSPORTATION_ALLOWANCE_TYPE(String TRANSPORTATION_ALLOWANCE_TYPE) {
        this.TRANSPORTATION_ALLOWANCE_TYPE = TRANSPORTATION_ALLOWANCE_TYPE;
    }

    public String getTRANSPORTATION_ALLOWANCE_TYPE() {
        return TRANSPORTATION_ALLOWANCE_TYPE;
    }

    public void setTRANS_ALLOWANCE_AMOUNT(String TRANS_ALLOWANCE_AMOUNT) {
        this.TRANS_ALLOWANCE_AMOUNT = TRANS_ALLOWANCE_AMOUNT;
    }

    public String getTRANS_ALLOWANCE_AMOUNT() {
        return TRANS_ALLOWANCE_AMOUNT;
    }

    public void setHOUSING_ALLOWANCE_TYPE(String HOUSING_ALLOWANCE_TYPE) {
        this.HOUSING_ALLOWANCE_TYPE = HOUSING_ALLOWANCE_TYPE;
    }

    public String getHOUSING_ALLOWANCE_TYPE() {
        return HOUSING_ALLOWANCE_TYPE;
    }

    public void setHOUSING_ALLOWANCE_AMOUNT(String HOUSING_ALLOWANCE_AMOUNT) {
        this.HOUSING_ALLOWANCE_AMOUNT = HOUSING_ALLOWANCE_AMOUNT;
    }

    public String getHOUSING_ALLOWANCE_AMOUNT() {
        return HOUSING_ALLOWANCE_AMOUNT;
    }

    public void setFOOD_ALLOWANCE_TYPE(String FOOD_ALLOWANCE_TYPE) {
        this.FOOD_ALLOWANCE_TYPE = FOOD_ALLOWANCE_TYPE;
    }

    public String getFOOD_ALLOWANCE_TYPE() {
        return FOOD_ALLOWANCE_TYPE;
    }

    public void setFOOD_ALLOWANCE_AMOUNT(String FOOD_ALLOWANCE_AMOUNT) {
        this.FOOD_ALLOWANCE_AMOUNT = FOOD_ALLOWANCE_AMOUNT;
    }

    public String getFOOD_ALLOWANCE_AMOUNT() {
        return FOOD_ALLOWANCE_AMOUNT;
    }

    public void setMEANS_TRAVEL(String MEANS_TRAVEL) {
        this.MEANS_TRAVEL = MEANS_TRAVEL;
    }

    public String getMEANS_TRAVEL() {
        return MEANS_TRAVEL;
    }

    public void setVISA_COST(String VISA_COST) {
        this.VISA_COST = VISA_COST;
    }

    public String getVISA_COST() {
        return VISA_COST;
    }

    public void setOTHER_COST(String OTHER_COST) {
        this.OTHER_COST = OTHER_COST;
    }

    public String getOTHER_COST() {
        return OTHER_COST;
    }

    public void setBUDGET_FLAG(String BUDGET_FLAG) {
        this.BUDGET_FLAG = BUDGET_FLAG;
    }

    public String getBUDGET_FLAG() {
        return BUDGET_FLAG;
    }

    public void setTRIP_TYPE(String TRIP_TYPE) {
        this.TRIP_TYPE = TRIP_TYPE;
    }

    public String getTRIP_TYPE() {
        return TRIP_TYPE;
    }

    public void setPERSONE_NAME(String PERSONE_NAME) {
        this.PERSONE_NAME = PERSONE_NAME;
    }

    public String getPERSONE_NAME() {
        return PERSONE_NAME;
    }

    public void setREQUEST_STATUS(String REQUEST_STATUS) {
        this.REQUEST_STATUS = REQUEST_STATUS;
    }

    public String getREQUEST_STATUS() {
        return REQUEST_STATUS;
    }

    public void setREJECT_COMMENTS(String REJECT_COMMENTS) {
        this.REJECT_COMMENTS = REJECT_COMMENTS;
    }

    public String getREJECT_COMMENTS() {
        return REJECT_COMMENTS;
    }

    public void setASSIGNEE(String ASSIGNEE) {
        this.ASSIGNEE = ASSIGNEE;
    }

    public String getASSIGNEE() {
        return ASSIGNEE;
    }

    public void setTRIP_REASON(String TRIP_REASON) {
        this.TRIP_REASON = TRIP_REASON;
    }

    public String getTRIP_REASON() {
        return TRIP_REASON;
    }

    public void setEVENT_SUBJECT(String EVENT_SUBJECT) {
        this.EVENT_SUBJECT = EVENT_SUBJECT;
    }

    public String getEVENT_SUBJECT() {
        return EVENT_SUBJECT;
    }

    public void setEVENT_TYPE(String EVENT_TYPE) {
        this.EVENT_TYPE = EVENT_TYPE;
    }

    public String getEVENT_TYPE() {
        return EVENT_TYPE;
    }

    public void setREQUIRED_VISA(String REQUIRED_VISA) {
        this.REQUIRED_VISA = REQUIRED_VISA;
    }

    public String getREQUIRED_VISA() {
        return REQUIRED_VISA;
    }

    public void setTARGETED_COMPETENCIES(String TARGETED_COMPETENCIES) {
        this.TARGETED_COMPETENCIES = TARGETED_COMPETENCIES;
    }

    public String getTARGETED_COMPETENCIES() {
        return TARGETED_COMPETENCIES;
    }

    public void setCOURSE_NAME(String COURSE_NAME) {
        this.COURSE_NAME = COURSE_NAME;
    }

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    public void setEXPENSE_BUSINESS_TRIP_ID(String EXPENSE_BUSINESS_TRIP_ID) {
        this.EXPENSE_BUSINESS_TRIP_ID = EXPENSE_BUSINESS_TRIP_ID;
    }

    public String getEXPENSE_BUSINESS_TRIP_ID() {
        return EXPENSE_BUSINESS_TRIP_ID;
    }

    public void setEXPENSE_FLAG(String EXPENSE_FLAG) {
        this.EXPENSE_FLAG = EXPENSE_FLAG;
    }

    public String getEXPENSE_FLAG() {
        return EXPENSE_FLAG;
    }

    public void setEXPENSE_TYPE(String EXPENSE_TYPE) {
        this.EXPENSE_TYPE = EXPENSE_TYPE;
    }

    public String getEXPENSE_TYPE() {
        return EXPENSE_TYPE;
    }

    public void setCANCEL_REASON(String CANCEL_REASON) {
        this.CANCEL_REASON = CANCEL_REASON;
    }

    public String getCANCEL_REASON() {
        return CANCEL_REASON;
    }

    public void setSUB_TYPE(String SUB_TYPE) {
        this.SUB_TYPE = SUB_TYPE;
    }

    public String getSUB_TYPE() {
        return SUB_TYPE;
    }

    public void setNEW_CITY(String NEW_CITY) {
        this.NEW_CITY = NEW_CITY;
    }

    public String getNEW_CITY() {
        return NEW_CITY;
    }

    public void setDESTINATION_TYPE(String DESTINATION_TYPE) {
        this.DESTINATION_TYPE = DESTINATION_TYPE;
    }

    public String getDESTINATION_TYPE() {
        return DESTINATION_TYPE;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCOST_CENTER(String COST_CENTER) {
        this.COST_CENTER = COST_CENTER;
    }

    public String getCOST_CENTER() {
        return COST_CENTER;
    }

    public void setCOST_CENTER_NUMBER(String COST_CENTER_NUMBER) {
        this.COST_CENTER_NUMBER = COST_CENTER_NUMBER;
    }

    public String getCOST_CENTER_NUMBER() {
        return COST_CENTER_NUMBER;
    }

    public void setTRAINING_COST(String TRAINING_COST) {
        this.TRAINING_COST = TRAINING_COST;
    }

    public String getTRAINING_COST() {
        return TRAINING_COST;
    }

    public void setOTHER_MEANS_TRAVEL(String OTHER_MEANS_TRAVEL) {
        this.OTHER_MEANS_TRAVEL = OTHER_MEANS_TRAVEL;
    }

    public String getOTHER_MEANS_TRAVEL() {
        return OTHER_MEANS_TRAVEL;
    }

    public void setTRAVEL_COST(String TRAVEL_COST) {
        this.TRAVEL_COST = TRAVEL_COST;
    }

    public String getTRAVEL_COST() {
        return TRAVEL_COST;
    }

    public void setEVENT_COST(String EVENT_COST) {
        this.EVENT_COST = EVENT_COST;
    }

    public String getEVENT_COST() {
        return EVENT_COST;
    }

    public void setTRIP_COMMENT(String TRIP_COMMENT) {
        this.TRIP_COMMENT = TRIP_COMMENT;
    }

    public String getTRIP_COMMENT() {
        return TRIP_COMMENT;
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

    public void setOTHER_CITIES(String OTHER_CITIES) {
        this.OTHER_CITIES = OTHER_CITIES;
    }

    public String getOTHER_CITIES() {
        return OTHER_CITIES;
    }

    public void setTO_CITY(String TO_CITY) {
        this.TO_CITY = TO_CITY;
    }

    public String getTO_CITY() {
        return TO_CITY;
    }

    public void setACTION_TAKEN(String ACTION_TAKEN) {
        this.ACTION_TAKEN = ACTION_TAKEN;
    }

    public String getACTION_TAKEN() {
        return ACTION_TAKEN;
    }

    public void setTOTAL_FOR_INVOICE(String TOTAL_FOR_INVOICE) {
        this.TOTAL_FOR_INVOICE = TOTAL_FOR_INVOICE;
    }

    public String getTOTAL_FOR_INVOICE() {
        return TOTAL_FOR_INVOICE;
    }

    public void setASSIGNEE_NAME(String ASSIGNEE_NAME) {
        this.ASSIGNEE_NAME = ASSIGNEE_NAME;
    }

    public String getASSIGNEE_NAME() {
        return ASSIGNEE_NAME;
    }

    public void setPER_DIEM_AMOUNT(String PER_DIEM_AMOUNT) {
        this.PER_DIEM_AMOUNT = PER_DIEM_AMOUNT;
    }

    public String getPER_DIEM_AMOUNT() {
        return PER_DIEM_AMOUNT;
    }

    public void setLOB(String LOB) {
        this.LOB = LOB;
    }

    public String getLOB() {
        return LOB;
    }

    public void setDIVISION(String DIVISION) {
        this.DIVISION = DIVISION;
    }

    public String getDIVISION() {
        return DIVISION;
    }

    public void setTOTAL_AMOUNT(String TOTAL_AMOUNT) {
        this.TOTAL_AMOUNT = TOTAL_AMOUNT;
    }

    public String getTOTAL_AMOUNT() {
        return TOTAL_AMOUNT;
    }

    public void setBENEFIT_TYPE(String BENEFIT_TYPE) {
        this.BENEFIT_TYPE = BENEFIT_TYPE;
    }

    public String getBENEFIT_TYPE() {
        return BENEFIT_TYPE;
    }
}
