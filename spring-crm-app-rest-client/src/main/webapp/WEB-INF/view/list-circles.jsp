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
		
			<input type="button" value="Add Circle"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table border=1>
				<tr>
					<th>DOJ</th>
					<th>CircleName</th>
					<th>UserID</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempUser" items="${circles}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/circle/showFormForUpdate">
						<c:param name="circleId" value="${tempUser.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="GetUsers" value="/usercircles/listcircleusers">
						<c:param name="circleId" value="${tempUser.id}" />
					</c:url>		
					
					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/circle/delete">
						<c:param name="circleId" value="${tempUser.id}" />
					</c:url>			
					
					<tr>
					<td><fmt:formatDate value="${tempUser.doj}" pattern="yyyy-MM-dd" /></td>
						<!-- td> ${tempUser.doj} </td-->
						<td> ${tempUser.circle_name} </td>
						<td> ${tempUser.circle_user_Info.userid} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
							   
							<a href="${GetUsers}">GetUsers</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>







		</div>
	
	</div>
	

</body>

</html>









