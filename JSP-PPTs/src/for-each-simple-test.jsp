<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
	// Just create some sample data
	String[] cities = {"Chennai", "Singapore", "Mumbai"};

	pageContext.setAttribute("myCities", cities);
%>

<html>

<body>
	<c:forEach var="tempCity" items="${myCities}">
	
		${tempCity } <br>
	
	</c:forEach>
</body>
</html>