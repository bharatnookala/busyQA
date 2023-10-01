package class2_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest_ID_Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.navigate().to(url);
		//driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
//		WebElement w1 = driver.findElement(By.id("name"));
//		w1.sendKeys("busyQA1");
//		Thread.sleep(5000);
//		w1.clear();
//		WebElement w2 = driver.findElement(By.name("enter-name"));
//		w2.sendKeys("busyQA2");
//		Thread.sleep(5000);
//		w2.clear();
//		Thread.sleep(5000);
////		WebElement w3 = driver.findElement(By.linkText("PRACTICE"));
////		w3.click();
////		Thread.sleep(5000);
//		WebElement w4 = driver.findElement(By.cssSelector("input#name"));
//		w4.sendKeys("busyQA3");
//		Thread.sleep(5000);
//		w4.clear();
//		WebElement w5 = driver.findElement(By.cssSelector("input.inputs[name=\"enter-name\"]"));
//		w5.sendKeys("busyQA4");
//		Thread.sleep(5000);
//		w5.clear();
//		List<WebElement> w6 = driver.findElements(By.cssSelector("input.inputs"));
//		for(WebElement i : w6) {
//			i.sendKeys("busyQA5");
//			Thread.sleep(5000);
//			i.clear();
//		}
//		
//		WebElement w7 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/fieldset[1]/input[1]"));
//		w7.sendKeys("busyQA6");
//		Thread.sleep(5000);
//		w7.clear();
//		
//		WebElement w8 = driver.findElement(By.xpath("//input[@id=\"autosuggest\"]"));
//		w8.sendKeys("busyQA7");
//		Thread.sleep(5000);
//		w8.clear();
//		
//		WebElement w9 = driver.findElement(By.xpath("//input[contains(@placeholder,\"Start\")]"));
//		w9.sendKeys("busyQA8");
//		Thread.sleep(5000);
//		w9.clear();
		
//		WebElement w10 = driver.findElement(By.xpath("//legend[contains(text(),\"Auto\")]"));
//		System.out.println("the text is::::"+w10.getText());
//		List<WebElement> w11 = driver.findElements(By.xpath("//input[@id=\"name\" or @class=\"inputs\"]"));
//		for(WebElement i : w11) {
//			i.sendKeys("busyQA11");
//			Thread.sleep(5000);
//			i.clear();
//		}
		
//		List<WebElement> w12 = driver.findElements(By.xpath("//legend[starts-with(text(),\"Switch\")]"));
//		for(WebElement i : w12) {
//			System.out.println("the text is::::"+i.getText());
//		}
//		System.out.println("the getTitle is::::"+driver.getTitle());
//		System.out.println("the getCurrentUrl is::::"+driver.getCurrentUrl());
//		boolean result = driver.getPageSource().contains("Switch Window Example");
//		System.out.println("the result is:::"+result);
//		System.out.println("isDisplayed:::::"+driver.findElement(By.id("name")).isDisplayed());
//		System.out.println("isEnabled:::::"+driver.findElement(By.id("name")).isEnabled());
//		System.out.println("isSelected:::::"+driver.findElement(By.id("name")).isSelected());
		
		
		
		
		
		driver.close();
		driver.quit();
		
		

	}

}
