package class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_CSS2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//startswith
		List<WebElement> startswith = driver.findElements(By.cssSelector("input[id^='bmw']"));
		for(WebElement i : startswith) {
			System.out.println("###########startswith#################");
			System.out.println(i.getAttribute("type"));
		}
		
		//endswith
		List<WebElement> endswith = driver.findElements(By.cssSelector("input[id$='check']"));
		for(WebElement i : endswith) {
			System.out.println("###########endswith#################");
			System.out.println(i.getAttribute("type"));
		}
		
		//contains
		
		List<WebElement> containselement = driver.findElements(By.cssSelector("input[id*='z']"));
		for(WebElement i : containselement) {
			System.out.println("###########contains#################");
			System.out.println(i.getAttribute("type"));
		}
		
		
				
		driver.quit();
		
		
		

	}

}
