package RestAssuredBusyQA.RestAssuredBusyQA_Class7;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.response.ResponseBody.*;

public class restAssured_Demo1 {
	
	@Test
	public void restAssuredDemo() {
		//giving on which uri should i perform the test on?
		RestAssured.baseURI="https://reqres.in/api";
		//framing the request
		RequestSpecification request = RestAssured.given();
		//path variables and hitting the actual formed url
		Response response = request.get("/users");
		//get the details from the response
		ResponseBody body = response.getBody();
		String contenttype = response.getContentType();
		//printing the details
		System.out.println("the response body is:::::");
		System.out.println(body.asString());
		System.out.println("the content type is:::::"+contenttype);
		
	}
	
	
	@Test
	public void restAssuredDemo2() {
		//giving on which uri should i perform the test on?
		RestAssured.baseURI="https://reqres.in/api";
		//framing the request
		RequestSpecification request = RestAssured.given();
		//path variables and hitting the actual formed url
		Response response = request.get();
		//get the details from the response
		ResponseBody body = response.getBody();
		String contenttype = response.getContentType();
		
		//printing the details
		
		if(response.getStatusCode() != 200) {
			System.out.println("issue in page");
		}else {
			System.out.println("the response body is:::::");
			System.out.println(body.asString());
			System.out.println("the content type is:::::"+contenttype);
			System.out.println("the status code is::::"+response.getStatusCode());
			
		}
		
		Assert.assertEquals(body.asString().contains("per_page"), true,"Response is as expected");
		
	}

}
