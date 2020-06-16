package Order;


import java.util.ArrayList;
import java.util.Date;
public class Orders
{
	private String orderNo,custID,prodCode,qtyPurchased,totBillAmt,transactionID,paymentType;
	private Date orderDate;
	String message;
	
	//constructor 
	public Orders()
	{
		orderNo=custID=prodCode=qtyPurchased=totBillAmt=transactionID=paymentType=null;
		orderDate=null;
		message=null;
		
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

	public String getQtyPurchased() {
		return qtyPurchased;
	}

	public void setQtyPurchased(String qtyPurchased) {
		this.qtyPurchased = qtyPurchased;
	}

	public String getTotBillAmt() {
		return totBillAmt;
	}

	public void setTotBillAmt(String totBillAmt) {
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
		OrdersDAO pDAO = new OrdersDAO();
		aList = pDAO.searchOrders(oId);

		return aList;
	}


}