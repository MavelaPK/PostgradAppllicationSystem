<%-- 
    Document   : applicationform
    Created on : 14 Aug 2014, 12:51:26 AM
    Author     : lindelani
--%>

<%@page language ="java" import ="java.sql.*;" %>
 <% 
          String driver  = "com.mysql.jdbc.Driver";
          Class.forName(driver);
          
          Connection con= null;
          ResultSet rst= null;
          Statement st = null;
          
          try{
               String url = "jdbc:mysql://localhost:3306/pag";
               
               con = DriverManager.getConnection(url,"root","Precious727");
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
          
       
    %>

 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/studentApplication.css">
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
        
        <form id="application" method="POST">
            <fieldset>
                <legend>Personal Details</legend>
                <ol>
                    <li>
                        <label for="title">Title</label>
                    <select name="title" id="title">
                        <option value="mr">Mr</option>
                        <option value="mrs">Mrs</option>
                        <option value="ms">Ms</option>
                        <option value="miss">Miss</option>
                    </select> 
                    </li>
                    <li>
                        <label for="firstName">First Name</label>
                        <input id="firstName" name="firstName" type="text" placeholder="First Name" required autofocus>
                    </li>
                    <li>
                        <label for="middleName">Middle Name</label>
                        <input id="middleName" name="middleName" type="text" placeholder="Middle Name">
                    </li> 
                    <li>
                        <label for="lastName">Last Name</label>
                        <input id="lastName" name="lastName" type="text" placeholder="Last Name" required>
                    </li>
                    <li>
                        <label for="gender">Gender</label>
                     <select name="gender" id="gender">
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select> 
                    </li>
                    <li>
                        <label for="primaryPhone">Primary Number</label>
                        <input id="primaryPhone" name="primaryPhone" type="tel" placeholder="Eg. +126214356" required>
                    </li>
                    <li>
                        <label for="cellPhone">Cellphone Number</label>
                        <input id="cellPhone" name="cellPhone" type="tel" placeholder="Eg. +726349338">
                    </li>
                    <li>
                        <label for="email">Email</label>
                        <input id="email" name="email" type="email"  placeholder="example@domain.com" required>
                    </li>
                    <li>
                        <label for="popGroup">Population Group</label>
                     <select name="race" id="race">
                        <option value="afr">African</option>
                        <option value="white">White</option>
                        <option value="asian">Asian</option>
                        <option value="indian">Indian</option>
                        <option value="coloured">Coloured</option>
                        <option value="n/a">N/A</option>
                    </select> 
                    </li>
                    <li>
                        <label for="dob">Date of Birth</label>
                        <input id="dob" name="dob" type="date" required>
                    </li>
                     <li>
                        <label for="id">ID/Passport Number</label>
                        <input id="id" name="id" type="number" required>
                    </li>
                    <li>
                        <label for="citizenship">Citizenship</label>
                     <select name="citizen" id="citizen">
                        <option value="sa">SA Citizen</option>
                        <option value="international">International</option>
                    </select> 
                    </li>
                    <li>
                        <label for="address">Address</label>
                        <textarea id="address" name="address" rows=3 required></textarea>
                    </li>
                    <li>
                        <label for="city">City</label>
                        <input id="city" name="city" type="text" required>
                    </li>
                    <li>
                        <label for="country">Country</label>
                        <input id="country" name="country" type="text" required>
                    </li>
                    <li>
                        <label for="postcode">Postal Code</label>
                        <input id="postcode" name="postcode" type="text" required>
                    </li>
                </ol>
            </fieldset>
            
            <button type="submit">Submit</button>
        </form>
    </body>
    
    
</html>
