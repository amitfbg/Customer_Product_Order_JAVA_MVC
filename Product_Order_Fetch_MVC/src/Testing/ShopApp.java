package Testing;
import java.util.Scanner;

import Product.ProductAdd_Input;



public class ShopApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DataProcess_ShopApp dps=new DataProcess_ShopApp();
		ProductAdd_Input pai=new ProductAdd_Input();
		

		int choice = 1;
		while (choice == 1) {
			System.out.println("------Enter Your Choice------");
			System.out.println("1 for Product Add in Database :");
			System.out.println("2 for Product Search using Given Range :");
			System.out.println("3 for Customer Add in Database : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				pai.Add();
				break;
			case 2:
				dps.Psearch();
				break;
			case 3:
				dps.Customer_add();
				break;
			}
			System.out.println("Do you want to Continue:(1.Yes / 2.No ) :");
			choice=sc.nextInt();
		}
		sc.close();

	}

}
