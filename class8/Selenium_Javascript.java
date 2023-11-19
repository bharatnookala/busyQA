package class8;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Javascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//opening the practice website
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.location='https://www.letskodeit.com/practice';");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//return the webelement
		WebElement w1 = (WebElement) jse.executeScript("return document.getElementById('bmwradio');");
		w1.click();
		Thread.sleep(3000);
		//details of the webpage
		long pageHeight = (long) jse.executeScript("return window.innerHeight;");
		long pageWidth = (long) jse.executeScript("return window.innerWidth;");
		System.out.println("the pageHeight is:::::::"+pageHeight);
		System.out.println("the pageWidth is:::::::"+pageWidth);
		Thread.sleep(3000);
		//scrolldown
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		//scrollup
		jse.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(3000);
		//scrollView
		WebElement w2 = driver.findElement(By.id("name"));
		jse.executeScript("arguments[0].scrollIntoView(true);",w2);
		Thread.sleep(3000);
		//click
		WebElement w3 = driver.findElement(By.id("bmwcheck"));
		jse.executeScript("arguments[0].scrollIntoView(true);",w3);
		jse.executeScript("arguments[0].click();", w3);
		Thread.sleep(3000);
		driver.quit();
	}

}
