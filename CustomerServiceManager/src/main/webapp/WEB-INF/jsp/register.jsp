
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>

	<h2>Submitted Customer Information</h2>
	<div align="center">
	<table border="1px">
		
		<tr>
			<td>User Name:</td>
			<td>${customer.getUname()}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${customer.getEmail()}</td>
		</tr>
		<tr>
			<td>PhoneNumber:</td>
			<td>${customer.getPhoneNum()}</td>
		</tr>
		<tr>
			<td>Service Details:</td>
			<td>${serviceDetails}</td>
		</tr>
	</table>
</div>
</body>
</html>