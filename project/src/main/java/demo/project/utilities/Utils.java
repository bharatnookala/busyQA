package demo.project.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	static DateFormat dateFormat;
	static Date date;

	public static final long PAGE_LOAD_TIMEOUT = 100;

	public static final long IMPLICIT_WAIT = 10;

	public static final String WORKSAPCE_PATH = "C://Personal//Bharat//BusyQA//Week09_18112023"; 

	public static final String SCREENSHOT_PATH = WORKSAPCE_PATH + "//Screenshot//";

	public static final String DateFormat = "yyyyMMddHH:mm:ss";

	public static String getDate(String format) {
		dateFormat = new SimpleDateFormat(format);
		date = new Date();
		return dateFormat.format(date);
	}

	public static void takeScreenShot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(SCREENSHOT_PATH + "//screenshot//" + getDate(DateFormat) + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
