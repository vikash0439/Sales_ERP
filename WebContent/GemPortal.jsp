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
</style>
<title>Gem Portal | Daily Work Report</title>
<style type="text/css"> * {margin:0; padding:0; text-indent:0; }
 .s1 { color: black; font-family:Arial, sans-serif; font-style: normal; font-weight: normal; text-decoration: none; font-size: 24pt; }
 .s2 { color: black; font-family:Arial, sans-serif; font-style: normal; font-weight: normal; text-decoration: none; font-size: 14pt; }
 p { color: black; font-family:Arial, sans-serif; font-style: normal; font-weight: normal; text-decoration: none; font-size: 14pt; margin:0pt; }
</style>
</head>
<body>
<div style="height:50px; box-shadow: 5px 2px 4px rgba(0,0,0,0.21); data-position:fixed;">
<p style="color:#0033cc; font-weight: bold; padding:5px 100px; display:inline;"><a href="GemPortal"><i class="fa fa-home" ></i></a></p>

<%-- <c:set var="page" scope="session" value= ${session.getAttribute("emailid")}/> --%>
<%-- <c:if test="page == 'sales@proxkey.in'">   --%>
<%--    <p>My income is: <c:out value="${page}"/><p>   --%>
<%-- </c:if> --%>

<h6 style="padding-right:50px; " align="right"><span class="fa fa-universal-access"></span> <b>Welcome <%=session.getAttribute("bdename") %> </b>&nbsp;&nbsp;||&nbsp;&nbsp;<a href="displayGem">View Orders</a>&nbsp;&nbsp;||&nbsp;&nbsp;<a href="<c:url value='/logout'/>">Logout</a></h6>

</div>
<div id="main">
<br>
<center>
<h4 align="center">GEM Order Details</h4><hr>
                       
