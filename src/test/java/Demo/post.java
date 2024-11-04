package Demo;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "4");
		map.put("studentName", "Abhishek");
	    map.put("studentSection", "K21FZ");
	    map.put("studentReg", "12111470");
	    map.put("studentPhone", "9199991852");
	    map.put("studentAddress", "LPU");
	    map.put("studentCourese", "computer science");
	    Response response =given().contentType(ContentType.JSON)
	    .body(map)
	    .post("http://localhost:3000/student");
	    response.prettyPrint();


		

	}

}
