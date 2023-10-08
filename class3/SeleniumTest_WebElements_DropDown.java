package class3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//getOptions
//		WebElement w1 = driver.findElement(By.id("carselect"));
//		Select s1 = new Select(w1);
//		List<WebElement> sw1 = s1.getOptions();
//		
//		for(WebElement i : sw1) {
//			System.out.println(i.getAttribute("value"));
//		}
		
		//getOptions.size
		
//		WebElement w1 = driver.findElement(By.id("carselect"));
//		Select s1 = new Select(w1);
//		System.out.println(s1.getOptions().size());
		
		
		
		//selectByIndex
//		WebElement w1 = driver.findElement(By.id("carselect"));
//		Select s1 = new Select(w1);
//		for(int i =0;i<s1.getOptions().size();i++) {
//			s1.selectByIndex(i);
//			Thread.sleep(3000);
//		}
	
		
		//selectByValue
		
//		WebElement w1 = driver.findElement(By.id("carselect"));
//		Select s1 = new Select(w1);
//		List<WebElement> sw1 = s1.getOptions();
//		List<String> values = new ArrayList<String>();
//		for(WebElement i:sw1) {
//			String a = i.getAttribute("value");
//			values.add(a);
//			
//		}
//		for(int i =0;i<values.size();i++) {
//			s1.selectByValue(values.get(i));
//			Thread.sleep(5000);
//		}
		
		//selectByVisibleText
		
//		WebElement w1 = driver.findElement(By.id("carselect"));
//		Select s1 = new Select(w1);
//		List<WebElement> sw1 = s1.getOptions();
//		List<String> values = new ArrayList<String>();
//		for(WebElement i:sw1) {
//			String a = i.getText();
//			System.out.println("the value::::"+a);
//			values.add(a);
//			
//		}
//		for(int i =0;i<values.size();i++) {
//			s1.selectByVisibleText(values.get(i));
//			Thread.sleep(5000);
//		}
		
		//deselectByIndex
//		WebElement w1 = driver.findElement(By.id("multiple-select-example"));
//		Select s1 = new Select(w1);
//		List<WebElement> sw1 = s1.getOptions();
//		List<String> values = new ArrayList<String>();
//		for(WebElement i:sw1) {
//			String a = i.getText();
//			System.out.println("the value::::"+a);
//			s1.selectByVisibleText(a);
//			values.add(a);
//			Thread.sleep(3000);
//			
//		}
//		for(int i =0;i<values.size();i++) {
//			s1.deselectByIndex(i);
//			Thread.sleep(3000);
//		}
		
		
		
		//deselectByValue
//		WebElement w1 = driver.findElement(By.id("multiple-select-example"));
//		Select s1 = new Select(w1);
//		List<WebElement> sw1 = s1.getOptions();
//		List<String> values = new ArrayList<String>();
//		for(WebElement i:sw1) {
//			String a = i.getAttribute("value");
//			System.out.println("the value::::"+a);
//			s1.selectByValue(a);
//			values.add(a);
//			Thread.sleep(3000);
//			
//		}
//		for(int i =0;i<values.size();i++) {
//			s1.deselectByValue(values.get(i));
//			Thread.sleep(3000);
//		}
		
		//deselectByVisibleText
		WebElement w1 = driver.findElement(By.id("multiple-select-example"));
		Select s1 = new Select(w1);
		List<WebElement> sw1 = s1.getOptions();
		List<String> values = new ArrayList<String>();
		for(WebElement i:sw1) {
			String a = i.getText();
			System.out.println("the value::::"+a);
			s1.selectByVisibleText(a);
			values.add(a);
			Thread.sleep(3000);
			
		}
		for(int i =0;i<values.size();i++) {
			s1.deselectByVisibleText(values.get(i));
			Thread.sleep(3000);
		}
		
		driver.quit();

	}

}
