package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/first",loadOnStartup = 1)
public class formServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name=req.getParameter("name");
         String age=req.getParameter("age");
         String address=req.getParameter("address");
         String pin=req.getParameter("pin");


         resp.setContentType("text/html");
         PrintWriter out=resp.getWriter();

         out.println("<html>");
         out.println("<head>");
         out.println("<body>");
         out.println("<p style='color:green;'>");
         out.println("Name:"+name);
         out.println("<br>");
         out.println("Age:"+age);
         out.println("<br>");
         out.println("<u>");
         out.println("Address : "+address);
         out.println("</u>");
         out.println("<br>");
         out.println("pin:"+pin);
         out.println("</p>");
         out.println("</body>");
         out.println("</head>");
         out.println("</html>");
    }
}
