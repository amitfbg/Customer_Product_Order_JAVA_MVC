package Customer;

import java.util.ArrayList;

public class Customer_Controller {
	
	ArrayList<Customer> cusarr = new ArrayList<Customer>();
	CustomerSearch_Output cso=new CustomerSearch_Output();
	
	public void AddCustomer(Customer c)
	{
		Customer_DAO CDAO=new Customer_DAO();
		CDAO.Add_Customer_DAO(c);
	}
	
	public void SearchCustomer(String cid)
	{
		
		Customer_DAO CDAO=new Customer_DAO();
		cusarr=CDAO.Search_Customer_DAO(cid);
		Display_Searched_Customer();
		
	}
	
	public void Display_Searched_Customer() {
		cso.Display(cusarr);
		
		
	}

}
