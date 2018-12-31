<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>login page</title>
        <link rel="stylesheet" type="text/css" href="/timesheet/resources/style.css" />
    </head>
    <body>
        <c:out value="${message}"/><br/>
        <div>
            <form action="login" method="post">
                User name:<br><input type="text" name="userName"><br>
                pass word:<br><input type="password" name="password"><br>
                <input type="submit" value="Login!">
            </form>
        </div>
    </body>
</html>
