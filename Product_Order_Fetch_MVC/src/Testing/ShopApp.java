package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Scanner;

import Product.*;

public class ShopApp {

	public static void Add() {
		try {
			Product p = new Product();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
	public static void Psearch()
	{
		ProductSearch_Input pInput = new ProductSearch_Input();
		System.out.println("--*--Accepting Product Price Range--*--\n");
		pInput.accept();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int choice = 1;
		while (choice == 1) {
			System.out.println("------Enter Your Choice------");
			System.out.println("1 for Product Add in Database :");
			System.out.println("2 for Product Search using Given Range :");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				Add();
				break;
			case 2:
				Psearch();
				break;
			}
			System.out.println("Do you want to Continue:(1.Yes / 2.No ) :");
			choice=sc.nextInt();
		}

	}

}