<form:form  action="gemdetail" method="POST" commandName="gemForm">
	<table >
	    <form:hidden path="id" />
	    <form:hidden path="bdename" value='<%=session.getAttribute("bdename") %>'/>
	    		
		<tr class="form-group col-md-6">
			<td><span style="color:green;">(Tariq Khan)</span>GEM OrderID :</td>
			<td><form:input path="gemorderid" class="form-control" />
			<form:errors path="gemorderid" style="color:red;"/></td>
		</tr>
		<tr class="form-group col-md-4" >
			<td>Products :</td>
			<td><form:input path="ordersummary" class="form-control"/>
			<form:errors path="ordersummary" /></td>
		</tr>
		<tr class="form-group col-md-4" >
			<td>Contact No :</td>
			<td><form:input path="contactno" class="form-control"/>
			<form:errors path="contactno" /></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Date :</td>
			<td><form:input path="date" class="form-control" placeholder="DD/MM/YYYY"/>
			<form:errors path="date" /></td>
		</tr>
		
		<tr class="form-group col-md-6">
			<td>Organisation Name :</td>
			<td><form:input path="name" class="form-control" />
			<form:errors path="name"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Contact No 1 :</td>
			<td><form:input path="contact1" class="form-control"/>
			<form:errors path="contact1" /></td>
		</tr>
        <tr class="form-group col-md-6">
			<td>Contact No 2 :</td>
			<td><form:input path="contact2" class="form-control"/>
			<form:errors path="contact2" /></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td>Contact Person :</td>
			<td><form:input path="contactperson" class="form-control" />
			<form:errors path="contactperson"></form:errors></td>
		</tr>   
		<tr class="form-group col-md-6">
			<td>Address :</td>
			<td><form:textarea path="add1" class="form-control" />
			<form:errors path="add1"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>City :</td>
			<td><form:input path="city" class="form-control" />
			<form:errors path="city"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>State :</td>
			<td><form:select path="state" class="form-control" >
			     <form:option value = "NONE" label = "Select"/>
			     <form:options items = "${state}" />
			</form:select>
			<form:errors path="state"></form:errors></td>
		</tr>  
		<tr class="form-group col-md-6">
			<td>PIN:</td>
			<td><form:input path="pin" class="form-control" />
			<form:errors path="pin"></form:errors></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td>Email ID :</td>
			<td><form:input path="email" class="form-control" />
			<form:errors path="email"></form:errors></td>
		</tr>   
		<tr class="form-group col-md-6">
			<td><span style="color:green;">(Anmol Gupta)</span>Invoice No:</td>
			<td><form:input path="invoiceno" class="form-control" />
			<form:errors path="invoiceno"></form:errors></td>
		</tr>  
		<tr class="form-group col-md-6">
			<td>Invoice Date :</td>
			<td><form:input path="invoicedate" class="form-control" />
			<form:errors path="invoicedate"></form:errors></td>
		</tr>  
		<tr class="form-group col-md-6">
			<td>Courier Name :</td>
			<td><form:input path="courier" class="form-control" />
			<form:errors path="courier"></form:errors></td>
		</tr>  
		<tr class="form-group col-md-6">
			<td>Dispatch Date :</td>
			<td><form:input path="dispatch" class="form-control" />
			<form:errors path="dispatch"></form:errors></td>
		</tr>  
		<tr class="form-group col-md-6">
			<td>Courier AWB :</td>
			<td><form:input path="awb" class="form-control" />
			<form:errors path="awb"></form:errors></td>
		</tr>  
		<tr class="form-group col-md-6">
			<td>Mode :</td>
			<td><form:select path="mode" class="form-control" >
			   <form:option value="Air">Air</form:option>
			   <form:option value="surface">Surface</form:option>
			</form:select>
			<form:errors path="mode"></form:errors></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td><span style="color:green;">(Tariq Khan)</span>Delivery Status :</td>
			<td><form:input path="dstatus" class="form-control" />
			<form:errors path="dstatus"></form:errors></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td>Delivery Date :</td>
			<td><form:input path="ddate" class="form-control" />
			<form:errors path="ddate"></form:errors></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td>Confirmed By :</td>
			<td><form:input path="confirm" class="form-control" />
			<form:errors path="confirm"></form:errors></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td>Accepted Status :</td>
			<td><form:input path="accepted" class="form-control" />
			<form:errors path="accepted"></form:errors></td>
		</tr> 
		<tr class="form-group col-md-6">
			<td>Recieved:</td>
			<td><form:select path="recieved" class="form-control" >
			 <form:option value="pending">Pending</form:option>
			   <form:option value="accepted">Accepted</form:option>
			</form:select>
			<form:errors path="recieved"></form:errors>
			</td>
		</tr>  
		<tr class="form-group col-md-6">
			<td><span style="color:green;">(Anmol Gupta)</span>Payment Mode :</td>
			<td><form:input path="pmode" class="form-control" />
			<form:errors path="pmode"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Payment Recieved Date :</td>
			<td><form:input path="precieveddate" class="form-control" />
			<form:errors path="precieveddate"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Payment Status :</td>
			<td><form:input path="status" class="form-control" />
			<form:errors path="status"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Transaction ID :</td>
			<td><form:input path="no" class="form-control" />
			<form:errors path="no"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Amount :</td>
			<td><form:input path="amount" class="form-control" />
			<form:errors path="amount"></form:errors></td>
		</tr>
		<tr class="form-group col-md-6">
			<td>Remark :</td>
			<td><form:input path="remark" class="form-control" />
			<form:errors path="remark"></form:errors></td>
		</tr>
		<tr class="form-group col-md-12">
		     <td>&nbsp;</td>
			<td><input class="btn btn-primary" type="submit" value="Submit"></td>
		</tr>
	</table>
</form:form>	
</center>		
</div>
<div style="height:54px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21);">
<br>
<h6 align="center"><b>2018 © Softsecure Infotech Pvt Ltd. All Rights Reserved</b></h6>

</div>

</body>
</html>