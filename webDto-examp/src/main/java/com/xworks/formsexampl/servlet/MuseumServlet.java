package com.xworks.formsexampl.servlet;

import com.xworks.formsexampl.dto.MilkFormDto;
import com.xworks.formsexampl.dto.MuseumFormDto;
import com.xworks.formsexampl.service.MuseumService;
import com.xworks.formsexampl.service.MuseumServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/museum",loadOnStartup = 1)
public class MuseumServlet extends HttpServlet {

    private MuseumService museumService=new MuseumServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName=req.getParameter("customerName");
        int numOfAdults =Integer.parseInt(req.getParameter("numOfAdults"));
        int numOfChildren=Integer.parseInt(req.getParameter("numOfChildren"));
        long mobileNumber=Long.parseLong(req.getParameter("mobileNumber"));
        String email=req.getParameter("email");

        int totalCost=(numOfAdults*100)+(numOfChildren*50);
        MuseumFormDto museumFormDto=new MuseumFormDto(customerName,numOfAdults,numOfChildren,mobileNumber,email,totalCost);





        boolean result=museumService.save(museumFormDto);
        if (result==true) {
            req.setAttribute("message", "the customer name is : " + customerName + "   and the total price is :" + totalCost);
        }else {
            req.setAttribute("message", "not found");

        }

        RequestDispatcher request=req.getRequestDispatcher("MusuemTicketForm.jsp");
        request.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<MuseumFormDto> list=museumService.getall();

        req.setAttribute("list",list);
        RequestDispatcher dispatcher=req.getRequestDispatcher("MuseumResult.jsp");
        dispatcher.forward(req,resp);
    }
}
