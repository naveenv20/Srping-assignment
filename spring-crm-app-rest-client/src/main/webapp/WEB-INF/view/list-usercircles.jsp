<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html>

<head>
	<title>List Users</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Circle Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			
		
		
		
			<!--  add our html table here -->
		
			


<table border=2>
				<tr>
					<th>CircleID</th>
					<th>CircleName</th>
					<th>UserID</th>
					<th>Subscribed</th>
					<th>Action</th>
					
				</tr>




<c:forEach var="tempcircleUser" items="${usercirclelist}">

					<c:url var="DeleteUserAssociation"
						value="/usercircle/delete">
						<c:param name="circleuserId" value="${tempcircleUser.id}" />
						<c:param name="circleId" value="${param['theId']}" />
					</c:url>
					
					<c:url var="UpdateUserAssociation"
						value="/usercircle/showFormForUpdate">
						<c:param name="circleuserId" value="${tempcircleUser.id}" />
						<c:param name="circleId" value="${param['theId']}" />
					
					</c:url>





					<tr>
					<td>${tempcircleUser.theCircle.id}</td>
					<td>${tempcircleUser.theCircle.circle_name}</td>
					<td>${tempcircleUser.user_Info.userid}</td>
					<td>${tempcircleUser.subscribe}</td>
						<td>
						<a href="${DeleteUserAssociation}"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
						|
						<a href="${UpdateUserAssociation}">Update</a>	
						</td>
					</tr>
				
				</c:forEach>



			</table>
			
			
			<c:url var="AddUsersToCircleLink" value="/usercircle/showFormForAdd">
						<c:param name="circleId" value="${param['theId']}" />
					</c:url>
<a href="${AddUsersToCircleLink}">AddUsersToCircleLink</a>

<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/circle/list">Back to Circle List</a>
		</p>
	

	
	
		</div>
	
	</div>
	

</body>

</html>









