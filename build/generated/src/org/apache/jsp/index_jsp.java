package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Suporte.Tabelas;
import Suporte.Paciente;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calcular IMC</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"div_imc\">\n");
      out.write("            <p>IMC = Índica de Massa Corporea</p>\n");
      out.write("            <form action=\"calculo.jsp\" method=\"get\" target=\"result\">\n");
      out.write("                Peso: <input type=\"text\" name=\"peso\" placeholder=\"Digite seu peso\"><br><br>\n");
      out.write("                Altura: <input type=\"text\" name=\"altura\" placeholder=\"Digite sua altura\"><br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"Calcular\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <div id=\"div_resultado\">\n");
      out.write("            <iframe name=\"result\" width=\"300\" height=\"200\"></iframe>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        ");
//=new Tabelas().getImc() 
      out.write("\n");
      out.write("            \n");
      out.write("            ");
 
                out.print(new Tabelas().nivel_imc(3));
            
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            Paciente p = new Paciente();
            p.setNome("Matheus");
            p.setIdade(21);
            p.setCpf("123.456.789-10");
            
            out.println("Nome: " + p.getNome() + "<br>");
            out.println(p.getCpf());
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
