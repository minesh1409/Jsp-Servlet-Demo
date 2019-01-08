package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login") //annotation
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		PrintWriter printwriter = response.getWriter();
		printwriter.print("<html>");
		printwriter.print("<head><style>ul li{height:40px; margin:15px 0; list-style:none}.span{display:table; width:100%; font-size:14px;}</style></head>");
		printwriter.print("<div><h2>Sign In</h2></div>");
		printwriter.print("<div><form action='login' method='post'><ul>");
		printwriter.print("<li><span class='un'></span><input type='text' name='txtusername' required placeholder='User Name Or Email'/></li>");
		printwriter.print("<li><span class='un'></span><input type='password' name='txtpassword' required placeholder='User Password'/></li>");
		printwriter.print("<li><input type='submit' value='LOGIN'></li>");
		printwriter.print("<li><div><input type='checkbox'<label>Remember Me</label><a href='#'>Forgot Password?</a></div></li>");
		printwriter.print("</ul></form></div>");
		printwriter.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//System.out.println("haha");
		String un=request.getParameter("txtusername");//fetch value of txtbox
		String pwd=request.getParameter("txtpassword");
		String username="devil", password="angel";
		PrintWriter out = response.getWriter();
		if(un.equals(username)&&pwd.equals(password))
		{
			out.println("<html><body onload=\"alert('Successs')\"></body></html>");
			//System.out.println("succesfully");
		}
		else
		{
			out.println("<html><body onload=\"alert('Note match')\"></form></html>");
			//response.sendRedirect("login");
			//System.out.println("note match");
		}
	}

}
