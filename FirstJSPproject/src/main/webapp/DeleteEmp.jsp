<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int result=(int)request.getAttribute("DeleteEmp");
%>
<div>delete employee: <%=result%></div>


</body>
</html>