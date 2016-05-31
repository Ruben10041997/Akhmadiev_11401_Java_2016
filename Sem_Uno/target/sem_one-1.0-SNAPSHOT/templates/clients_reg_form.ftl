<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Login - Bootstrap Admin Template</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

    <link href="../css/font-awesome.css" rel="stylesheet">
    <link href="../css/fontstyle.css" rel="stylesheet">

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

            <a class="brand" href="/home">
                Client Control System
            </a>

        </div> <!-- /container -->

    </div> <!-- /navbar-inner -->

</div> <!-- /navbar -->



<div class="account-container register">

    <div class="content clearfix">

        <form action="#" class="reg-form" method="post">

            <h1>Client adding</h1>

            <div class="login-fields">

                <p>Add a Client:</p>

                <div class="field">
                    <label for="nameoforganization">Name Of Organization:</label>
                    <input type="text" id="nameoforganization" name="nameoforganization" value="" placeholder="Name Of Organization" class="login" />
                </div> <!-- /field -->

                <div class="field">
                    <label for="fieldofactivity">Field Of Activity:</label>
                    <input type="text" id="fieldofactivity" name="fieldofactivity" value="" placeholder="Field Of Activity" class="login" />
                </div> <!-- /field -->


                <div class="field">
                    <label for="mailoforganization">Mail Of Organization:</label>
                    <input type="text" id="mailoforganization" name="mailoforganization" value="" placeholder="Mail Of Organization" class="login"/>
                </div> <!-- /field -->

                <div class="field">
                    <label for="ceo">CEO:</label>
                    <input type="text" id="ceo" name="ceo" value="" placeholder="CEO" class="login"/>
                </div> <!-- /field -->

                <div class="field">
                    <label for="inn">INN:</label>
                    <input type="number" id="inn" name="inn" value="" placeholder="INN" class="login"/>
                </div> <!-- /field -->

            </div> <!-- /login-fields -->

            <div class="login-actions">

                <button class="button btn btn-primary btn-large">Add</button>

            </div> <!-- .actions -->

        </form>

    </div> <!-- /content -->

</div> <!-- /account-container -->



<script src="../js/jquery-1.7.2.min.js"></script>
<script src="../js/bootstrap.js"></script>

<script src="../js/signin.js"></script>

</body>

</html>
