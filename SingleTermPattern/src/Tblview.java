

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tblview
 */
@WebServlet("/Tblview")
public class Tblview extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tblview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><head></head><body>");
		printWriter.println("<table>");
		printWriter.println("<tr><th>ID</th><th>NAME</th><th>ACTION</th></tr>");
		System.out.println("connection..");
		Dbconnection dbconnection=Dbconnection.getInstance();
		dbconnection.connectionopen();
		//printWriter.println("<html><body onload=\"alert('Successs')\"></body></html>");
		System.out.println("connection success");
//		String sql = "select * from tbl";
//		ResultSet resultSet=dbconnection.getlist(sql);
//		
//		int Id=0;
//		String Name=null;
//		try {
//			Id = resultSet.getInt("id");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Name=resultSet.getString("name");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			while(resultSet.next())
//			{
//			printWriter.println("<tr><td>"+Id+"</td><td>"+Name+"</td></tr>");	
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		dbconnection.connectionclose();
		printWriter.println("</table>");
		printWriter.println("</body></html>");
			
	}

}
