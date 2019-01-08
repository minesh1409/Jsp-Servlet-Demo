package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.TblModel;
import pojo.Pojo;

/**
 * Servlet implementation class TblController
 */
@WebServlet("/TblController")
public class TblController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TblController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String id= request.getParameter("id");
		//String name =request.getParameter("name");
		String action = request.getParameter("actionButton");
		TblModel tblModel = new TblModel();
//		PrintWriter printWriter = response.getWriter();
		//String edit =request.getParameter("editButton");
//		String insert=null;
		if(action.equals("Delete"))
		{
			String id= request.getParameter("id");
//			printWriter.println("<html><body onload=\"alert('Successs')\"></body></html>");
			System.out.println("Deleting data");
//			TblModel tblModel = new TblModel();
			tblModel.delete(id);
			response.sendRedirect("databasedemo.jsp");
		}
		else if(action.equals("Edit"))
		{
			String id= request.getParameter("id");
			System.out.println("Editing call");
			Pojo pojo = tblModel.edit(id);
			request.setAttribute("key", pojo);
			System.out.println("pojo passed now request:::"+pojo.getId()+"::name::"+pojo.getName());
			RequestDispatcher dispatcher = request.getRequestDispatcher("Update.jsp");
            dispatcher.forward(request, response);
//			printWriter.print("<html> <body><form>");
//			//printWriter.println("<input type='text' name='name' value='<%= resultSet.getString(2) %>'/>");
//			printWriter.println("<input type='text' name='name' value='"+name+"'");
//			printWriter.print("</form></body> </html>");
//			TblModel tblModel=new TblModel();
//			tblModel.edit(id, name);
//			response.sendRedirect("databasedemo.jsp");
		}
		else if(action.equals("Update"))
		{
			//String id= request.getParameter("id");
			System.out.println("update caal");
			Pojo pojo =  new Pojo();
			//pojo.setName(name);
			pojo.setName(request.getParameter("txtname"));
			pojo.setId(Integer.parseInt(request.getParameter("txtid")));
			tblModel.update(pojo);
			response.sendRedirect("databasedemo.jsp");
		}
		else if(action.equals("Add"))
		{
			System.out.println("Inserting Data");
//			TblModel tblModel=new TblModel();
			String id= request.getParameter("id");
			Pojo pojo=tblModel.edit(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Update.jsp");
            dispatcher.forward(request, response);
			pojo.setName(request.getParameter("txtname"));
			tblModel.insert(pojo);
			response.sendRedirect("databasedemo.jsp");
		}
	}

}
