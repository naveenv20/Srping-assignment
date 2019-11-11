<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>Message Form</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">






<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
<script>
	$(document).ready(function() {
		$('#circle').hide();
		$('#circle1').hide();
		$("#iscircle").click(function() {
			if ($("#iscircle").prop("checked")) {
				$("#receiver").hide();
				$("#receiver1").hide();
				$("#circle").show();
				$("#circle1").show();
			} else {
				
			}
		});
	});
</script>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Message Form</h2>
		</div>
	</div>

	<div id="container">
		<h3>Send Message</h3>

		<form:form action="saveMessage" modelAttribute="message" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td><label>Message : </label></td>
						<td><form:input path="message" /></td>
					</tr>
					<!-- tr>
						<td><label>Receiver : </label></td>
						<td><form:input path="receiver_id" /></td>
					</tr>
					<tr>
						<td><label>Sender: </label></td>
						<td><form:input path="user_Info.id" /></td>
					</tr-->

					<tr>
						<td><label>Is Circle:</label></td>
						<td><form:checkbox path="iscircle" id="iscircle" /></td>
					</tr>

					
					<tr>
						<td><label>Date:</label></td>
						<td><form:input path="doj" /></td>
					</tr>


					<tr>
						<td><label id="receiver1">Receiver :</label></td>
						<td><form:select path="receiver_id" id="receiver"
								items="${receivers_values}" /></td>
					</tr>

					<tr>
						<td><label id="circle1"  type="hidden" >Circle :</label></td>
						<td><form:select path="receiver_id" id="circle"
								items="${circles_values}"  type="hidden" /></td>
					</tr>

					<tr>
						<td><label>Sender :</label></td>
						<td><form:select path="user_Info.id"
								items="${senders_values}" /></td>
					</tr>



					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>


				</tbody>
			</table>


			<p id="text" style="display: none">Checkbox is CHECKED!</p>
		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/user/list">Back to
				User List</a>
		</p>

	</div>

</body>





</html>










