package Order;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

import Customer.Customer;
import Customer.Customer_DAO;
import Product.ProductDAO;

public class OrderPlaced_Input {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void Purchage_Product() {
		try {
			ProductDAO pdo = new ProductDAO();		
			ArrayList<Customer> al= new ArrayList<Customer>();
			String pcode,cid;
			
			System.out.print("Enter Lower Limit:");
			double lcost = Double.parseDouble(br.readLine());
			System.out.print("Enter Upper Limit:");
			double ucost = Double.parseDouble(br.readLine());
			Map<String, Double> a = pdo.searchProduct(lcost, ucost);
			if (a != null) {
				System.out.print("Enter Product Code:");
				pcode = br.readLine();
				if (a.keySet().contains(pcode)) {
					System.out.print("Enter Customer ID:");
					cid = br.readLine();
					Customer_DAO cdo = new Customer_DAO();
					 al=cdo.Search_Customer_DAO(cid);
					if (al.size()!=0 && al.get(0).getMessage()!="Sorry") {
						Orders o = new Orders();
						Date orderDate = Date.valueOf(LocalDate.now());
						System.out.print("Quantity purchase:");
						int qtyPurchased = Integer.parseInt(br.readLine());
						String s = LocalDateTime.now().toString();
						String[] s1 = s.split("T");
						String[] s2 = s1[0].split("-");
						String[] s3 = s1[1].split(":");
						String orderNo = cid.substring(0, 2) + pcode.substring(0, 2) + s2[2] + s2[1]
								+ s3[2].substring(0, 2);
						double totBillAmt = qtyPurchased * a.get(pcode);
						String transactionID = "TNX" + (Math.random() * 10000);
						String paymentType = "CASH ON DELIVERY";
						o.setOrderNo(orderNo);
						o.setOrderDate(orderDate);
						o.setCustID(cid);
						o.setProdCode(pcode);
						o.setQtyPurchased(qtyPurchased);
						o.setTotBillAmt(totBillAmt);
						o.setTransactionID(transactionID);
						o.setPaymentType(paymentType);
						Orders_Controller oc=new Orders_Controller();
						oc.Order_Add(o);
					} else {
						System.out.println("SORRY!!!! No Customer Found");
					}

				} else {
					System.out.println("SORRY!!!! Product code Not found");
				}

			} else {
				System.out.println("SORRY!!!! No product ffound :(");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
