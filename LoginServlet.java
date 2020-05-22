import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException,ServletException{
	
		response.setContentType("text/html");
    		PrintWriter out = response.getWriter();

		try{
      			Class.forName("org.postgresql.Driver");
      			Connection con = DriverManager.getConnection(
					"jdbc:postgresql:ty1", "postgres","");

    			String user = request.getParameter("name");
    			String pass = request.getParameter("pass");
   
			PreparedStatement ps = con.prepareStatement("select * from login where login_name=? and password=?");
			ps.setString(1,user);
			ps.setString(2,pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				out.print("<h1>Login Successful.</h1>");
			}
			else{
				out.print("<h1>Login Failed.</h1>");
			}
		}
		catch(Exception e){
			out.print(e);
		}
	}
} 
