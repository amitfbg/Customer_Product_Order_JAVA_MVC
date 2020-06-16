package Database_Connection;
import java.sql.*;
public class MyConnection
{
	Connection con;
	public MyConnection()
	{
		con=null;
	}
	public Connection connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/office","root","password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}