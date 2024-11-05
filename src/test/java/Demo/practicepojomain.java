package Demo;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class practicepojomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicepojo obj = new practicepojo("6", "swaraj", "23", "oak residency 3", "Green valley", "phagwara", "punjab");
		obj.setMobile(823510,759183,123456);
		
	Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/second");
		response.prettyPrint();
		

	}

}
