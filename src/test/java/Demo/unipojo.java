package Demo;

public class unipojo {
	private String id;
	private namepojouni name;
	private String Email;
	private String phone;
	private Addresspojouni Address;
	private universitypojo University;
	
	public unipojo(String id,String firstName, String lastName, String Email, String phone,
String HouseNo, String Landmark, String City, String State, int pincode ,String UniName, String Branch, String Subject, int Reg) {
		this.id=id;
		this.name = new namepojouni(firstName, lastName);
		this.Email=Email;
		this.phone=phone;
		this.University=new universitypojo(UniName, Branch, Subject, Reg);
		this.Address=new Addresspojouni(HouseNo, Landmark, City, State, pincode);
		
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public namepojouni getName() {
		return name;
	}

	public void setName(namepojouni name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Addresspojouni getAddress() {
		return Address;
	}

	public void setAddress(Addresspojouni address) {
		Address = address;
	}

	public universitypojo getUniversity() {
		return University;
	}

	public void setUniversity(universitypojo university) {
		University = university;
	}
	
	

}
