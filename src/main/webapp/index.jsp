<%@ page isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Tag Example</title>
</head>
<body>
<c:forEach items="${movieList}" var="movie">
    <td><c:out value="${movie}"/></td>
</c:forEach>
</body>
</html>