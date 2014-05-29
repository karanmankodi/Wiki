<%@page import="Business.Wiki"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Articles :
	<br>
	<table>
		<tr>
			<th>Article</th>
			<th>Author</th>
			<th>Date</th>
		</tr>
		<%
			for (int i = 0; i < Wiki.Initialize().getArticles().size(); i++) {
		%>
		<tr>
			<td><%=Wiki.Initialize().getArticles().get(i).toString()%></td>
			<td><%=Wiki.Initialize().getAuthors().get(i).toString()%></td>
			<td><%=Wiki.Initialize().getDates().get(i).toString() %>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>