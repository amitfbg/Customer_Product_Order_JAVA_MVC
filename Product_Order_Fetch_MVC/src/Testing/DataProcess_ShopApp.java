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
	
	public void Add() {
		try {
			Product p = new Product();
			System.out.print("Enter Product Code :");
			String prodCode = br.readLine();
			System.out.print("Enter Product Name :");
			String prodName = br.readLine();
			int prodWeight;
			do {
				System.out.print("Enter Product Weight :");
				prodWeight = Integer.parseInt(br.readLine());
				if (prodWeight < 0)
					System.out.println("Wrong entry,Try Again");
			} while (prodWeight < 0);
			System.out.print("Enter Product Category :");
			String prodCategory = br.readLine();
			System.out.print("Enter MFG date (YYYY-MM-DD):");
			Date mfgDate = Date.valueOf(br.readLine());
			System.out.print("Enter Expire date (YYYY-MM-DD) :");
			Date expDate = Date.valueOf(br.readLine());
			double cost;
			do {
				System.out.print("Enter Product Cost :");
				cost = Double.parseDouble(br.readLine());
				if (cost <= 0)
					System.out.println("Wrong entry,Try Again");
			} while (cost <= 0);
			p.setpName(prodName);
			p.setpCode(prodCode);
			p.setExpDate(expDate);
			p.setMfgDate(mfgDate);
			p.setpCatg(prodCategory);
			p.setpWt(prodWeight);
			p.setpCost(cost);
			p.setQoh(0);
			Product_Controller pc = new Product_Controller();
			pc.addProductController(p);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void Psearch()
	{
		ProductSearch_Input pInput = new ProductSearch_Input();
		System.out.println("--*--Accepting Product Price Range--*--\n");
		pInput.accept();
	}
	public void Customer_add()
	{
		try {
		Customer cadd=new Customer();
		System.out.println("--*--Accepting Customer Details--*--\n");
		System.out.println("Enter Customer ID : ");
		cadd.setCustID(br.readLine());
		System.out.println("Enter Customer First Name : ");
		cadd.setCustFName(br.readLine());
		System.out.println("Enter Customer Last Name : ");
		cadd.setCustLName(br.readLine());
		String sex;
		do {
		System.out.println("Enter Sex of Customer (Male or Female) : ");
		sex=br.readLine();
		if(!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female") )
		{
			System.out.println("Wrong Input !!!  Try Again with valid Input");
		}
		}while(!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female"));
		cadd.setSex(sex);
		System.out.println("Enter the phone number of Customer : ");
		cadd.setContactNo(Long.parseLong(br.readLine()));
		System.out.println("Enter the City Details of Customer : ");
		cadd.setCity(br.readLine());
		String country;
		do {
		System.out.println("Enter the Country Details of Customer :(India) ");
		country=br.readLine();
		if(!country.equalsIgnoreCase("india"))
		{
			System.out.println("Wrong Entry!!! Enter Valid Details");
		}
		}while(!country.equalsIgnoreCase("india"));
		cadd.setCountry(country);
		//customer COntroller object
		Customer_Controller ccon=new Customer_Controller();
		ccon.AddCustomer(cadd);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
