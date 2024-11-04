package Demo;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class POJOpassingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoPOJO obj = new demoPOJO("5", "swaraj", "23", "K21FZ");
		
		Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/student");
		response.prettyPrint();

	}

}
