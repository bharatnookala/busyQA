package class8;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.cheapoair.ca/flights/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement source = driver.findElement(By.xpath("//input[@id='from0']"));
		source.sendKeys("YOO");
		Thread.sleep(5000);
		WebElement dest = driver.findElement(By.xpath("//input[@id='to0']"));
		dest.sendKeys("YYZ");
		Thread.sleep(5000);
		WebElement from_date = driver.findElement(By.xpath("//input[@id='cal0']"));
		from_date.click();
		Thread.sleep(5000);
		WebElement from_day = driver.findElement(By.xpath("//div[@class='calendar__single-month active'][position()=1]//a[text()=18]"));
		from_day.click();
		Thread.sleep(5000);
		WebElement to_date = driver.findElement(By.xpath("//input[@id='cal1']"));
		to_date.click();
		Thread.sleep(5000);
		WebElement to_day = driver.findElement(By.xpath("//div[@class='calendar__single-month active'][position()=2]//a[text()=18]"));
		to_day.click();
		Thread.sleep(5000);
		WebElement search_button = driver.findElement(By.xpath("//input[@id='searchNow']"));
		search_button.click();
		Thread.sleep(5000);
		
		
		
		
				
		driver.quit();
		
		
		

	}

}
