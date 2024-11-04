package Demo;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class putmultiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		HashMap<String, Object> map = new HashMap<String, Object>();
	    map.put("id", "4");
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
		HashMap<String, String> University = new HashMap<String, String>();
		University.put("UniName", "LPU");
		University.put("Reg no.", "12111470");
		University.put("subjec", "api testing");
		map.put("University", University);
		*/
		JSONObject jobj = new JSONObject();
		jobj.put("id", "4");
		jobj.put("username", "swaraj");
		JSONArray jarr = new JSONArray();
		jarr.put(12344555);
		jarr.put(12349455);
		jobj.put("phone", "jarr");
		JSONObject address = new JSONObject();
		address.put("HouseNo.", "eewi");
		address.put("StreetNo.", "3");
		address.put("city", "uPhagwara");
		address.put("state", "punjab");
		jobj.put("address", address);
		JSONObject university = new JSONObject();
		university.put("UniName", "LPU");
		university.put("RegNo", "12111470");
		university.put("Branch", "CSE");
		jobj.put("University", university);
		Response response = given().contentType(ContentType.JSON).body(jobj.toString()).post("http://localhost:3000/first");
		response.prettyPrint();

	}

}
