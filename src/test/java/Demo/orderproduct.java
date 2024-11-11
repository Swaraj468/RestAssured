package Demo;

public class orderproduct {
	private String OrderNo;
	private String ProductId;
	private String ProductName;
	
	public orderproduct(String OrderNo, String ProductId, String ProductName)
	{
		this.OrderNo=OrderNo;
		this.ProductId=ProductId;
		this.ProductName=ProductName;
	}

	public String getOrderNo() {
		return OrderNo;
	}

	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

}
