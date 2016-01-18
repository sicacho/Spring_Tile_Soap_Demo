<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header page-scroll">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#page-top">Java Resource</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li class="hidden">
          <a href="#page-top"></a>
        </li>
        <li class="page-scroll">
          <a href="/">Member</a>
        </li>
        <li class="page-scroll">
          <a href="<c:url value="/about"></c:url>">About</a>
        </li>
        <li class="page-scroll">
          <a href="<c:url value="/contact"></c:url>">Contact</a>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse -->
  </div>
  <!-- /.container-fluid -->
</nav>

<!-- Header -->
<header>
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <img class="img-responsive" src="<c:url value="/resources/img/profile.png"></c:url>" alt="">
        <div class="intro-text">
          <span class="name">We just make a website</span>
          <hr class="star-light">
          <span class="skills">beautiful design - Simple to use - User friendly</span>
        </div>
      </div>
    </div>
  </div>
</header>
