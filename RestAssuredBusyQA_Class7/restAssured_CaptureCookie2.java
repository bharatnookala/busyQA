package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class restAssured_CaptureCookie2 {
	
	@Test
	public void cookieCapture2() {
		
		Response response = given()
		
		.when()
			.get("http://google.com");
		
		Map<String, String> map1 = response.getCookies();
		for(Map.Entry entryval : map1.entrySet()) {
			
			System.out.println("the map key is::::"+entryval.getKey()+" the key value is::::"+entryval.getValue());
			if(entryval.getKey().equals("1P_JAR") & entryval.getValue().toString().trim().startsWith("2023-11-04")) {
				System.out.println("there is key as 1P_JAR and has right value!!!!");
			}
			
		}
		
	}

}
