package class8;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Selenium_Robot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/login";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.cssSelector("#email"));
		WebElement passWord = driver.findElement(By.cssSelector("#login-password"));
		userName.sendKeys("dummy@gmail.com");
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		//userName.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		passWord.sendKeys("dummy@123");
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//passWord.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
//		userName.sendKeys(Keys.CONTROL + "a");
//		Thread.sleep(3000);
//		userName.sendKeys(Keys.BACK_SPACE);
//		Thread.sleep(3000);
		driver.quit();
	}

}
