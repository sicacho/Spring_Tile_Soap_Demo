<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Freelancer - Start Bootstrap Theme</title>

  <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
  <link href="<c:url value="/resources/css/bootstrap.min.css"></c:url>" rel="stylesheet">

  <!-- Custom CSS -->
  <link href="<c:url value="/resources/css/freelancer.css"></c:url>" rel="stylesheet">

  <!-- Custom Fonts -->
  <link href="<c:url value="/resources/font-awesome/css/font-awesome.min.css"></c:url>" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

</head>

<body id="page-top" class="index">

<!-- Navigation -->
<tiles:insertAttribute name="header" />
<!-- Portfolio Grid Section -->
<tiles:insertAttribute name="body"/>

<!-- Footer -->
<tiles:insertAttribute name="footer" ></tiles:insertAttribute>
<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->


<!-- Portfolio Modals -->

<!-- jQuery -->
<script src="<c:url value="/resources/js/jquery.js"></c:url>"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/resources/js/bootstrap.min.js"></c:url>"></script>

<!-- Plugin JavaScript -->
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
<script src="<c:url value="/resources/js/classie.js"></c:url>"></script>
<script src="<c:url value="/resources/js/cbpAnimatedHeader.js"></c:url>"></script>

<!-- Contact Form JavaScript -->
<script src="<c:url value="/resources/js/jqBootstrapValidation.js"></c:url>"></script>
<script src="<c:url value="/resources/js/contact_me.js"></c:url>"></script>

<!-- Custom Theme JavaScript -->
<script src="<c:url value="/resources/js/freelancer.js"></c:url>"></script>

</body>

</html>
