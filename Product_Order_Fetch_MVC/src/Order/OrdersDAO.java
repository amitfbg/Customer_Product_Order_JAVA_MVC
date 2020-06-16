package Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Database_Connection.MyConnection;

public class OrdersDAO {
	
	Connection con;
	PreparedStatement pstat;
	ResultSet rs;
	MyConnection mCon;
	Orders p[];
	
	public OrdersDAO()
	{
		con=null;
		pstat=null;
		rs=null;
		mCon=new MyConnection();
	}	
	
	public ArrayList<Orders> searchOrders(String oId)
	{
		ArrayList<Orders> arList=new ArrayList<Orders>();
		try
		{
			con=mCon.connect();
			
			pstat=con.prepareStatement("select c.custFName,c.custLName,c.custID,o.orderNo,o.prodCode from Customer c join Orders o on c.custID=o.custID where o.custID=?");
			pstat.setString(1,oId);
			rs=pstat.executeQuery();
			
			p=new Orders[100];
			for(int i=0; i<100; i++)
			{
				p[i]=new Orders();
			}
			int ctr=0;

			
			if(rs.next())
			{
				do
				{
					p[ctr].setOrderNo(rs.getString(1));
					//p[ctr].setOrderDate(rs.getDate(2));
					p[ctr].setCustID(rs.getString(2));
					p[ctr].setProdCode(rs.getString(3));
					p[ctr].setQtyPurchased(rs.getString(4));
					p[ctr].setTotBillAmt(rs.getString(5));
					//p[ctr].setTransactionID(rs.getString(7));
					//p[ctr].setPaymentType(rs.getString(8));
					arList.add(p[ctr]);
					ctr++;
				}
				while(rs.next());
			}
			else
			{
				int ctr1=0;
				String msg="---NO ORDER DETAILS FOUND---";
				p[ctr].setMessage(msg);
				arList.add(p[ctr1]);
			}
			con.close();
			
				
		}
		catch(Exception e)
		{
			System.out.println("Unabele to fetch");
		}
		return arList;
	}

}
