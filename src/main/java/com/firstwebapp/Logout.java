
package com.firstwebapp;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/logout")
public class Logout extends HttpServlet {

    protected void doGet(HttpServletRequest req,
            HttpServletResponse res) throws IOException {

        HttpSession session = req.getSession(false);

        if(session != null) {
        	
            session.invalidate();
        }

        res.sendRedirect("loginpage.jsp");
    }
}
