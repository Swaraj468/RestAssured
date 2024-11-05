package Demo;

import java.util.ArrayList;

public class Addresspojouni {
	
	private String HouseNo;
	private String Landmark;
	private String City;
	private String State;
	private int pincode;
	
	public Addresspojouni(String HouseNo, String Landmark, String City, String State, int pincode ) {
		this.HouseNo=HouseNo;
		this.Landmark=Landmark;
		this.City=City;
		this.State=State;
//		this.pincode=new ArrayList<Integer>();
		this.pincode=pincode;
		
	}

	public String getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

//	public ArrayList<Integer> getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(ArrayList<Integer> pincode) {
//		this.pincode = pincode;
//	}
	

}
