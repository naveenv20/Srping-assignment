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
		
			<input type="button" value="Add User"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			


<table border=2>
				<tr>
					<th>CircleID</th>
					<th>CircleName</th>
					<th>UserID</th>
					<th>Subscribed</th>
				</tr>




<c:forEach var="tempcircleUser" items="${usercirclelist}">
				
								
					
					<tr>
					<td>${tempcircleUser.theCircle.id}</td>
					<td>${tempcircleUser.theCircle.circle_name}</td>
					<td>${tempcircleUser.user_Info.userid}</td>
					<td>${tempcircleUser.subscribe}</td>
					</tr>
				
				</c:forEach>



			</table>



		</div>
	
	</div>
	

</body>

</html>









