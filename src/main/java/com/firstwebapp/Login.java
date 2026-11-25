
package com.firstwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/log")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals("admin") &&
                password.equals("1234")) {

            HttpSession session = req.getSession();

            session.setAttribute("user", username);

            res.sendRedirect("home.jsp");

        } else {

            res.sendRedirect("login.jsp?error=1");

        }
    }
}
