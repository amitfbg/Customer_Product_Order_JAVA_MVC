package Product;
import java.util.*;
public class Product
{
	private String pCode,pName,pCatg;
	private int pWt,qoh;
	private Date mfgDate,expDate;
	private double pCost;
	String message;
	public Product()
	{
		pCode=pName=pCatg=null;
		pWt=qoh=0;
		mfgDate=expDate=null;
		pCost=0.0;
		message=null;
		
	}
	
	//business method
	public ArrayList<Product> processProductData(double lp,double up)
	{
		ArrayList<Product> aList=new ArrayList<Product>();
		ProductDAO pDAO=new ProductDAO();
		aList=pDAO.searchProduct(lp,up);
		
		return aList;
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