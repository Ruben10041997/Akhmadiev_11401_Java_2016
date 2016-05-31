<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Dashboard - Bootstrap Admin Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" >
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" >
    <link href="../css/fontstyle.css" rel="stylesheet" type="text/css">
    <link href="../css/font-awesome.css" rel="stylesheet" type="text/css" >
    <link href="../css/style.css" rel="stylesheet" type="text/css" >
    <link href="../css/dashboard.css" rel="stylesheet" type="text/css" >
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="../js/html5.js"></script>
    <![endif]-->
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
                class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span> </a><a class="brand" href="/admin/">Cars Control System (Admin Zone)</a>
            <div class="nav-collapse">
                <ul class="nav pull-right">
                    <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="icon-cog"></i> Account <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="javascript:;">Settings</a></li>
                            <li><a href="javascript:;">Help</a></li>
                        </ul>
                    </li>
                    <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="icon-user"></i> ${user.getLogin()} <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="javascript:;">Profile</a></li>
                            <li><a href="/logout">Logout</a></li>
                        </ul>
                    </li>
                </ul>


            </div>
            <!--/.nav-collapse -->
        </div>
        <!-- /container -->
    </div>
    <!-- /navbar-inner -->
</div>
<!-- /navbar -->
<div class="subnavbar">
    <div class="subnavbar-inner">
        <div class="container">
            <ul class="mainnav">
                <li class="active"><a href="/admin"><i></i><span>Home</span> </a> </li>
                <li><a href="/users"><i ></i><span>Users</span> </a> </li>
                <li><a href="/cars"><i ></i><span>Autopark</span> </a></li>
                <li><a href="/drivers"><i></i><span>Drivers</span> </a> </li>
                <li><a href="/clients"><i></i><span>Clients</span> </a> </li>
                <li><a href="/orders"><i></i><span>Orders</span> </a> </li>
                <li><a href="/requests"><i></i><span>Repair Request</span> </a> </li>
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
<!-- /subnavbar -->
 <h2>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut hendrerit nisl mi, id iaculis dui malesuada sit amet. <br>
     Praesent gravida mi in nibh dignissim, a laoreet dolor vestibulum. Aliquam risus mauris, gravida non urna non, <br>
     sollicitudin consequat nibh. Morbi tempor enim vel dapibus tempor. Etiam urna velit, imperdiet sed sapien ac, <br>
     gravida molestie justo. Sed ullamcorper diam sed tempor volutpat. Fusce ac ornare mauris. Maecenas ultrices <br>
     finibus nulla, a dapibus lectus condimentum id. In at interdum dui. Donec odio augue, tincidunt fringilla laoreet <br>
     non, accumsan vitae ligula. Nam eget feugiat est. Sed et accumsan enim. Suspendisse mattis odio sed risus porttitor  <br>
     ultrices. Duis placerat ipsum ac porttitor rhoncus. Aenean ullamcorper, urna ac iaculis laoreet, dolor dui efficitur  <br>
     erat, quis posuere velit nisl eget risus. Maecenas velit erat, hendrerit vitae imperdiet luctus, faucibus vitae ligula.  <br>
     Maecenas ultrices libero sed viverra dapibus. Curabitur id pulvinar lacus. Morbi cursus mollis sagittis. In in tellus a  <br>
     dolor mollis laoreet in vel nisl. Vivamus sit amet posuere ipsum. Proin id orci urna. Aenean efficitur tincidunt tincidunt.  <br>
     Nam ipsum metus, ultrices eget arcu non, aliquam elementum mauris. Etiam sed pulvinar ligula.</h2>
    <!-- /main -->
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
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /extra-inner -->
    </div>
    <!-- /extra -->
    <div class="footer">
        <div class="footer-inner">
            <div class="container">
                <div class="row">
                    <div class="span12"> &copy; 2013 <a href="http://www.egrappler.com/">Bootstrap Responsive Admin Template</a>. </div>
                    <!-- /span12 -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /footer-inner -->
    </div>
    <!-- /footer -->
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../js/jquery-1.7.2.min.js"></script>
    <script src="../js/excanvas.min.js"></script>
    <script src="../js/chart.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.js"></script>
</body>
</html>