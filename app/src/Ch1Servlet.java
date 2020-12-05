import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out  = response.getWriter();
        java.util.Date today = new java.util.Date();

        out.println(
            "<html> " +
            "<body>" +
            "<h1 align=center>Hello world!</h1>" +
            "<br>" + today +
            "</body>" +
            "</html>"
        );
    }
}