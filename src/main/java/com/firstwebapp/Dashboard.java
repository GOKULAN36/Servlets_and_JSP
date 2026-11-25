package com.firstwebapp;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dash")
public class Dashboard extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        HttpSession session = req.getSession(false);
            String user = (String) session.getAttribute("user");

            res.getWriter().println("Welcome " + user + " done");
        
    }
}