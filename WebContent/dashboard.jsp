<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
body 
{
   background-color: white;
   font-family: 'Roboto Condensed', sans-serif;  
}
#main{
 background-image: url('http://biomini.in/payment/images/source.gif');
 background-repeat: no-repeat;
 background-attachment: fixed;
}
form:errors{
  color:red;
}
#main{
  padding:10px 100px;
 
}
#a, #b, #c{
   background-color: #3DBFD9;
   border-radius:1em;
   height:150px;
   width:200px;
   flex:1;
   text-align:center;
   margin:50px 10px;
   color: white;
   box-shadow: 5px 1px 4px rgba(0,0,0,0.21);
}
h4{
  margin:50px;
}
@media screen and (min-width: 600px) {
    #main{
     padding:10px 100px;
     display:flex;
   }
}
</style>
<title>Daily Work Report</title>
</head>
<body background="<c:url value='/images/back.jpg' />">
<div style="height:50px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21); ">
<p style="color:#0033cc; font-weight: bold; padding:5px 100px; display:inline;"><a href="dashboard"><i class="fa fa-home" style="font-size:30px;"></i></a></p>
<h6 style="padding-right: 50px; " align="right"><span class="fa fa-universal-access"> <b>Welcome <%=session.getAttribute("bdename") %> </b>&nbsp;&nbsp;||&nbsp;&nbsp;<a href="<c:url value='/logout'/>">Logout</a></h6>

</div>
<div id="main">
<br>
<div id=a>
<h4><a href="sales" style="color: white;">Sales DWR</a></h4>
</div>
<div id=b>
<h4><a href="GemPortal" style="color: white;">GEM Portal</a></h4>
</div>
<div id=c>
<h4></h4>
</div>
<br>
</div>
<div id="main">
<br>
<div id=a>
<h4></h4>
</div>
<div id=b>
<h4></h4>
</div>
<div id=c>
<h4></h4>
</div>
<br>
</div>
<div id="main">
<br>
<div id=a>
<h4></h4>
</div>
<div id=b>
<h4></h4>
</div>
<div id=c>
<h4></h4>
</div>
<br>
</div>

<div style="height:54px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21);">
<br>
<h6 align="center"><b>2018 © Softsecure Infotech Pvt Ltd. All Rights Reserved<b></b></h6>

</div>

</body>
</html>