<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="assets/html/head.jsp" %>
</head>
<body>
<%@include file="assets/html/header.jsp" %>
<p class="lead fw-normal text-white-50 mb-0">Ingrese los numero y la operacion</p>
</header>

<section class="container">
    <form class="row g-3 needs-validation p-5" method="post" action="Calculadora">
        <div class="col-12">
            <label for="num1" class="form-label">Numero 1</label>
            <input type="number" class="form-control" id="num1" name="num1" required>
        </div>

        <div class="col-12">
            <label for="num2" class="form-label">Numero 2</label>
            <input type="number" class="form-control" id="num2" name="num2" required>
        </div>
        <div class="col-12">
            <label for="operacion" class="form-label">Operaciones Matematica</label>
            <select class="form-select" id="operacion" name="operacion" required>
                <option value="1">Sumar</option>
                <option value="2">Restar</option>
                <option value="3">Multiplicar</option>
                <option value="4">Dividir</option>
                <option value="5">Ordenar el número</option>
                <option value="6">Cuál es par e impar</option>
            </select>
        </div>

        <div class="col-12 d-md-flex justify-content-center">
            <button class="btn btn-primary" type="submit">Respuesta</button>
        </div>
    </form>
</section>

<%@include file="assets/html/footer.jsp"%>
</body>
</html>