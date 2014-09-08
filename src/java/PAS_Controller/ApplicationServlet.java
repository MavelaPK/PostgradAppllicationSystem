
package PAS_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PAS_Model.DataAccess;
/**
 *
 * @author lindelani
 */
@WebServlet(name = "ApplicationServlet", urlPatterns = {"/ApplicationServlet"})
public class ApplicationServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        /*Access data from the form*/
        String title = request.getParameter("title");
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        String primaryPhone = request.getParameter("primaryPhone");
        String cellphone = request.getParameter("cellphone");
        String email = request.getParameter("email");
        String race = request.getParameter("race");
        String dateOfBirth = request.getParameter("dob");
        String idNumber = request.getParameter("id");
        String citizen = request.getParameter("citizen");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String postCode = request.getParameter("postcode");
        String studentNo = request.getParameter("studentNo"); 
        
        DataAccess dataAccess =new DataAccess();
        
        int status = dataAccess.addStudent(firstName, middleName, lastName, 
                             studentNo, primaryPhone, cellphone, email, country, 
                             city,postCode, race,dateOfBirth,gender,title,idNumber);
        
        /*check student data is inserted to database*/ 
        if(status ==0){
          /*direct to success page*/
            out.println("<script>alert('Submission Successful')</script>");
            response.setHeader("refresh","3;URL=studentApplication.html" );
        }else if (status==0){
          /*direct to unsuccessful page*/
            out.println("<script>alert('Submission Failed')</script>");
            response.setHeader("refresh","3;URL=studentApplication.html" );
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
