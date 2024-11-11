package Demo;


import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class productmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product obj = new product("2", "swaraj", "swaraj0000@gmail.com",
				"123", "dsla", "Phagwara", "Punjab", "123333", "23445",
                "hello", "computer");
				obj.setMobile(823510,759183,123456);
				Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/classPractice");
				response.prettyPrint();
				

	}

}
