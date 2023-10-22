package class5_stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefinitions1 {
	
	public WebDriver driver;
	public WebElement w1;
	
	
		
	@Given("^Browser is opened$")
	public void browser_is_opened() throws Throwable {
	    
	    System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("browser_is_opened");
	}
	
	
	

	@Then("^Click on the textbox$")
	public void click_on_the_textbox() throws Throwable {
		w1 = driver.findElement(By.id("autosuggest1111111111"));
		w1.click();
		Thread.sleep(5000);
	    System.out.println("click_on_the_textbox");
	}

	@And("^Pass the value$")
	public void pass_the_value() throws Throwable {
		w1.sendKeys("busyQA123");
		Thread.sleep(5000);
	    System.out.println("pass_the_value");
	}

	@Then("^Check the value$")
	public void check_the_value() throws Throwable {
		String value = w1.getAttribute("placeholder");
		System.out.println("the value is::::::"+value);
		Thread.sleep(5000);
	    System.out.println("check_the_value");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
		Thread.sleep(5000);
	    System.out.println("close_the_browser");
	}



}
