package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_MouseActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//Mouse Hover - moveToElement(WebElement).build().perform()
//		WebElement w1 = driver.findElement(By.id("mousehover"));
//		Actions a1 = new Actions(driver);
//		a1.moveToElement(w1).build().perform();
//		Thread.sleep(5000);
		
		//Right click - contextClick(WebElement).build().perform()
//		WebElement w1 = driver.findElement(By.id("mousehover"));
//		Actions a1 = new Actions(driver);
//		a1.contextClick(w1).build().perform();
//		Thread.sleep(5000);
		
		//Double Click - doubleClick(WebElement).build().perform()
		WebElement w1 = driver.findElement(By.id("mousehover"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(w1).build().perform();
		Thread.sleep(5000);

		
		driver.quit();

	}

}
