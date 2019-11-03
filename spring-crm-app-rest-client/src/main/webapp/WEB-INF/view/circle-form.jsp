<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Circle Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Circle</h3>
	
		<form:form action="saveCircle" modelAttribute="circle" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Circle name:</label></td>
						<td><form:input path="circle_name" /></td>
					</tr>
				
					<tr>
						<td><label>Date of Creation</label></td>
						<td><form:input path="doj" /></td>
					</tr>

					<tr>
						<td><label>Created By</label></td>
						<td><form:input path="circle_user_Info.id" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/circle/list">Back to Circle List</a>
		</p>
	
	</div>

</body>

</html>










