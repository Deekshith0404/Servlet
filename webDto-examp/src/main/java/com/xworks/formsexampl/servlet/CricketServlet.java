package com.xworks.formsexampl.servlet;

import com.xworks.formsexampl.dto.CricketFormDto;
import com.xworks.formsexampl.service.CricketService;
import com.xworks.formsexampl.service.CricketServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cricket" ,loadOnStartup = 1)
public class CricketServlet extends HttpServlet {
    private CricketService cricketService=new CricketServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String TeamName=req.getParameter("TeamName");
        int budget =Integer.parseInt(req.getParameter("budget"));
        int noOfPlayers=Integer.parseInt(req.getParameter("noOfPlayers"));
        String sponsers=req.getParameter("sponsers");
        String homeGround=req.getParameter("homeGround");
        String owner=req.getParameter("owner");
        String IplSponser=req.getParameter("IplSponser");
        String fanOrNot=req.getParameter("fan");


        CricketFormDto cricketFormDto=new CricketFormDto(TeamName,budget,noOfPlayers,sponsers,homeGround,owner,IplSponser,fanOrNot);

        boolean result=cricketService.save(cricketFormDto);
        if (result==true) {
            req.setAttribute("message", "team name : " + TeamName + " total budget : " + budget);
        }else {
            req.setAttribute("message", "not found");

        }
        RequestDispatcher request=req.getRequestDispatcher("CricketForm.jsp");
        request.forward(req,resp);
    }
}
