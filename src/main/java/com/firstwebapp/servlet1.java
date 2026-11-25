package com.firstwebapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/send")
public class servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException {
		
		req.setAttribute("name", "gl");
		req.setAttribute("id", "101");
		
		RequestDispatcher rq = req.getRequestDispatcher("fetch.jsp");
		rq.forward(req, res);
	}
}
