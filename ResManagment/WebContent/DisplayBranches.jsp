<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.image {
	background: url('forkstheme.jpg');
	background-repeat: no-repeat;
	background-size: 100% 90%;
	height: 800px;
}

.btn-group button {
	background-color: black; /* Green background */
	margin-left: 460px;
	margin-bottom: 10px;
	border: 2px #f49e42; /* Green border */
	color: #cccac9; /* White text */
	padding: 10px 24px; /* Some padding */
	cursor: pointer; /* Pointer/hand icon */
	width: 100%; /* Set a width if needed */
	display: block; /* Make the buttons appear below each other */
}

.btn-group button:not (:last-child ) {
	border-bottom: none; /* Prevent double borders */
}

.btn-group button:hover {
	background-color: #6c727c;
}
</style>
<body>
	<div class="image">
		<h1 align="center" style="colour: blue">
			<b>Branches</b>
		</h1>
		<div class="btn-group" align="center">
			<table>
				<c:forEach var="branche" items="${branchData}">


					<form action="DisplayRecipeServlet?id=${branche.branchId}"
						method="post">
					<tr>
						<td><button>
								<b>${branche.branch}</b>
							</button></td>
					</tr>
					</form>

				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>