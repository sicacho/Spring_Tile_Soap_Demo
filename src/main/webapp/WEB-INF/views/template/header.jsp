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
      <a class="navbar-brand" href="#page-top">Human Resource</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li class="hidden">
          <a href="#page-top"></a>
        </li>
        <li class="page-scroll">
          <a href="#portfolio">Portfolio</a>
        </li>
        <li class="page-scroll">
          <a href="#about">About</a>
        </li>
        <li class="page-scroll">
          <a href="#contact">Contact</a>
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
          <span class="name">Start Bootstrap</span>
          <hr class="star-light">
          <span class="skills">Web Developer - Graphic Artist - User Experience Designer</span>
        </div>
      </div>
    </div>
  </div>
</header>
