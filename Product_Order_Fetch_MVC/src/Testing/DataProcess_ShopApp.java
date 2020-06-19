package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;

import Customer.Customer;
import Customer.Customer_Controller;
import Product.Product;
import Product.ProductSearch_Input;
import Product.Product_Controller;

public class DataProcess_ShopApp {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void Psearch()
	{
		ProductSearch_Input pInput = new ProductSearch_Input();
		System.out.println("--*--Accepting Product Price Range--*--\n");
		pInput.accept();
	}
	

}
