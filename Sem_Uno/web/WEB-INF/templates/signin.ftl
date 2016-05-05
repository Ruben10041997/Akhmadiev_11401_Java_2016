<#ftl encoding="utf-8">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Sign In</title>
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div id="container">
    <form class="login-form" action="/signin/process" method="post">
        <label for="login">Логин:</label>
        <input  id="login" name="login" type="name">
        <label for="password">Пароль:</label>
        <p><a href="#">Забыли пароль?</a></p>
        <input id="password" name="password" type="password">
        <div id="lower">
            <input type="checkbox"><label class="check" for="checkbox">Запомнить меня</label>
            <input type="submit" value="Войти">
        </div>
    </form>
</div>
</body>
</html>