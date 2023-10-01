package class2_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest_CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//name
		WebElement e1 = driver.findElement(By.cssSelector("input#name"));
		e1.sendKeys("busyQA1");
		Thread.sleep(10000);
		e1.clear();
		//id
		List<WebElement> e2 = driver.findElements(By.cssSelector("input.inputs"));
		for(WebElement i : e2) {
			i.sendKeys("busyQA2");
			Thread.sleep(10000);
			i.clear();
		}
		WebElement e3 = driver.findElement(By.cssSelector("input[id=name]"));
		e3.sendKeys("TagAttribute");
		Thread.sleep(20000);
		driver.quit();

	}

}
