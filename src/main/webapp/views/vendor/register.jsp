<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="vendor" action="register" method="post">

		<table>
			<tr>
				<td><form:label path="user.username">username:</form:label></td>
				<td><form:input path="user.username" /></td>
				<td><form:errors path="user.username" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="user.password">password:</form:label></td>
				<td><form:input path="user.password" /></td>
				<td><form:errors path="user.password" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="email">email:</form:label></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="accountNumber">email:</form:label></td>
				<td><form:input path="accountNumber" /></td>
				<td><form:errors path="accountNumber" cssClass="error" /></td>
			</tr>		
			
			<tr>
				<td><form:label path="fName">fName:</form:label></td>
				<td><form:input path="fName" /></td>
				<td><form:errors path="fName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="lName">lName:</form:label></td>
				<td><form:input path="lName" /></td>
				<td><form:errors path="lName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="phone">phone:</form:label></td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="dob">dob:</form:label></td>
				<td><form:input path="dob" /></td>
				<td><form:errors path="dob" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="address.street">street:</form:label></td>
				<td><form:input path="address.street" /></td>
				<td><form:errors path="address.street" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="address.city">city:</form:label></td>
				<td><form:input path="address.city" /></td>
				<td><form:errors path="address.city" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="address.state">state:</form:label></td>
				<td><form:input path="address.state" /></td>
				<td><form:errors path="address.state" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="address.zip">zip:</form:label></td>
				<td><form:input path="address.zip" /></td>
				<td><form:errors path="address.zip" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="address.country">country:</form:label></td>
				<td><form:input path="address.country" /></td>
				<td><form:errors path="address.country" cssClass="error" /></td>
			</tr>


			<tr>
				<td colspan="2"><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>