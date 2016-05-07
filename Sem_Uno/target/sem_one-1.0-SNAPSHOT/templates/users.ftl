<#ftl encoding="utf-8">

<html>
<head>
    <title>Sign In</title>
</head>
<body>
<h1>Users</h1>

<#list users as user>
${user.id} ${user.login} <br/>
</#list>

</body>
</html>