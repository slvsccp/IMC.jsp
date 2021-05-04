<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="Suporte.Tabelas" %>
<%@page import="Suporte.Paciente" %>
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
        <%//=new Tabelas().getImc() %>
            
            <% 
                out.print(new Tabelas().nivel_Imc(7));
            %>
            <% 
                out.print(new Tabelas().nivel_Imc());
            %>
        
        <%
            List<Paciente> p1 = new LinkedList();
            //List<Paciente> p1 = new ArrayList<Paciente> ();
            
            p1.add(new Paciente("Matheus", "123.456.789-12", 21) );
            p1.add(new Paciente("João", "123.456.789-12", 25) );
            p1.add(new Paciente("Guilherme", "123.456.789-12", 33) );
            
            for(Paciente valor : p1){
                out.print("<hr>Nome: " + valor.getNome() + "<br>");
                out.print(valor.getCpf() + "<br>");
                out.print("Idade: " + valor.getIdade() + "<br>");
            }
            
            
            
            
            /*Paciente p = new Paciente("Matheus", "123.456.789-12", 21);
            
            out.println("Nome: " + p.getNome() + "<br>");
            out.println("CPF: " + p.getCpf() + "<br>");
            out.println("Idade: " + p.getIdade());*/
        %>
        
    </body>
</html>
