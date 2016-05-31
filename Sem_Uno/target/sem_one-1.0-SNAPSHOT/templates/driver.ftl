<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Account Upgrade - Bootstrap Admin Template</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet">

    <link href="../css/fontstyle.css" rel="stylesheet">
    <link href="../css/font-awesome.css" rel="stylesheet">

    <link href="../css/style.css" rel="stylesheet">


    <link href="../css/plans.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="../js/html5.js"></script>
    <![endif]-->

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
                Cars Control System (Driver)
            </a>

            <div class="nav-collapse">
                <ul class="nav pull-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-cog"></i>
                            Account
                            <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a href="javascript:;">Settings</a></li>
                            <li><a href="javascript:;">Help</a></li>
                        </ul>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i>
                        ${user.getLogin()}
                            <b class="caret"></b>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a href="javascript:;">Profile</a></li>
                            <li><a href="/logout">Logout</a></li>
                        </ul>
                    </li>
                </ul>

                <form class="navbar-search pull-right">
                    <input type="text" class="search-query" placeholder="Search">
                </form>

            </div><!--/.nav-collapse -->

        </div> <!-- /container -->

    </div> <!-- /navbar-inner -->

</div> <!-- /navbar -->


<div class="subnavbar">
    <div class="subnavbar-inner">
        <div class="container">
            <ul class="mainnav">
                <li class="active"><a href="/admin"><i></i><span>Home</span> </a> </li>
                <li><a href="/users"><i ></i><span>MyInformation</span> </a> </li>
                <li><a href="/driver/orders"><i ></i><span>Orders</span> </a></li>
                <li><a href="/driver/ownorders"><i></i><span>My Orders</span> </a> </li>
                <li><a href="/repairrequests"><i></i><span>Repair Requests</span> </a> </li>
                <li class="dropdown"><a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown"> <i class="icon-long-arrow-down"></i><span>Other</span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/home">Pricing Plans</a></li>
                        <li><a href="/signin">Login</a></li>
                        <li><a href="/registration">Signup</a></li>
                        <li><a href="/signin_failure">404</a></li>
                        <li><a href="/accessdeny">403</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <!-- /container -->
    </div>
    <!-- /subnavbar-inner -->
</div>

<h1>Welcome, ${driver.firstName} ${driver.secondName}</h1><br>
<h2>Thanks, for choosing our service!</h2><br><br>
<h2>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sollicitudin augue in mauris elementum consequat.<br>
    Proin nec turpis suscipit, fringilla urna ac, elementum dolor. Aliquam non commodo eros, eu bibendum massa.<br>
    Integer vel felis vel quam egestas imperdiet vitae a diam. Vestibulum at porttitor sem. Class aptent taciti <br>
    sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla sed sagittis tortor.<br><br>

    Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras id tellus <br>
    sit amet velit euismod pellentesque ut ornare tellus. Sed augue metus, luctus venenatis gravida sit amet,<br>
    fermentum eu libero. Vestibulum eu ligula lobortis, aliquam sem rutrum, elementum orci. Duis iaculis dolor <br>
    at erat dictum, a vulputate urna tincidunt. Suspendisse tristique porttitor hendrerit.</h2>

<div class="extra">

    <div class="extra-inner">

        <div class="container">

            <div class="row">
                <div class="span3">
                    <h4>
                        About Free Admin Template</h4>
                    <ul>
                        <li><a href="javascript:;">EGrappler.com</a></li>
                        <li><a href="javascript:;">Web Development Resources</a></li>
                        <li><a href="javascript:;">Responsive HTML5 Portfolio Templates</a></li>
                        <li><a href="javascript:;">Free Resources and Scripts</a></li>
                    </ul>
                </div>
                <!-- /span3 -->
                <div class="span3">
                    <h4>
                        Support</h4>
                    <ul>
                        <li><a href="javascript:;">Frequently Asked Questions</a></li>
                        <li><a href="javascript:;">Ask a Question</a></li>
                        <li><a href="javascript:;">Video Tutorial</a></li>
                        <li><a href="javascript:;">Feedback</a></li>
                    </ul>
                </div>
                <!-- /span3 -->
                <div class="span3">
                    <h4>
                        Something Legal</h4>
                    <ul>
                        <li><a href="javascript:;">Read License</a></li>
                        <li><a href="javascript:;">Terms of Use</a></li>
                        <li><a href="javascript:;">Privacy Policy</a></li>
                    </ul>
                </div>
                <!-- /span3 -->
                <div class="span3">
                    <h4>
                        Open Source jQuery Plugins</h4>
                    <ul>
                        <li><a href="http://www.egrappler.com">Open Source jQuery Plugins</a></li>
                        <li><a href="http://www.egrappler.com;">HTML5 Responsive Tempaltes</a></li>
                        <li><a href="http://www.egrappler.com;">Free Contact Form Plugin</a></li>
                        <li><a href="http://www.egrappler.com;">Flat UI PSD</a></li>
                    </ul>
                </div>
                <!-- /span3 -->
            </div> <!-- /row -->

        </div> <!-- /container -->

    </div> <!-- /extra-inner -->

</div> <!-- /extra -->


<div class="footer">

    <div class="footer-inner">

        <div class="container">

            <div class="row">

                <div class="span12">
                    &copy; 2013 <a href="http://www.egrappler.com/">Bootstrap Responsive Admin Template</a>.
                </div> <!-- /span12 -->

            </div> <!-- /row -->

        </div> <!-- /container -->

    </div> <!-- /footer-inner -->

</div> <!-- /footer -->


<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="../js/jquery-1.7.2.min.js"></script>

<script src="../js/bootstrap.js"></script>
<script src="../js/base.js"></script>

</body>

</html>
