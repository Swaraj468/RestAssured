package Demo;

import java.util.ArrayList;

public class product {
	private String id;
	private String userName;
	private String Email;
	private ArrayList<Integer>Phone;
	private addressproject Address;
	private  orderproduct OrderId;
	
	
	public product(String id, String userName, String Email,
			String HouseNo, String StreetNo, String City, String State, String PinCode,
			String OrderNo, String ProductId,String ProductName) {
		this.id=id;
		this.userName=userName;
		this.Email=Email;
		this.Address=new addressproject(HouseNo, StreetNo, City, 
				State, PinCode);
		this.OrderId=new orderproduct(OrderNo, ProductId, ProductName);
		this.Phone = new ArrayList<Integer>();
		
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public ArrayList<Integer> getPhone() {
		return Phone;
	}


	public void setPhone(ArrayList<Integer> phone) {
		Phone = phone;
	}


	public addressproject getAddress() {
		return Address;
	}


	public void setAddress(addressproject address) {
		Address = address;
	}


	public orderproduct getOrderId() {
		return OrderId;
	}


	public void setOrderId(orderproduct orderId) {
		OrderId = orderId;
	}
	public void setMobile(int...a) {
		for(int i=0; i<a.length; i++) {
			this.Phone.add(a[i]);
		}
	}

}
