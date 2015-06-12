//<div class="col-md-2">
//			<div class="col-md-1"></div>
//			<div class="col-md-10"><img src="http://placehold.it/120x150" class = "img-responsive img-rounded"></div>
//			<div class="col-md-1"></div>
//</div>

$("#lNext").click(function(){
	var record = $("#cheat").attr("data-cheat");
	$.post( "library", { direction: "next", source: "lib", record: record } );
	location.reload(true);
});

$("lPrev").click(function(){
	var record = $("#cheat").attr("data-cheat");
	$.post( "library", { direction: "prev", source: "lib", record: record } );
	location.reload(true);
});

$(".btn-warning").click(function(){
	window.location.replace("ourgames.jsp");
});
