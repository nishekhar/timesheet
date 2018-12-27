<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<title>login page</title>
	</head>
	<body>
		<c:out value="${message}" /><br />

		<form action="login" method="post">
  			User name:<br>
  			<input type="text" name="userName"><br>
  			pass word:<br>
  			<input type="password" name="password"><br>
			<input type="submit" value="Login!">
		</form>
	</body>
</html>
