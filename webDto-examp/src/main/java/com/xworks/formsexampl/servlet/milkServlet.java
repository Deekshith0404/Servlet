package com.xworks.formsexampl.servlet;

import com.xworks.formsexampl.dto.MilkFormDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/milk",loadOnStartup = 1)
public class milkServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String brand=req.getParameter("brandName");
        String types=req.getParameter("types");
        String quantity=req.getParameter("quantity");
        int quantityAft=Integer.parseInt(quantity);

        MilkFormDto milkFormDto=new MilkFormDto(brand,types,quantityAft);

        Map<String,Integer> map=new HashMap<>();
        map.put("SPECIAL",56);
        map.put("ordinary",54);
        map.put("goodLife",67);
        map.put("goodLifeLite",68);
        map.put("family",56);
        map.put("buffalo",70);
        int price=map.get(types);
        int cost=price*quantityAft;
        req.setAttribute("cost",cost);
        req.setAttribute("milkFormDto",milkFormDto);
        RequestDispatcher request=req.getRequestDispatcher("milkResult.jsp");
        request.forward(req,resp);

    }
}
