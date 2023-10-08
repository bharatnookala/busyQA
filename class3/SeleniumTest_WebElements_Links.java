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

public class SeleniumTest_WebElements_Links {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//broken links
//		try {
//			List<WebElement> links = driver.findElements(By.tagName("a"));
//			for(WebElement w1: links) {
//				String url = w1.getAttribute("href");
//				if(url.length()>0) {
//					System.out.println("the link is::::"+url);
//					URL urlVar = new URL(url);
//					HttpURLConnection httpconn = (HttpURLConnection) urlVar.openConnection();
//					httpconn.setConnectTimeout(5000);
//					httpconn.connect();
//					if(httpconn.getResponseCode() == 200) {
//						System.out.println("Enjoy your link is fine");
//					}
//					else {
//						System.out.println("link is broken");
//					}
//				}
//			}
//			
//		}catch(Exception e) {
//			System.out.println("there is an exception!!!!!!!");
//			//e.printStackTrace();
//		}
		
		
		//click
//		WebElement w1 = driver.findElement(By.id("opentab"));
//		w1.click();
//		Thread.sleep(3000);
		
		//isDisplayed
		
		WebElement w1 = driver.findElement(By.id("opentab"));
		System.out.println("isDisplayed::::::"+w1.isDisplayed());
		Thread.sleep(3000);
		
		driver.quit();

	}

}
