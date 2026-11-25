
package com.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String name = req.getParameter("name");
        String rollno = req.getParameter("rollno");
        int age = Integer.parseInt(req.getParameter("age"));
        String gen = req.getParameter("gender");

        PrintWriter out = res.getWriter();

        out.println("Hello " + name
                + ", And your RollNo is " + rollno
                + ", your age is " + age
                + ", you are " + gen);
    }
}
