package class4_2;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_Log4j {
	
	public static Logger logger;
	
	
	@Test
	public void log4jDemo() throws InterruptedException {
		logger = Logger.getLogger(TestNG_Log4j.class);
		PropertyConfigurator.configure("C:\\Users\\sowmi\\eclipse-workspace\\BusyQA22092023\\log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		logger.info("Browser opened");
		WebElement w1 = driver.findElement(By.id("autosuggest"));
		//sendkeys
		w1.sendKeys("busyQA1111");
		Thread.sleep(3000);
		logger.info("Autosuggest populated");
		
		
		
		//clear
		w1.clear();
		Thread.sleep(3000);
		logger.info("Autosuggest cleared");
		
		
		//isEnabled
		WebElement w2 = driver.findElement(By.id("bmwradio"));
		w2.click();
		logger.info("Radio button clicked");
		Thread.sleep(3000);
		
		logger.debug("Test case completed");
		driver.quit();
		  
		  
		  
		  
		  
		  
		  
		  }

}
