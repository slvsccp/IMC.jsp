package Suporte;

public class Tabelas {
    String html = "";
    
    public void Imc(){
        html += "TABELA IMC";
        html += "<p>A Organização Mundial de Saúde utiliza a seguinte tabela de peso ideal pelo IMC:</p>";
        html += "<div align=\"left\">";
        html += "   <table border=\"1\" cellpadding=\"10\" width=\"300\" cellspacing=\"1\">";
        html += "        <tr>";
        html += "            <td><b>Situação</b></td>";
        html += "            <td><b>IMC em adultos</b></td>";
        html += "        </tr>";
        html += "        <tr>";
        html += "            <td>abaixo do peso ideal</td>";
        html += "            <td>abaixo de 18,5</td>";
        html += "        </tr>";
        html += "        <tr>";
        html += "            <td>no peso ideal</td>";
        html += "            <td>entre 18,5 e 25</font></td>";
        html += "        </tr>";
        html += "        <tr>";
        html += "            <td>acima do peso ideal</td>";
        html += "            <td>entre 25 e 30</td>";
        html += "        </tr>";
        html += "        <tr>";
        html += "            <td>obeso</td>";
        html += "            <td>acima de 30</td>";
        html += "        </tr>";
        html += "    </table>";
        html += " </div>";
        html += " <p>Esta tabela da Organização Mundial de Saúde tem vantagem de ser simples e fácil de usar com números redondos.</p>";
    }
    
    public String getImc(){
        Imc();
        return html;
    }
}
