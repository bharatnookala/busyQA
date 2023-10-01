package class2_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest_XPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//absolute xpath
		WebElement e1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/fieldset[1]/input[1]"));
		e1.sendKeys("busyQA1");
		Thread.sleep(10000);
		e1.clear();
		//id
		WebElement e2 = driver.findElement(By.xpath("//input[@id=\"name\" and @name=\"enter-name\"]"));
		e2.sendKeys("busyQA2");
		Thread.sleep(10000);
		e2.clear();
		WebElement e3 = driver.findElement(By.xpath("//input[contains(@name,\"enter\")]"));
		e3.sendKeys("busyQA3");
		Thread.sleep(10000);
		e3.clear();
		WebElement e4 = driver.findElement(By.xpath("//legend[contains(text(),\"Switch To\")]"));
		System.out.println("the text is::::"+e4.getText());
		WebElement e5 = driver.findElement(By.xpath("//h1[starts-with(text(),\"Practice\")]"));
		System.out.println("the text is::::"+e5.getText());
		WebElement e6 = driver.findElement(By.xpath("//legend[text()=\"Radio Button Example\"]"));
		System.out.println("the text is::::"+e6.getText());
		System.out.println("the title is:::"+driver.getTitle());
		List<WebElement> e7 = driver.findElements(By.xpath("//label[@for=\"benz\"]/preceding::label"));
		for(WebElement i : e7) {
			System.out.println(i.getText());
		}
		List<WebElement> e8 = driver.findElements(By.xpath("//label[@for=\"benz\"]/following::label"));
		for(WebElement j : e8) {
			System.out.println(j.getText());
		}
		driver.quit();

	}

}
