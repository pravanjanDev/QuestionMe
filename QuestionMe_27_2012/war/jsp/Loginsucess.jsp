<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br> <center>Please note your AccessToken for further call with Us
    
<%

out.println(session.getAttribute("AccessToken"));

%>

<br>


<Br> <br> <br>
NOTE:The Access Token is for merchant personal use please note it for future reference.
     If the merchant detail provided by you is invalid you would not able to process
     any payment .


</body>
</html>