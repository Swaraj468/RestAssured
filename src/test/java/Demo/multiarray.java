package Demo;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "3");
		map.put("username", "mayurrai");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(123455677);
		arr.add(230924032);
		map.put("phone", arr);
		HashMap<String, String> address = new HashMap<String, String>();
		address.put("HouseNO.", "2Q");
		address.put("StreetNo.", "j2");
		address.put("city", "phagwara");
		address.put("state","punjab");
		map.put("address", address);
	
	Response response = given().contentType(ContentType.JSON).body(map).post("http://localhost:3000/first");
	response.prettyPrint();

	}

}
