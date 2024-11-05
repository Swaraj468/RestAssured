package Demo;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class unipojomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unipojo obj = new unipojo("6", "swaraj", "rai", "swaraj@00gmail.com", "+91-7367085432", 
				"oak residency 3", "Green valley", "phagwara", "punjab", 144411, "LPU", "CSE", "API", 12111470);
		Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/class");
		response.prettyPrint();
//		System.out.println(response.jsonPath().get("username[0]").toString());
//		System.out.println(response.jsonPath().getMap("id").size());
//		
//		AssertEquals(response.jsonPath().statuscode(200));

	}

}
