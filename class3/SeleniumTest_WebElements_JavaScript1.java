package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_JavaScript1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//clicking element
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();", w1);
//		Thread.sleep(3000);
			
		
		
		//js.executeScript("window.scrollBy(0,500)"); 
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(3000);
		
		//js.executeScript("arguments[0].scrollIntoView();",Element )
//		WebElement w1 = driver.findElement(By.id("displayed-text"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].scrollIntoView();",w1);
//		Thread.sleep(5000);
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)")
		WebElement w1 = driver.findElement(By.id("displayed-text"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
