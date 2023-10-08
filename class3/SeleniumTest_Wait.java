package class3;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest_Wait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//thread sleep
		
		Thread.sleep(3000);
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicitly wait
		//alertIsPresent
//		WebElement w1 = driver.findElement(By.id("alertbtn"));
//		w1.click();
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
		//elementToBeClickable
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("bmwradio")));
		//elementToBeSelected
//		WebElement w1 = driver.findElement(By.id("bmwradio"));
//		w1.click();
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeSelected(w1));
		//frameToBeAvailableAndSwitchToIt
//		WebElement w1 = driver.findElement(By.id("courses-iframe"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(w1));
		
		//invisibilityOf
		//presenceOfAllElementsLocatedBy
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("bmwradio")));
		//textToBePresentInElement
//		WebElement w1 = driver.findElement(By.id("openwindow"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.textToBePresentInElement(w1, "Open Window"));
		//textToBePresentInElementValue
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("bmwcheck"), "bmw"));
		//visibilityOf
//		WebElement w1 = driver.findElement(By.id("alertbtn"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(w1));
		//titleContains
//		WebElement w1 = driver.findElement(By.id("alertbtn"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.titleContains("Practice"));
		
		
		//pageouttimeload
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//fluent wait
		FluentWait wait = new FluentWait(driver);
		
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("bmwradio")));
		
		
		
		driver.quit();

	}

}
