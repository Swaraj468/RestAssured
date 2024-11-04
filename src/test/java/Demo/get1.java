package Demo;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class get1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response response = given()
				.contentType(ContentType.JSON)
				.get("http://localhost:3000/Specialization");
		response.prettyPrint();

	}

}
