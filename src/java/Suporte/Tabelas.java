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
    
    public String nivel_Imc(int inicio, int tam){
                
      //  para imprimir: out.print(new Tabelas().nivel_Imc() );
      String result = "";
      int nivelIMC[] = {10, 12, 13, 14, 15, 17, 18, 25, 30, 31, 42, 51, 60};
                
        for(int i = inicio; i < (inicio+tam); i++){
            result += "<br>Valor "+ (i+1) + " = " + nivelIMC[i];
        }
                
        result += "<br><br>";
  
          return result;
    }
    
    public String nivel_Imc() {
     
      String result = "";
      int nivelIMC[][] = {
          {18,5,2,4},
          {19,7,1,6},
          {25,12,3,8}
        };
                
        for(int i = 0; i < 3; i++){
            result += "<br>";
        for(int j = 0; j < 4; j++){
            result += nivelIMC[i][j] + " ";
        }
            
      }
        result += "<br><br>";
        return result;
    }
    
    public String nivel_Imc(int inicio){
                
      //  para imprimir: out.print(new Tabelas().nivel_Imc() );
      String result = "";
      int nivelIMC[] = {10, 12, 13, 14, 15, 17, 18, 25, 30, 31, 42, 51, 60};
                
        for(int i = inicio; i < nivelIMC.length; i++){
            result += "<br>Valor "+ (i+1) + " = " + nivelIMC[i];
        }
                
        result += "<br><br>";
  
          return result;
    }
    
    
        
}
