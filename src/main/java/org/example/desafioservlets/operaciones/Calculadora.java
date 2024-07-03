package org.example.desafioservlets.operaciones;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Calculadora", value = "/Calculadora")
public class Calculadora extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Obtener los parámetros del formulario
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operacion = request.getParameter("operacion");


        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double resultado = 0;
        String resultadoTexto = "";

        // Realizar la operación matemática
        switch (operacion) {
            case "1":
                resultado = num1 + num2;
                resultadoTexto = "La Suma de los dos numero es: " + resultado;
                break;
            case "2":
                resultado = num1 - num2;
                resultadoTexto = "La Resta de los dos numero es: " + resultado;
                break;
            case "3":
                resultado = num1 * num2;
                resultadoTexto = "La Multiplicación de los dos numero es: " + resultado;
                break;
            case "4":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    resultadoTexto = "La División de los dos numero es: " + resultado;
                } else {
                    resultadoTexto = "Error: División por cero no permitida.";
                }
                break;
            case "5":
                // Ordenar los números (suponiendo ascendente)
                if (num1 > num2) {
                    resultadoTexto = "El Orden de los numero es: " + num2 + ", " + num1;
                } else {
                    resultadoTexto = "El Orden de los numero es: " + num1 + ", " + num2;
                }
                break;
            case "6":
                resultadoTexto = (num1 % 2 == 0 ? num1 + " es Par" : num1 + " es Impar") +
                        ", " +
                        (num2 % 2 == 0 ? num2 +" es Par" : num2 +" es Impar");
                break;
            default:
                resultadoTexto = "Operación no válida";
                break;
        }

        // Establecer el resultado como atributo de la solicitud
        request.setAttribute("resultado", resultadoTexto);

        // Reenviar la solicitud al JSP resultado.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
