package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FAQ_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Postgraduate Application System</title> \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <p>University of Cape Town</p>\n");
      out.write("                <p>Department of Computer Science</p>\n");
      out.write("                <a><img src=\"css/CS_Logo.jpg\" id=\"logo\" alt=\"CS Logo\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"#student\">Student</a>\n");
      out.write("                        <ul><li><a href=\"studentApplication.html\">Application</a></li>\n");
      out.write("                            <li><a href=\"studentApplicationStatus.jsp\">Application Status</a></li></ul></li>\n");
      out.write("                    <li><a href=\"staffLogin.jsp\">Staff</a></li>\n");
      out.write("                    <li><a href=\"FAQ.jsp\">FAQ's</a></li>\n");
      out.write("                    <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"queries\">\n");
      out.write("            <ul>\n");
      out.write("                <ol>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"email\">E-mail Address</label>\n");
      out.write("                        <input id=\"email\" name=\"email\" type=\"email\" placeholder =\"email@domain.com\" required autofocus>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <option>\n");
      out.write("                    <select name=\"categories\" id=\"categories\">\n");
      out.write("                        <option value=\"fin\">Finance</option>\n");
      out.write("                        <option value=\"international\">International Students</option>\n");
      out.write("                        <option value=\"accommodation\">Accommodation</option>\n");
      out.write("                        <option value=\"academics\">Academic Programmes</option>\n");
      out.write("                        <option value=\"other\">Other</option>\n");
      out.write("                    </select>\n");
      out.write("                    </option>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"queries\">Query</label>\n");
      out.write("                        <textarea id=\"query\" name=\"query\" rows=\"3\" required></textarea>\n");
      out.write("                    </li>\n");
      out.write("                </ol>\n");
      out.write("            </ul>\n");
      out.write("            <button type=\"submit\">Submit</button>\n");
      out.write("        </div>\n");
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
