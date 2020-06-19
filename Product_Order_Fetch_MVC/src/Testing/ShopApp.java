package Testing;
import java.util.Scanner;

import Customer.CustomerAdd_Input;
import Customer.CustomerSearch_Input;
import Product.ProductAdd_Input;



public class ShopApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataProcess_ShopApp dps=new DataProcess_ShopApp();
		ProductAdd_Input pai=new ProductAdd_Input();
		CustomerAdd_Input cai=new CustomerAdd_Input();
		CustomerSearch_Input csi=new CustomerSearch_Input();
		

		int choice = 1;
		while (choice == 1) {
			System.out.println("------Enter Your Choice------");
			System.out.println("1 for Product Add in Database :");
			System.out.println("2 for Product Search using Given Range :");
			System.out.println("3 for Customer Add in Database : ");
			System.out.println("4 for Customer Search :");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				pai.Add();
				break;
			case 2:
				dps.Psearch();
				break;
			case 3:
				cai.Customer_add();
				break;
			case 4:
				csi.accept();
				break;
				
			}
			System.out.println("Do you want to Continue:(1.Yes / 2.No ) :");
			choice=sc.nextInt();
		}
		sc.close();

	}

}
