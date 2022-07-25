<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<body>
<%
  int result = (int)request.getAttribute("AddEmp");
  %>
  <div>Add Employee: <%=result%></div>

</body>
</html>