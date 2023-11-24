package demo.project.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import demo.project.base.Driver;

public class SeleniumActions extends Driver {

	public void selectbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectbyValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}}
