<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Page</title>
        <link rel="stylesheet" type="text/css" href="/timesheet/resources/style.css" />
    </head>
    <body>
        <h1>Welcome <c:out value="${sessionScope.loggedUser.userName}" />!</h1>
        <div>
            Please enter your timesheet for this week
            <form action="timesheet" method="post">
                <table>
                    <tr>
                        <th>Day</th>
                        <th>Hours</th>
                    </tr>
                    <tr>
                        <td>Start Date</td>
                        <td><input type="date" name="dateMonday" disabled value="<c:out value="${timesheet.dateMonday}" />" /> </td>
                    </tr>
                    <tr>
                        <td>End Date</td>
                        <td><input type="date" name="dateFriday" disabled value="<c:out value="${timesheet.dateFriday}" />" /></td>
                    </tr>
                    <tr>
                        <td>Monday</td>
                        <td><input type="text" name="hrsMonday" value="0" /></td>
                    </tr>
                    <tr>
                        <td>Tuesday</td>
                        <td><input type="text" name="hrsTuesday" value="0" /></td>
                    </tr>
                     <tr>
                        <td>Wednesday</td>
                        <td><input type="text" name="hrsWednesday" value="0" /></td>
                    </tr>
                     <tr>
                        <td>Thursday</td>
                        <td><input type="text" name="hrsThursday" value="0" /></td>
                    </tr>
                     <tr>
                        <td>Friday</td>
                        <td><input type="text" name="hrsFriday" value="0" /></td>
                    </tr>
                </table>
                <input type="submit" value="Submit Timesheet" />
            </form>
        </div>
    </body>
</html>