
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author ASUS
 *
 */


public class Dbconnection 
{
	
	/**
	 * @param args
	 */
	private static Dbconnection dbconnection = null;
	
	private Dbconnection()
	{
		
	}
	
	public static Dbconnection getInstance()
	{
		 if (dbconnection == null)
		 {  
	            dbconnection = new Dbconnection();
		 }
		 return dbconnection;
	}
	
	
	
	Connection connection = null;
	Statement statement=null;
	
	public boolean connectionopen()
	{
		boolean isconnection=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Connection connection = null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Statement statement=null;
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(connection!=null) 
		{
			isconnection=true;
		} 
		return isconnection;
	}
	
	public void connectionclose()
	{
		if (connection!=null)
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	 public ResultSet getlist(String query)
	    {
	        ResultSet resultset=null;
	        try {
				resultset = statement.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return resultset;
	        
	    }
	    
	    public int getOperation(String query)
	    {
	        
	        int a=0;
	        try {
				a=statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return a;
	    }
		
}
