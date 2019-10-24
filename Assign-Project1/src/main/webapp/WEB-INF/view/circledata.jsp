<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>
Circle Data
</title>

</head>

<body>

<table border=1>
			
		<!--  loop over and print the customers -->
		<c:forEach var="tempUser" items="${circlelist}">
		<!-- Create a update link with customer id -->
		
			<tr> 
				<td>${tempUser.createdby}</td>
				<td>${tempUser.created_date_time}</td>
				<td>${tempUser.circle_name}</td>
				
			</tr>
		
		</c:forEach>
		
		</table>

</body>