package Product;
import java.util.*;
public class Product
{
	//Variables Declared
	private String pCode,pName,pCatg;
	private int pWt,qoh;
	private Date mfgDate,expDate;
	private double pCost;
	String message;
	//Constructor to initialize the variables
	public Product()
	{
		pCode=pName=pCatg=null;
		pWt=qoh=0;
		mfgDate=expDate=null;
		pCost=0.0;
		message=null;
		
	}
	
	//Method where the price range for Product is processed for further functionality
	public ArrayList<Product> processProductData(double lp,double up)
	{
		ArrayList<Product> aList=new ArrayList<Product>();//Initializing the ArrayList so that the processed data can be stored
		ProductDAO pDAO=new ProductDAO(); //Object Creation for ProductDAO class so that we can call the search method which uses database connectivity
		aList=pDAO.searchProduct(lp,up); // searchProduct method of class ProductDAO is called and the data is stored in the arraylist object.
		
		return aList; // finally we are returning the arraylist
	}

	//Getter and Setter Methods
	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCatg() {
		return pCatg;
	}

	public void setpCatg(String pCatg) {
		this.pCatg = pCatg;
	}

	public int getpWt() {
		return pWt;
	}

	public void setpWt(int pWt) {
		this.pWt = pWt;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public double getpCost() {
		return pCost;
	}

	public void setpCost(double pCost) {
		this.pCost = pCost;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}