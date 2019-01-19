<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4-4.0.0/jq-3.2.1/jszip-2.5.0/dt-1.10.16/af-2.2.2/b-1.5.1/b-flash-1.5.1/b-html5-1.5.1/b-print-1.5.1/fh-3.1.3/r-2.2.1/datatables.min.css"/>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4-4.0.0/jq-3.2.1/jszip-2.5.0/dt-1.10.16/af-2.2.2/b-1.5.1/b-flash-1.5.1/b-html5-1.5.1/b-print-1.5.1/fh-3.1.3/r-2.2.1/datatables.min.js"></script>
<script>
$(document).ready(function() {
    $('#client').DataTable();
} );
</script>
<style>
body{
   
   background-color: white;
   font-family: 'Roboto Condensed', sans-serif;  
}
</style>
<body>
<div style="height:50px; box-shadow: 1px 1px 4px rgba(0,0,0,0.21);">
<p style="color:#0033cc; font-weight: bold; padding:5px 100px; display:inline;"><a href="dashboard"><i class="fa fa-home" style="font-size:30px;"></i></a></p>
<h6 style="padding-right: 50px; " align="right"><span class="fa fa-universal-access"></span><b>  Welcome <%=session.getAttribute("bdename") %> </b>&nbsp;&nbsp;||&nbsp;&nbsp;<a href="<c:url value='/logout'/>">Logout</a></h6>
</div>
<br>
<center>	
<h4 align="center">Daily Work Report</h4>
<display:table cellpadding="10" cellspacing="0" id="client" class="table table-striped table-bordered" style="width:100%" name="client"  export="false" requestURI="lead">
	<display:column property="id" title="Id no" sortable="false" />
	<display:column property="bdename" title="BDE" sortable="false" />	
	<display:column property="date" title="Date & Time" sortable="false" />
	<display:column property="name" title="Name" sortable="false" />
	<display:column property="phone" title="Phone No" sortable="false" />
	<display:column property="email" title="Email id" sortable="false" />
	<display:column property="address" title="Address" sortable="false" />
	<display:column property="remark" title="Remark" sortable="false" />
	<display:column property="company" title="Name of Company" sortable="false" />	
</display:table>
</center>
<br>
<div style="height:50px; box-shadow: 1px 1px 4px rgba(0,0,0,0.21);"><br>
<h6 align="center"><b>2018 © Softsecure Infotech Pvt Ltd. All Rights Reserved</b></h6>

</div>

</body>
</html>