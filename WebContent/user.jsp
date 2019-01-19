<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>        
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
<title>Daily Work Report</title>
</head>
<body background="<c:url value='/images/back.jpg' />">
<div style="height:50px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21);">
<p style="color:#0033cc; font-weight: bold; padding:5px 100px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<k id="flowtest"></k></p>
</div>
<script>
					var myString=" || Daily Work Report || Now get all your lead at one place. Easy to add, sort, search and edit each lead.";
					var myArray=myString.split("");
					var loopTimer;	
                    function frameLooper(){
						if(myArray.length > 0){                   
							document.getElementById("flowtest").innerHTML += myArray.shift();
						}else {
							clearTimeout(loopTimer);
                            return false;
						}
						loopTimer=setTimeout('frameLooper()',80); 						
					}					
                frameLooper(); 
                </script>
<div id="main">
<br>
<center>
<h4 align="center">Log In</h4>
<form:form action="login" method="POST" commandName="loginForm" style="padding:125px 0px;">
	<table>	    
		<tr>
			<td>Email Id:</td>
			<td><form:errors path="emailid" style="color:red"/>
			<form:input path="emailid" class="form-control" /></td>			
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" class="form-control" ></form:password>
			<form:errors path="password" style="color:red;"/></td>
		</tr>       
		<tr>
		    <td>&nbsp;</td>
			<td><input class="btn btn-primary" type="submit" value="Log In"></td>
		</tr>
	</table>
</form:form>
<div id="openweathermap-widget-1"></div>
<script src='//openweathermap.org/themes/openweathermap/assets/vendor/owm/js/d3.min.js'></script><script>window.myWidgetParam ? window.myWidgetParam : window.myWidgetParam = [];  window.myWidgetParam.push({id: 1,cityid: '1261481',appid: 'dcfdcbcc9e21a7a1bd9b57ed4325cd45',units: 'metric',containerid: 'openweathermap-widget-1',  });  (function() {var script = document.createElement('script');script.async = true;script.charset = "utf-8";script.src = "//openweathermap.org/themes/openweathermap/assets/vendor/owm/js/weather-widget-generator.js";var s = document.getElementsByTagName('script')[0];s.parentNode.insertBefore(script, s);  })();</script>

</center><br><br><br><br><br><br></div>
<div style="height:54px; box-shadow: 5px 1px 4px rgba(0,0,0,0.21);">
<br>
<h6 align="center"><b>2018 © Softsecure Infotech Pvt Ltd. All Rights Reserved<b></b></h6>

</div>

</body>
</html>