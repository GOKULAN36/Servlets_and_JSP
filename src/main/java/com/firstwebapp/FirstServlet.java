package com.firstwebapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));

        int c = a + b;

        req.setAttribute("c", c);
        RequestDispatcher rq=req.getRequestDispatcher("square");
        rq.forward(req, res);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));

        int c = a + b;

        res.sendRedirect(req.getContextPath() + "/square?c=" + c);
    }
}