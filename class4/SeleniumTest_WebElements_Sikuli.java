package class4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SeleniumTest_WebElements_Sikuli {

	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String filepath = "C:\\Personal\\Bharat\\BusyQA\\Week04_14102023\\";
        String inputFilePath = "C:\\Personal\\Bharat\\BusyQA\\Week04_14102023\\";
		
        Pattern fileInputTextBox = new Pattern(filepath + "SearchBar.PNG");
        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
        

        // Open Chrome browser    
        driver.get("https://www.tutorialspoint.com/index.htm");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        Actions a1 = new Actions(driver);

        // Click on Browse button and handle windows pop up using Sikuli
        WebElement w1 = driver.findElement(By.xpath("//input[@id='search-strings']"));
        System.out.println(w1.getAttribute("name"));
        System.out.println(w1.isDisplayed());
        System.out.println(w1.isEnabled());
        Thread.sleep(5000);
        Screen s = new Screen();
        System.out.println("1");
        s.wait(fileInputTextBox, 5);
        System.out.println("2");
        s.type(fileInputTextBox,"busyQA");
        System.out.println("3");
        s.click(fileInputTextBox);
        System.out.println("4");
        Thread.sleep(5000);
        // Close the browser
        driver.quit();

	}

}
