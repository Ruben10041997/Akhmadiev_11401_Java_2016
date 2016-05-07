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

        </div> <!-- /container -->

    </div> <!-- /navbar-inner -->

</div> <!-- /navbar -->



<div class="account-container register">

    <div class="content clearfix">

        <form action="#" class="register" method="post">

            <h1>Car adding</h1>

            <div class="login-fields">

                <p>Add car:</p>

                <div class="field">
                    <label for="mark">Mark:</label>
                    <input type="text" id="mark" name="mark" value="" placeholder="Mark" class="login" />
                </div> <!-- /field -->

                <div class="field">
                    <label for="model">Model:</label>
                    <input type="text" id="model" name="model" value="" placeholder="Model" class="login" />
                </div> <!-- /field -->


            <div class="field">
            <label for="year">Car's Production Year:</label>
            <input type="number" id="year" name="year" value="" placeholder="Car's Production Year" class="login"/>
            </div> <!-- /field -->

                <div class="field">
                    <label for="type">Type:</label>
                    <input type="text" id="type" name="type" value="" placeholder="Type" class="login"/>
                </div> <!-- /field -->

            <div class="field">
            <label for="power">Power:</label>
            <input type="number" id="power" name="power" value="" placeholder="Power" class="login"/>
            </div> <!-- /field -->

                <div class="field">
                    <label for="people_capacity">People Capacity:</label>
                    <input type="number" id="people_capacity" name="people_capacity" value="" placeholder="People Capacity" class="login"/>
                </div> <!-- /field -->

                <div class="field">
                    <label for="bearing_capacity">Bearing Capacity:</label>
                    <input type="number" id="bearing_capacity" name="bearing_capacity" value="" placeholder="Bearing Capacity" class="login"/>
                </div> <!-- /field -->

                <div class="field">
                    <label for="mileage">Mileage: </label>
                    <input type="number" id="mileage" name="mileage" value="" placeholder="Mileage" class="login"/>
                </div> <!-- /field -->

                <div class="field">
                    <label for="vehicle_condition">Vehicle Condition:</label>
                    <input type="number" id="vehicle_condition" name="vehicle_condition" value="" placeholder="Vehicle Condition" class="login"/>
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
