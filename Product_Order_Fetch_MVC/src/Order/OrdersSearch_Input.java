package Order;
import java.util.Scanner;

public class OrdersSearch_Input {
	
	String cID;
	Scanner sc;
	Orders_Controller pc;
	public OrdersSearch_Input()
	{
		cID=null;
		sc=new Scanner(System.in);
		pc=new Orders_Controller();
	}
	
	public void accept()
	{
		System.out.println("ENTER THE CUSTOMER ID:");
		cID=sc.nextLine();		
		pc.acceptData(cID);
	}

}
