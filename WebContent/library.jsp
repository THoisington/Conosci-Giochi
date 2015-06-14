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
		<div class="col-md-4"></div>
		<div class="col-md-3" style="font-size: 10px;"><div class="centered"> <button type="submit" class="btn btn-warning full" id="recommend">Rate Games</button></div></div>
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

	<%   Game[] library;
		 library = (Game[]) request.getSession().getAttribute("library");
		 Integer indexInt = (Integer) request.getSession().getAttribute("indexLib");
		 int index = indexInt.intValue();
				
		 Integer size = library.length; 
		 int maxIndex = size.intValue();
		 
	%>
	<div class="row" id="cheat" data-cheat= <%= index %>>
		<!-- <div class="col-md-1"></div> -->
		<div class="col-md-12 text-center libHead"> <h4>Your Library</h4></div>
		<!-- <div class="col-md-1"></div> -->
	</div>
	
	<div class="row gameRow">
		<div class="col-md-1"></div>
		
		<% if (index<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+1<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+1].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+1].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+2<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+2].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+2].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+3<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+3].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+3].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+4<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+4].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+4].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>

		<div class="col-md-1"></div>
	</div>
	
	<div class="row gameRow">
		<div class="col-md-1"></div>
		
		<% if (index+5<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+5].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+5].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+6<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+6].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+6].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+7<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+7].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+7].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+8<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+8].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+8].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+9<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+9].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+9].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>

		<div class="col-md-1"></div>
	</div>
	
	<div class="row gameRow">
		<div class="col-md-1"></div>
		
		<% if (index+10<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+10].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+10].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+11<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+11].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+11].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+12<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+12].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+12].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+13<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+13].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+13].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>
		
		<% if (index+14<maxIndex) { %>
		<div class="col-md-2">
			<div class="col-md-1"></div>
			<div class="col-md-10"><img src=<%= library[index+14].getCover() %> class = "img-responsive img-rounded">
			<h5><%= library[index+14].getTitle() %></h5></div>
			<div class="col-md-1"></div>
		</div>
		<% } else { %>
		<% } %>

		<div class="col-md-1"></div>
	</div>
	
	<nav>
  		<ul class="pager">
   		 <li><a href="#" id="lPrev">Previous</a></li>
    	 <li><a href="#" id="lNext">Next</a></li>
  		</ul>
	</nav>
	
			
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="javascript/jquery.fullPage.js"></script>
<script type="text/javascript" src="javascript/library.js"></script>
</body>
</html>