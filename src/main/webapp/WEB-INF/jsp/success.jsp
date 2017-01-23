<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message}</br>
<table>
  <tr>
    <th>custname</th>
    <th>custid</th>
    <th>stockid</th>
    <th>stockqty</th>
    <th>rate</th>
  </tr>
  <tr>
    <td>${s.custname}</td>
    <td>${s.custid}</td>
    <td>${s.stockid}</td>
    <td>${s.stockqty}</td>
    <td>${s.rate}</td>
  </tr>
</table>

</body>
</html>