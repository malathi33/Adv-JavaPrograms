

<%@page import="Com.Sathya.Servlet.ProductDao" import="java.util.Base64"%>
<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Product List</title>
<!--  BootStrap CDN Link to Get the Support of BootStrap -->
	<link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link> 
</head>

<body>
	<table class="table table-bordered table-stripped">
	<thead class="thread-dark">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Cost</th>
		<th>Product Brand</th>
		<th>Product Made In</th>
		<th>Product Mfg Date</th>
		<th>Product Exp Date</th>
		<th>Product Image</th>
	</tr>
</thead>
<tbody>
<c:forEach var="product" items="<%=new ProductDao().findAll()%>">
	<tr>
	<td>${product.proId}</td> 
	<td>${product.proName}</td> 
	<td>${product.proPrice}</td> 
	<td>${product.proBrand}</td> 
	<td>${product.proMadeIn}</td> 
	<td>${product.proMfgDate}</td> 
	<td>${product.proExpDate}</td> 
  
	</tr>
	</c:forEach>
</tbody>
	</table>
</body>
</html>


