<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/sboard/style/index.css">
<title>Insert title here</title>
</head>
<body>
<header id="header">
	<jsp:include page="include/header.jsp" />
</header>
<nav id="nav">
	<sec:authorize access="isAnonymous()">
		<jsp:include page="include/anonymous.jsp" />
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		<jsp:include page="include/user.jsp" />
	</sec:authorize>
</nav>
	<jsp:include page="${viewName}" />
<footer id="footer">
	<jsp:include page="include/footer.jsp"/>
</footer>
</body>
</html>