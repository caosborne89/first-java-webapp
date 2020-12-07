package dev.andyosborne;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        java.util.Date today = new java.util.Date();
        String todaysDate = today.toString();

        request.setAttribute("today", todaysDate);

        RequestDispatcher view = request.getRequestDispatcher("date.jsp");
        view.forward(request, response);
    }
}