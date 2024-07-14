package com.servlet;

import com.dbcall.CallDbObject;

import com.job.TraineesExitFormApprovalJob;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class TraineesExitApprovalServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1256";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        String action = request.getParameter("action")!=null ?request.getParameter("action").toString():"";
        String msg = "Welcome";
        if ("start-job".equals(action)) {
                    System.err.println("START (Exit/Trainees Form Auto Approval)");
                    new TraineesExitFormApprovalJob().approvalTraineeExitFormJob(false);
            msg = "<h1>Trainees Exit/Clearance Form Auto Approval Scheduler is started successfully !!!</h1>";
        }
        if ("stop-job".equals(action)) {
                    System.err.println("STOP (Exit/Trainees Form Auto Approval)");
                    new TraineesExitFormApprovalJob().approvalTraineeExitFormJob(true);
            msg = "<h1>Trainees Exit/Clearance Form Auto Approval Scheduler has been stopped successfully!!!</h1>";
        }
        if ("update-now".equals(action)) {
                    System.err.println("NOW (Exit/Trainees Form Auto Approval process has been initiated)");
                    CallDbObject.callAutoApprovalTraineesExitFrom();
            msg = "<h1>Trainees Exit/Clearance Form Auto Approval process has been initiated successfully!!!</h1>";
        }
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Trainees Exit Form Auto Approval</title></head>");
        out.println("<body>"); 
        out.println(msg); 
        out.println("</body></html>");
        out.close();
    }
}
