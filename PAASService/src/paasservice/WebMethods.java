package paasservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.naming.Context;

import javax.naming.InitialContext;

import javax.sql.DataSource;

import paasservice.BusinessTripPOJO.BusinessTripPOJO;

import paasservice.BusinessTripPOJO.BusinessTripSubmittedAmountPOJO;

import paasservice.manpower.ManPowerPOJO;

import paasservice.Loan.LoanPOJO;

import paasservice.changeposition.ChangePositionPOJO;

import paasservice.education.EducationPOJO;

import paasservice.exceptionalrewards.ExceptionalRewardsPOJO;

import paasservice.exitclearance.ExitClearancePOJO;

import paasservice.exitclearance.TraineesExitFormPOJO;

import paasservice.exitreentry.ExitReEntryPOJO;

import paasservice.loansettlement.LoanSettlementPOJO;

import paasservice.mobile.MobileAllowancePOJO;

import paasservice.overtime.OverTimePOJO;

import paasservice.repayment.RepaymentTicketsPOJO;

import paasservice.specialneed.SpecialNeedsPOJO;

@WebService(name = "PAASWeb", serviceName = "PAASWebService", portName = "PAASWebPort")
public class WebMethods {

    List<ManPowerPOJO> manpower = null;
    List<BusinessTripPOJO> businessTrip = null;
    List<BusinessTripSubmittedAmountPOJO> businessTripSubmittedAmount = null;
    List<LoanPOJO> loan = null;
    List<OverTimePOJO> overtime;
    List<EducationPOJO> Educationpojo;
    List<MobileAllowancePOJO> mobileallowancepojo;
    List<ExitReEntryPOJO> exitPojo;
    List<ExceptionalRewardsPOJO> rewardsPojo;
    List<ChangePositionPOJO> positionPojo;
    List<RepaymentTicketsPOJO> repaymentPojo;
    List<SpecialNeedsPOJO> specialPojo;
    List<LoanSettlementPOJO> loanSettlementPojo;
    List<ExitClearancePOJO> exitClearancePojo;
    List<TraineesExitFormPOJO> traineesExitPojo;

    //private final static String datasource = "tatweerdev"; //local
    //private final static String datasource = "dbtatweert1"; //old PROD
    //private final static String datasource = "ORA-DB_TATWEERDB"; //DEV
   private final static String datasource = "ORADBSPRD01_TATWEERDB"; //PROD


    public WebMethods() {
        super();
    }

    @WebMethod(exclude = true)
    public void setManpower(List<ManPowerPOJO> manpower) {
        this.manpower = manpower;
    }

