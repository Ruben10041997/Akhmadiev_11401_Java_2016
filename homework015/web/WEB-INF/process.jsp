<%--
  Created by IntelliJ IDEA.
  User: rubenahmadiev
  Date: 25.03.16
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="process" action="/process" method="post" autocomplete="on">

        <textarea name="text" placeholder="Вводите ваш текст" required></textarea>

            <select name="oper">
                <option value="symbols"><p>Number of symbols</p></option>
                <option value="words"><p>Number of words</p></option>
                <option value="sentences"><p>Number of sentences</p></option>
                <option value="paragraphs"><p>Number of paragraphs</p></option>
            </select>

        <input type="submit" value="process">
</form>
</body>
</html>
