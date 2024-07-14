package com.dbcall;

import com.mivors.model.bi.integration.type.AllInvoiceReport;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

public class CallDbObject {
    public CallDbObject() {
        super();
    }
    //private final static String datasource = "tatweerdev"; //local
    //private final static String datasource = "ORA-DB_TATWEERDB"; //dev
    private final static String datasource = "ORADBSPRD01_TATWEERDB"; //PROD
    //ORADBSPRD01_TATWEERDB

    public List getFinishedInvoices() {
        List<AllInvoiceReport> list = new ArrayList<AllInvoiceReport>();


        return list;
    }

    public static String updateInvoice(String invoice_no, String invoice_status, String invoice_type) {
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        String result = "N";
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource)initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            //...
            String sql_string = "CALL PAAS_UPDATES.VALIDATE_UPDATE_INVOICES(?, ?, ?, ?)";
            CallableStatement cs = con.prepareCall(sql_string);
            cs.setString(1, invoice_no);
            cs.setString(2, invoice_status);
            cs.setString(3, invoice_type);
            cs.registerOutParameter(4,Types.VARCHAR); 
            cs.execute(); 
            result = cs.getString(4);

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
        if("Updated".equals(result)){
            System.err.println("Updates status :"+invoice_no+" | "+invoice_status);
        }
        return result;
    }
    
    public static void callAutoApprovalExitForm() {
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource)initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            String sql_string = "BEGIN AUTO_APPROVE_EXIT_CLEARANCE();END;";
            CallableStatement cs = con.prepareCall(sql_string);
            cs.execute(); 
            System.err.println("AUTO_APPROVE_EXIT_CLEARANCE called !");

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
    }
    
    public static void callAutoApprovalTraineesExitFrom() {
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource)initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            String sql_string = "BEGIN AUTO_APPROVE_TRAINEES_EXIT();END;";
            CallableStatement cs = con.prepareCall(sql_string);
            cs.execute(); 
            System.err.println("AUTO_APPROVE_TRAINEES_EXIT called !");

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
    }
    
    public static void sendPRRejectedNotification(String to, String reqNo, String approvername, String rejectedBy, byte[] attach) {
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource)initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            //...
            String sql_string = "call send_pr_rejection_notification(?, ?, ?, ?, ?)";
            CallableStatement cs = con.prepareCall(sql_string);
            cs.setString(1, to);
            cs.setString(2, reqNo);
            cs.setString(3, approvername);
            cs.setString(4, rejectedBy);
            cs.setBytes(5, attach);
            cs.execute(); 

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
        System.err.println(":PR Rejection Notification sent :");
    } 
    public static void sendPRPaymentAlert(String to, String reqNo, String reqName, String poNumber, String invNo, byte[] attach) {
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;
        DataSource data = null;
        try {
            Context initialContext = new InitialContext();
            if (initialContext == null) {

            }
            data = (DataSource)initialContext.lookup(datasource);
            if (data != null) {
                con = data.getConnection();
            }
            stmt = con.createStatement();
            //...
            String sql_string = "call send_pr_payment_notification(?, ?, ?, ?, ?, ?)";
            CallableStatement cs = con.prepareCall(sql_string);
            cs.setString(1, to);
            cs.setString(2, reqNo);
            cs.setString(3, reqName);
            cs.setString(4, poNumber);
            cs.setString(5, invNo);
            cs.setBytes(6, attach);
            cs.execute(); 

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
        System.err.println(":PR Payment Notification sent :");
    } 
}
