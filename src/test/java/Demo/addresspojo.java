package Demo;

public class addresspojo {
	
	private String HouseNo;
	private String StreetNo;
	private String City;
	private String State;
	
	public addresspojo(String HouseNo, String StreetNo, String City, String State) {
		this.HouseNo=HouseNo;
		this.StreetNo=StreetNo;
		this.City=City;
		this.State=State;
		

}

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}

	public String getStreetNo() {
		return StreetNo;
	}

	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
}
