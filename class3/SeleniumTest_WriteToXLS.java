package class3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WriteToXLS {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\Bharat\\BusyQA\\Week03_07102023\\samplewriting.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("test");
		
		for(int i=0;i<=5;i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<=5;j++) {
				
				row.createCell(j).setCellValue(Integer.toString(i) + Integer.toString(j));
			}
		}
		
		wb.write(fos);
		
	}

}
