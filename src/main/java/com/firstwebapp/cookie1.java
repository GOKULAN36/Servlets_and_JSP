package com.firstwebapp;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/CA")
public class cookie1 extends HttpServlet{
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	            throws IOException {

	        String n = req.getParameter("userNm");
	        
	        Cookie cookie=new Cookie("n",n);
	        res.addCookie(cookie);
	        res.sendRedirect("getc");
	    }
}
