<%@page import="Suporte.Tabelas" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular IMC</title>
    </head>
    <body>

        <div id="div_imc">
            <p>IMC = Índica de Massa Corporea</p>
            <form action="calculo.jsp" method="get" target="result">
                Peso: <input type="text" name="peso" placeholder="Digite seu peso"><br><br>
                Altura: <input type="text" name="altura" placeholder="Digite sua altura"><br>
                <br>
                <input type="submit" name="enviar" value="Calcular">
            </form>
        </div>
        <br><br>
        
        <div id="div_resultado">
            <iframe name="result" width="300" height="200"></iframe>
        </div>
        
        <br>
        <%=new Tabelas().getImc() %>
    </body>
</html>
