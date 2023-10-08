package class3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WebElements_WebTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.xpath("//table[@id=\"product\"]//tr[2]/td[@class=\"author-name\"]"));
		WebElement w2 = driver.findElement(By.xpath("//table[@id=\"product\"]//tr[2]/td[@class=\"course-name\"]"));
		WebElement w3 = driver.findElement(By.xpath("//table[@id=\"product\"]//tr[2]/td[@class=\"price\"]"));
		System.out.println(w1.getText());
		System.out.println(w2.getText());
		System.out.println(w3.getText());
		
		for(int i =2;i<=4;i++) {
			for(int j=1;j<=3;j++) {
				String text = driver.findElement(By.xpath("//table[@id=\"product\"]//tr["+i+"]/td[" + j+"]")).getText();
				System.out.println(text);
			}
		}
		
		
		driver.quit();

	}

}
