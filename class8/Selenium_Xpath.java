package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//absolute xpath
		WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/label[1]"));
		System.out.println("abs xpath::::::"+w1.getAttribute("id"));
		//relative xpath
		WebElement w2 = driver.findElement(By.xpath("//input[@id='bmwradio']"));
		System.out.println("relative xpath::::"+w2.getAttribute("id"));
		//combination of abs and rel xpath
		WebElement w3 = driver.findElement(By.xpath("//label/input[@id='bmwradio']"));
		System.out.println("combo xpath::::"+w3.getAttribute("id"));
		//text()
		WebElement w4 = driver.findElement(By.xpath("//a[text()='Open Tab']"));
		System.out.println("text()::::"+w4.getAttribute("id"));
		//contains
		WebElement w5 = driver.findElement(By.xpath("//input[contains(@name,'car')]"));
		System.out.println("contains::::"+w5.getAttribute("id"));
		//starts-with
		WebElement w6 = driver.findElement(By.xpath("//input[starts-with(@name,'car')]"));
		System.out.println("starts-with::::"+w6.getAttribute("id"));
		//parent
		WebElement w7 = driver.findElement(By.xpath("//td[@class='course-name']//parent::td"));
		System.out.println("parent::::"+w7.getAttribute("class"));
		//preceding-sibling
		WebElement w8 = driver.findElement(By.xpath("//td[@class='course-name']//preceding-sibling::td"));
		System.out.println("preceding-sibling::::"+w8.getAttribute("class"));
		//following-sibling
	    WebElement w9 = driver.findElement(By.xpath("//td[@class='course-name']//following-sibling::td"));
		System.out.println("following-sibling::::"+w9.getAttribute("class"));
		
		
		
				
		driver.quit();
		
		
		

	}

}
