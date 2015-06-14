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
<form ACTION="library" method="post">
	<div class = "row top-bar">
		<div class="col-md-1"></div>
		<div class="col-md-4"><img src="images/logoSmall.png" class="img-responsive navLogo"></div>
		<div class="col-md-4"></div>
		<div class="col-md-3" style="font-size: 10px;"><div class="centered"> <button type="submit" class="btn btn-warning full" id="recommend">Your Library</button></div></div>
	</div>
	</form>
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

	<div class="row">
		<!-- <div class="col-md-1"></div> -->
		<div class="col-md-12 text-center libHead"> <h4>Our Database</h4></div>
		<!-- <div class="col-md-1"></div> -->
	</div>
	<% Game[] games = new Game[70];
	 Integer indexInt = (Integer) request.getSession().getAttribute("index");
	   int index = indexInt.intValue();
	   games = (Game[])request.getSession().getAttribute("games"); %>
	<div class="row" id="cheat" data-cheat="<%= index %>">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index].getTitle() %></h3>
		<p class="publisher"><%= games[index].getPublisher() %></p>
		<p class="genre"><%= games[index].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+1].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+1].getTitle() %></h3>
		<p class="publisher"><%= games[index+1].getPublisher() %></p>
		<p class="genre"><%= games[index+1].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>	

	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+2].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+2].getTitle() %></h3>
		<p class="publisher"><%= games[index+2].getPublisher() %></p>
		<p class="genre"><%= games[index+2].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+3].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+3].getTitle() %></h3>
		<p class="publisher"><%= games[index+3].getPublisher() %></p>
		<p class="genre"><%= games[index+3].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+4].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+4].getTitle() %></h3>
		<p class="publisher"><%= games[index+4].getPublisher() %></p>
		<p class="genre"><%= games[index+4].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+5].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+5].getTitle() %></h3>
		<p class="publisher"><%= games[index+5].getPublisher() %></p>
		<p class="genre"><%= games[index+5].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+6].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+6].getTitle() %></h3>
		<p class="publisher"><%= games[index+6].getPublisher() %></p>
		<p class="genre"><%= games[index+6].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+7].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+7].getTitle() %></h3>
		<p class="publisher"><%= games[index+7].getPublisher() %></p>
		<p class="genre"><%= games[index+7].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+8].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+8].getTitle() %></h3>
		<p class="publisher"><%= games[index+8].getPublisher() %></p>
		<p class="genre"><%= games[index+8].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<div class="row">
		<div class="col-md-5"></div>
		<div class="col-md-2"><hr></div>
		<div class="col-md-5"></div>
	</div>
	
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-2"><img src = <%= games[index+9].getCover() %> class="img-responsive gameThumb"></div>
		<div class="col-md-6"><h3 class="title"><%= games[index+9].getTitle() %></h3>
		<p class="publisher"><%= games[index+9].getPublisher() %></p>
		<p class="genre"><%= games[index+9].getGenre() %></p></div>
		<div class="col-md-2">
		<p> <button type="button" class="btn btn-success btn-sm" style="width: 50%;">Like</button> </p>
		<p> <button type="button" class="btn btn-danger btn-sm" style="width: 50%;">Dislike</button> </p>
		</div>
		<div class="col-md-1"></div>
	</div>
	
	<nav>
  		<ul class="pager">
   		 <li><a href="#" id="aPrev">Previous</a></li>
    	 <li><a href="#" id="aNext">Next</a></li>
  		</ul>
	</nav>						
	
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="javascript/jquery.fullPage.js"></script>
<script type="text/javascript" src="javascript/ourgames.js"></script>
</body>
</html>