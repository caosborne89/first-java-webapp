<%@ page import="java.util.*" %>

<html>
<body>
<h1 align=center>Hello world! I'm using JSP!</h1>

<%
String day = (String)request.getAttribute("dayStr");
String date = (String)request.getAttribute("date-param");
String dayval = (String)request.getAttribute("dayval");
String dayobj = (String)request.getAttribute("dateobj");
String month = (String)request.getAttribute("month-param");
String dayParam = (String)request.getAttribute("day-param");
String year = (String)request.getAttribute("year-param");

out.print("<br> The day is " + day + " and the date is " + date);
out.print("<br> The day value from the date object is " + dayval);
out.print("<br> The Date in string form object is " + dayobj);
out.print("<br> The month from the parameter is " + month);
out.print("<br> The day from the parameter is " + dayParam);
out.print("<br> The year from the parameter is " + year);
%>

</body>
</html>