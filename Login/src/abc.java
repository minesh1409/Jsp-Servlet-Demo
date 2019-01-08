

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class abc
 */
@WebServlet("/hello")
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public abc() {
        super();
        // TODO Auto-generated constructor stub
       // doPost(HttpServletRequest request, HttpServletResponse response);
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("Helloworld");
		//String txt=request.getParameter("txt1");
		//System.out.println(txt);
		doPost(request, response);
		//response.sendRedirect("login");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//System.out.println("Postmethodcall");
		String un=request.getParameter("txtusername");//fetch value of txtbox
		String pwd=request.getParameter("txtpassword");
		String username="devil", password="angel";
		PrintWriter out = response.getWriter();
		if(un.equals(username)&&pwd.equals(password))
		{
			out.println("<html><body onload=\"alert('Successs')\"></body></html>");
		}
		else
		{
			//out.println("<html><body onload=\"alert('Note match')\" ></form></html>");
			//response.sendRedirect("xyz.jsp");
			//out.println("<html>");
			//out.println("<script type=\"text/javascript\">");
		    //out.println("alert('User or password incorrect');");
		    //out.println("</script>");
	        //response.sendRedirect("xyz.jsp");
	        //out.println("</html>"); 
			out.println("<script type=\"text/javascript\">");
			out.println("alert('User or password incorrect');");
		    out.println("location='xyz.jsp';");
	   	    out.println("</script>");
			//request.setAttribute("errorMessage", "Please submit an amount of at least 1");
			//response.sendRedirect("xyz.jsp");
		}
	}

}
