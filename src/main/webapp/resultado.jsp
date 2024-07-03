<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="assets/html/head.jsp" %>
</head>
<body>
<%@include file="assets/html/header.jsp" %>
<p class="lead fw-normal text-white-50 mb-0">El resultado es:</p>
        </div>
    </div>
</header>

<div class="container p-5 text-center">
    <h2><%= request.getAttribute("resultado") %></h2>
</div>

<%@include file="assets/html/footer.jsp" %>
</body>
</html>