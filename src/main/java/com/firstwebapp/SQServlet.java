package com.firstwebapp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SQServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

       int c=(int)req.getAttribute("c");
       c=c*c;
       res.getWriter().println(c);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int c = Integer.parseInt(req.getParameter("c"));

        c = c * c;

        res.getWriter().println("Square of sum = " + c);
    }
}