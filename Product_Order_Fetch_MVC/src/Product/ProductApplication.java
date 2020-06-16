package Product;
public class ProductApplication
{
	
	ProductSearch_Input pInput;
	public ProductApplication()
	{
		pInput=new ProductSearch_Input();
	}
	
	public static void main(String args[])
	{
		System.out.println("-----\bProduct Fetch Application\b-----\n");
		ProductApplication pa=new ProductApplication();
		System.out.println("--*--Accepting Product Price Range--*--\n");
		pa.pInput.accept();
		
	}
	
}
		