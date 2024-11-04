package Demo;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class post1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "4");
		map.put("studentName", "Abhishek");
	    map.put("studentSpecialization", "software testing");
	    map.put("studentSkill", "api automation");
	    map.put("ToolUsed", "postman");
	   
	    Response response =given().contentType(ContentType.JSON)
	    .body(map)
	    .post("http://localhost:3000/Specialization");
	    response.prettyPrint();

	}

}
