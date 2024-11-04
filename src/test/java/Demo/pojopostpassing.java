package Demo;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class pojopostpassing {
	
//	public int[] arr (int... phone) { 
//		return phone;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pojopost obj = new pojopost("8", "mayur");
		
		obj.setMobileNumber(12334,12344,2345);
		
		Response response = given().contentType(ContentType.JSON).body(obj).post("http://localhost:3000/second");
       response.prettyPrint();
	}

}
