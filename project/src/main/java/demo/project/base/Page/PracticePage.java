package demo.project.base.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import demo.project.base.Driver;

public class PracticePage extends Driver{
	
	@FindBy(id="autosuggest")
	public WebElement autosuggest;
	
	@FindBy(how= How.XPATH, using="//input[@id='bmwradio']")
	public WebElement bmwradio;
	
	@FindBy(how= How.ID, using="bmwcheck")
	public WebElement bmwcheckbox;
	
	@FindBy(how= How.XPATH, using="//input[@name='cars' and @type='radio']")
	public List<WebElement> radiobtn;
	

	
	public PracticePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void sendKeys(String value) throws InterruptedException {
		autosuggest.sendKeys(value);
		
	}
	
	
	
	
	

}
