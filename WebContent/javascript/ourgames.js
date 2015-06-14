$("#aNext").click(function(){
	var record = $("#cheat").attr("data-cheat");
	$.post( "libpages", { direction: "next", source: "add", record: record } );
	location.reload(true);
});

$("#aPrev").click(function(){
	var record = $("#cheat").attr("data-cheat");
	$.post( "libpages", { direction: "prev", source: "add", record: record } );
	location.reload(true);
});

$(".btn-success").click(function(){
	var title = $(this).parent().parent().parent().find("h3").text();
	$(this).removeClass("btn-success");
	$.post( "addtouserlib", { title: title, liked: "true" } );
});

$(".btn-danger").click(function(){
	var title = $(this).parent().parent().parent().find("h3").text();
	console.log(title);
	$(this).removeClass("btn-danger");
	$.post( "addtouserlib", { title: title, liked: "false" } );
});