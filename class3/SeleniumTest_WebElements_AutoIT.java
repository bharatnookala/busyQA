package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest_WebElements_AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("11111111111");
		WebElement w1 = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
		System.out.println("222222222222222");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		System.out.println("333333333");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='imagesrc']")));
		System.out.println("4444444444444");
		Thread.sleep(5000);
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click();", w1);
//		w1.click();
//		Thread.sleep(3000);
		System.out.println("5555555555555");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Personal\\Bharat\\BusyQA\\Week03_07102023\\busyqa1.exe");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
