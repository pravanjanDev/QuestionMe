$().ready(function() {
	console.log("comming inside")
  
	$("#WPS").click(function(){
    $("#wpp").hide();
    $("#pfp").hide();
    $("#wps").show();
  });
  $("#WPP").click(function(){
    $("#wps").hide();
    $("#pfp").hide();
    $("#wpp").show();
  });
  
  $("#PFP").click(function(){
	    $("#wps").hide();
	    $("#wpp").hide();
	    $("#pfp").show();
	  });
  
  
});
