package com.xworks.formsexampl.servlet;

import com.xworks.formsexampl.dto.SweetFormDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet",loadOnStartup = 1)
public class SweetServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String shopName=req.getParameter("shopName");
        String sweetName=req.getParameter("sweetName");
        String special=req.getParameter("special");
        double quantity=Double.parseDouble(req.getParameter("quantity"));

        SweetFormDto sweetFormDto=new SweetFormDto(shopName,sweetName,special,quantity);
        Map<String,Integer> map01 =new HashMap<>();
        map01.put("Gulab jamun",150);
        map01.put("mysore pak",100);
        map01.put("jalebi",250);
        map01.put("rasgulla",300);
        map01.put("kaju katli",500);
        map01.put("kheer",90);

        int price=map01.get(sweetName);

        double cost =quantity*price;
         if (special.equals("SPECIAL")) {
             cost=cost+(quantity*30);
         }
         req.setAttribute("cost",cost);
         req.setAttribute("sweetFormDto",sweetFormDto);
        RequestDispatcher request=req.getRequestDispatcher("SweetResult.jsp");
        request.forward(req,resp);


    }
}
