<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html>

<head>
	<title>User Inbox</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>User Inbox</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			
		
		
		
			<!--  add our html table here -->
		
			


<table border=2>
				<tr>
					<th>Message</th>
					<th>Receiver</th>
					<th>From Circle</th>
					<th>Sender</th>
					
					
				</tr>




<c:forEach var="tempUser" items="${userinboxlist}">

					





					<tr>
					<td>${tempUser.message}</td>
					<td>${tempUser.receiver_Info.userid}</td>
					<td>${tempUser.iscircle}</td>
					<td>${tempUser.sender_Info.userid}</td>
						
					</tr>
				
				</c:forEach>



			</table>
			
			
		

<div style="clear; both;"></div>
		
		
	
	
	<p>
			<a href="${pageContext.request.contextPath}/user/list">Back to User List</a>
		</p>
	

	
	
		</div>
	
	</div>
	

</body>

</html>









