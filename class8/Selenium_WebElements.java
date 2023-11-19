package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_WebElements {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//ID
		WebElement w1 = driver.findElement(By.id("hondaradio"));
		System.out.println("w1::::"+w1.getAttribute("name"));
		//Xpath
		WebElement w2 = driver.findElement(By.xpath("//input[@id='hondaradio']"));
		System.out.println("w2::::"+w2.getAttribute("name"));
		//name
		WebElement w3 = driver.findElement(By.name("cars"));
		System.out.println("w3::::"+w3.getAttribute("name"));
		//CSS
		WebElement w4 = driver.findElement(By.cssSelector("#hondaradio"));
		System.out.println("w4::::"+w4.getAttribute("name"));
		//classname
		WebElement w5 = driver.findElement(By.className("dynamic-link"));
		System.out.println("w5:::::"+w5.getAttribute("href"));
		//tagname
		WebElement w6 = driver.findElement(By.tagName("input"));
		System.out.println("w6::::::"+w6.getAttribute("name"));
		//link text
		WebElement w7 = driver.findElement(By.linkText("PRACTICE"));
		System.out.println("w7:::::"+w7.getAttribute("href"));
		//partial link text
		WebElement w8 = driver.findElement(By.partialLinkText("ALL"));
		System.out.println("w8:::::"+w8.getAttribute("href"));
		
		driver.quit();
		
		
		
	}

}
