<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here</title>
</head>
<body>
<form action="register" method="post"> <h2>
Enter the name: <br><input type="text" name="cust_name" placeholder="your Full Name"><br><br>

Enter your Date of Birth: <br><input type="Date" name="dob"><br><br>

Enter your Mobile no: <br><input type="text" name="phno" placeholder="Only 10 digit-number "><br><br>

Enter your Email:<br><input type="text" name="email" placeholder="e.g:abc11@xyz.com"><br><br>

Set a Password: <br><input type="password" name="password"placeholder="must be 8 character"><br><br>
 
Enter account opening Balance:<br><input type="text" name="balance" placeholder="Should be > 500"><br><br>
</h2>
<input type="submit" value="Register">


</form>
</body>
</html>
