
package PAS_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import myBean.Student; 

/**
 *
 * @author lindelani
 */


public class DataAccess {

private Connection conn= null;
private Statement st= null;
private ResultSet rst = null;

/*connection parameter*/
private String db_user ="root";
private String db_password ="vendaboy";
private String db_url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
private String db_driver ="com.mysql.jdbc.Driver";
private String sql;
private int result=2;
/*Connect to database server*/


/*Add student data to database*/
public int addStudent(String fName,String mName,String lName,String sNum
                      ,String pPhone,String cPhone,String email,String country,
                      String city,String pCode,String race,String dob,String gender,
                      String title,String idNumber){
    
    /*@sql, prepare query string */ 
    String sql;
    sql="insert into student(firstName,middleName,lastName,studentNumber," +
"          primaryPhone,cellphone,email,country,city,postCode,race,dateOfBirth," +
"            gender,title,idNumber)values('lindelani','lani','nemadzivhanani'" +
"            ,'nmdlin001','0720665007','0216504458','nema@gmail.com','South Africa'" +
"            ,'Cape town','02451','african','1990','male'" +
"            ,'mr','9089211225');";
    
    
        /*Establish database connection*/
      
    try{
         Class.forName(db_driver);
         conn= DriverManager.getConnection(db_url,db_user,db_password);
         st =conn.createStatement();
         
       rst =  st.executeQuery("select * from student");
       rst.close();
       
    }catch(Exception e){
    
      }
        /*prepare statement connection*/
        /*Execute statement*/
        
        /*if(result!=0){
          return 1;
        }
        else if(result==0){
          return 0;//no data added to database
        }
       
       }catch(Exception e){
         e.printStackTrace();
       }
        
       finally{
          /*close connection
          this.closeConnection();
       }*/
    
  return result;
}
    
public void closeConnection(){

   if(conn!=null){
      try{
      conn.close();
      conn=null;
      }catch(SQLException e){
      }
   }
}
}
