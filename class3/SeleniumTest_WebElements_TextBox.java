package class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_TextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("autosuggest"));
		//sendkeys
		w1.sendKeys("busyQA1111");
		Thread.sleep(3000);
		
		//clear
		w1.clear();
		Thread.sleep(3000);
		
		//isDisplayed
		System.out.println("isDisplayed:::::"+w1.isDisplayed());
		
		
		
		//isEnabled
		WebElement w2 = driver.findElement(By.id("bmwradio"));
		w2.click();
		Thread.sleep(3000);
		System.out.println("isEnabled::::"+w2.isEnabled());
		
		driver.quit();

	}

}
