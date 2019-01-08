/**
` * Feb 18, 2017 1:23:16 PM
 */
package Model;


import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.dbcon;
import pojo.Pojo;

/**
 * @author ASUS
 *
 */
public class TblModel {

	
	
	public void delete(String id)
	{
		dbcon dbcon1 = dbcon.getinstance();
		dbcon1.openconnection();
		String sql = "delete from tbl where id="+id;
		dbcon1.statementexecuteupdate(sql);
		dbcon1.connectionclose();
		
		
	}
	
	public Pojo edit(String id) 
	{
		Pojo pojo = new Pojo();
		 try {
		dbcon dbcon1 = dbcon.getinstance();
		dbcon1.openconnection();
//		String sql ="update tbl set name='"++"' where id="+id;
//		dbcon1.statementexecuteupdate(sql);
//		dbcon1.connectionclose();
		String sql = "select * from tbl where id="+id;
        ResultSet resultSet= dbcon1.executequery(sql);
       //try {
			while(resultSet.next())
			{
			    pojo.setId(resultSet.getInt(1));
			    pojo.setName(resultSet.getString(2));
			}
			dbcon1.connectionclose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //dbcon1.connectionclose();
   
    return  pojo;
	}
	

	/**
	 * @param pojo
	 */
	public void update(Pojo pojo) 
	{
		// TODO Auto-generated method stub
		dbcon dbcon1 = dbcon.getinstance();
		dbcon1.openconnection();
		String sql = "update tbl set name='"+pojo.getName()+"' where id="+pojo.getId();
		dbcon1.statementexecuteupdate(sql);
		dbcon1.connectionclose();
	}
	
	public void insert(Pojo pojo)
	{
		dbcon dbcon1 = dbcon.getinstance();
		dbcon1.openconnection();
		String sql="insert into tbl(name) values('"+pojo.getName()+"')";
		dbcon1.statementexecuteupdate(sql);
		dbcon1.connectionclose();
	}

}
