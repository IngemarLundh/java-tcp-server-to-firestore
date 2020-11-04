<%@ page import="JavaClient.FireStoreQueries" %><%--
  Created by IntelliJ IDEA.
  User: Exarchias
  Date: 2020-09-24
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The light must be ON now</title>
</head>
<body>
<%
    FireStoreQueries fire = new FireStoreQueries();
    fire.updateElement("LightTest", "lightTestdocument2.1", "key3.1", "lightON");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String lamp = fire.readElement("LightTest", "lightTestdocument2.1", "key3.1");
    out.println("Lamp is: " + lamp);
%>
<form action="${pageContext.request.contextPath}/index.jsp">
    <input type="submit">
</form>
</body>
</html>
