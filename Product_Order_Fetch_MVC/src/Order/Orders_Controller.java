package Order;
import java.util.ArrayList;

public class Orders_Controller {
	ArrayList<Orders> arrList;
	OrdersSearch_Output pso;
	
	public Orders_Controller()
	{
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
		Orders pd=new Orders();
		arrList=pd.processOrdersData(oId);
		displayData();
		
	}
	public void displayData()
	{
		pso.display(arrList);
	}
	
	public void Order_Add(Orders o) {
		OrdersDAO Odao=new OrdersDAO();
		Odao.OrderAdd(o);
		
	}

}
