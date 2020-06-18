package Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database_Connection.MyConnection;

public class Customer_DAO {
	
	Connection con; // con is a variable of Connection type
	PreparedStatement pstate;  // pstat is a variable of PreparedStatement type
	ResultSet rs; // rs is a variable of ResultSet
	MyConnection mCon; //object declared of MyConnection Class
	
	//Constructor
	public Customer_DAO()
	{
		con=null;
		pstate=null;
		rs=null;
		mCon=new MyConnection();//object creation of MyConnection
	}
	
	public void Add_Customer_DAO(Customer c)
	{
		try {
			con=mCon.connect();
			pstate=con.prepareStatement("insert into Customer values(?,?,?,?,?,?,?)");
			pstate.setString(1, c.getCustID());
			pstate.setString(2,c.getCustFName());
			pstate.setString(3,c.getCustLName());
			pstate.setString(4,c.getSex());
			pstate.setLong(5,c.getContactNo());
			pstate.setString(6,c.getCity());
			pstate.setString(7,c.getCountry());
			int row=pstate.executeUpdate();
			if(row!=0) {
				System.out.println("Inserted");
			}
			else {
				System.out.println("Not Inserted");
			}
			con.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
		}
	

}
