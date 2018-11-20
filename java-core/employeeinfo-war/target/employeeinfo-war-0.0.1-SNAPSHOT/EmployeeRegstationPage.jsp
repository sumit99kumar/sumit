<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="send" method="post">
			<table>
				<tr>
					<th>EMPLOYEE ID</th>
					<td><input type="text" name="empId" /></td>
				</tr>
				<tr>
					<th>FIRST NAME</th>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<th>LAST NAME</th>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<th>ADDRESS</th>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<th></th>
					<td style="text-align: right;"><input type="submit"
						value="REGISTER" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>