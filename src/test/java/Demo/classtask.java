package Demo;
import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class classtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jobj = new JSONObject();
		jobj.put("id", "2");
		JSONObject name = new JSONObject();
		name.put("firstName", "Mayur");
		name.put("lastName", "Rai");
		jobj.put("Name", name);
		JSONArray jarr = new JSONArray();
		jarr.put(1654646164);
		jarr.put(1235707591);
		jarr.put(1963085354);
		jobj.put("phone", jarr);
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
		Response response = given().contentType(ContentType.JSON).body(jobj.toString()).post("http://localhost:3000/student");
		response.prettyPrint();

	}

}
