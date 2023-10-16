package class4_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	
	public WebDriver driver;
	
	@FindBy(id="autosuggest")
	public WebElement autosuggest;
	
	@FindBy(how= How.XPATH, using="//input[@id='bmwradio']")
	public WebElement bmwradio;
	

	
	PracticePage(WebDriver driver1){
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	public void sendKeys(String value) throws InterruptedException {
		autosuggest.sendKeys(value);
		
	}
	
	
	
	
	

}
