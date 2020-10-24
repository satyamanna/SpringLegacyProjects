<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handler mappings examples </title>
</head>
<body>
 <c:if test="${bodymessage ne ''}">
      <p>Welcome to ${bodymessage} </p>
    </c:if>
</body>
</html>