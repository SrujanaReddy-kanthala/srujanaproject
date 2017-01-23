<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">

custName : <input type="text" name="custname">

custid : <input type="text" name="custid">


stockid: <input type="text" name="stockid">

stockqty: <input type="text" name="stockqty">

rate: <input type="text" name="rate">

<tr><input type="submit" value="Save"/></tr>
</form>
<form action="deleteIt" method="post">
Name : <input type="text" name="name">
<input type="submit" value="Delete"/>
</form>

<form action="getAlldetls" method="post">
<input type="submit" value="Show All Deatils"/>
<a href="/StockDetails/StockController"></a>
</form>

</body>
</html>