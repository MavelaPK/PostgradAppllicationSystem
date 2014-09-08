package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class apply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");
 
          String driver  = "com.mysql.jdbc.Driver";
          Class.forName(driver);
          
          Connection con= null;
          ResultSet rst= null;
          Statement st = null;
          
          try{
               String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
               
               con = DriverManager.getConnection(url,"root","vendaboy");
               st = con.createStatement();
             }
             catch(Exception e){
             
                System.out.println(e.getMessage());
             }
            
        String title = request.getParameter("title");
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        String primaryPhone = request.getParameter("primaryPhone");
        String cellphone = request.getParameter("cellphone");
        String email = request.getParameter("email");
        String race = request.getParameter("race");
        String dob = request.getParameter("dob");
        String idNumber = request.getParameter("id");
        String citizen = request.getParameter("citizen");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String postCode = request.getParameter("postcode");
        String studentNo = request.getParameter("studentNo"); 
                         
        st.executeUpdate("insert into student(firstName,middleName,lastName,studentNumber," +
"          primaryPhone,cellphone,email,country,city,postCode,race,dateOfBirth," +
"            gender,title,idNumber)values('"+ firstName+"','"+ middleName+"','"+lastName+"','"+studentNo+"','"+primaryPhone+"','"+cellphone+"','"+email+"','"+country+"','"+city+"','"+postCode+"','"+race+"','"+dob+"','"+gender+"','"+title+"','"+idNumber+"')"); 
          
             rst = st.executeQuery("select * from apply");
             rst.close();
             st.close();
             con.close();
          
       
    
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/studentApplication.css\">\n");
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
      out.write("        \n");
      out.write("        <form id=\"application\" method=\"POST\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Personal Details</legend>\n");
      out.write("                <ol>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"title\">Title</label>\n");
      out.write("                    <select name=\"title\" id=\"title\">\n");
      out.write("                        <option value=\"mr\">Mr</option>\n");
      out.write("                        <option value=\"mrs\">Mrs</option>\n");
      out.write("                        <option value=\"ms\">Ms</option>\n");
      out.write("                        <option value=\"miss\">Miss</option>\n");
      out.write("                    </select> \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"firstName\">First Name</label>\n");
      out.write("                        <input id=\"firstName\" name=\"firstName\" type=\"text\" placeholder=\"First Name\" required autofocus>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"middleName\">Middle Name</label>\n");
      out.write("                        <input id=\"middleName\" name=\"middleName\" type=\"text\" placeholder=\"Middle Name\">\n");
      out.write("                    </li> \n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"lastName\">Last Name</label>\n");
      out.write("                        <input id=\"lastName\" name=\"lastName\" type=\"text\" placeholder=\"Last Name\" required>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"gender\">Gender</label>\n");
      out.write("                     <select name=\"gender\" id=\"gender\">\n");
      out.write("                        <option value=\"male\">Male</option>\n");
      out.write("                        <option value=\"female\">Female</option>\n");
      out.write("                    </select> \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"primaryPhone\">Primary Number</label>\n");
      out.write("                        <input id=\"primaryPhone\" name=\"primaryPhone\" type=\"tel\" placeholder=\"Eg. +126214356\" required>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"cellPhone\">Cellphone Number</label>\n");
      out.write("                        <input id=\"cellPhone\" name=\"cellPhone\" type=\"tel\" placeholder=\"Eg. +726349338\">\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"email\">Email</label>\n");
      out.write("                        <input id=\"email\" name=\"email\" type=\"email\"  placeholder=\"example@domain.com\" required>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"popGroup\">Population Group</label>\n");
      out.write("                     <select name=\"race\" id=\"race\">\n");
      out.write("                        <option value=\"afr\">African</option>\n");
      out.write("                        <option value=\"white\">White</option>\n");
      out.write("                        <option value=\"asian\">Asian</option>\n");
      out.write("                        <option value=\"indian\">Indian</option>\n");
      out.write("                        <option value=\"coloured\">Coloured</option>\n");
      out.write("                        <option value=\"n/a\">N/A</option>\n");
      out.write("                    </select> \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"dob\">Date of Birth</label>\n");
      out.write("                        <input id=\"dob\" name=\"dob\" type=\"date\" required>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                        <label for=\"id\">ID/Passport Number</label>\n");
      out.write("                        <input id=\"id\" name=\"id\" type=\"number\" required>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"citizenship\">Citizenship</label>\n");
      out.write("                     <select name=\"citizen\" id=\"citizen\">\n");
      out.write("                        <option value=\"sa\">SA Citizen</option>\n");
      out.write("                        <option value=\"international\">International</option>\n");
      out.write("                    </select> \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"address\">Address</label>\n");
      out.write("                        <textarea id=\"address\" name=\"address\" rows=3 required></textarea>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"city\">City</label>\n");
      out.write("                        <input id=\"city\" name=\"city\" type=\"text\" required>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"country\">Country</label>\n");
      out.write("                        <input id=\"country\" name=\"country\" type=\"text\" required>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <label for=\"postcode\">Postal Code</label>\n");
      out.write("                        <input id=\"postcode\" name=\"postcode\" type=\"text\" required>\n");
      out.write("                    </li>\n");
      out.write("                </ol>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("            <button type=\"submit\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
