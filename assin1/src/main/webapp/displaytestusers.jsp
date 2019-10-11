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
		<c:forEach var="tempCustomer" items="${customers}">
		<!-- Create a update link with customer id -->
		
			<tr> 
				<td>${tempCustomer.userid}</td>
				<td>${tempCustomer.email}</td>
				
			</tr>
		
		</c:forEach>
		
		</table>


</body>