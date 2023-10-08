package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.Cookie;

public class SeleniumTest_WebElements_Cookies {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		//driver.manage().getCookies()
		System.out.println("11111111111111111");
		System.out.println(driver.manage().getCookies());
				
		//driver.manage().addCookie(arg0); 
		System.out.println("2222222222");
		driver.manage().addCookie(new Cookie("Cookiename", "1589516354637%2F1", ".letskodeit.com", "/", new Date((2035-1900),05,07), false, true));
		System.out.println(driver.manage().getCookies());
		//driver.manage().getCookieNamed(arg0)
		System.out.println("333333333");
		System.out.println(driver.manage().getCookieNamed("Cookiename"));
		//driver.manage().deleteCookie(arg0)
		System.out.println("4444444444");
		driver.manage().addCookie(new Cookie("Cookiename1", "1589516354637%2F1", ".letskodeit.com", "/", new Date((2035-1900),05,07), false, true));
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteCookie(new Cookie("Cookiename1", "1589516354637%2F1", ".letskodeit.com", "/", new Date((2035-1900),05,07), false, true));
		//driver.manage().deleteCookieNamed(arg0
		System.out.println("555555555");
		driver.manage().deleteCookieNamed("Cookiename1");
		System.out.println(driver.manage().getCookies());
		//driver.manage().deleteAllCookies()
		driver.quit();

	}

}
