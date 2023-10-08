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

public class SeleniumTest_WebElements_MouseActions2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		//Drag and Drop - dragAndDrop(Source WebElement, Target WebElement).build().perform()
//		Actions a1= new Actions(driver);
//		a1.dragAndDrop(driver.findElement(By.id("angular")), driver.findElement(By.id("droparea"))).build().perform();
//		Thread.sleep(5000);
		

		//Drag and Drop - clickAndHold(Source WebElement).moveToElement(Target WebElement).release().build().perform()
		Actions a1= new Actions(driver);
		a1.clickAndHold(driver.findElement(By.id("angular"))).moveToElement(driver.findElement(By.id("droparea"))).release().build().perform();
		Thread.sleep(5000);
		
		


		
		driver.quit();

	}

}
