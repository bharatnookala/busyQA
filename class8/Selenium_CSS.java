package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_CSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Bharat\\BusyQA\\Week08_11112023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//using ID
		WebElement w1 = driver.findElement(By.cssSelector("#openwindow"));
		System.out.println("using id in CSS:::::"+w1.getAttribute("id"));
		//using ID and tagname
		WebElement w2 = driver.findElement(By.cssSelector("button#openwindow"));
		System.out.println("using id and tagname in CSS:::::"+w2.getAttribute("id"));
		//using class
		WebElement w3 = driver.findElement(By.cssSelector(".btn-style.class1"));
		System.out.println("using class in CSS:::::"+w3.getAttribute("id"));
		//using class and tagname
		WebElement w4 = driver.findElement(By.cssSelector("button.btn-style.class1"));
		System.out.println("using class and tagname in CSS:::::"+w4.getAttribute("id"));
		//using ID attribute
		WebElement w5 = driver.findElement(By.cssSelector("button[id='openwindow']"));
		System.out.println("using id in xpath like in CSS:::::"+w4.getAttribute("id"));
		//using class attribute
		WebElement w6 = driver.findElement(By.cssSelector("button[class='btn-style class1']"));
		System.out.println("using class in xpath like in CSS:::::"+w4.getAttribute("id"));
		//using other attribute
		WebElement w7 = driver.findElement(By.cssSelector("button[onclick='openWindow()']"));
		System.out.println("using any other attribute in xpath like in CSS:::::"+w4.getAttribute("id"));
		
		driver.quit();
		
		
		

	}

}
