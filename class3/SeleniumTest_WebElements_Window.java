package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_Window {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//getWindowHandle
		//System.out.println(driver.getWindowHandle());
		
		//getWindowHandles
		String currentWindow = driver.getWindowHandle();
		WebElement w1 = driver.findElement(By.id("openwindow"));
		w1.click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext()) {
			String cwindow = itr.next();
			if(!currentWindow.equals(cwindow)) {
				driver.switchTo().window(cwindow);
				//driver.switchTo().window(cwindow).findElement(By.id("search")).sendKeys("busqyQA123");
				System.out.println(driver.switchTo().window(cwindow).getTitle());
			}
		}
		
		
		driver.quit();

	}

}
