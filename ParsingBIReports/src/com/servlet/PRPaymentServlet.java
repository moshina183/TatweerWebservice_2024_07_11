package com.servlet;

import com.job.PRPaymentNotify;

import com.job.PRPaymentNotifyJob;
import com.job.PRRejectNotify;
import com.job.PRRejectNotifyJob;

import com.mivors.model.bi.integration.BiReportAccess;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;

public class PRPaymentServlet extends HttpServlet {
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
            System.err.println("START (PRPaymentNotifyJob)");
            new PRPaymentNotifyJob().prPaymentNotificationJob(false);
            msg = "<h1>PR Payment Notification Scheduler is started successfully !!!</h1>";
        }
        if ("stop-job".equals(action)) {
            System.err.println("STOP (PRPaymentNotifyJob)");
            new PRPaymentNotifyJob().prPaymentNotificationJob(true);
            msg = "<h1>PR Payment Notification Scheduler has been stopped successfully!!!</h1>";
        }
        if ("update-now".equals(action)) {
            System.err.println("NOW (PRPaymentNotifyJob)");
            new PRPaymentNotify().sendPRPaymentNotification();
            msg = "<h1>PR Payment Notification process has been initiated successfully!!!</h1>";
        }
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>PR Payment Servlet</title></head>");
        out.println("<body>");
        out.println(msg);
        out.println("</body></html>");
        out.close();
    }
}
