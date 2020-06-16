package Product;
import java.util.*;

public class Product_Controller
{
	ArrayList<Product> arrList;
	
	ProductSearch_Output pso;
	//constructor
	public Product_Controller()
	{
		arrList=new ArrayList<Product>();
		pso=new ProductSearch_Output();
	}
	//Getter and Setter Method
	public ArrayList<Product> getArrList() {
		return arrList;
	}
	public void setArrList(ArrayList<Product> arrList) {
		this.arrList = arrList;
	}	
	//Method for adding product
	public void addProductController(Product pd)
	{
		ProductDAO pDAO=new ProductDAO();
		pDAO.AddProduct(pd);
	}
	//Accept method for price input
	public void acceptData(double lPrice,double uPrice)
	{
		Product pd =new Product();
		arrList=pd.processProductData(lPrice,uPrice);
		displayData();
		
	}
	public void displayData()
	{
		pso.display(arrList);
	}



	
	
	
}