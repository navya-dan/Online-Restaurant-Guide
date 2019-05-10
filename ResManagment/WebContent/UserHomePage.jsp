<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="UserHomePage.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
</style>
</head>
<body>
	<!DOCTYPE html>
<html lang="en">

<div class="container">
<div style="display: inline-block; float: right; margin-top: 10px">
				<button class="btn btn-primary" data-toggle="modal"
					style="background-color: #dd7a16; color: white;"
					.bs-example-modal-sm" data-target=".bs-example-modal-sm">
					Logout</button>

				<div class="modal bs-example-modal-sm" tabindex="-1" role="dialog"
					aria-hidden="true">
					<div class="modal-dialog modal-sm">
						<div class="modal-content">
							<div class="modal-header">
								<h4>
									Logout <i class="fa fa-lock"></i>
								</h4>
							</div>
							<div class="modal-body">
								<i class="fa fa-question-circle"></i> Are you sure you want to
								log-off?
							</div>
							<div class="modal-footer">
								<a href="MainPage.html" class="btn btn-primary btn-block">Logout</a>
							</div>
						</div>
					</div>
				</div>
			</div>
	<br>
	<div id="myCarousel" class="carousel slide" data-ride="carousel"
		data-interval="1200">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">

			<div class="item active">
				<img src="mutton-biryani.png" width="460" height="345">
				<div class="carousel-caption"></div>
			</div>

			<div class="item">
				<img src="glass.png" width="460" height="345">
				<div class="carousel-caption">
					<center>
						<h2>
							<b><i>Come fall in love with food</i></b>
						</h2>
					</center>
				</div>
			</div>

			<div class="item">
				<img src="chinese.png" width="460" height="345">
				<div class="carousel-caption"></div>
			</div>

			<div class="item">
				<img src="north.png" width="460" height="345">
				<div class="carousel-caption"></div>
			</div>

		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
</div>


<div class="container">
	<div class="row">
		<!--

Photos from unsplash.com

Follow me on
Dribbble: https://dribbble.com/supahfunk
Twitter: https://twitter.com/supahfunk
Codepen: https://codepen.io/supah/

-->
		<div class="gallery">



			<c:forEach var="restaurante" items="${RestaurantData}">
				<figure>
					<a
						href="DisplayBranchDetailsServlet?id=${restaurante.restaurantId}"><img
						src="restaurants/${restaurante.restaurantImage}" height="300"
						alt="" /></a>

				</figure>
			</c:forEach>


		</div>

		<svg xmlns="http://www.w3.org/2000/svg"
			xmlns:xlink="http://www.w3.org/1999/xlink" style="display: none;">
  <symbol id="close" viewBox="0 0 18 18">
    <path fill-rule="evenodd" clip-rule="evenodd" fill="#FFFFFF"
				d="M9,0.493C4.302,0.493,0.493,4.302,0.493,9S4.302,17.507,9,17.507
			S17.507,13.698,17.507,9S13.698,0.493,9,0.493z M12.491,11.491c0.292,0.296,0.292,0.773,0,1.068c-0.293,0.295-0.767,0.295-1.059,0
			l-2.435-2.457L6.564,12.56c-0.292,0.295-0.766,0.295-1.058,0c-0.292-0.295-0.292-0.772,0-1.068L7.94,9.035L5.435,6.507
			c-0.292-0.295-0.292-0.773,0-1.068c0.293-0.295,0.766-0.295,1.059,0l2.504,2.528l2.505-2.528c0.292-0.295,0.767-0.295,1.059,0
			s0.292,0.773,0,1.068l-2.505,2.528L12.491,11.491z" />
  </symbol>
</svg>

	</div>
</div>

</body>
</html>