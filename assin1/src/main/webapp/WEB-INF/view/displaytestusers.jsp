<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>
List Customers
</title>

</head>

<body>

<table>
			<tr>
				<th>Userid</th>
				<th>Email</th>
				
		</tr>
		<!--  loop over and print the customers -->
		<c:forEach var="tempUser" items="${userlist}">
		<!-- Create a update link with customer id -->
		
			<tr> 
				<td>${tempUser.username}</td>
				<td>${tempUser.email}</td>
				
			</tr>
		
		</c:forEach>
		
		</table>

</body>