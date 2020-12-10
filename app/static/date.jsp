<%@ page import="java.util.*" %>

<html>
<body>
<h1 align=center>Hello world! I'm using JSP!</h1>

<%
String date = (String)request.getAttribute("today");
out.print("<br> " + date);
%>

</body>
</html>