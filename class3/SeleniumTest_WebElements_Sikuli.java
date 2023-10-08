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
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SeleniumTest_WebElements_Sikuli {

	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("RESULT_FileUpload-11")).click();
		
		Screen s1 = new Screen();
		
		String path = "C:\\Personal\\Bharat\\BusyQA\\Week03_07102023";
		Pattern fileip = new Pattern(path + "watching.jpg");
		Pattern open = new Pattern(path + "watching.jpg");
		s1.wait(fileip, 20);
		s1.type(fileip, path+ "watching.jpg");
		s1.click();
		
		
		driver.quit();

	}

}
