<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
    <body>
        <form:form>
            <table>
                <tr>
                    <td>First Name:</td>
                    <td><form:input path="firstName" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><form:input path="lastName" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save Changes"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
