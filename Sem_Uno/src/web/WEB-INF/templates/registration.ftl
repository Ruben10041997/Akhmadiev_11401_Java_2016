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
                Cars Control System
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

            <h1>Registration for Free Account</h1>

            <div class="login-fields">

                <p>Create your free account:</p>

                <div class="field">
                    <label for="login">Login:</label>
                    <input type="text" id="login" name="login" value="" placeholder="Login" class="login" />
                </div> <!-- /field -->

                <div class="field">
                    <label for="role">Role:(USER_ROLE)</label>
                    <input type="text" id="role" name="role" value="" placeholder="Role" class="login" />
                </div> <!-- /field -->


                <#--<div class="field">-->
                    <#--<label for="email">Email Address:</label>-->
                    <#--<input type="text" id="email" name="email" value="" placeholder="Email" class="login"/>-->
                <#--</div> <!-- /field &ndash;&gt;-->

                <div class="field">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" value="" placeholder="Password" class="login"/>
                </div> <!-- /field -->

                <#--<div class="field">-->
                    <#--<label for="confirm_password">Confirm Password:</label>-->
                    <#--<input type="password" id="confirm_password" name="confirm_password" value="" placeholder="Confirm Password" class="login"/>-->
                <#--</div> <!-- /field &ndash;&gt;-->

            </div> <!-- /login-fields -->

            <div class="login-actions">

				<#--<span class="login-checkbox">-->
					<#--<input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4" />-->
					<#--<label class="choice" for="Field">Agree with the Terms & Conditions.</label>-->
				<#--</span>-->

                <button class="button btn btn-primary btn-large">Register</button>

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

