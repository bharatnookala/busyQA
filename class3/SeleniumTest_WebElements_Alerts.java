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

public class SeleniumTest_WebElements_Alerts {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//driver.switchTo().alert()
//		WebElement w1 = driver.findElement(By.id("alertbtn"));
//		w1.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert();
		
		
		//driver.switchTo().alert().accept()
//		WebElement w1 = driver.findElement(By.id("alertbtn"));
//		w1.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
		
		//driver.switchTo().alert().dismiss()
//		WebElement w1 = driver.findElement(By.id("confirmbtn"));
//		w1.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
		
		
		
		//driver.switchTo().alert().sendKeys(text)
//		WebElement w1 = driver.findElement(By.id("confirmbtn"));
//		w1.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("abc");
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
		
		//driver.switchTo().alert().getText()
//		WebElement w1 = driver.findElement(By.id("confirmbtn"));
//		w1.click();
//		Thread.sleep(2000);
//		String text = driver.switchTo().alert().getText();
//		Thread.sleep(2000);
//		System.out.println("the text in the confirm button is::::"+text);
		
		driver.quit();

	}

}
