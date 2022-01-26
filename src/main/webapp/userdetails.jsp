<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@page import="com.eswar.learning.level2.User"%>   
 <%@page import="java.util.List"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>

</head>
<body>



<table bgcolor="pink" align="center">
<tr>
<th>UserId </th>	
<th>UserName </th>	
<th>UserPassword </th>	
<th>UserPhNo </th>		
</tr>



<%
List<User> lst = (List<User>)request.getAttribute("al");
%>

<%
for(User u : lst){
	
	%>

<tr>

<td><%=u.getUserID() %> </td>	
<td><%=u.getUserName() %> </td>	
<td><%=u.getPassword() %> </td>	
<td><%=u.getPhNo() %> </td>	
</tr>


<%
}
%>


</table>


</body>
</html>