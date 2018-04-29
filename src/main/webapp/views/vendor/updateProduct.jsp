<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	</form>
	<h2>Product Edit</h2>
		<form:form modelAttribute="product" method="post" enctype="multipart/form-data">
			<form:hidden path="id" />
			<div class="form-group">
				<label>Image: </label>
				<form:input type="file" path="image" class="form-control" />
			</div>
			
			<div class="form-group">
				<label>Name: <form:errors path="name" cssClass="alert-danger" /></label>
				<form:input path="name" class="form-control" />
			</div>
			<div class="form-group">
				<label>Description: <form:errors path="description" cssClass="alert-danger" /></label>
					<form:textarea path="description" class="form-control" rows="5" cols="30" />
			</div>
			<div class="form-group">
				<label>Original Price: <form:errors path="oriPrice" cssClass="alert-danger" /></label> 
				<form:input path="oriPrice" class="form-control" />
			</div>
			<div class="form-group">
				<label>Sale Price: <form:errors path="salePrice" cssClass="alert-danger" /></label> 
				<form:input path="salePrice" class="form-control" />
			</div>
			<div class="form-group">
				<label>Weight: <form:errors path="weight" cssClass="alert-danger" /></label> 
				<form:input path="weight" class="form-control" />
			</div>
			
			<button type="submit" class="btn btn-default">Submit</button>
		</form:form>
</body>
</html>