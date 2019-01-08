
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dbsmpl")
public class Dbsmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Dbsmpl() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("Loding Driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully.");
			} 
		catch (Exception e1) 
		{
			System.out.println("Failed to Load Driver.");
			e1.printStackTrace();	
		}  
		Connection con;
		
		try {
			System.out.println("Connecting to Database...");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			System.out.println("Connected to Database Successfully");
			con.close();
			} 
		catch (SQLException e) 
		{
			System.out.println("Failed to Close Connection");
			e.printStackTrace();
		}  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
