package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Selenium_SoftAssert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		SoftAssert sa = new SoftAssert();
		
		//ID
		WebElement w1 = driver.findElement(By.id("hondaradio"));
		System.out.println("w1::::"+w1.getAttribute("name"));
		sa.assertEquals(w1.getAttribute("name"), "cars");
		//Xpath
		WebElement w2 = driver.findElement(By.xpath("//input[@id='hondaradio']"));
		System.out.println("w2::::"+w2.getAttribute("name"));
		sa.assertEquals(w2.getAttribute("name"), "cars");
		//name
		WebElement w3 = driver.findElement(By.name("cars"));
		System.out.println("w3::::"+w3.getAttribute("name"));
		sa.assertEquals(w3.getAttribute("name"), "cars");
		//CSS
		WebElement w4 = driver.findElement(By.cssSelector("#hondaradio"));
		System.out.println("w4::::"+w4.getAttribute("name"));
		sa.assertEquals(w4.getAttribute("name"), "cars");
		//classname
		WebElement w5 = driver.findElement(By.className("dynamic-link"));
		System.out.println("w5:::::"+w5.getAttribute("href"));
		sa.assertEquals(w5.getAttribute("href"), "https://www.letskodeit.com/home");
		//tagname
		WebElement w6 = driver.findElement(By.tagName("input"));
		System.out.println("w6::::::"+w6.getAttribute("name"));
		sa.assertEquals(w6.getAttribute("name"), "cars");
		//link text
		WebElement w7 = driver.findElement(By.linkText("PRACTICE"));
		System.out.println("w7:::::"+w7.getAttribute("href"));
		sa.assertEquals(w7.getAttribute("href"), "https://www.letskodeit.com/practice");
		//partial link text
		WebElement w8 = driver.findElement(By.partialLinkText("ALL"));
		System.out.println("w8:::::"+w8.getAttribute("href"));
		sa.assertEquals(w8.getAttribute("href"), "https://www.letskodeit.com/courses");
		Thread.sleep(3000);
		sa.assertAll();
		driver.quit();
		
		
		
	}

}
