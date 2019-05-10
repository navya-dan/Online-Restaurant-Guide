<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
<style>
body {
	font-family: "Times New Roman", Georgia, Serif;
}

h1, h2, h3, h4, h5, h6 {
	font-family: "Playfair Display";
	letter-spacing: 5px;
}
</style>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<body>

	<!-- Navbar (sit on top) -->
	<div class="w3-top">
		<div class="w3-bar w3-white w3-padding w3-card"
			style="letter-spacing: 4px;">
			<a href="#home" class="w3-bar-item w3-button"><l>4MoreForks</l></a>
			<!-- Right-sided navbar links. Hide them on small screens -->
			<div class="w3-right w3-hide-small">
				<a href="#about" class="w3-bar-item w3-button">Origin</a> <a
					href="#menu" class="w3-bar-item w3-button">Restaurants</a> <a
					href="#contact" class="w3-bar-item w3-button">Contact Us</a> <a
					href="Login.html" class="w3-bar-item w3-button">Login</a>
			</div>

			<div class="container">
				<div class="dropdown">
					<button type="button" class="btn btn-primary dropdown-toggle"
						data-toggle="dropdown">Dropdown button</button>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="#">Link 1</a> <a
							class="dropdown-item" href="#">Link 2</a> <a
							class="dropdown-item" href="#">Link 3</a>
					</div>
				</div>
			</div>


		</div>
	</div>

	<!-- Header -->
	<header class="w3-display-container w3-content w3-wide"
		style="max-width: 1600px; min-width: 500px" id="home">
		<img class="w3-image" src="Mainhamburger.png" alt="Hamburger Catering"
			width="1600" height="800">
		<div class="w3-display-bottomleft w3-padding-large w3-opacity">
			<h1 class="w3-xxlarge">
				<l> Chase the Taste </l>
			</h1>
			<h3 class="w3-xlarge">
				<l>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Choose the flavour
				</l>
			</h3>
		</div>
	</header>

	<!-- Page content -->
	<div class="w3-content" style="max-width: 1100px">

		<!-- About Section -->
		<div class="w3-row w3-padding-64" id="about">
			<div class="w3-col m6 w3-padding-large w3-hide-small">
				<img src="tablesetting2.png"
					class="w3-round w3-image w3-opacity-min" alt="Table Setting"
					width="600" height="750">
			</div>

			<div class="w3-col m6 w3-padding-large">
				<h1 class="w3-center">About 4MoreForks</h1>
				<br>
				<h5 class="w3-center">Tradition since 2019</h5>
				<p class="w3-large">
					This forum was founded in Bhimavaram by <b><i>4MoreForks</i></b> in
					2019. Four folks dined in a restaurant and baffled for the reason
					that they didn't find the flavour of their choice. This dismay led
					to a startup <b><i>4MoreForks</i></b> which got name and fame in
					recent times.
				</p>
				<p class="w3-large">The main theme of this forum is that a food
					enthusiast mustn't regret when he visit a restaurant. This blog
					provides the info of restaurants, their branches and the unique
					recipes in a branch.</p>
				<p class="w3-large w3-text-grey w3-hide-medium">మంచి ఆహారం వంటి
					వ్యక్తులను సేకరించడానికి ఏమీ లేదు</p>
				<br>

				<p class="w3-large  w3-hide-medium">कुछ भी नहीं लोगों को अच्छे
					भोजन की तरह साथ लाता है</p>
				<br>

				<p class="w3-large w3-text-grey w3-hide-medium">
					おいしい料理のように人を集めるものは何もない</p>
				<br>
				<p class="w3-large  w3-hide-medium">
					<b> There is nothing to gather people like good food</b>
				</p>
				<br>
				<p class="w3-large w3-text-grey w3-hide-medium">நல்ல உணவைப்
					போன்று மக்களை ஒன்று சேர்க்க ஒன்றுமில்லை</p>
				<br>

			</div>
		</div>

		<hr>

		<!-- Menu Section -->
		<div class="w3-row w3-padding-64" id="menu">
			<div class="w3-col l6 w3-padding-large">
				<h1 class="w3-center">
					<b>Restaurants</b>
				</h1>
				<br>
				<h4>Paradise</h4>
				<p class="w3-text-grey">We bet you won't find better</p>
				<br>

				<h4>Barbeque</h4>
				<p class="w3-text-grey">It ain't barbeque, if there ain't no
					smoke</p>
				<br>

				<h4>Bawarchi</h4>
				<p class="w3-text-grey">Beyond the boundaries of taste</p>
				<br>

				<h4>Chutneys</h4>
				<p class="w3-text-grey">The flavors of nature</p>
				<br>

				<h4>Dialogue In The Dark</h4>
				<p class="w3-text-grey">The pleasure of variety on your plate</p>
				<br>
				<h4>Dakshin</h4>
				<p class="w3-text-grey">Eat n Dream</p>
			</div>


			<div class="w3-col l6 w3-padding-large">
				<img src="img1.jpg" class="w3-round w3-image w3-opacity-min"
					alt="Menu" style="width: 100%">
			</div>
		</div>

		<hr>

		<!-- Contact Section -->
		<div class="w3-container w3-padding-64" id="contact">
			<h1>Contact</h1>
			<br>
			<p>We offer full info for any restaurant, large or small. We
				understand your needs and we will showcase the food to satisfy the
				biggest criteria of them all, both look and taste. Do not hesitate
				to contact us.</p>
			<p class="w3-text-blue-grey w3-large">
				<b>4MoreForks Service, 42nd Living St, 43043 Bhimavaram</b>
			</p>
			<p>You can also contact us by phone 9439567290 or email
				choosewell@4moreforks.com, or you can send us a message here:</p>

		</div>

		<!-- End page content -->
	</div>

</body>
</html>
