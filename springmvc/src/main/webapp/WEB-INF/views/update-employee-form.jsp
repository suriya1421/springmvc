<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatedoc" method="post" modelAttribute="updateemployee">
				<div>
					<label for="emp_id">employee id</label>
					<div>
						<form:input path="emp_id" />
					</div>
				</div>
				<div>
					<label for="first_name">First Name</label>
					<div>
						<form:input path="first_name" />
					</div>
				</div>
				<div>
					<label for="last_name">last Name</label>
					<div>
						<form:input path="last_name" />
					</div>
				</div>
				<div>
					<label for="email">email</label>
					<div>
						<form:input path="email" />
					</div>
				</div>
				<div>
					<label for="hire_date">hire date</label>
					<div>
						<form:input path="hire_date" />
					</div>
				</div>
				<div>
					<label for="job_id">job id</label>
					<div>
						<form:input path="job_id" />
					</div>
					<div>
						<label for="salary">salary</label>
						<div>
							<form:input path="salary" />
						</div>
					</div>
				</div>
				<form:button>update Employee</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>