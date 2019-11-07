<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<h2>UserCircle Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Circle</h3>
		
	
		<form:form action="saveUserCircle" modelAttribute="usercircle" method="POST">

			<!-- need to associate this data with usercircle id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Circle id:</label></td>
						<td><form:input path="theCircle.id"/></td>
					</tr>
				
					<tr>
						<td><label>user_id</label></td>
						<td><form:input path="user_Info.id" /></td>
					</tr>
					
					<tr>
						<td><label>subscribe</label></td>
						<td><form:input path="subscribe" /></td>
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
			<!--  a href="${pageContext.request.contextPath}/usercircle/listcircleusers?circleId=">Back to CircleUser List</a-->
			<c:url var="CircleUserlist" value="/usercircle/listcircleusers">
						<c:param name="circleId" value="${param['circleId']}" />
					</c:url>
<a href="${CircleUserlist}">Back to CircleUser List</a>
		</p>
	
	</div>

</body>

</html>










