package Order;
import java.util.ArrayList;

public class OrdersSearch_Output {
	
	
ArrayList<Orders> aLS;
	
	public OrdersSearch_Output()
	{
		aLS=new ArrayList<Orders>();
		
	}
	
	public void display(ArrayList<Orders> aLP)
	{
		aLS=aLP;
		Orders pp=new Orders();
		if(aLS.size()==1)
		{
			pp=aLS.get(0);
			if(pp.getMessage()!=null)
			{
				System.out.println(pp.getMessage());
			}
			else
			{
				for(int i=0; i<aLP.size(); i++)
				{
					pp=aLP.get(i);
					
					System.out.println(pp.getOrderNo());
					//System.out.println(pp.getOrderDate());
					System.out.println(pp.getCustID());
					System.out.println(pp.getProdCode());
					System.out.println(pp.getQtyPurchased());
					System.out.println(pp.getTotBillAmt());
					//System.out.println(pp.getTransactionID());
					//System.out.println(pp.getPaymentType());
				}
			}
		}
			
		else
		{
			for(int i=0; i<=aLP.size(); i++)
			{
				pp=aLP.get(i);
				
				System.out.println(pp.getOrderNo());
				//System.out.println(pp.getOrderDate());
				System.out.println(pp.getCustID());
				System.out.println(pp.getProdCode());
				System.out.println(pp.getQtyPurchased());
				System.out.println(pp.getTotBillAmt());
				//System.out.println(pp.getTransactionID());
				//System.out.println(pp.getPaymentType());
			}
		
		}


	}

}
