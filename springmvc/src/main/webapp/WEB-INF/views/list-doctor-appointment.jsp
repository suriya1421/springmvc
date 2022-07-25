<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="root">
		<div id="doctorform">
			<form:form action="" method="post" modelAttribute="getdoc">
				<div>
					<label for="doctor_id">doctor id</label>
					<div>
						<form:input path="doctor_id" />
					</div>
				</div>
				<div>
					<label for="doctor_name">doctor Name</label>
					<div>
						<form:input path="doctor_name" />
					</div>
				</div>
				<div>
					<label for="dob">dob</label>
					<div>
						<form:input path="dob" />
					</div>
				</div>
				<div>
					<label for="speciality">speciality</label>
					<div>
						<form:input path="speciality" />
					</div>
				</div>
				<div>
					<label for="city">city</label>
					<div>
						<form:input path="city" />
					</div>
				</div>
				<div>
					<label for="phone_no">phone no</label>
					<div>
						<form:input path="phone_no" />
					</div>
					<div>
						<label for="standard_fees">standard fees</label>
						<div>
							<form:input path="standard_fees" />
						</div>
					</div>
				</div>
			</form:form>
			
		</div>
		<div id="applist"></div>
	</div>
	<table>
			<thead>
				<tr>
					<th>Appointment id</th>
					<th>Appointment date</th>
					<th>doc id</th>
					<th>Patient name</th>
					<th>fees</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="app" items="${applist}">
					<tr>
						<td>${app.appointment_id }</td>
						<td>${app.appointment_date}</td>
						<td>${app.doctor_id}</td>
						<td>${app.patient_name}</td>
						<td>${app.fees_collected}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
</body>
</html>