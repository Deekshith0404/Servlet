package com.xworks.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/bana",loadOnStartup = 1)
public class bananaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter=resp.getWriter();
        String price=req.getParameter("price");
//        System.out.println(price);
        String quanty=req.getParameter("quantity");
       printWriter.println("price to be pay :"+Integer.parseInt(price)*Integer.parseInt(quanty));
        printWriter.println("banana order submitted");

    }
}