package com.servlet;

import com.job.UpdateInvoice;
import com.job.UpdateInvoiceJob;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class InvoiceServlet extends HttpServlet {
    private static final String CONTENT_TYPE =
        "text/html; charset=windows-1256";

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
            System.err.println("START (Invoice Status Update)");
            new UpdateInvoiceJob().invoiceStatusUpdateJob(false);
            msg = "<h1>Invoice Status Update Scheduler is started successfully !!!</h1>";
        }
        if ("stop-job".equals(action)) {
            System.err.println("STOP (Invoice Status Update)");
            new UpdateInvoiceJob().invoiceStatusUpdateJob(true);
            msg = "<h1>Invoice Status Update Scheduler has been stopped successfully!!!</h1>";
        }
        if ("update-now".equals(action)) {
            System.err.println("NOW (Invoice Status Update)");
            new UpdateInvoice().updateInvoiceStatus();
            msg = "<h1>Invoice Status Update process has been initiated successfully!!!</h1>";
        }
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>InvoiceServlet</title></head>");
        out.println("<body>"); 
        out.println(msg); 
        out.println("</body></html>");
        out.close();
    }
}
