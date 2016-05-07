<#ftl encoding="utf-8">

<html>
<head>
    <title>Cars</title>
</head>
<body>
<h1>Autopark</h1>

<#list autoparks as autopark>
${autopark.mark} ${autopark.model} <br/>
</#list>

<li><a href="/car_add">Add a car</a></li>

</body>
</html>