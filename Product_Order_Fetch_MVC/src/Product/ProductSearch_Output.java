package Product;
import java.util.*;
public class ProductSearch_Output
{
	ArrayList<Product> aLS;
	
	public ProductSearch_Output()
	{
		aLS=new ArrayList<Product>();
		
	}
	
	public void display(ArrayList<Product> aLP)
	{
		aLS=aLP;
		Product pp=new Product();
		if(aLS.size()==1)
		{
			pp=aLS.get(0);
			if(pp.getMessage()!=null)
			{
				System.out.println(pp.getMessage());
			}
			else
			{
				for(int i=0; i<aLP.size(); i++)
				{
					pp=aLP.get(i);
					System.out.println("\n");
					System.out.println("-------Product Details--------");
					System.out.println(pp.getpCode());
					System.out.println(pp.getpName());
					System.out.println(pp.getpCatg());
					System.out.println(pp.getpWt());
					System.out.println(pp.getMfgDate());
					System.out.println(pp.getExpDate());
					System.out.println(pp.getpCost());
					System.out.println("--------------------------");
				}
			}
		}
			
		else
		{
			for(int i=0; i<aLP.size(); i++)
			{
				pp=aLP.get(i);
				System.out.println("\n");
				System.out.println("-------Product Details--------");
				System.out.println(pp.getpCode());
				System.out.println(pp.getpName());
				System.out.println(pp.getpCatg());
				System.out.println(pp.getpWt());
				System.out.println(pp.getMfgDate());
				System.out.println(pp.getExpDate());
				System.out.println(pp.getpCost());
				System.out.println("--------------------------");
			}
		
		}


	}
}