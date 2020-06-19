package Order;


import java.util.ArrayList;
import java.util.Date;
public class Orders
{
	private String orderNo,custID,prodCode,paymentType,transactionID;
	private Date orderDate;
	private double totBillAmt;
	private int qtyPurchased;
	String message;
	
	//constructor 
	public Orders()
	{
		orderNo=custID=prodCode=transactionID=paymentType=null;
		orderDate=null;
		message=null;
		qtyPurchased=0;
		totBillAmt=0.0;
		
	}
	
	//Getter and Setter Methods
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public int getQtyPurchased() {
		return qtyPurchased;
	}

	public void setQtyPurchased(int qtyPurchased) {
		this.qtyPurchased = qtyPurchased;
	}

	public double getTotBillAmt() {
		return totBillAmt;
	}

	public void setTotBillAmt(double totBillAmt) {
		this.totBillAmt = totBillAmt;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	// business method
	public ArrayList<Orders> processOrdersData(String oId) {
		ArrayList<Orders> aList = new ArrayList<Orders>();
		OrdersDAO ODAO = new OrdersDAO();
		aList = ODAO.searchOrders(oId);

		return aList;
	}


}