<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="TrataError.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <% 
            
        String peso_txt, altura_txt;
        
        float peso, altura;
        peso = 0f;
        altura = 0f;
        
        // Receber dados externos
        peso_txt = request.getParameter("peso");
        altura_txt = request.getParameter("altura");
        
        // Converter String para float
        peso = Float.parseFloat(peso_txt);
        altura = Float.parseFloat(altura_txt);
        
        // Calcular e exibir o IMC
        float imc = (peso / (altura * altura));
        out.println(new DecimalFormat("IMC = #,##0.00 <br>").format(imc) );
        
        if(imc <= 18.5) {
            out.println("Abaixo do peso.");
        } else if(imc <= 25) {
            out.println("Peso ideal.");
        } else if (imc <= 30) {
            out.println("Acima do peso.");
        } else if (imc <= 35) {
            out.println("Obesidade de grau II.");
        } else if(imc <= 40) {
            out.println("Obesidade de grau II (severa).");
        } else {
            out.println("Obesidade III (mórbida).");
        }
        %>
    </body>
</html>
