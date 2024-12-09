package com.xworks.web.servlet;

import com.sun.org.apache.xml.internal.serializer.EmptySerializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/app" ,loadOnStartup = 1)
public class appleServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter print=resp.getWriter();
        String type=req.getParameter("AppleType");
        String grow=req.getParameter("grownIn");
        String imp=req.getParameter("ImportedFrom");
        String color=req.getParameter("color");
        String price=req.getParameter("price");
        print.println("order of apple submitted");
        print.println("order of apple type :"+type);
        print.println("place of growth :"+grow);
        print.println("imported from :"+imp);
        print.println("color of apple :"+color);
        print.println("price of apple perKg :"+price);
    }
}
