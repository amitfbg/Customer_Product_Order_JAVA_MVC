package Order;
import java.util.ArrayList;

public class Orders_Controller {
	ArrayList<Orders> arrList;
	Orders pd;
	OrdersSearch_Output pso;
	public Orders_Controller()
	{
		pd=new Orders();
		arrList=new ArrayList<Orders>();
		pso=new OrdersSearch_Output();
	}
	
	public ArrayList<Orders> getArrList() {
		return arrList;
	}
	public void setArrList(ArrayList<Orders> arrList) {
		this.arrList = arrList;
	}	
	
	public void acceptData(String oId)
	{
		arrList=pd.processOrdersData(oId);
		displayData();
		
	}
	public void displayData()
	{
		pso.display(arrList);
	}

}
