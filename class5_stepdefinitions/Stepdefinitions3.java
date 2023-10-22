package class5_stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions3 {
	
	@When("^Open Browser \"(.*)\"$")
	public void print_value1(String value) {
		if(value.equalsIgnoreCase("chrome")) {
			System.out.println("intializing chrome");
		}else if(value.equalsIgnoreCase("IE")) {
			System.out.println("intializing IE");
		}else if(value.equalsIgnoreCase("Firefox")) {
			System.out.println("intializing Firefox");
		}else if(value.equalsIgnoreCase("Opera")) {
			System.out.println("intializing Opera");
		}else if(value.equalsIgnoreCase("Safari")) {
			System.out.println("intializing Safari");
		}else {
			System.out.println("intializing default browser");
		}
	}
	
	
	
	
	
	
}
