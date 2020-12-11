package dev.andyosborne;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
import java.util.*;
import java.util.Calendar;

// @WebServlet(urlPatterns={"/day/*"})
@WebServlet(urlPatterns={"/day"})
public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String datePath = request.getParameter("date");

        String [] dateArr = datePath.split("-", 3);

        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(year + 1900, month, day);

        int dayVal = cal.get(Calendar.DAY_OF_WEEK);

        String dayStr = "na";

        switch(dayVal) {
            case 0:     dayStr = "Sunday";
                        break;
            case 1:     dayStr = "Monday";
                        break;
            case 2:     dayStr = "Tuesday";
                        break;
            case 3:     dayStr = "Wednesday";
                        break;
            case 4:     dayStr = "Thursday";
                        break;
            case 5:     dayStr = "Friday";
                        break;
            case 6:     dayStr = "Saturday";
                        break;
            default:    dayStr = "Invalid day";
                        break;
        }

        request.setAttribute("dayStr", dayStr);
        request.setAttribute("date-param", datePath);
        request.setAttribute("dayval", Integer.toString(dayVal));
        request.setAttribute("dateobj", cal.toString());
        request.setAttribute("day-param", Integer.toString(day));
        request.setAttribute("month-param", Integer.toString(month));
        request.setAttribute("year-param", Integer.toString(year));


        RequestDispatcher view = request.getRequestDispatcher("day.jsp");
        view.forward(request, response);
    }
}