package Demo;

import java.util.ArrayList;

public class practice1 {
	private String id;
	private String Name;
	private String RollNo;
	private ArrayList<Integer> phone;

	public practice1(String id, String Name, String RollNo) {
		this.id = id; 
		this.Name = Name;
		 this.RollNo = RollNo;
		 this.phone = new ArrayList<Integer>();
		 

		 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRollNo() {
		return RollNo;
	}

	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}

	public ArrayList<Integer> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}
	public void setMobilephone(int...a) {
		for(int i = 0; i<a.length; i++) {
			this.phone.add(a[i]);
		}
	}

}