    @WebMethod
    public List<ManPowerPOJO> getManpower(@WebParam(name = "MAN_POWER_REQ_ID") String MAN_POWER_REQ_ID,
                                          @WebParam(name = "REQUISITION_TITLE") String REQUISITION_TITLE,
                                          @WebParam(name = "ASSIGNEE_NAME") String ASSIGNEE_NAME,
                                          @WebParam(name = "PERSON_NUMBER") String PERSON_NUMBER,
                                          @WebParam(name = "PERSON_NAME") String PERSON_NAME,
                                          @WebParam(name = "REQUEST_STATUS") String REQUEST_STATUS) {
        manpower = new ArrayList<ManPowerPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select MAN_POWER_REQ_ID, to_char(CREATION_DATE,'dd-fmMonth-yyyy') CREATION_DATE, REQUISITION_TITLE, NUMBER_OF_OPENING, to_char(TARGET_START_DATE,'dd-fmMonth-yyyy') TARGET_START_DATE, JUSTIFICATIONS, DEPARTMENT, JOB, GRADE, JOB_DESCRIPTION, QUALIFICATIONS, POSITION_CATEGORY, DURATION, DURATION_TYPE, NATIONALITY, LANGUAGE, OTHER_LANGUAGE, REPLACEMENT, ADDITIONAL_COMMENTS, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, YEARS, MONTHS, DAYS, ACTION_TAKEN, BASIC_SALARY, EXPERIENCE, WORK_TYPE, AVAILABLE_BUDGECT from man_power_requisition";
            if (MAN_POWER_REQ_ID != null && !MAN_POWER_REQ_ID.equalsIgnoreCase("") &&
                !MAN_POWER_REQ_ID.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where MAN_POWER_REQ_ID=" + MAN_POWER_REQ_ID;
                    first = 1;
                } else {
                    query = query + " AND MAN_POWER_REQ_ID=" + MAN_POWER_REQ_ID;
                }
            }
            if (REQUISITION_TITLE != null && !REQUISITION_TITLE.equalsIgnoreCase("") &&
                !REQUISITION_TITLE.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUISITION_TITLE='" + REQUISITION_TITLE + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUISITION_TITLE='" + REQUISITION_TITLE + "'";
                }
            }
            if (ASSIGNEE_NAME != null && !ASSIGNEE_NAME.equalsIgnoreCase("") && !ASSIGNEE_NAME.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where ASSIGNEE_NAME='" + ASSIGNEE_NAME + "'";
                    first = 1;
                } else {
                    query = query + " AND ASSIGNEE_NAME='" + ASSIGNEE_NAME + "'";
                }
            }
            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (PERSON_NAME != null && !PERSON_NAME.equalsIgnoreCase("") && !PERSON_NAME.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NAME='" + PERSON_NAME + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_NAME='" + PERSON_NAME + "'";
                }
            }
            if (REQUEST_STATUS != null && !REQUEST_STATUS.equalsIgnoreCase("") &&
                !REQUEST_STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS='" + REQUEST_STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS='" + REQUEST_STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                manpower.add(new ManPowerPOJO(rs.getString("MAN_POWER_REQ_ID"), rs.getString("CREATION_DATE"),
                                              rs.getString("REQUISITION_TITLE"), rs.getString("NUMBER_OF_OPENING"),
                                              rs.getString("TARGET_START_DATE"), rs.getString("JUSTIFICATIONS"),
                                              rs.getString("DEPARTMENT"), rs.getString("JOB"), rs.getString("GRADE"),
                                              rs.getString("JOB_DESCRIPTION"), rs.getString("QUALIFICATIONS"),
                                              rs.getString("POSITION_CATEGORY"), rs.getString("DURATION"),
                                              rs.getString("DURATION_TYPE"), rs.getString("NATIONALITY"),
                                              rs.getString("LANGUAGE"), rs.getString("OTHER_LANGUAGE"),
                                              rs.getString("REPLACEMENT"), rs.getString("ADDITIONAL_COMMENTS"),
                                              rs.getString("PERSON_NUMBER"), rs.getString("PERSON_NAME"),
                                              rs.getString("STEP_ID"), rs.getString("ASSIGNEE"),
                                              rs.getString("ASSIGNEE_NAME"), rs.getString("PERSON_POSITION"),
                                              rs.getString("PERSON_JOB"), rs.getString("PERSON_DEPARTMENT"),
                                              rs.getString("PERSON_LOCATION"), rs.getString("PERSON_GRADE"),
                                              rs.getString("REQUEST_STATUS"), rs.getString("REJECTION_REASON"),
                                              rs.getString("YEARS"), rs.getString("MONTHS"), rs.getString("DAYS"),
                                              rs.getString("ACTION_TAKEN"), rs.getString("BASIC_SALARY"),
                                              rs.getString("EXPERIENCE"), rs.getString("WORK_TYPE"),
                                              rs.getString("AVAILABLE_BUDGECT")));

            }
            //

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();

                }
                if (con != null) {
                    con.close();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return manpower;
    }

    @WebMethod
    public List<BusinessTripPOJO> getBusinessTrip(@WebParam(name = "BUSINESS_TRIP_ID") String BUSINESS_TRIP_ID,
                                                  @WebParam(name = "PERSON_NAME") String PERSONE_NAME,
                                                  @WebParam(name = "p_from_date") String START_DATE,
                                                  @WebParam(name = "p_to_date") String END_DATE,
                                                  @WebParam(name = "ASSIGNEE_NAME") String ASSIGNEE_NAME,
                                                  @WebParam(name = "REQUEST_STATUS") String REQUEST_STATUS,
                                                  @WebParam(name = "COST_CENTER_NUMBER") String COST_CENTER_NUMBER,
                                                  @WebParam(name = "COST_CENTER") String COST_CENTER,
                                                  @WebParam(name = "p_absence_type") String TRIP_TYPE,
                                                  @WebParam(name = "p_person_number") String PERSONE_NUMBER) {
        businessTrip = new ArrayList<BusinessTripPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select LOCAL_BUSINESS_TRIP_ID, PERSONE_ID, STEP_ID, to_char(START_DATE,'dd-fmMonth-yyyy') START_DATE, to_char(END_DATE,'dd-fmMonth-yyyy') END_DATE,\n" +
                "DAYS, (SELECT COUNTRY_NAME FROM COUNTRIES WHERE COUNTRY_ID=BusinessTripRequest.COUNTRY_ID) COUNTRY_NAME, \n" +
                "LAUNDRY_ALLOWANCE_AMOUNT, TRANSPORTATION_ALLOWANCE_TYPE, TRANS_ALLOWANCE_AMOUNT, HOUSING_ALLOWANCE_TYPE, \n" +
                "HOUSING_ALLOWANCE_AMOUNT, FOOD_ALLOWANCE_TYPE, FOOD_ALLOWANCE_AMOUNT,\n" +
                "MEANS_TRAVEL, VISA_COST,\n" +
                "OTHER_COST, BUDGET_FLAG, TRIP_TYPE, PERSONE_NAME, REQUEST_STATUS, REJECT_COMMENTS, ASSIGNEE, TRIP_REASON, EVENT_SUBJECT, \n" +
                "EVENT_TYPE, REQUIRED_VISA, TARGETED_COMPETENCIES, COURSE_NAME, EXPENSE_BUSINESS_TRIP_ID, EXPENSE_FLAG, EXPENSE_TYPE, CANCEL_REASON, \n" +
                "SUB_TYPE, NEW_CITY, DESTINATION_TYPE, to_char(CREATION_DATE,'dd-fmMonth-yyyy') CREATION_DATE, COST_CENTER, COST_CENTER_NUMBER, \n" +
                "TRAINING_COST, OTHER_MEANS_TRAVEL, TRAVEL_COST, \n" +
                "EVENT_COST, TRIP_COMMENT, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, OTHER_CITIES, TO_CITY, ACTION_TAKEN, \n" +
                "TOTAL_FOR_INVOICE, ASSIGNEE_NAME, PER_DIEM_AMOUNT, LOB, DIVISION,\n" +
                "DECODE(BusinessTripRequest.BENEFIT_TYPE,'A',\n" +
                "  nvl(BusinessTripRequest.LAUNDRY_ALLOWANCE_AMOUNT,0)+nvl(BusinessTripRequest.TRANS_ALLOWANCE_AMOUNT,0)+nvl(BusinessTripRequest.HOUSING_ALLOWANCE_AMOUNT,0)+nvl(BusinessTripRequest.FOOD_ALLOWANCE_AMOUNT,0)+nvl(BusinessTripRequest.VISA_COST,0)+nvl(BusinessTripRequest.OTHER_COST,0)+nvl(BusinessTripRequest.TRAINING_COST,0)+nvl(BusinessTripRequest.TRAVEL_COST,0)+nvl(BusinessTripRequest.EVENT_COST,0)\n" +
                "  ,nvl(BusinessTripRequest.PER_DIEM_AMOUNT,0)+nvl(BusinessTripRequest.VISA_COST,0)+nvl(BusinessTripRequest.OTHER_COST,0)+nvl(BusinessTripRequest.TRAINING_COST,0)+nvl(BusinessTripRequest.TRAVEL_COST,0)+nvl(BusinessTripRequest.EVENT_COST,0)) as total_amount,\n" +
                " DECODE(BusinessTripRequest.BENEFIT_TYPE,'A','Allowances','Per-Diem') AS BENEFIT_TYPE\n" +
                "from business_trip_request BusinessTripRequest";
            if (BUSINESS_TRIP_ID != null && !BUSINESS_TRIP_ID.equalsIgnoreCase("") &&
                !BUSINESS_TRIP_ID.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where LOCAL_BUSINESS_TRIP_ID=" + BUSINESS_TRIP_ID;
                    first = 1;
                } else {
                    query = query + " AND LOCAL_BUSINESS_TRIP_ID=" + BUSINESS_TRIP_ID;
                }
            }
            if (PERSONE_NAME != null && !PERSONE_NAME.equalsIgnoreCase("") && !PERSONE_NAME.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSONE_NAME='" + PERSONE_NAME + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSONE_NAME='" + PERSONE_NAME + "'";
                }
            }
            if (START_DATE != null && !START_DATE.equalsIgnoreCase("") && !START_DATE.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where (trunc(START_DATE) between to_date('" + START_DATE + "','MM-dd-yyyy')";
                    first = 1;
                } else {
                    query = query + " AND (trunc(START_DATE) between to_date('" + START_DATE + "','MM-dd-yyyy')";
                }
                if (END_DATE != null && !END_DATE.equalsIgnoreCase("") && !END_DATE.equalsIgnoreCase("?")) {
                    query = query + " AND to_date('" + END_DATE + "','MM-dd-yyyy')";
                } else {
                    query = query + " AND trunc(sysdate)";
                }
                if (END_DATE != null && !END_DATE.equalsIgnoreCase("") && !END_DATE.equalsIgnoreCase("?")) {
                    query =
                        query + " OR trunc(END_DATE) between to_date('" + START_DATE + "','MM-dd-yyyy') AND to_date('" +
                        END_DATE + "','MM-dd-yyyy'))";
                } else {
                    query =
                        query + " OR trunc(END_DATE) between to_date('" + START_DATE +
                        "','MM-dd-yyyy') AND trunc(sysdate))";
                }
            }
            if (END_DATE != null && !END_DATE.equalsIgnoreCase("") && !END_DATE.equalsIgnoreCase("?")) {
                if (START_DATE != null && !START_DATE.equalsIgnoreCase("") && !START_DATE.equalsIgnoreCase("?")) {
                    if (first == 0) {
                        query = query + " where (trunc(START_DATE) between to_date('" + START_DATE + "','MM-dd-yyyy')";
                        first = 1;
                    } else {
                        query = query + " AND (trunc(START_DATE) between to_date('" + START_DATE + "','MM-dd-yyyy')";
                    }
                } else {
                    if (first == 0) {
                        query = query + " where (trunc(START_DATE) between to_date('01-01-2000','MM-dd-yyyy')";
                        first = 1;
                    } else {
                        query = query + " AND (trunc(START_DATE) between to_date('01-01-2000','MM-dd-yyyy')";
                    }
                }
                query = query + " AND to_date('" + END_DATE + "','MM-dd-yyyy')";
                if (START_DATE != null && !START_DATE.equalsIgnoreCase("") && !START_DATE.equalsIgnoreCase("?")) {
                    query =
                        query + " OR trunc(END_DATE) between to_date('" + START_DATE + "','MM-dd-yyyy') AND to_date('" +
                        END_DATE + "','MM-dd-yyyy'))";
                } else {
                    query =
                        query + " OR trunc(END_DATE) between to_date('01-01-2000','MM-dd-yyyy') AND to_date('" +
                        END_DATE + "','MM-dd-yyyy'))";
                }
            }
            if (ASSIGNEE_NAME != null && !ASSIGNEE_NAME.equalsIgnoreCase("") && !ASSIGNEE_NAME.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where ASSIGNEE_NAME='" + ASSIGNEE_NAME + "'";
                    first = 1;
                } else {
                    query = query + " AND ASSIGNEE_NAME='" + ASSIGNEE_NAME + "'";
                }
            }
            if (REQUEST_STATUS != null && !REQUEST_STATUS.equalsIgnoreCase("") &&
                !REQUEST_STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS='" + REQUEST_STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS='" + REQUEST_STATUS + "'";
                }
            }
            if (COST_CENTER_NUMBER != null && !COST_CENTER_NUMBER.equalsIgnoreCase("") &&
                !COST_CENTER_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where COST_CENTER_NUMBER=" + COST_CENTER_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND COST_CENTER_NUMBER=" + COST_CENTER_NUMBER;
                }
            }
            if (COST_CENTER != null && !COST_CENTER.equalsIgnoreCase("") && !COST_CENTER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where COST_CENTER='" + COST_CENTER + "'";
                    first = 1;
                } else {
                    query = query + " AND COST_CENTER='" + COST_CENTER + "'";
                }
            }
            if (TRIP_TYPE != null && !TRIP_TYPE.equalsIgnoreCase("") && !TRIP_TYPE.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where TRIP_TYPE='" + TRIP_TYPE + "'";
                    first = 1;
                } else {
                    query = query + " AND TRIP_TYPE='" + TRIP_TYPE + "'";
                }
            }
            if (PERSONE_NUMBER != null && !PERSONE_NUMBER.equalsIgnoreCase("") &&
                !PERSONE_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSONE_ID=" + PERSONE_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSONE_ID=" + PERSONE_NUMBER;
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                businessTrip.add(new BusinessTripPOJO(rs.getString("LOCAL_BUSINESS_TRIP_ID"),
                                                      rs.getString("PERSONE_ID"), rs.getString("STEP_ID"),
                                                      rs.getString("START_DATE"), rs.getString("END_DATE"),
                                                      rs.getString("DAYS"), rs.getString("COUNTRY_NAME"),
                                                      rs.getString("LAUNDRY_ALLOWANCE_AMOUNT"),
                                                      rs.getString("TRANSPORTATION_ALLOWANCE_TYPE"),
                                                      rs.getString("TRANS_ALLOWANCE_AMOUNT"),
                                                      rs.getString("HOUSING_ALLOWANCE_TYPE"),
                                                      rs.getString("HOUSING_ALLOWANCE_AMOUNT"),
                                                      rs.getString("FOOD_ALLOWANCE_TYPE"),
                                                      rs.getString("FOOD_ALLOWANCE_AMOUNT"),
                                                      rs.getString("MEANS_TRAVEL"), rs.getString("VISA_COST"),
                                                      rs.getString("OTHER_COST"), rs.getString("BUDGET_FLAG"),
                                                      rs.getString("TRIP_TYPE"), rs.getString("PERSONE_NAME"),
                                                      rs.getString("REQUEST_STATUS"), rs.getString("REJECT_COMMENTS"),
                                                      rs.getString("ASSIGNEE"), rs.getString("TRIP_REASON"),
                                                      rs.getString("EVENT_SUBJECT"), rs.getString("EVENT_TYPE"),
                                                      rs.getString("REQUIRED_VISA"),
                                                      rs.getString("TARGETED_COMPETENCIES"),
                                                      rs.getString("COURSE_NAME"),
                                                      rs.getString("EXPENSE_BUSINESS_TRIP_ID"),
                                                      rs.getString("EXPENSE_FLAG"), rs.getString("EXPENSE_TYPE"),
                                                      rs.getString("CANCEL_REASON"), rs.getString("SUB_TYPE"),
                                                      rs.getString("NEW_CITY"), rs.getString("DESTINATION_TYPE"),
                                                      rs.getString("CREATION_DATE"), rs.getString("COST_CENTER"),
                                                      rs.getString("COST_CENTER_NUMBER"), rs.getString("TRAINING_COST"),
                                                      rs.getString("OTHER_MEANS_TRAVEL"), rs.getString("TRAVEL_COST"),
                                                      rs.getString("EVENT_COST"), rs.getString("TRIP_COMMENT"),
                                                      rs.getString("PERSON_POSITION"), rs.getString("PERSON_JOB"),
                                                      rs.getString("PERSON_DEPARTMENT"),
                                                      rs.getString("PERSON_LOCATION"), rs.getString("OTHER_CITIES"),
                                                      rs.getString("TO_CITY"), rs.getString("ACTION_TAKEN"),
                                                      rs.getString("TOTAL_FOR_INVOICE"), rs.getString("ASSIGNEE_NAME"),
                                                      rs.getString("PER_DIEM_AMOUNT"), rs.getString("LOB"),
                                                      rs.getString("DIVISION"), rs.getString("TOTAL_AMOUNT"),
                                                      rs.getString("BENEFIT_TYPE")));

            }
            //

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();

                }
                if (con != null) {
                    con.close();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return businessTrip;
    }


    @WebMethod
    public List<BusinessTripSubmittedAmountPOJO> getBusinessTripSubmittedAmount1(@WebParam(name = "PERIOD")
                                                                                 String PERIOD,
                                                                                 @WebParam(name = "DIVISION")
                                                                                 String DIVISION,
                                                                                 @WebParam(name = "LOB") String LOB,
                                                                                 @WebParam(name = "COSTCENTERNUMBER")
                                                                                 String COSTCENTERNUMBER) {
        if (DIVISION != null && (DIVISION.equals("") || DIVISION.equals("?"))) {
            DIVISION = null;
        }
        if (LOB != null && (LOB.equals("") || LOB.equals("?"))) {
            LOB = null;
        }
        if (COSTCENTERNUMBER != null && (COSTCENTERNUMBER.equals("") || COSTCENTERNUMBER.equals("?"))) {
            COSTCENTERNUMBER = null;
        }
        businessTripSubmittedAmount = new ArrayList<BusinessTripSubmittedAmountPOJO>();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            String query =
                "select * from (select (  \n" +
                "                     (select nvl(sum(other_cost),0) from BUSINESS_TRIP_REQUEST  \n" +
                "                     WHERE REQUEST_STATUS          NOT IN ('SAVED','REJECTED','Withdrawn') \n" +
                "                     and division=btr1.division  \n" + "                     and lob=btr1.lob  \n" +
                "                     and cost_center_number=btr1.cost_center_number  \n" +
                "                     and MEANS_TRAVEL IN('Car (Company)','Train (Company)','Plane (Company)')  \n" +
                "                     and BENEFIT_TYPE ='A' and expense_flag='N'\n" +
                "                     AND EXTRACT( year  from creation_date)=?)  \n" + "                     +  \n" +
                "                     (select nvl(sum(other_cost),0)   from BUSINESS_TRIP_REQUEST  \n" +
                "                       WHERE REQUEST_STATUS         NOT IN ('SAVED','REJECTED','Withdrawn') \n" +
                "                       and division=btr1.division  \n" + "                     and lob=btr1.lob  \n" +
                "                     and cost_center_number=btr1.cost_center_number  \n" +
                "                     and MEANS_TRAVEL IN ('Car (Employee)','Train (Employee)','Plane (Employee)')  \n" +
                "                     and BENEFIT_TYPE ='A' and expense_flag='N'\n" +
                "                     AND EXTRACT( year  from creation_date)=?)  \n" + "                     +  \n" +
                "                     (select nvl(sum(nvl(other_cost +PER_DIEM_AMOUNT,0)),0) from BUSINESS_TRIP_REQUEST  \n" +
                "                       WHERE REQUEST_STATUS         NOT IN ('SAVED','REJECTED','Withdrawn') \n" +
                "                       and division=btr1.division  \n" + "                     and lob=btr1.lob  \n" +
                "                     and cost_center_number=btr1.cost_center_number  \n" +
                "                     and MEANS_TRAVEL IN('Car (Company)','Train (Company)','Plane (Company)')  \n" +
                "                     and BENEFIT_TYPE ='P' and expense_flag='N'\n" +
                "                     AND EXTRACT( year  from creation_date)=?)  \n" + "                     +  \n" +
                "                     (select nvl(sum(nvl(other_cost +PER_DIEM_AMOUNT,0)),0)  from BUSINESS_TRIP_REQUEST  \n" +
                "                      WHERE REQUEST_STATUS          NOT IN ('SAVED','REJECTED','Withdrawn')  \n" +
                "                      and division=btr1.division  \n" + "                     and lob=btr1.lob  \n" +
                "                     and cost_center_number=btr1.cost_center_number  \n" +
                "                     and MEANS_TRAVEL IN ('Car (Employee)','Train (Employee)','Plane (Employee)')  \n" +
                "                     and BENEFIT_TYPE ='P' and expense_flag='N'\n" +
                "                     AND EXTRACT( year  from creation_date)=?)  \n" +
                "                     )  submitted_amount,division,lob,cost_center_number,cost_center,'01-'||division||'-'||lob||'-'||cost_center_number||'-'||'5101030201' code_combination from BUSINESS_TRIP_REQUEST btr1,  \n" +
                "                     departments dpt  \n" + "                     where   \n" +
                "                     dpt.segment2=btr1.division and  \n" +
                "                     dpt.segment3=btr1.lob and  \n" +
                "                     dpt.segment4=btr1.cost_center_number\n" +
                "                     and (? is null or btr1.division=?)\n" +
                "                     and (? is null or btr1.lob=?)\n" +
                "                     and (? is null or btr1.cost_center_number=?)\n" +
                "                     group by division,lob,cost_center_number,cost_center  \n" +
                "                     union  \n" + "                     select (  \n" +
                "                     (select nvl(SUM(nvl(travel_cost,0)),0)   from BUSINESS_TRIP_REQUEST  \n" +
                "                       WHERE REQUEST_STATUS         NOT IN ('SAVED','REJECTED','Withdrawn')   \n" +
                "                       and division=btr1.division  \n" + "                     and lob=btr1.lob  \n" +
                "                     and cost_center_number=btr1.cost_center_number  \n" +
                "                     and MEANS_TRAVEL IN ('Car (Employee)','Train (Employee)','Plane (Employee)')  \n" +
                "                     and BENEFIT_TYPE ='A' and expense_flag='N'\n" +
                "                     AND EXTRACT( year  from creation_date)=?)  \n" + "                     +  \n" +
                "                     (select nvl(SUM(travel_cost),0)  from BUSINESS_TRIP_REQUEST  \n" +
                "                      WHERE REQUEST_STATUS  NOT IN ('SAVED','REJECTED','Withdrawn')  \n" +
                "                      and division=btr1.division  \n" + "                     and lob=btr1.lob  \n" +
                "                     and cost_center_number=btr1.cost_center_number  \n" +
                "                     and MEANS_TRAVEL IN ('Car (Employee)','Train (Employee)','Plane (Employee)')  \n" +
                "                     and BENEFIT_TYPE ='P' and expense_flag='N'\n" +
                "                     AND EXTRACT( year  from creation_date)=?)  \n" +
                "                     )  submitted_amount,division,lob,cost_center_number,cost_center,'01-'||division||'-'||lob||'-'||cost_center_number||'-'||'5101030202' code_combination from BUSINESS_TRIP_REQUEST btr1,  \n" +
                "                     departments dpt  \n" + "                     where   \n" +
                "                     dpt.segment2=btr1.division and  \n" +
                "                     dpt.segment3=btr1.lob and  \n" +
                "                     dpt.segment4=btr1.cost_center_number\n" +
                "                     and (? is null or btr1.division=?)\n" +
                "                     and (? is null or btr1.lob=?)\n" +
                "                     and (? is null or btr1.cost_center_number=?)\n" +
                "                     group by division,lob,cost_center_number,cost_center)\n" +
                "                     order by cost_center";
            System.out.println("query:" + query);
            stmt = con.prepareStatement(query);
            stmt.setString(1, PERIOD);
            stmt.setString(2, PERIOD);
            stmt.setString(3, PERIOD);
            stmt.setString(4, PERIOD);
            stmt.setString(5, DIVISION);
            stmt.setString(6, DIVISION);
            stmt.setString(7, LOB);
            stmt.setString(8, LOB);
            stmt.setString(9, COSTCENTERNUMBER);
            stmt.setString(10, COSTCENTERNUMBER);
            stmt.setString(11, PERIOD);
            stmt.setString(12, PERIOD);
            stmt.setString(13, DIVISION);
            stmt.setString(14, DIVISION);
            stmt.setString(15, LOB);
            stmt.setString(16, LOB);
            stmt.setString(17, COSTCENTERNUMBER);
            stmt.setString(18, COSTCENTERNUMBER);
            rs = stmt.executeQuery();
            while (rs.next()) {
                businessTripSubmittedAmount.add(new BusinessTripSubmittedAmountPOJO(rs.getString("SUBMITTED_AMOUNT"),
                                                                                    rs.getString("DIVISION"),
                                                                                    rs.getString("LOB"),
                                                                                    rs.getString("COST_CENTER_NUMBER"),
                                                                                    rs.getString("COST_CENTER"),
                                                                                    rs.getString("CODE_COMBINATION")));

            }
            //

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();

                }
                if (con != null) {
                    con.close();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return businessTripSubmittedAmount;
    }


    @WebMethod
    public List<LoanPOJO> getLoan(@WebParam(name = "FROM_DATE") String from_date,
                                  @WebParam(name = "TO_DATE") String to_date,
                                  @WebParam(name = "PERSON_NUMBER") String PERSON_NUMBER,
                                  @WebParam(name = "STATUS") String STATUS) {
        loan = new ArrayList<LoanPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select \n" +
                "LOAN_ID, NO_OF_MONTHS, DIVISION, to_char(CREATION_DATE,'dd-fmMonth-yyyy') CREATION_DATE, CREATED_BY, PERSON_ID,\n" +
                "STEP_ID, PERSON_NAME, REQUEST_STATUS, REJECT_COMMENT, ASSIGNEE, CANCEL_REASON, \n" +
                "ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, \n" +
                "PERSON_GRADE, BASIC_SALARY, EMP_BASIC_SALARY, TOTAL_AMOUNT, to_char(YEAR_END,'dd-fmMonth-yyyy') YEAR_END, AMOUNT_IN_YEAR, \n" +
                "ACTION_TAKEN \n" + "from loan_request";
            if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where trunc(creation_date) between to_date('" + from_date + "','MM-dd-yyyy')";
                    first = 1;
                    if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    } else {
                        query = query + " and trunc(sysdate)";
                    }
                } else {
                    query = query + " and trunc(creation_date) between to_date('" + from_date + "','MM-dd-yyyy')";
                    first = 1;
                    if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    } else {
                        query = query + " and trunc(sysdate)";
                    }
                }
            }
            if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                        query = query + " where trunc(creation_date) between to_date('" + from_date + "','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                        first = 1;
                    } else {
                        query = query + " where trunc(creation_date) between to_date('01-01-2000','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                        first = 1;
                    }
                } else {
                    if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                        query = query + " and trunc(creation_date) between to_date('" + from_date + "','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                        first = 1;
                    } else {
                        query = query + " and trunc(creation_date) between to_date('01-01-2000','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                        first = 1;
                    }
                }
            }
            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_ID = '" + PERSON_NUMBER + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_ID = '" + PERSON_NUMBER + "'";
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                loan.add(new LoanPOJO(rs.getString("LOAN_ID"), rs.getString("NO_OF_MONTHS"), rs.getString("DIVISION"),
                                      rs.getString("CREATION_DATE"), rs.getString("CREATED_BY"),
                                      rs.getString("PERSON_ID"), rs.getString("STEP_ID"), rs.getString("PERSON_NAME"),
                                      rs.getString("REQUEST_STATUS"), rs.getString("REJECT_COMMENT"),
                                      rs.getString("ASSIGNEE"), rs.getString("CANCEL_REASON"),
                                      rs.getString("ASSIGNEE_NAME"), rs.getString("PERSON_POSITION"),
                                      rs.getString("PERSON_JOB"), rs.getString("PERSON_DEPARTMENT"),
                                      rs.getString("PERSON_LOCATION"), rs.getString("PERSON_GRADE"),
                                      rs.getString("BASIC_SALARY"), rs.getString("EMP_BASIC_SALARY"),
                                      rs.getString("TOTAL_AMOUNT"), rs.getString("YEAR_END"),
                                      rs.getString("AMOUNT_IN_YEAR"), rs.getString("ACTION_TAKEN")));

            }
            //

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();

                }
                if (con != null) {
                    con.close();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return loan;
    }

    @WebMethod
    public List<OverTimePOJO> getOverTime(@WebParam(name = "REQUESTED_FROM_DATE") final String from_date,
                                          @WebParam(name = "REQUESTED_TO_DATE") final String to_date,
                                          @WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                          @WebParam(name = "STATUS") final String STATUS,
                                          @WebParam(name = "OVERTIME_FROM_DATE") final String overtime_from_date,
                                          @WebParam(name = "OVERTIME_TO_DATE") final String overtime_to_date) {
        this.overtime = new ArrayList<OverTimePOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select otr.OVERTIME_REQUEST_ID, otr.PERSONE_ID, otr.NUMBER_OF_HOURS, otr.STEP_ID, otr.PERSONE_NAME, \notr.REQUEST_STATUS, otr.REJECT_COMMENTS, otr.ASSIGNEE, otr.CANCEL_REASON, to_char(otr.REQ_DATE,'dd-fmMonth-yyyy') REQ_DATE, \notr.ASSIGNEE_NAME, otr.PERSON_POSITION, otr.PERSON_JOB, otr.PERSON_DEPARTMENT, otr.PERSON_LOCATION, \notr.PERSON_GRADE,olr.DESCRIPTION, otr.ACTION_TAKEN, olr.OVERTIME_LINE_REQUEST_ID, olr.HOURS, to_char(olr.OVER_TIME_DATE,'dd-fmMonth-yyyy') OVER_TIME_DATE \nfrom OVERTIME_REQUEST otr LEFT JOIN OVERTIME_LINE_REQUEST olr ON\n   otr. OVERTIME_REQUEST_ID = olr.OVERTIME_REQUEST_ID";
            if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where trunc(otr.REQ_DATE) between to_date('" + from_date + "','MM-dd-yyyy')";
                    first = 1;
                    if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    } else {
                        query += " and trunc(sysdate)";
                    }
                } else {
                    query = query + " and trunc(otr.REQ_DATE) between to_date('" + from_date + "','MM-dd-yyyy')";
                    first = 1;
                    if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    } else {
                        query += " and trunc(sysdate)";
                    }
                }
            }
            if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                        query = query + " where trunc(otr.REQ_DATE) between to_date('" + from_date + "','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                        first = 1;
                    } else {
                        query += " where trunc(otr.REQ_DATE) between to_date('01-01-2000','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                        first = 1;
                    }
                } else if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                    query = query + " and trunc(otr.REQ_DATE) between to_date('" + from_date + "','MM-dd-yyyy')";
                    query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    first = 1;
                } else {
                    query += " and trunc(otr.REQ_DATE) between to_date('01-01-2000','MM-dd-yyyy')";
                    query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    first = 1;
                }
            }
            if (overtime_from_date != null && !overtime_from_date.equalsIgnoreCase("") &&
                !overtime_from_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query =
                        query + " where trunc(olr.OVER_TIME_DATE) between to_date('" + overtime_from_date +
                        "','MM-dd-yyyy')";
                    first = 1;
                    if (overtime_to_date != null && !overtime_to_date.equalsIgnoreCase("") &&
                        !overtime_to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + overtime_to_date + "','MM-dd-yyyy')";
                    } else {
                        query += " and trunc(sysdate)";
                    }
                } else {
                    query =
                        query + " and trunc(olr.OVER_TIME_DATE) between to_date('" + overtime_from_date +
                        "','MM-dd-yyyy')";
                    first = 1;
                    if (overtime_to_date != null && !overtime_to_date.equalsIgnoreCase("") &&
                        !overtime_to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + overtime_to_date + "','MM-dd-yyyy')";
                    } else {
                        query += " and trunc(sysdate)";
                    }
                }
            }
            if (overtime_to_date != null && !overtime_to_date.equalsIgnoreCase("") &&
                !overtime_to_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    if (overtime_from_date != null && !overtime_from_date.equalsIgnoreCase("") &&
                        !overtime_from_date.equalsIgnoreCase("?")) {
                        query =
                            query + " where trunc(olr.OVER_TIME_DATE) between to_date('" + from_date +
                            "','MM-dd-yyyy')";
                        query = query + " and to_date('" + overtime_to_date + "','MM-dd-yyyy')";
                        first = 1;
                    } else {
                        query += " where trunc(olr.OVER_TIME_DATE) between to_date('01-01-2000','MM-dd-yyyy')";
                        query = query + " and to_date('" + overtime_to_date + "','MM-dd-yyyy')";
                        first = 1;
                    }
                } else if (overtime_from_date != null && !overtime_from_date.equalsIgnoreCase("") &&
                           !overtime_from_date.equalsIgnoreCase("?")) {
                    query =
                        query + " and trunc(olr.OVER_TIME_DATE) between to_date('" + overtime_from_date +
                        "','MM-dd-yyyy')";
                    query = query + " and to_date('" + overtime_to_date + "','MM-dd-yyyy')";
                    first = 1;
                } else {
                    query += " and trunc(olr.OVER_TIME_DATE) between to_date('01-01-2000','MM-dd-yyyy')";
                    query = query + " and to_date('" + to_date + "','MM-dd-yyyy')";
                    first = 1;
                }
            }
            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where otr.PERSONE_ID=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND otr.PERSONE_ID=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where otr.REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND otr.REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.overtime.add(new OverTimePOJO(rs.getString("OVERTIME_REQUEST_ID"), rs.getString("PERSONE_ID"),
                                                   rs.getString("NUMBER_OF_HOURS"), rs.getString("PERSONE_NAME"),
                                                   rs.getString("REJECT_COMMENTS"), rs.getString("REQ_DATE"),
                                                   rs.getString("STEP_ID"), rs.getString("OVERTIME_LINE_REQUEST_ID"),
                                                   rs.getString("REQUEST_STATUS"), rs.getString("ASSIGNEE"),
                                                   rs.getString("CANCEL_REASON"), rs.getString("ASSIGNEE_NAME"),
                                                   rs.getString("PERSON_POSITION"), rs.getString("PERSON_JOB"),
                                                   rs.getString("PERSON_DEPARTMENT"), rs.getString("PERSON_LOCATION"),
                                                   rs.getString("PERSON_GRADE"), rs.getString("HOURS"),
                                                   rs.getString("OVER_TIME_DATE"), rs.getString("DESCRIPTION")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.overtime;
    }

    @WebMethod
    public List<EducationPOJO> getEduactionAllowance(@WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                                     @WebParam(name = "STATUS") final String STATUS,
                                                     @WebParam(name = "FROM_DATE") String from_date,
                                                     @WebParam(name = "TO_DATE") String to_date,
                                                     @WebParam(name = "ISACTIVE") final String activeFlag) {
        this.Educationpojo = new ArrayList<EducationPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select EDUCATION_ALLOWANCE_ID, to_char(CREATION_DATE,'dd-fmMonth-yyyy') CREATION_DATE, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, \nPERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, NUMBER_OF_CHILDREN,\nFIRST_CHILD, SECOND_CHILD, THIRD_CHILD, FOURTH_CHILD, FIFTH_CHILD, SIXTH_CHILD, SEVENTH_CHILD, EIGHTTH_CHILD, \nNINTH_CHILD, TENTH_CHILD, PAYMENT_METHOD, IBAN_EMPLOYEE, IBAN_SCHOOL, COMMENTS, TOTAL_AMOUNT, ACTION_TAKEN,NAME_OF_CHILD_ONE,NAME_OF_CHILD_TWO,NAME_OF_CHILD_THREE,NAME_OF_CHILD_FOUR,NAME_OF_CHILD_FIVE,NAME_OF_CHILD_SIX,NAME_OF_CHILD_SEVEN,NAME_OF_CHILD_EIGHT,NAME_OF_CHILD_NINE,NAME_OF_CHILD_TEN,NID_OF_CHILD_ONE,NID_OF_CHILD_TWO,NID_OF_CHILD_THREE,NID_OF_CHILD_FOUR,NID_OF_CHILD_FIVE,NID_OF_CHILD_SIX,NID_OF_CHILD_SEVEN,NID_OF_CHILD_EIGHT,NID_OF_CHILD_NINE,NID_OF_CHILD_TEN,COALESCE(NAME_OF_CHILD_ONE, '') ||' '||COALESCE(NAME_OF_CHILD_TWO, '')||' '||COALESCE(NAME_OF_CHILD_THREE, '')||' '||COALESCE(NAME_OF_CHILD_FOUR, '')||' '||COALESCE(NAME_OF_CHILD_FIVE, '')||' '||COALESCE(NAME_OF_CHILD_SIX, '')||' '||COALESCE(NAME_OF_CHILD_SEVEN, '')||' '||COALESCE(NAME_OF_CHILD_EIGHT, '')||' '||COALESCE(NAME_OF_CHILD_NINE, '')||' '||COALESCE(NAME_OF_CHILD_TEN, '') AS NAME_OF_CHILD, ISACTIVE from EDUCATION_ALLOWANCE";
            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER='" + PERSON_NUMBER + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER='" + PERSON_NUMBER + "'";
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where trunc(creation_date) between to_date('" + from_date + "','mm-dd-yyyy')";
                    first = 1;
                    if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + to_date + "','mm-dd-yyyy')";
                    } else {
                        query = query + " and trunc(sysdate)";
                    }
                } else {
                    query = query + " and trunc(creation_date) between to_date('" + from_date + "','mm-dd-yyyy')";
                    first = 1;
                    if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                        query = query + " and to_date('" + to_date + "','mm-dd-yyyy')";
                    } else {
                        query = query + " and trunc(sysdate)";
                    }
                }
            }
            if (to_date != null && !to_date.equalsIgnoreCase("") && !to_date.equalsIgnoreCase("?")) {
                if (first == 0) {
                    if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                        query = query + " where trunc(creation_date) between to_date('" + from_date + "','mm-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','mm-dd-yyyy')";
                        first = 1;
                    } else {
                        query = query + " where trunc(creation_date) between to_date('01-01-2000','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','mm-dd-yyyy')";
                        first = 1;
                    }
                } else {
                    if (from_date != null && !from_date.equalsIgnoreCase("") && !from_date.equalsIgnoreCase("?")) {
                        query = query + " and trunc(creation_date) between to_date('" + from_date + "','mm-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','mm-dd-yyyy')";
                        first = 1;
                    } else {
                        query = query + " and trunc(creation_date) between to_date('01-01-2000','MM-dd-yyyy')";
                        query = query + " and to_date('" + to_date + "','mm-dd-yyyy')";
                        first = 1;
                    }
                }

            }

            if (activeFlag != null && !activeFlag.equalsIgnoreCase("") && !activeFlag.equalsIgnoreCase("?") &&
                !activeFlag.equalsIgnoreCase("All")) {
                if (first == 0) {
                    query = query + " where ISACTIVE ='" + activeFlag + "'";
                    first = 1;
                } else {
                    query = query + " AND ISACTIVE ='" + activeFlag + "'";
                }
            }


            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.Educationpojo.add(new EducationPOJO(rs.getString("EDUCATION_ALLOWANCE_ID"),
                                                         rs.getString("CREATION_DATE"),
                                                         rs.getString("NUMBER_OF_CHILDREN"),
                                                         rs.getString("FIRST_CHILD"), rs.getString("SECOND_CHILD"),
                                                         rs.getString("THIRD_CHILD"), rs.getString("FOURTH_CHILD"),
                                                         rs.getString("FIFTH_CHILD"), rs.getString("SIXTH_CHILD"),
                                                         rs.getString("SEVENTH_CHILD"), rs.getString("EIGHTTH_CHILD"),
                                                         rs.getString("NINTH_CHILD"), rs.getString("TENTH_CHILD"),
                                                         rs.getString("COMMENTS"), rs.getString("PAYMENT_METHOD"),
                                                         rs.getString("IBAN_SCHOOL"), rs.getString("IBAN_EMPLOYEE"),
                                                         rs.getString("PERSON_NUMBER"), rs.getString("PERSON_NAME"),
                                                         rs.getString("STEP_ID"), rs.getString("ASSIGNEE"),
                                                         rs.getString("ASSIGNEE_NAME"), rs.getString("PERSON_POSITION"),
                                                         rs.getString("PERSON_JOB"), rs.getString("PERSON_DEPARTMENT"),
                                                         rs.getString("PERSON_LOCATION"), rs.getString("PERSON_GRADE"),
                                                         rs.getString("REQUEST_STATUS"),
                                                         rs.getString("REJECTION_REASON"), rs.getString("TOTAL_AMOUNT"),
                                                         rs.getString("ACTION_TAKEN"),
                                                         rs.getString("NAME_OF_CHILD_ONE"),
                                                         rs.getString("NAME_OF_CHILD_TWO"),
                                                         rs.getString("NAME_OF_CHILD_THREE"),
                                                         rs.getString("NAME_OF_CHILD_FOUR"),
                                                         rs.getString("NAME_OF_CHILD_FIVE"),
                                                         rs.getString("NAME_OF_CHILD_SIX"),
                                                         rs.getString("NAME_OF_CHILD_SEVEN"),
                                                         rs.getString("NAME_OF_CHILD_EIGHT"),
                                                         rs.getString("NAME_OF_CHILD_NINE"),
                                                         rs.getString("NAME_OF_CHILD_TEN"),
                                                         rs.getString("NID_OF_CHILD_ONE"),
                                                         rs.getString("NID_OF_CHILD_TWO"),
                                                         rs.getString("NID_OF_CHILD_THREE"),
                                                         rs.getString("NID_OF_CHILD_FOUR"),
                                                         rs.getString("NID_OF_CHILD_FIVE"),
                                                         rs.getString("NID_OF_CHILD_SIX"),
                                                         rs.getString("NID_OF_CHILD_SEVEN"),
                                                         rs.getString("NID_OF_CHILD_EIGHT"),
                                                         rs.getString("NID_OF_CHILD_NINE"),
                                                         rs.getString("NID_OF_CHILD_TEN"),
                                                         rs.getString("NAME_OF_CHILD"), rs.getString("ISACTIVE")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.Educationpojo;
    }

    @WebMethod
    public List<MobileAllowancePOJO> getMobileAllowance(@WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                                        @WebParam(name = "STATUS") final String STATUS) {
        this.mobileallowancepojo = new ArrayList<MobileAllowancePOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select REQUEST_ID, PERSONE_NUMBER, STEP_ID, PERSONE_NAME, REQUEST_STATUS, REJECT_COMMENTS, ASSIGNEE, \nREQUEST_REASON, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, to_char(CREATION_DATE,'dd-fmMonth-yyyy') CREATION_DATE ,\nACTION_TAKEN, NUMBER_OF_MONTHS from MOBILE_ALLOWANCE_REQUEST";
            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSONE_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSONE_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.mobileallowancepojo.add(new MobileAllowancePOJO(rs.getString("REQUEST_ID"),
                                                                     rs.getString("CREATION_DATE"),
                                                                     rs.getString("REQUEST_REASON"),
                                                                     rs.getString("PERSONE_NUMBER"),
                                                                     rs.getString("PERSONE_NAME"),
                                                                     rs.getString("STEP_ID"), rs.getString("ASSIGNEE"),
                                                                     rs.getString("ASSIGNEE_NAME"),
                                                                     rs.getString("PERSON_POSITION"),
                                                                     rs.getString("PERSON_JOB"),
                                                                     rs.getString("PERSON_DEPARTMENT"),
                                                                     rs.getString("PERSON_LOCATION"),
                                                                     rs.getString("PERSON_GRADE"),
                                                                     rs.getString("REQUEST_STATUS"),
                                                                     rs.getString("REJECT_COMMENTS"),
                                                                     rs.getString("ACTION_TAKEN"),
                                                                     rs.getString("NUMBER_OF_MONTHS")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.mobileallowancepojo;
    }

    @WebMethod
    public List<ExitReEntryPOJO> getExitReEntryData(@WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                                    @WebParam(name = "STATUS") final String STATUS) {

        this.exitPojo = new ArrayList<ExitReEntryPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select EXIT_RE_ENTRY_ID, CREATION_DATE, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, VISA_INFORMATION, FAMILY_PERIOD, ONLIN_PAYMENT, PAYMENT_REQUEST, REQUEST_REASON, OTHER_REQUEST_REASON, AMOUNT, SELF_FLAG, SPOUSE_FLAG, CHILDS_FLAG, NO_OF_CHILDS, TYPE_OF_EXIT_RE_ENTRY, MARITAL_STATUS, NATIONALITY, COMMENTS, TOTAL_WANTED_AMOUNT, TRAVEL_DATE, ACTION_TAKEN, RELATED_BT_NO from EXIT_RE_ENTRY_REQUEST";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.exitPojo.add(new ExitReEntryPOJO(rs.getString("TRAVEL_DATE"), rs.getString("CREATION_DATE"),
                                                      rs.getString("NO_OF_CHILDS"), rs.getString("RELATED_BT_NO"),
                                                      rs.getString("AMOUNT"), rs.getString("SELF_FLAG"),
                                                      rs.getString("SPOUSE_FLAG"), rs.getString("CHILDS_FLAG"),
                                                      rs.getString("TOTAL_WANTED_AMOUNT"), rs.getString("STEP_ID"),
                                                      rs.getString("EXIT_RE_ENTRY_ID"), rs.getString("MARITAL_STATUS"),
                                                      rs.getString("PAYMENT_REQUEST"), rs.getString("FAMILY_PERIOD"),
                                                      rs.getString("VISA_INFORMATION"), rs.getString("PERSON_NAME"),
                                                      rs.getString("PERSON_NUMBER"), rs.getString("ASSIGNEE"),
                                                      rs.getString("OTHER_REQUEST_REASON"),
                                                      rs.getString("ASSIGNEE_NAME"), rs.getString("PERSON_POSITION"),
                                                      rs.getString("PERSON_JOB"), rs.getString("PERSON_LOCATION"),
                                                      rs.getString("PERSON_DEPARTMENT"), rs.getString("NATIONALITY"),
                                                      rs.getString("REQUEST_STATUS"),
                                                      rs.getString("TYPE_OF_EXIT_RE_ENTRY"),
                                                      rs.getString("REJECTION_REASON"), rs.getString("ONLIN_PAYMENT"),
                                                      rs.getString("REQUEST_REASON"), rs.getString("ACTION_TAKEN"),
                                                      rs.getString("PERSON_GRADE"), rs.getString("COMMENTS")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.exitPojo;
    }


    @WebMethod
    public List<ExceptionalRewardsPOJO> getExceptionalRewardsData(@WebParam(name = "PERSON_NUMBER")
                                                                  final String PERSON_NUMBER,
                                                                  @WebParam(name = "STATUS") final String STATUS) {

        this.rewardsPojo = new ArrayList<ExceptionalRewardsPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "SELECT EXCEPTIONAL_REWARD_ID, CREATION_DATE, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, REWARD_AMOUNT, JUSTIFICATION, PERCENTAGE_FROM_BASIC_SAL, BASIC_SALARY, HR_RECOMENDATIONS, LAST_REWARD_DATE, EMP_BASIC_SALARY, CREATED_BY_NO, CREATED_BY_NAME, ACTION_TAKEN, LAST_REWARD_DATE_STRING FROM EXCEPTIONAL_REWARD";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.rewardsPojo.add(new ExceptionalRewardsPOJO(rs.getString("CREATION_DATE"),
                                                                rs.getString("LAST_REWARD_DATE"),
                                                                rs.getString("HR_RECOMENDATIONS"),
                                                                rs.getString("REWARD_AMOUNT"),
                                                                rs.getString("PERCENTAGE_FROM_BASIC_SAL"),
                                                                rs.getString("BASIC_SALARY"), rs.getString("STEP_ID"),
                                                                rs.getString("EXCEPTIONAL_REWARD_ID"),
                                                                rs.getString("PERSON_NAME"),
                                                                rs.getString("CREATED_BY_NAME"),
                                                                rs.getString("PERSON_NUMBER"),
                                                                rs.getString("CREATED_BY_NO"),
                                                                rs.getString("PERSON_JOB"),
                                                                rs.getString("PERSON_DEPARTMENT"),
                                                                rs.getString("PERSON_LOCATION"),
                                                                rs.getString("PERSON_POSITION"),
                                                                rs.getString("ASSIGNEE"), rs.getString("ASSIGNEE_NAME"),
                                                                rs.getString("EMP_BASIC_SALARY"),
                                                                rs.getString("LAST_REWARD_DATE_STRING"),
                                                                rs.getString("REQUEST_STATUS"),
                                                                rs.getString("REJECTION_REASON"),
                                                                rs.getString("ACTION_TAKEN"),
                                                                rs.getString("PERSON_GRADE"),
                                                                rs.getString("JUSTIFICATION")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.rewardsPojo;
    }

    @WebMethod
    public List<ChangePositionPOJO> getChangePositionData(@WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                                          @WebParam(name = "STATUS") final String STATUS) {

        this.positionPojo = new ArrayList<ChangePositionPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "SELECT CHANGE_POSITION_ID, CREATION_DATE, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, CURRENT_POSITION, PROPOSED_POSITION_EMP, PROPOSED_POSITION_HR, ACTION_TAKEN, OTHER, REQUEST_DETAILS, HR_FLAG1, HR_FLAG2, HR_FLAG3, HR_FLAG4, EFFECTIVE_START_DATE FROM CHANGE_POSITION";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.positionPojo.add(new ChangePositionPOJO(rs.getString("CREATION_DATE"),
                                                             rs.getString("EFFECTIVE_START_DATE"),
                                                             rs.getString("HR_FLAG4"),
                                                             rs.getString("CHANGE_POSITION_ID"),
                                                             rs.getString("HR_FLAG3"), rs.getString("HR_FLAG2"),
                                                             rs.getString("HR_FLAG1"), rs.getString("STEP_ID"),
                                                             rs.getString("PERSON_NAME"), rs.getString("PERSON_NUMBER"),
                                                             rs.getString("PERSON_LOCATION"),
                                                             rs.getString("PERSON_DEPARTMENT"),
                                                             rs.getString("PERSON_POSITION"),
                                                             rs.getString("PERSON_JOB"), rs.getString("ASSIGNEE"),
                                                             rs.getString("ASSIGNEE_NAME"), rs.getString("OTHER"),
                                                             rs.getString("PROPOSED_POSITION_HR"),
                                                             rs.getString("CURRENT_POSITION"),
                                                             rs.getString("PROPOSED_POSITION_EMP"),
                                                             rs.getString("REQUEST_STATUS"),
                                                             rs.getString("REJECTION_REASON"),
                                                             rs.getString("ACTION_TAKEN"), rs.getString("PERSON_GRADE"),
                                                             rs.getString("REQUEST_DETAILS")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.positionPojo;
    }

    @WebMethod
    public List<RepaymentTicketsPOJO> getRepaymentTicketsData(@WebParam(name = "PERSON_NUMBER")
                                                              final String PERSON_NUMBER,
                                                              @WebParam(name = "STATUS") final String STATUS) {

        this.repaymentPojo = new ArrayList<RepaymentTicketsPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "SELECT REPAYMENT_TICKETS_ID, CREATION_DATE, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, DESTINATION, REQUEST_REASON, OTHER_REASON, PAYMENT_METHOD, COMPENSATION_PRICE, AMOUNT, COMMENTS, TRAVEL_DATE, END_BALANCE, TO_DATE, ACTION_TAKEN, INVOICE_NUMBER, LAST_UPDATED_ON, PAYMENT_STATUS FROM REPAYMENT_TICKETS";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.repaymentPojo.add(new RepaymentTicketsPOJO(rs.getString("CREATION_DATE"),
                                                                rs.getString("TRAVEL_DATE"),
                                                                rs.getString("LAST_UPDATED_ON"),
                                                                rs.getString("TO_DATE"),
                                                                rs.getString("COMPENSATION_PRICE"),
                                                                rs.getString("AMOUNT"),
                                                                rs.getString("REPAYMENT_TICKETS_ID"),
                                                                rs.getString("END_BALANCE"), rs.getString("STEP_ID"),
                                                                rs.getString("PERSON_NAME"),
                                                                rs.getString("DESTINATION"),
                                                                rs.getString("OTHER_REASON"),
                                                                rs.getString("PERSON_NUMBER"),
                                                                rs.getString("PERSON_DEPARTMENT"),
                                                                rs.getString("ASSIGNEE"), rs.getString("ASSIGNEE_NAME"),
                                                                rs.getString("PERSON_LOCATION"),
                                                                rs.getString("PERSON_JOB"),
                                                                rs.getString("PERSON_POSITION"),
                                                                rs.getString("PAYMENT_METHOD"),
                                                                rs.getString("REQUEST_REASON"),
                                                                rs.getString("REQUEST_STATUS"),
                                                                rs.getString("PAYMENT_STATUS"),
                                                                rs.getString("INVOICE_NUMBER"),
                                                                rs.getString("REJECTION_REASON"),
                                                                rs.getString("ACTION_TAKEN"),
                                                                rs.getString("PERSON_GRADE"),
                                                                rs.getString("COMMENTS")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.repaymentPojo;
    }

    @WebMethod
    public List<SpecialNeedsPOJO> getSpecialNeedsData(@WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                                      @WebParam(name = "STATUS") final String STATUS) {

        this.specialPojo = new ArrayList<SpecialNeedsPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "SELECT SPECIAL_NEED_SUPPORT_ID, CREATION_DATE, PERSON_NUMBER, PERSON_NAME, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, PERSON_POSITION, PERSON_JOB, PERSON_DEPARTMENT, PERSON_LOCATION, PERSON_GRADE, REQUEST_STATUS, REJECTION_REASON, AMOUNT, COMMENTS, HR_RECOMENDATIONS, TAKEN_AMOUNT, HR_RECOMENDATIONS_NO, ACTION_TAKEN, INVOICE_NUMBER, PAYMENT_STATUS, LAST_UPDATED_ON FROM SPECIAL_NEED_SUPPORT";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            System.out.println("query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.specialPojo.add(new SpecialNeedsPOJO(rs.getString("CREATION_DATE"),
                                                          rs.getString("LAST_UPDATED_ON"), rs.getString("STEP_ID"),
                                                          rs.getString("HR_RECOMENDATIONS_NO"),
                                                          rs.getString("SPECIAL_NEED_SUPPORT_ID"),
                                                          rs.getString("TAKEN_AMOUNT"), rs.getString("AMOUNT"),
                                                          rs.getString("PERSON_NAME"), rs.getString("PERSON_NUMBER"),
                                                          rs.getString("PERSON_LOCATION"), rs.getString("ASSIGNEE"),
                                                          rs.getString("ASSIGNEE_NAME"),
                                                          rs.getString("PERSON_POSITION"), rs.getString("PERSON_JOB"),
                                                          rs.getString("PERSON_DEPARTMENT"),
                                                          rs.getString("REQUEST_STATUS"),
                                                          rs.getString("PAYMENT_STATUS"),
                                                          rs.getString("INVOICE_NUMBER"),
                                                          rs.getString("HR_RECOMENDATIONS"),
                                                          rs.getString("REJECTION_REASON"),
                                                          rs.getString("ACTION_TAKEN"), rs.getString("PERSON_GRADE"),
                                                          rs.getString("COMMENTS")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.specialPojo;
    }

    @WebMethod
    public List<LoanSettlementPOJO> getLoanSettlementData(@WebParam(name = "PERSON_NUMBER") final String PERSON_NUMBER,
                                                          @WebParam(name = "STATUS") final String STATUS,
                                                          @WebParam(name = "LOCATION") final String LOCATION,
                                                          @WebParam(name = "DEPARTMENT") final String DEPARTMENT,
                                                          @WebParam(name = "REQUEST_ID") final String REQUEST_ID) {

        this.loanSettlementPojo = new ArrayList<LoanSettlementPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "SELECT LOAN_PRECLOSURE_ID, LOAN_ID, LOAN_CREATION_DATE, LOAN_TOTAL_AMOUNT, LOAN_REMAINING_AMOUNT, LOAN_NO_OF_MONTHS, LOAN_DIVISION, PERSON_JOB, PERSON_POSITION, PERSON_LOCATION, PERSON_DEPARTMENT, PERSON_GRADE, PERSON_NAME, PERSON_NUMBER, STEP_ID, ASSIGNEE, ASSIGNEE_NAME, REQUEST_STATUS, ACTION_TAKEN, REJECT_COMMENT, CREATED_BY, LAST_UPDATED_BY, CREATED_ON, LAST_UPDATED_ON FROM LOAN_PRECLOSURE";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER=" + PERSON_NUMBER;
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER=" + PERSON_NUMBER;
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            if (LOCATION != null && !LOCATION.equalsIgnoreCase("") && !LOCATION.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_LOCATION ='" + LOCATION + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_LOCATION ='" + LOCATION + "'";
                }
            }
            if (DEPARTMENT != null && !DEPARTMENT.equalsIgnoreCase("") && !DEPARTMENT.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_DEPARTMENT ='" + DEPARTMENT + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_DEPARTMENT ='" + DEPARTMENT + "'";
                }
            }
            if (REQUEST_ID != null && !REQUEST_ID.equalsIgnoreCase("") && !REQUEST_ID.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where LOAN_PRECLOSURE_ID ='" + REQUEST_ID + "'";
                    first = 1;
                } else {
                    query = query + " AND LOAN_PRECLOSURE_ID ='" + REQUEST_ID + "'";
                }
            }
            System.out.println("Loan settlement query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.loanSettlementPojo.add(new LoanSettlementPOJO(rs.getString("LOAN_PRECLOSURE_ID"),
                                                                   rs.getString("LOAN_ID"),
                                                                   rs.getString("LOAN_CREATION_DATE"),
                                                                   rs.getString("LOAN_TOTAL_AMOUNT"),
                                                                   rs.getString("LOAN_REMAINING_AMOUNT"),
                                                                   rs.getString("LOAN_NO_OF_MONTHS"),
                                                                   rs.getString("LOAN_DIVISION"),
                                                                   rs.getString("PERSON_JOB"),
                                                                   rs.getString("PERSON_POSITION"),
                                                                   rs.getString("PERSON_LOCATION"),
                                                                   rs.getString("PERSON_DEPARTMENT"),
                                                                   rs.getString("PERSON_GRADE"),
                                                                   rs.getString("PERSON_NAME"),
                                                                   rs.getString("PERSON_NUMBER"),
                                                                   rs.getString("STEP_ID"), rs.getString("ASSIGNEE"),
                                                                   rs.getString("ASSIGNEE_NAME"),
                                                                   rs.getString("REQUEST_STATUS"),
                                                                   rs.getString("ACTION_TAKEN"),
                                                                   rs.getString("REJECT_COMMENT"),
                                                                   rs.getString("CREATED_BY"),
                                                                   rs.getString("LAST_UPDATED_BY"),
                                                                   rs.getString("CREATED_ON"),
                                                                   rs.getString("LAST_UPDATED_ON")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.loanSettlementPojo;
    }

    @WebMethod
    public List<ExitClearancePOJO> getExitClearanceFormDetails(@WebParam(name = "PERSON_NUMBER")
                                                               final String PERSON_NUMBER,
                                                               @WebParam(name = "STATUS") final String STATUS,
                                                               @WebParam(name = "LOCATION") final String LOCATION,
                                                               @WebParam(name = "DEPARTMENT") final String DEPARTMENT,
                                                               @WebParam(name = "REQUEST_ID") final String REQUEST_ID) {

        this.exitClearancePojo = new ArrayList<ExitClearancePOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "SELECT PERSON_NUMBER, PERSON_NAME, PERSON_JOB, PERSON_POSITION, PERSON_LOCATION, PERSON_DEPARTMENT, PERSON_GRADE, REQUEST_ID, STEP_ID, ASSIGNEE," +
                "ASSIGNEE_NAME, REQUEST_STATUS, ACTION_TAKEN, REJECT_COMMENT, CREATED_BY, LAST_UPDATED_BY, CREATED_ON, LAST_UPDATED_ON, HIRE_DATE, LAST_WORKING_DATE," +
                "LENGTH_OF_SERVICE, ADMINISTRATION, REASON_FOR_EXIT, MANAGER_NAME, DEPARTMENT, LIKE_IN_COMPANY, DISLIKE_IN_COMPANY, SUGGESTIONS_TO_DEPART," +
                "SUGGESTIONS_TO_COMPANY, REAL_REASON_FOR_END, SUGG_OBSERV_IN_COMPANY, RATING1, RATING2, RATING3, RATING4, RATING5, RATING6, RATING7, RATING8," +
                "RATING9, RATING10, RATING11, RATING12, RATING13, RATING14, RATING15, RATING16, RATING17, DH_DATE, FMU_DATE, ITC_DATE, ADS_DATE, HRO_DATE," +
                "LAU_DATE, FIN_DATE, HRD_DATE, CHR_DATE, GD_DATE, DH_NAME, FMU_NAME, ITC_NAME, ADS_NAME, HRO_NAME, LAU_NAME, FIN_NAME, HRD_NAME, CHR_NAME," +
                "GD_NAME, DH_QUES1, DH_QUES2, DH_QUES3, FMU_QUES1, FMU_QUES2, FMU_QUES3, FMU_OTHERS, ITC_QUES1, ITC_QUES2, ITC_QUES3, ITC_QUES4, ITC_OTHERS," +
                "ADS_QUES1, ADS_QUES2, ADS_QUES3, ADS_QUES4, HRO_QUES1, HRO_OTHERS, LAU_QUES1, FIN_QUES1, FIN_QUES2, HRD_QUES1, CHR_QUES1, GD_QUES1, FMU_QUES4," +
                "ASSIGNEE_POSITION, DH_COMMENTS, FMU_COMMENTS, ITC_COMMENTS, ITC_COMMENTS2, ADS_COMMENTS, HRO_COMMENTS, LAU_COMMENTS, FIN_COMMENTS, HRD_COMMENTS," +
                "CHR_COMMENTS, GD_COMMENTS, ITC_NAME2, ITC_DATE2, PERSONAL_EMAIL, EXP_CERTIFICATION_FLAG, EXP_CERTIFICATION, PERSON_NAME_ARABIC, PERSON_TYPE," +
                "LAST_ASSIGNED_TIME, REQUEST_TYPE, MANAGER_NAME_EN, ACTION_TYPE, REASON_EN " +
                "FROM EXIT_CLEARANCE_FORM";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER='" + PERSON_NUMBER + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER='" + PERSON_NUMBER + "'";
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            if (LOCATION != null && !LOCATION.equalsIgnoreCase("") && !LOCATION.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_LOCATION ='" + LOCATION + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_LOCATION ='" + LOCATION + "'";
                }
            }
            if (DEPARTMENT != null && !DEPARTMENT.equalsIgnoreCase("") && !DEPARTMENT.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_DEPARTMENT ='" + DEPARTMENT + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_DEPARTMENT ='" + DEPARTMENT + "'";
                }
            }
            if (REQUEST_ID != null && !REQUEST_ID.equalsIgnoreCase("") && !REQUEST_ID.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_ID ='" + REQUEST_ID + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_ID ='" + REQUEST_ID + "'";
                }
            }
            System.out.println("Exit Clearance query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.exitClearancePojo.add(new ExitClearancePOJO(rs.getString("PERSON_NUMBER"),
                                                                 rs.getString("PERSON_NAME"),
                                                                 rs.getString("PERSON_JOB"),
                                                                 rs.getString("PERSON_POSITION"),
                                                                 rs.getString("PERSON_LOCATION"),
                                                                 rs.getString("PERSON_DEPARTMENT"),
                                                                 rs.getString("PERSON_GRADE"),
                                                                 rs.getString("REQUEST_ID"), rs.getString("STEP_ID"),
                                                                 rs.getString("ASSIGNEE"),
                                                                 rs.getString("ASSIGNEE_NAME"),
                                                                 rs.getString("REQUEST_STATUS"),
                                                                 rs.getString("ACTION_TAKEN"),
                                                                 rs.getString("REJECT_COMMENT"),
                                                                 rs.getString("CREATED_BY"),
                                                                 rs.getString("LAST_UPDATED_BY"),
                                                                 rs.getString("CREATED_ON"),
                                                                 rs.getString("LAST_UPDATED_ON"),
                                                                 rs.getString("HIRE_DATE"),
                                                                 rs.getString("LAST_WORKING_DATE"),
                                                                 rs.getString("LENGTH_OF_SERVICE"),
                                                                 rs.getString("ADMINISTRATION"),
                                                                 rs.getString("REASON_FOR_EXIT"),
                                                                 rs.getString("MANAGER_NAME"),
                                                                 rs.getString("DEPARTMENT"),
                                                                 rs.getString("LIKE_IN_COMPANY"),
                                                                 rs.getString("DISLIKE_IN_COMPANY"),
                                                                 rs.getString("SUGGESTIONS_TO_DEPART"),
                                                                 rs.getString("SUGGESTIONS_TO_COMPANY"),
                                                                 rs.getString("REAL_REASON_FOR_END"),
                                                                 rs.getString("SUGG_OBSERV_IN_COMPANY"),
                                                                 rs.getString("RATING1"), rs.getString("RATING2"),
                                                                 rs.getString("RATING3"), rs.getString("RATING4"),
                                                                 rs.getString("RATING5"), rs.getString("RATING6"),
                                                                 rs.getString("RATING7"), rs.getString("RATING8"),
                                                                 rs.getString("RATING9"), rs.getString("RATING10"),
                                                                 rs.getString("RATING11"), rs.getString("RATING12"),
                                                                 rs.getString("RATING13"), rs.getString("RATING14"),
                                                                 rs.getString("RATING15"), rs.getString("RATING16"),
                                                                 rs.getString("RATING17"), rs.getString("DH_DATE"),
                                                                 rs.getString("FMU_DATE"), rs.getString("ITC_DATE"),
                                                                 rs.getString("ADS_DATE"), rs.getString("HRO_DATE"),
                                                                 rs.getString("LAU_DATE"), rs.getString("FIN_DATE"),
                                                                 rs.getString("HRD_DATE"), rs.getString("CHR_DATE"),
                                                                 rs.getString("GD_DATE"), rs.getString("DH_NAME"),
                                                                 rs.getString("FMU_NAME"), rs.getString("ITC_NAME"),
                                                                 rs.getString("ADS_NAME"), rs.getString("HRO_NAME"),
                                                                 rs.getString("LAU_NAME"), rs.getString("FIN_NAME"),
                                                                 rs.getString("HRD_NAME"), rs.getString("CHR_NAME"),
                                                                 rs.getString("GD_NAME"), rs.getString("DH_QUES1"),
                                                                 rs.getString("DH_QUES2"), rs.getString("DH_QUES3"),
                                                                 rs.getString("FMU_QUES1"), rs.getString("FMU_QUES2"),
                                                                 rs.getString("FMU_QUES3"), rs.getString("FMU_OTHERS"),
                                                                 rs.getString("ITC_QUES1"), rs.getString("ITC_QUES2"),
                                                                 rs.getString("ITC_QUES3"), rs.getString("ITC_QUES4"),
                                                                 rs.getString("ITC_OTHERS"), rs.getString("ADS_QUES1"),
                                                                 rs.getString("ADS_QUES2"), rs.getString("ADS_QUES3"),
                                                                 rs.getString("ADS_QUES4"), rs.getString("HRO_QUES1"),
                                                                 rs.getString("HRO_OTHERS"), rs.getString("LAU_QUES1"),
                                                                 rs.getString("FIN_QUES1"), rs.getString("FIN_QUES2"),
                                                                 rs.getString("HRD_QUES1"), rs.getString("CHR_QUES1"),
                                                                 rs.getString("GD_QUES1"), rs.getString("FMU_QUES4"),
                                                                 rs.getString("ASSIGNEE_POSITION"),
                                                                 rs.getString("DH_COMMENTS"),
                                                                 rs.getString("FMU_COMMENTS"),
                                                                 rs.getString("ITC_COMMENTS"),
                                                                 rs.getString("ITC_COMMENTS2"),
                                                                 rs.getString("ADS_COMMENTS"),
                                                                 rs.getString("HRO_COMMENTS"),
                                                                 rs.getString("LAU_COMMENTS"),
                                                                 rs.getString("FIN_COMMENTS"),
                                                                 rs.getString("HRD_COMMENTS"),
                                                                 rs.getString("CHR_COMMENTS"),
                                                                 rs.getString("GD_COMMENTS"), rs.getString("ITC_NAME2"),
                                                                 rs.getString("ITC_DATE2"),
                                                                 rs.getString("PERSONAL_EMAIL"),
                                                                 rs.getString("EXP_CERTIFICATION_FLAG"),
                                                                 rs.getString("PERSON_NAME_ARABIC"),
                                                                 rs.getString("PERSON_TYPE"),
                                                                 rs.getString("LAST_ASSIGNED_TIME"),
                                                                 rs.getString("REQUEST_TYPE"),
                                                                 rs.getString("MANAGER_NAME_EN"),
                                                                 rs.getString("ACTION_TYPE"),
                                                                 rs.getString("REASON_EN")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.exitClearancePojo;
    }

    @WebMethod
    public List<TraineesExitFormPOJO> getTraineesExitFormDetails(@WebParam(name = "PERSON_NUMBER")
                                                                 final String PERSON_NUMBER,
                                                                 @WebParam(name = "STATUS") final String STATUS,
                                                                 @WebParam(name = "LOCATION") final String LOCATION,
                                                                 @WebParam(name = "DEPARTMENT") final String DEPARTMENT,
                                                                 @WebParam(name = "REQUEST_ID")
                                                                 final String REQUEST_ID) {

        this.traineesExitPojo = new ArrayList<TraineesExitFormPOJO>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            final Context initialContext = new InitialContext();
            if (initialContext == null) {
            }
            data = (DataSource) initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            int first = 0;
            String query =
                "select REQUEST_ID, REQUEST_STATUS, STEP_ID, ACTION_TAKEN, ASSIGNEE, ASSIGNEE_NAME, ASSIGNEE_POSITION, REJECT_COMMENT, PERSON_NUMBER," +
                "PERSON_NAME, PERSON_NAME_AR, DEPARTMENT_AR, MANAGER_NAME, MANAGER_NAME_AR, LAST_WORKING_DATE, DATE_OF_JOINING, LENGTH_OF_SERVICE," +
                "REASON_FOR_EXIT, REASON_AR, TRAINING_TITLE, PERSONAL_EMAIL, SATISFIED_WITH_TRAINING, IS_TRAINER_HELPFUL, FOLLOW_PLAN, MEET_EXPECTATIONS," +
                "PREPARES_PERMANENT_JOB, DISTINGUISHES_EMP_TRAINER, SUGGESTIONS_FOR_DEV, PERSON_DEPARTMENT, PERSON_GRADE, PERSON_JOB, PERSON_LOCATION," +
                "PERSON_POSITION, DH_QUES_1, DH_QUES_2, DH_QUES_3, DH_NAME, DH_DATE, DH_COMMENTS, FMU_QUES_1, FMU_QUES_2, FMU_NAME, FMU_DATE," +
                "FMU_COMMENTS, ITC_QUES_1, ITC_QUES_2, ITC_QUES_3, ITC_QUES_4, ITC_NAME, ITC_DATE, ITC_COMMENTS, HRO_QUES_1, HRO_QUES_2, HRO_QUES_3," +
                "HRO_NAME, HRO_DATE, HRO_COMMENTS, HRD_QUES_1, HRD_NAME, HRD_DATE, HRD_COMMENTS, CREATED_BY, LAST_UPDATED_BY, CREATED_ON," +
                "LAST_UPDATED_ON, ACTION_TYPE, REQUEST_TYPE, HRO2_COMMENTS, HRO2_DATE, HRO2_NAME, HRO2_QUES_1, EXP_CERTIFICATION_FLAG, LAST_ASSIGNED_TIME " +
                "from TRAINEES_EXIT_FORM";

            if (PERSON_NUMBER != null && !PERSON_NUMBER.equalsIgnoreCase("") && !PERSON_NUMBER.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_NUMBER='" + PERSON_NUMBER + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_NUMBER='" + PERSON_NUMBER + "'";
                }
            }
            if (STATUS != null && !STATUS.equalsIgnoreCase("") && !STATUS.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_STATUS ='" + STATUS + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_STATUS ='" + STATUS + "'";
                }
            }
            if (LOCATION != null && !LOCATION.equalsIgnoreCase("") && !LOCATION.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_LOCATION ='" + LOCATION + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_LOCATION ='" + LOCATION + "'";
                }
            }
            if (DEPARTMENT != null && !DEPARTMENT.equalsIgnoreCase("") && !DEPARTMENT.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where PERSON_DEPARTMENT ='" + DEPARTMENT + "'";
                    first = 1;
                } else {
                    query = query + " AND PERSON_DEPARTMENT ='" + DEPARTMENT + "'";
                }
            }
            if (REQUEST_ID != null && !REQUEST_ID.equalsIgnoreCase("") && !REQUEST_ID.equalsIgnoreCase("?")) {
                if (first == 0) {
                    query = query + " where REQUEST_ID ='" + REQUEST_ID + "'";
                    first = 1;
                } else {
                    query = query + " AND REQUEST_ID ='" + REQUEST_ID + "'";
                }
            }
            System.out.println("Trainees Exit query:" + query);
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                this.traineesExitPojo.add(new TraineesExitFormPOJO(rs.getString("REQUEST_ID"),
                                                                   rs.getString("REQUEST_STATUS"),
                                                                   rs.getString("STEP_ID"),
                                                                   rs.getString("ACTION_TAKEN"),
                                                                   rs.getString("ASSIGNEE"),
                                                                   rs.getString("ASSIGNEE_NAME"),
                                                                   rs.getString("ASSIGNEE_POSITION"),
                                                                   rs.getString("REJECT_COMMENT"),
                                                                   rs.getString("PERSON_NUMBER"),
                                                                   rs.getString("PERSON_NAME"),
                                                                   rs.getString("PERSON_NAME_AR"),
                                                                   rs.getString("DEPARTMENT_AR"),
                                                                   rs.getString("MANAGER_NAME"),
                                                                   rs.getString("MANAGER_NAME_AR"),
                                                                   rs.getString("LAST_WORKING_DATE"),
                                                                   rs.getString("DATE_OF_JOINING"),
                                                                   rs.getString("LENGTH_OF_SERVICE"),
                                                                   rs.getString("REASON_FOR_EXIT"),
                                                                   rs.getString("REASON_AR"),
                                                                   rs.getString("TRAINING_TITLE"),
                                                                   rs.getString("PERSONAL_EMAIL"),
                                                                   rs.getString("SATISFIED_WITH_TRAINING"),
                                                                   rs.getString("IS_TRAINER_HELPFUL"),
                                                                   rs.getString("FOLLOW_PLAN"),
                                                                   rs.getString("MEET_EXPECTATIONS"),
                                                                   rs.getString("PREPARES_PERMANENT_JOB"),
                                                                   rs.getString("DISTINGUISHES_EMP_TRAINER"),
                                                                   rs.getString("SUGGESTIONS_FOR_DEV"),
                                                                   rs.getString("PERSON_DEPARTMENT"),
                                                                   rs.getString("PERSON_GRADE"),
                                                                   rs.getString("PERSON_JOB"),
                                                                   rs.getString("PERSON_LOCATION"),
                                                                   rs.getString("PERSON_POSITION"),
                                                                   rs.getString("DH_QUES_1"), rs.getString("DH_QUES_2"),
                                                                   rs.getString("DH_QUES_3"), rs.getString("DH_NAME"),
                                                                   rs.getString("DH_DATE"), rs.getString("DH_COMMENTS"),
                                                                   rs.getString("FMU_QUES_1"),
                                                                   rs.getString("FMU_QUES_2"), rs.getString("FMU_NAME"),
                                                                   rs.getString("FMU_DATE"),
                                                                   rs.getString("FMU_COMMENTS"),
                                                                   rs.getString("ITC_QUES_1"),
                                                                   rs.getString("ITC_QUES_2"),
                                                                   rs.getString("ITC_QUES_3"),
                                                                   rs.getString("ITC_QUES_4"), rs.getString("ITC_NAME"),
                                                                   rs.getString("ITC_DATE"),
                                                                   rs.getString("ITC_COMMENTS"),
                                                                   rs.getString("HRO_QUES_1"),
                                                                   rs.getString("HRO_QUES_2"),
                                                                   rs.getString("HRO_QUES_3"), rs.getString("HRO_NAME"),
                                                                   rs.getString("HRO_DATE"),
                                                                   rs.getString("HRO_COMMENTS"),
                                                                   rs.getString("HRD_QUES_1"), rs.getString("HRD_NAME"),
                                                                   rs.getString("HRD_DATE"),
                                                                   rs.getString("HRD_COMMENTS"),
                                                                   rs.getString("CREATED_BY"),
                                                                   rs.getString("LAST_UPDATED_BY"),
                                                                   rs.getString("CREATED_ON"),
                                                                   rs.getString("LAST_UPDATED_ON"),
                                                                   rs.getString("ACTION_TYPE"),
                                                                   rs.getString("REQUEST_TYPE"),
                                                                   rs.getString("HRO2_COMMENTS"),
                                                                   rs.getString("HRO2_DATE"), rs.getString("HRO2_NAME"),
                                                                   rs.getString("HRO2_QUES_1"),
                                                                   rs.getString("EXP_CERTIFICATION_FLAG"),
                                                                   rs.getString("LAST_ASSIGNED_TIME")));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.traineesExitPojo;
    }
}
