package Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	//Add Customer method
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
	//Search Customer Method
	public ArrayList<Customer> Search_Customer_DAO(String cid)
	{
		ArrayList<Customer> arlist = new ArrayList<Customer>();
		try {
			con=mCon.connect();
			pstate=con.prepareStatement("Select * from Customer where custID=?");
			pstate.setString(1, cid);
			rs=pstate.executeQuery();
			Customer c=new Customer();
			if(rs.next())
			{
				
				c.setCustID(rs.getString(1));
				c.setCustFName(rs.getString(2));
				c.setCustLName(rs.getString(3));
				c.setSex(rs.getString(4));
				c.setContactNo(rs.getLong(5));
				c.setCity(rs.getString(6));
				c.setCountry(rs.getString(7));
				arlist.add(c);
			}
			else
			{
				String msg="Sorry!!!!!! No Customer Found :( ";
				c.setMessage(msg);
				arlist.add(c);
			}
			con.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		return arlist;
		
	}
	

}
