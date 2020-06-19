package Customer;

import java.util.Scanner;

public class CustomerSearch_Input {
	String cid;
	Customer_Controller cc;
	Scanner sc;

	public CustomerSearch_Input() {
		cid = null;
		cc = new Customer_Controller();
		sc = new Scanner(System.in);
	}
	
	public void accept()
	{
		System.out.println("Enter the Customer ID : ");
		cid=sc.nextLine();
		cc.SearchCustomer(cid);
	}

}
