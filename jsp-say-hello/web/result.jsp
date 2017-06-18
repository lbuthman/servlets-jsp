<%--
  Created by IntelliJ IDEA.
  User: lbuthman
  Date: 6/17/17
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>You made it!! Awesome!</title>
  </head>
  <body>
  <p>
    <%
      String message = (String) request.getAttribute("message");
      out.print(message);
    %>
  </p>
  Let's roll!
  </body>
</html>
