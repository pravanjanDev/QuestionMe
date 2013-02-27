<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    	String url = (String) session.getAttribute("CANCELURL");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>payment conformation page</title>
<style type="text/css">
#paymentDetail
{
 margin-left: auto;
  margin-right: auto;
width: 6em
position:fixed;
top:30px;
right:5px;
color: #FFF;
font-weight:bold;
background: #9494D1;
border: 2px outset #111155;
padding:5px 35px;
</style>

</head>
<body>
<div id="paymentDetail">

<br>
<br>
  <form action="doExpressCheckout" method="get">
      <center>Please Conform your payment<br>
     AMOUNT : <%out.println(session.getAttribute("amount")); %> <br>
     NAME  :  <%out.println(session.getAttribute("FIRSTNAME")); %>
              <%out.println(session.getAttribute("LASTNAME")); %> <br>
             
              
      
      <input type="submit" value="conform"> </center>
  
  </form>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="<%=session.getAttribute("CANCELURL") %>"><input type="button" value="Cancel"></a>
  
 

</div>
</body>
</html>