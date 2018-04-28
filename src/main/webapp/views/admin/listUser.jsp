<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty requestScope.customers }">
	No customers!
</c:if>
<c:if test="${!empty requestScope.customers }">
	<table border="1"><tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>DOB</th>
			<th>IdentificationNumber</th>
			<th>Street</th>
			<th>City</th>
			<th>State</th>
			<th>Zip</th>
			<th>Country</th>
			<th>Username</th>
			<th>Password</th>
			<th>Role</th>
			<th>Enabled</th>
			
		</tr>
		<c:forEach items="${requestScope.customers }" var="customer">
		<tr>
			<td>${customer.id} </td>			
			<td>${customer.fName} </td>			
			<td>${customer.lName} </td>			
			<td>${customer.phone} </td>			
			<td>${customer.email} </td>			
			<td>${customer.dob} </td>			
			<td>${customer.identificationNumber} </td>			
			<td>${customer.address.street} </td>			
			<td>${customer.address.city} </td>			
			<td>${customer.address.state} </td>			
			<td>${customer.address.zip} </td>			
			<td>${customer.address.country} </td>			
			<td>${customer.user.username} </td>			
			<td>${customer.user.password} </td>			
			<td>${customer.user.hasRole} </td>			
			<td>${customer.user.enabled} </td>			
			<td><a href="/deleteUser/${customer.id }">Delete</a></td>			
			<td><a href="/updateUserForAdmin/${customer.id }">Update</a></td>			
		</tr>
		</c:forEach>
	</table>
</c:if>
<a href="/admin">Go home</a>
</body>
</html>