package class5_stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions4 {
	
	@Before(order = 1)
	public void setUp1() {
		System.out.println("before tag in setUp1");
	}
	
	@Before(order = 0)
	public void setUp2() {
		System.out.println("before tag in setUp2");
	}
	
	
	@After(order =0)
	public void tearDown1() {
		System.out.println("after tag in tearDown1");
	}
	
	
	@After(order =1)
	public void tearDown2() {
		System.out.println("after tag in tearDown2");
	}
	
	@When("^Background Value1$")
	public void background1() {
		System.out.println("Background Value1");
	}
	
	@When("^Background Value2$")
	public void background2() {
		System.out.println("Background Value2");
	}
	
	
	@When("^Open Browser$")
	public void open_Browser(DataTable arg1) throws Throwable {
		
		List<List<String>> data = arg1.asLists(String.class);
		System.out.println(data.size());
		
		for(int i=0;i<data.size();i++) {
			if(data.get(i).get(0).equalsIgnoreCase("IE")) {
				System.out.println("username::::::"+data.get(i).get(1));
				System.out.println("password::::::"+data.get(i).get(2));
			}else if(data.get(i).get(0).equalsIgnoreCase("Safari")) {
				System.out.println("username::::::"+data.get(i).get(1));
				System.out.println("password::::::"+data.get(i).get(2));
			}else if(data.get(i).get(0).equalsIgnoreCase("Chrome")) {
				System.out.println("username::::::"+data.get(i).get(1));
				System.out.println("password::::::"+data.get(i).get(2));
			}else if(data.get(i).get(0).equalsIgnoreCase("Opera")) {
				System.out.println("username::::::"+data.get(i).get(1));
				System.out.println("password::::::"+data.get(i).get(2));
			}else if(data.get(i).get(0).equalsIgnoreCase("Firefox")) {
				System.out.println("username::::::"+data.get(i).get(1));
				System.out.println("password::::::"+data.get(i).get(2));
			}
			
		}
	
		
		
		
	
	
		
		
		
		
	}
	
	
	
	
	
	
	
}
