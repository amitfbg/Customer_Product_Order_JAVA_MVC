package Customer;

import java.util.ArrayList;

public class CustomerSearch_Output {
	
	public void Display(ArrayList<Customer> aLC) {
		Customer cc=new Customer();
		cc=aLC.get(0);
		if(cc.getMessage()!=null) {
			System.out.println(cc.getMessage());
		}
		else
		{
			System.out.println("-------------CUSTOMER DETAILS------------------------");
			System.out.println("CustID : "+cc.getCustID());
			System.out.println("Customer First Name : "+cc.getCustFName());
			System.out.println("Customer Last Name : "+cc.getCustLName());
			System.out.println("Sex : "+cc.getSex());
			System.out.println("Contact No : "+cc.getContactNo());
			System.out.println("City : "+cc.getCity());
			System.out.println("Country : "+cc.getCountry());
		}
		
	}

}
