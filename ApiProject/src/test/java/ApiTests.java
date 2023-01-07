import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiTests {

	@Test
	public void canGetSingleUser() {
		String getSingleUser = "https://reqres.in/api/users/2";
		Response response = RestAssured.get(getSingleUser);
		
		assertTrue(response.asPrettyString().contains("janet.weaver@reqres.in"));
		
	}
	
	@Test
	public void canVerifyToken() {
		String postLogin = "https://reqres.in/api/login";
		
		RequestSpecification request = RestAssured.given();
		request.header("content-type", "application/json");
		request.body("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n" + "}");
		
		Response response = request.post(postLogin);
		System.out.println("Post Status Code: " + response.getStatusCode() + " Post Response: " + response.asPrettyString());
		
		assertTrue(response.asPrettyString().contains("QpwL5tke4Pnpja7X4"));
	}
	
	@Test
	public void canVerifyResponseCode() {
		String deleteQuest = "https://reqres.in/api/users/2";
		
		var expectedStatusCode = 204;
		
		Response deleteResponse = RestAssured.delete(deleteQuest);
		System.out.println("Status Code: " + deleteResponse.getStatusCode() + " Response: " + deleteResponse.asPrettyString());
		
		var actualStatusCode = deleteResponse.statusCode();
		
		//TODO:: cant take ints look into this
		assertEquals(actualStatusCode, expectedStatusCode, "The response code should be 204 ");

		// The response code 204 does have headers but does not contain a body.
	}
	
	@Test
	public void canUpdatePatchMorpheus() {
		
		String patch = "https://reqres.in/api/users/2";
		
		RequestSpecification patchRequest = RestAssured.given()
				.header("content-type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus2\"\r\n" + "}");
		
		Response patchResponse = patchRequest.patch(patch);
		System.out.println("Patch Status Code: " + patchResponse.getStatusCode() + " Patch Response: " + patchResponse.asPrettyString());
		
		assertTrue(patchResponse.asPrettyString().contains("morpheus2"));

	}
	
	@Test
	public void canUpdatePutMorpheus() {
		String put = "https://reqres.in/api/users/2";
		
		RequestSpecification putRequest = RestAssured.given()
				.header("content-type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus2\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}");
		
		Response putResponse = putRequest.put(put);
		System.out.println("Patch Status Code: " + putResponse.getStatusCode() + " Patch Response: " + putResponse.asPrettyString());
		
		assertTrue(putResponse.asPrettyString().contains("morpheus2"));
		
	}
	
	@Test
	public void canDeserializeUserDataIntoObject() {
		String deserializeData = "https://reqres.in/api/users/2";
		
		Response getResponse = RestAssured.get(deserializeData);
		
		Data userData = new Data();
		userData.getID();
		userData.getEmail();
		userData.getFirstName();
		userData.getLastName();
		userData.getAvatar();
		
		RestAssured.given()
			.contentType(ContentType.JSON)
			.when()
			.get(deserializeData);
		
		assertTrue(getResponse.asPrettyString().contains("janet.weaver@reqres.in"));
		assertTrue(getResponse.asPrettyString().contains("Janet"));
		assertTrue(getResponse.asPrettyString().contains("Weaver"));
		assertTrue(getResponse.asPrettyString().contains("https://reqres.in/img/faces/2-image.jpg"));
	}
	
	//TODO:: Find a way to put multiple user data into a list, similar to above
	@Test
	public void canDeserializeUserDataIntoCollectionOfObjects() {
		String deserializeData = "https://reqres.in/api/users?page=2";
		
		Response getResponse = RestAssured.get(deserializeData);
		
		Data userData = new Data();
		userData.getID();
		userData.getEmail();
		userData.getFirstName();
		userData.getLastName();
		userData.getAvatar();
		
		
		
	}
	
	
	
}
