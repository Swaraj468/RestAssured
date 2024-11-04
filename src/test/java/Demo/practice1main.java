package Demo;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class practice1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1 obj = new practice1("2", "Kunwar aditya", "25");
		obj.setMobilephone(919999, 185222);
		
		Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/second");
	 response.prettyPrint();

	}

}
