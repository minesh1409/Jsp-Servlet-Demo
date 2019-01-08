import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");  
//here sonoo is database name, root is username and password  
//Statement stmt=con.createStatement();  
//ResultSet rs=stmt.executeQuery("select * from tbl");  
//while(rs.next())  
//System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
System.out.println("connection success");
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}
