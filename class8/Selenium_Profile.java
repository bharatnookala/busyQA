package class8;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Profile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\sowmi\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljngjbnaijcbncmcnjfhigebomdlkcjo\\6.1.12_0.crx"));
		WebDriver driver = new ChromeDriver(options);
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
		
		
				
		driver.quit();
		
		
		

	}

}
