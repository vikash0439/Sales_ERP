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
}
form:errors{
  color:red;
}
</style>
<title>Daily Work Report</title>
</head>
<body background="<c:url value='/images/back.jpg' />">
<div style="height:50px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21); data-position:fixed;">
<p style="color:#0033cc; font-weight: bold; padding:5px 100px; display:inline;"><a href="dwr"><i class="fa fa-home" style="font-size:30px;"></i></a></p>
<h6 style="padding-right: 50px; " align="right"><span class="fa fa-universal-access"> <b>Welcome <%=session.getAttribute("bdename") %> </b>&nbsp;&nbsp;||&nbsp;&nbsp;<a href="display">View Lead</a>&nbsp;&nbsp;||&nbsp;&nbsp;<a href="<c:url value='/logout'/>">Logout</a></h6>

</div>
<div id="main">
<br>
<center>
<h4 align="center">Add Lead</h4><hr>
<form:form action="lead" method="POST" commandName="clientForm" style="padding:10px 0px;">
	<table>
	    <form:hidden path="id" />
	    <form:hidden path="bdename" value= '<%=session.getAttribute("bdename") %>'/>
		<tr>
			<td>Lead's Name :</td>
			<td><form:input path="name" class="form-control" />
			<form:errors path="name" style="color:red;"/></td>
		</tr>
		<tr>
			<td>Phone No :</td>
			<td><form:input path="phone" class="form-control"/>
			<form:errors path="phone" /></td>
		</tr>
		<tr>
			<td>Email Id :</td>
			<td><form:input path="email" class="form-control"/>
			<form:errors path="email" /></td>
		</tr>
		
		<tr>
			<td>Address :</td>
			<td><form:textarea path="address" class="form-control"></form:textarea> 
			<form:errors path="address"></form:errors></td>
		</tr>
		<tr>
			<td>Remarks :</td>
			<td><form:textarea path="remark" class="form-control"/>
			<form:errors path="remark" /></td>
		</tr>
        <tr>
			<td>Company Name :</td>
			<td><form:input path="company" class="form-control"/>
			<form:errors path="company" /></td>
		</tr>
        
		<tr>
		     <td>&nbsp;</td>
			<td><input class="btn btn-primary" type="submit" value="Submit"></td>
		</tr>
	</table>
</form:form>
</center><br><br><br><br><br><br></div>
<div style="height:54px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21);">
<br>
<h6 align="center"><b>2018 © Softsecure Infotech. All Rights Reserved</b></h6>

</div>

</body>
</html>