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
                Driver Control System
            </a>

            <div class="nav-collapse">
                <ul class="nav pull-right">
                    <li class="">
                        <a href="/signin" class="">
                            Already have an account? Login now
                        </a>

                    </li>
                    <li class="">
                        <a href="/homepage" class="">
                            <i class="icon-chevron-left"></i>
                            Back to Homepage
                        </a>

                    </li>
                </ul>

            </div><!--/.nav-collapse -->

        </div> <!-- /container -->

    </div> <!-- /navbar-inner -->

</div> <!-- /navbar -->





<div class="account-container register">

<div class="content clearfix">

    <form action="#" class="reg-form" method="post">

        <h1>Driver adding</h1>

        <div class="login-fields">

            <p>Add a driver:</p>

            <div class="field">
                <label for="firstname">First Name:</label>
                <input type="text" id="firstname" name="firstname" value="" placeholder="First Name" class="login" />
            </div> <!-- /field -->

            <div class="field">
                <label for="secondname">Second Name:</label>
                <input type="text" id="secondname" name="secondname" value="" placeholder="Second Name" class="login" />
            </div> <!-- /field -->


            <div class="field">
                <label for="yearofborn">Year Of Born:</label>
                <input type="number" id="yearofborn" name="yearofborn" value="" placeholder="Year Of Born" class="login"/>
            </div> <!-- /field -->

            <div class="field">
                <label for="personalexperience">Personal Experience:</label>
                <input type="number" id="personalexperience" name="personalexperience" value="" placeholder="Personal Experience" class="login"/>
            </div> <!-- /field -->

            <div class="field">
                <label for="specialization">Specialization:</label>
                <input type="text" id="specialization" name="specialization" value="" placeholder="Specialization" class="login"/>
            </div> <!-- /field -->

            <div class="field">
                <label for="totalmileage">Total Mileage:</label>
                <input type="number" id="totalmileage" name="totalmileage" value="" placeholder="Total Mileage" class="login"/>
            </div> <!-- /field -->

            <div class="field">
                <label for="mail">E-mail:</label>
                <input type="text" id="mail" name="mail" value="" placeholder="Mail" class="login"/>
            </div> <!-- /field -->

        </div> <!-- /login-fields -->

        <div class="login-actions">

            <button class="button btn btn-primary btn-large">Add</button>

        </div> <!-- .actions -->

    </form>

</div> <!-- /content -->

</div> <!-- /account-container -->


<!-- Text Under Box -->
<div class="login-extra">
    Already have an account? <a href="/signin">Login to your account</a>
</div> <!-- /login-extra -->


<script src="../js/jquery-1.7.2.min.js"></script>
<script src="../js/bootstrap.js"></script>

<script src="../js/signin.js"></script>

</body>

</html>

