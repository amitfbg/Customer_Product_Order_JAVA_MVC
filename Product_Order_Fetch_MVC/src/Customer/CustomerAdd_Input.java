package Customer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//This class is first called to take the user input and the input data is then set to Customer class(which is model)
//then controller class is called which process the data by calling DAO where the data is accessed and then the data is set to the databse
public class CustomerAdd_Input {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void Customer_add() {
		try {
			Customer cadd = new Customer();
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
				sex = br.readLine();
				if (!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female")) {
					System.out.println("Wrong Input !!!  Try Again with valid Input");
				}
			} while (!sex.equalsIgnoreCase("Male") && !sex.equalsIgnoreCase("Female"));
			cadd.setSex(sex);
			System.out.println("Enter the phone number of Customer : ");
			cadd.setContactNo(Long.parseLong(br.readLine()));
			System.out.println("Enter the City Details of Customer : ");
			cadd.setCity(br.readLine());
			String country;
			do {
				System.out.println("Enter the Country Details of Customer :(India) ");
				country = br.readLine();
				if (!country.equalsIgnoreCase("india")) {
					System.out.println("Wrong Entry!!! Enter Valid Details");
				}
			} while (!country.equalsIgnoreCase("india"));
			cadd.setCountry(country);

			Customer_Controller ccon = new Customer_Controller();
			ccon.AddCustomer(cadd);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
