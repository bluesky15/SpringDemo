<%@ page import="java.util.*" %>
<html>
<head>
<title>Jsp Demo</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/angular.min.js"></script>
</head>
<body>
<div class="container">
<h1>This is Jsp Demo page!</h1>
<h1><%=new Date() %></h1>
</div>
</body>
</html>