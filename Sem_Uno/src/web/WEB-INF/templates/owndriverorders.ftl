<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Login - Bootstrap Admin Template</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="/css/bootstrap.css" media="screen" type="text/css">

    <link href="../css/font-awesome.css" rel="stylesheet">
    <link href="../css/fontstyle.css" rel="stylesheet">
    <link href="../css/rounded.css" rel="stylesheet">

    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <link href="../css/signin.css" rel="stylesheet" type="text/css">

</head>

<body>

<div class="navbar navbar-fixed-top">

    <div class="navbar-inner">

        <div class="container">

            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <a class="brand" href="/driver">
                Driver Control System
            </a>

            <div class="nav-collapse">
                <ul class="nav pull-right">
                    <li class="">
                        <a href="/driver" class="">
                            <i class="icon-chevron-left"></i>
                            Back to Homepage
                        </a>

                    </li>
                </ul>

            </div><!--/.nav-collapse -->

        </div> <!-- /container -->

    </div> <!-- /navbar-inner -->

</div> <!-- /navbar -->

<h1>${driver.firstName}'s orders</h1>

<table border="2" class="table">
    <tr>
        <th>Order Name</th>
        <th>Required Transport</th>
        <th>Deadline</th>
        <th>Price</th>
        <th>Status</th>
<tr>
<#list orders as order>
    <tr>
        <td>${order.ordersName}</td>
        <td>${order.requiredTransport}</td>
        <td>${order.deadline}</td>
        <td>${order.price}</td>
        <td>${order.status}</td>
    </tr>
</#list>
</table>

<script src="../js/jquery-1.7.2.min.js"></script>
<script src="../js/bootstrap.js"></script>

<script src="../js/signin.js"></script>

</body>

</html>