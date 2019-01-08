/**
 * Feb 18, 2017 10:59:16 AM
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ASUS
 *
 */
public class dbcon {

	private dbcon() {

	}

	static dbcon dbc = null;

	public static dbcon getinstance() {
		if (dbc == null) {
			dbc = new dbcon();
		}
		return dbc;
	}

	public void msg() {
		System.out.println("Hello");
	}
	
	Connection connection;
	Statement statement;
	public void openconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void connectionclose()
	{
		try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public int statementexecuteupdate(String sql) //change from alter to statementexecuteupdate
	{
		int a=0;
		try {
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a;
	}
	
	public ResultSet executequery(String list) //change from show to statementexecutequery
	{
		ResultSet resultSet=null;
		try {
			resultSet=statement.executeQuery(list);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return resultSet;
	}
}
