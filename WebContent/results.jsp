<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="stylesheets/styles.css">
<%@ page import="conogio.model.*" %>
</head>
<body class = "library">
	<div class = "row top-bar">
		<div class="col-md-1"></div>
		<div class="col-md-4"><img src="images/logoSmall.png" class="img-responsive navLogo"></div>
		<div class="col-md-5"></div>
		<div class="col-md-1" style="font-size: 10px;"><p class ="text-center vert"><a href="library.jsp">Your Library</a></p></div>
		<div class="col-md-1" style="font-size: 10px;"><p class ="text-center vert"><a href="ourgames.jsp">Rate Games</a></p></div>
	</div>
	<form ACTION="recc" method="post">
	<div class = "row filter-bar">
		<div class="col-md-1"></div>
		<div class="col-md-1 filterText">Hit the button for custom recommendations</div>

		<div class="col-md-2"><select class="form-control" name="genre">
  			<option>Genre</option>
  			<option>Action</option>
  			<option>Adventure</option>
  			<option>Horror</option>
  			<option>JRPG</option>
  			<option>WRPG</option>
  			<option>Puzzle</option>
  			<option>Strategy</option>
  			<option>Shooter</option>
  			<option>Platformer</option>
  			<option>Sports</option>		
		</select></div>
		<div class="col-md-2"><select class="form-control" name="perspective">
  			<option>Perspective</option>
  			<option>First</option>
  			<option>Third</option>
  			<option>Top</option>
  			<option>Side</option>
		</select></div>
		<div class="col-md-2"><select class="form-control" name="focus">
  			<option>Focus</option>
  			<option>Story</option>
  			<option>Gameplay</option>
  			<option>Competition</option>
  			<option>Creation</option>
  			<option>Exploration</option>
		</select></div>
		<div class="col-md-2"><select class="form-control" name="graphics">
  			<option>Graphics</option>
  			<option>Pixel</option>
  			<option>Realistic</option>
  			<option>Cartoon</option>
  			<option>Cel</option>
  			<option>Art</option>
  			<option>Other</option>
		</select></div>
		<div class="col-md-2"> </div></div>
		
		<div class = "row filter-bar">
		<div class="col-md-1"></div>
		<div class="col-md-1 filterText">or use the filters here to narrow results</div>
		<div class="col-md-2"><select class="form-control" name="setting">
  			<option>Setting</option>
  			<option>Modern</option>
  			<option>Fantasy</option>
  			<option>Scifi</option>
  			<option>Nature</option>
  			<option>Global</option>
  			<option>Apocalyptic</option>
  			<option>Other</option>
		</select></div>
		<div class="col-md-2"><select class="form-control" name="playerNum">
  			<option>Player Number</option>
  			<option>Single</option>
  			<option>Multi</option>
  			<option>MMO</option>
		</select></div>
		<div class="col-md-2"><select class="form-control" name="publisher">
  			<option>Publisher</option>
  			<option>Sony</option>
  			<option>Nintendo</option>
  			<option>Indie</option>
  			<option>EA</option>
  			<option>Ubisoft</option>
  			<option>Capcom</option>
  			<option>Namco Bandai</option>
  			<option>Valve</option>
  			<option>Atlus</option>
  			<option>Other</option>
		</select></div>
		<div class="col-md-2"> <div class="centered"> <button type="submit" class="btn btn-primary full" id="recommend">Recommendations</button> </div></div>
	</div>
	</form>


	<% Game[] results = new Game[3]; 
	results = (Game[])request.getSession().getAttribute("results"); %>
	<div class="row marginTop100">
	<div class ="col-md-2"> </div>
	<div class ="col-md-2"> 
		<img src=<%= results[0].getCover() %> class="img-responsive img-thumbnail" style="width:150px; height: 175px;">
		<h3><%= results[0].getTitle() %></h3>
		<!-- <p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p> -->
	</div>
	<div class ="col-md-1"></div>
	<div class ="col-md-2"> 
		<img src=<%= results[1].getCover() %> class="img-responsive img-thumbnail" style="width:150px; height: 175px;">
		<h3><%= results[1].getTitle() %></h3>
<!-- 		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p> -->
	</div>
	<div class ="col-md-1"></div>
	<div class ="col-md-2"> 
		<img src=<%= results[2].getCover() %> class="img-responsive img-thumbnail" style="width:150px; height: 175px;">
		<h3><%= results[2].getTitle() %></h3>
	<!-- 	<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p> -->
	</div>
	<div class ="col-md-2"> </div>
	
	</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="javascript/jquery.fullPage.js"></script>
<script type="text/javascript" src="javascript/results.js"></script>
</body>
</html>