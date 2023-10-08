package class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_Radio_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//radio - click
		WebElement w1 = driver.findElement(By.id("bmwradio"));
		w1.click();
		Thread.sleep(3000);
		
		//checkbox - click
		WebElement w2 = driver.findElement(By.id("bmwcheck"));
		w2.click();
		Thread.sleep(3000);
				
		//radio - isDisplayed
		System.out.println("the radio button is displayed::::"+w1.isDisplayed());
		
		//checkbox - isDisplayed
		System.out.println("the check button is displayed::::"+w2.isDisplayed());
		
		//radio - isEnabled
		System.out.println("the radio button is enabled::::"+w1.isEnabled());
		
		//checkbox - isEnabled
		System.out.println("the check button is enabled::::"+w2.isEnabled());

		//radio - isSelected
		System.out.println("the radio button is selected::::"+w1.isSelected());
		
		//checkbox - isSelected
		System.out.println("the check button is selected::::"+w2.isSelected());
		
		driver.quit();

	}

}
