<%--
  Created by IntelliJ IDEA.
  User: lbuthman
  Date: 6/15/17
  Time: 6:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <p>
      <%
        List styles = (List) request.getAttribute("styles");
        for (Object s: styles) {
            out.println("<br>try: " + s);
        }
      %>
    </p>
  $END$
  </body>
</html>
