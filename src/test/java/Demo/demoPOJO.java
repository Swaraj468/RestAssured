package Demo;



public class demoPOJO {
	private String id;
	private String student_name;
	private String Roll_No;
	private String Section;
//	private addresspojo address;


	public demoPOJO(String id, String student_name, String Roll_No, String Section) {
//		demoPOJO obj = new demoPOJO();
		this.id = id;
		this.student_name = student_name;
		this.Roll_No = Roll_No;
		this.Section = Section;
//		this.address = new addresspojo(HouseNo, StreetNo, City, State);
		
		
		
	}

//	public addresspojo getAddress() {
//		return address;
//	}
//
//	public void setAddress(addresspojo address) {
//		this.address = address;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(String roll_No) {
		Roll_No = roll_No;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	

}
