package com.firstwebapp;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getc")
public class Cookie2 extends HttpServlet{
	 public void doGet(HttpServletRequest req, HttpServletResponse res)
	            throws IOException {

	        Cookie[] cookies=req.getCookies();
	        
	        for(Cookie c:cookies) {
	        	res.getWriter().println(c.getName());
	        }
	    }
}
