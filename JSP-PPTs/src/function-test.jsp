<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>

<body>

<c:set var="data" value="Hello World" />


Length of the string <b>${data }</b>: ${fn:length(data)}
<br>
Length of the string <b>${data }</b>: ${fn:toLowerCase(data)}  



</body>
</html>