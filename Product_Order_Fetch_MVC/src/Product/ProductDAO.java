package Product;
import java.util.*;

import Database_Connection.MyConnection;

import java.sql.*;
import java.sql.Date;
public class ProductDAO
{
	Connection con;
	PreparedStatement pstat;
	ResultSet rs;
	MyConnection mCon;
	Product p[];
	
	public ProductDAO()
	{
		con=null;
		pstat=null;
		rs=null;
		mCon=new MyConnection();
	}
	
	public void AddProduct(Product p)
	{
		try {
			con=mCon.connect();
			pstat=con.prepareStatement("insert into Product values(?,?,?,?,?,?,?)");
			pstat.setString(1, p.getpCode());
			pstat.setString(2,p.getpName());
			pstat.setInt(3, p.getpWt());
			pstat.setString(4, p.getpCatg());
			pstat.setDate(5, (Date) p.getMfgDate());
			pstat.setDate(6, (Date) p.getExpDate());
			pstat.setDouble(7, p.getpCost());
			int row=pstat.executeUpdate();
			if(row!=0) {
				System.out.println("Database Inserted:Sucess");
			}
			else {
				System.out.println("Database Inserted:failure");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<Product> searchProduct(double lp,double up)
	{
		ArrayList<Product> arList=new ArrayList<Product>();
		try
		{
			con=mCon.connect();
			
			pstat=con.prepareStatement("select * from Product where cost>=? and cost<=?");
			pstat.setDouble(1,lp);
			pstat.setDouble(2,up);
			rs=pstat.executeQuery();
			
			p=new Product[100];
			for(int i=0; i<100; i++)
			{
				p[i]=new Product();
			}
			int ctr=0;

			
			if(rs.next())
			{
				do
				{
					p[ctr].setpCode(rs.getString(1));
					p[ctr].setpName(rs.getString(2));
					p[ctr].setpWt(rs.getInt(3));
					p[ctr].setpCatg(rs.getString(4));
					p[ctr].setMfgDate(rs.getDate(5));
					p[ctr].setExpDate(rs.getDate(6));
					p[ctr].setpCost(rs.getDouble(7));
					//p.setQoh(rs.getInt(8));
					arList.add(p[ctr]);
					ctr++;
				}
				while(rs.next());
			}
			else
			{
				int ctr1=0;
				String msg="---NO PRODUCT FOUND---";
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