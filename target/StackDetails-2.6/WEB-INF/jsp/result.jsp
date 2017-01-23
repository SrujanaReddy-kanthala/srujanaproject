<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html>
<script type="text/javascript">
function deletedet(custname) {
	
	alert("Are you sure wanna delete it?? " + custname);
	alert(custname);
	document.forms[0].action="deletedet/"+custname;
		document.forms[0].submit();
	/* if(name == "Srik"){
		alert("Valid");
		document.forms[0].action="deleteEmp/"+name;
		document.forms[0].submit();
	} else {
		alert("In valid");
	} */
}

</script>
<body>

<form action="">
stock  Details
<table>
  <tr>
    <th>custname</th>
    <th>custid</th>
    <th>stockid</th>
    <th>stockqty</th>
    <th>rate</th>
  </tr>
  		
<c:forEach var="s" items="${StockDetail}">  
  <tr>
    <td>${s.custname}</td>
    <td>${s.custid}</td>
    <td>${s.stockid}</td>
    <td>${s.stockqty}</td>
    <td>${s.rate}</td>
    <td><input type="button" value = "Delete" onclick="deletedet('${s.custname}')"> </td>
  </tr>
</c:forEach>
</table>
</form>
</body>

</html>
</body>
</html>