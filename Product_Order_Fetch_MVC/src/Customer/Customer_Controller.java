package Customer;

public class Customer_Controller {
	
	public void AddCustomer(Customer c)
	{
		Customer_DAO CDAO=new Customer_DAO();
		CDAO.Add_Customer_DAO(c);
	}

}
