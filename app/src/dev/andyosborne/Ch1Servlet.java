package dev.andyosborne;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
import java.util.*;

@WebServlet(urlPatterns={"/hello"})
public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        java.util.Date today = new java.util.Date();
        String todaysDate = today.toString();

        request.setAttribute("today", todaysDate);

        RequestDispatcher view = request.getRequestDispatcher("date.jsp");
        view.forward(request, response);
    }
}