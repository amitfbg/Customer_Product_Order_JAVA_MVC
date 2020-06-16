package Product;
import java.util.*;
public class ProductSearch_Input
{
	double lPrice,uPrice;
	Scanner sc;
	Product_Controller pc;
	public ProductSearch_Input()
	{
		lPrice=uPrice=0;
		sc=new Scanner(System.in);
		pc=new Product_Controller();
	}
	
	public void accept()
	{
		System.out.println("ENTER THE LOWER PRICE RANGE");
		lPrice=sc.nextDouble();
		System.out.println("ENTER THE UPPER PRICE RANGE");
		uPrice=sc.nextDouble();
		pc.acceptData(lPrice,uPrice);
	}
	
}