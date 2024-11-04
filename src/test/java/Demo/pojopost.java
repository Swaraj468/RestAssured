package Demo;

import java.util.ArrayList;

public class pojopost {
	private String id;
	private String username;
	private ArrayList<Integer> phone;
	
	public pojopost(String id, String username) {
		this.id = id;
		this.username = username;
		this.phone = new ArrayList<Integer>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<Integer> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}
	public void setMobileNumber(int...a) {
		for(int i=0; i<a.length; i++) {
		this.phone.add(a[i]);
	}

	}
}
