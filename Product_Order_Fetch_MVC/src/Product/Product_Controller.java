package Product;
import java.util.*;

public class Product_Controller
{
	ArrayList<Product> arrList;//initializing variable arrlist of type Product	
	ProductSearch_Output pso; //Initializing variable of type ProductSearch_Output
	
	//constructor 
	public Product_Controller()
	{
		arrList=new ArrayList<Product>(); //Object creation of ArrayList of type Product
		pso=new ProductSearch_Output();   //Object Creation of ProductSearch_Output
	}
	//Getter and Setter Method
	public ArrayList<Product> getArrList() {
		return arrList;
	}
	public void setArrList(ArrayList<Product> arrList) {
		this.arrList = arrList;
	}
	
	//Method for adding product which takes Product object as argument 
	// inside this creating object of ProductDAO class which has AddProduct method which adds the product to database
	public void addProductController(Product pd)
	{
		ProductDAO pDAO=new ProductDAO();
		pDAO.AddProduct(pd);
	}
	//Accept method for input price range
	//inside this Product object is initialized and then the processProductData method which takes price ranges as argument is called
	//then displayData method is called
	public void acceptData(double lPrice,double uPrice)
	{
		Product pd =new Product();
		arrList=pd.processProductData(lPrice,uPrice);
		displayData();
		
	}
	//displayData method in this ProductSearch_Output() class display method is invoked which takes arrList object as argument
	public void displayData()
	{
		pso.display(arrList);
	}



	
	
	
}