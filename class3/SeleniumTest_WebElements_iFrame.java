package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_iFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//driver.switchTo().frame(name of the frame)
//		driver.switchTo().frame("iframe-name");
//		WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]"));
//		w1.sendKeys("search busyQA");
//		Thread.sleep(5000);
		
		//driver.switchTo().frame(WebElement) 
//		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
//		WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]"));
//		w1.sendKeys("search busyQA");
//		Thread.sleep(5000);
		
		//driver.switchTo().frame(index) 
//		driver.switchTo().frame(0);
//		WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]"));
//		w1.sendKeys("search busyQA");
//		Thread.sleep(5000);
		
		//driver.switchTo().defaultContent()
//		driver.switchTo().frame(0);
//		WebElement w1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]"));
//		w1.sendKeys("search busyQA");
//		Thread.sleep(5000);
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("busyQA");
//		Thread.sleep(5000);
		driver.quit();

	}

}
