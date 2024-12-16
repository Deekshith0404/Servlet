package com.xworkz.web.sevlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/first",loadOnStartup = 1)
public class webServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//    @Override
  //  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException//{

        String name=req.getParameter("name");
        String grames=req.getParameter("grames");
        String cost=req.getParameter("cost");
        String gst=req.getParameter("gst");
        String serviceRate=req.getParameter("rate");

//        PrintWriter writer=resp.getWriter();
//        writer.println(name);

        req.setAttribute("name",name);
        req.setAttribute("grames",grames);
        req.setAttribute("cost",cost);
        req.setAttribute("gst",gst);
        req.setAttribute("rate",serviceRate);

        RequestDispatcher request=req.getRequestDispatcher("OrnamentResult.jsp");
        request.forward(req,resp);

    }
}
