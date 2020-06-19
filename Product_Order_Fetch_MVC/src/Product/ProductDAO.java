package Product;
import java.util.*;

import Database_Connection.MyConnection;

import java.sql.*;
import java.sql.Date;
public class ProductDAO
{
	Connection con; // con is a variable of Connection type
	PreparedStatement pstat;  // pstat is a variable of PreparedStatement type
	ResultSet rs; // rs is a variable of ResultSet
	MyConnection mCon; //object declared of MyConnection Class
	Product p[]; // initializing an array of Product type
	
	//Constructor
	public ProductDAO()
	{
		con=null;
		pstat=null;
		rs=null;
		mCon=new MyConnection();//object creation of MyConnection
	}
	
	//AddProduct method which at first makes the connection with database
	//After SuccessFul connection it will insert data into Product Table of database
	public void AddProduct(Product p)
	{
		try {
			con=mCon.connect(); //creating the connection to database
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
	
	//searchProduct method which takes the price range as input and stores the output in arrayList 
	//we use arraylist as we know that they may be more than 1 product
	public Map<String,Double> searchProduct(double lp,double up)
	{
		Map<String,Double> a=null;
		try
		{
			con=mCon.connect();
			
			pstat=con.prepareStatement("select * from Product where cost>=? and cost<=?");
			pstat.setDouble(1,lp);
			pstat.setDouble(2,up);
			rs=pstat.executeQuery();
			
			
			if(rs.next()) {
				a=new HashMap<String,Double>();
				do {
					
					System.out.println("---------------AVAILABE PRODUCT DETAILS----------------------");
					System.out.println("Product No:"+(a.size()+1));
					String pcode=rs.getString(1);
					System.out.println("Product Code:"+pcode);
					System.out.println("Product Name:"+rs.getString(2));
					System.out.println("Product Weight:"+rs.getInt(3));
					System.out.println("Product Category:"+rs.getString(4));
					System.out.println("MFG Date:"+rs.getDate(5));
					System.out.println("Exp Date:"+rs.getDate(6));
					double co=rs.getDouble(7);
					System.out.println("Cost:"+co);
					System.out.println("-------------------------------------");
					a.put(pcode, co);
				}while(rs.next());
			}
			else {
				System.out.println("No Record found");
				a=null;
			}
			return a;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
			
			
			
			/*p=new Product[100];// array of Product is declared
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
				p[ctr1].setMessage(msg);
				arList.add(p[ctr1]);
			}
			con.close();
			
				
		}
		catch(Exception e)
		{
			System.out.println("Unabele to fetch");
		} */
		//return arList;
	}
}