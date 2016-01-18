<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="success" style="background: #4294DA" id="about">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-lg-offset-2">
          <div class="modal-body">
            <h2 style="text-align: center;">${project.name}</h2>
            <hr class="star-primary" id="star2">
            <img src="<c:url value="/resources/img/portfolio/cabin.png"></c:url>" style="max-height: 400px;max-height: 400px" class="img-responsive img-centered" alt="">
            <p>${project.detail}</p>
            <ul class="list-inline item-details">
              <li>Client:
                <strong><a href="http://startbootstrap.com">${project.customer}</a>
                </strong>
              </li>
              <li>Date:
                <strong><a href="http://startbootstrap.com">${project.date}</a>
                </strong>
              </li>
              <li>Service:
                <strong><a href="http://startbootstrap.com">${project.service}</a>
                </strong>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>