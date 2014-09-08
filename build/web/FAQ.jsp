<%-- 
    Document   : FAQ
    Created on : Sep 8, 2014, 10:55:45 AM
    Author     : Peloza
--%>
<%@page language ="java" import ="java.sql.*;" %>
<%
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
            
        String email = request.getParameter("email");
        String category = request.getParameter("categories");
        String query = request.getParameter("query");
        
        st.executeUpdate("insert into faq_query(email,category,query)values('"+email+"','"+ category+"','"+ query+"')");
        
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/FAQ.css">
        <title>Postgraduate Application System</title> 
    
    </head>
    
    <body>
        <div id="main">
            <div id="header">
                <p>University of Cape Town</p>
                <p>Department of Computer Science</p>
                <a><img src="css/CS_Logo.jpg" id="logo" alt="CS Logo"></a>
            </div>
            <div id="menu">
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="#student">Student</a>
                        <ul><li><a href="studentApplication.html">Application</a></li>
                            <li><a href="studentApplicationStatus.jsp">Application Status</a></li></ul></li>
                    <li><a href="staffLogin.jsp">Staff</a></li>
                    <li><a href="FAQ.jsp">FAQ's</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </div>
        </div>
        
        <div id="queries">
            <form method="POST">
            <ul>
                <ol>
                    <li>
                        <label for="email">E-mail Address</label>
                        <input id="email" name="email" type="email" placeholder ="email@domain.com" required autofocus>
                    </li>
                    <li>
                    <option>
                    <select name="categories" id="categories">
                        <option value="fin">Finance</option>
                        <option value="international">International Students</option>
                        <option value="accommodation">Accommodation</option>
                        <option value="academics">Academic Programmes</option>
                        <option value="other">Other</option>
                    </select>
                    </option>
                    </li>
                    <li>
                        <label for="queries">Query</label>
                        <textarea id="query" name="query" rows="3" required></textarea>
                    </li>
                </ol>
            </ul>
            <button type="submit">Submit</button>
            </form>
        </div>
    </body>
</html>
