<%--
  Created by IntelliJ IDEA.
  User: rubenahmadiev
  Date: 25.03.16
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://${searcher}" method="get">
    <input type="text" name="${name}"/>
    <input type="submit" value="search"/>
</form>
</body>
</html>
