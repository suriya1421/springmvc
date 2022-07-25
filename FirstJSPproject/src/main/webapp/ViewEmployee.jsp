<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.List,com.chainsys.jspproject.pojo.Employee,java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<table>
<thead></thead>
<%
List<Employee> emplist = (ArrayList<Employee>)request.getAttribute("emplist"); 
for(Employee emp:emplist) {
%>
<tr>
<td><%=emp.getEmp_id()%></td>
<td><%=emp.getFirst_name()%></td>
<td><%=emp.getLast_name()%></td>
<td><%=emp.getEmail()%></td>
<td><%=emp.getHire_date()%></td>
<td><%=emp.getSALARY()%></td>
<td><%=emp.getJob_id()%></td>

</tr>
<%}%>
</table>
</body>
</html>