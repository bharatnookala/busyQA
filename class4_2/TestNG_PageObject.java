package class4_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_PageObject {
  @Test
  public void takeScreenshot() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.letskodeit.com/practice");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  PracticePage practice = new PracticePage(driver);
	  practice.autosuggest.sendKeys("busyQA123");
	  //Thread.sleep(3000);
	  practice.bmwradio.click();
	  //Thread.sleep(3000);
	  driver.quit();
	  
	  
	  
  }
}
