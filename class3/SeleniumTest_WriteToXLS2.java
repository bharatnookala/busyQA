package class3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest_WriteToXLS2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\Bharat\\BusyQA\\Week03_07102023\\samplewriting1.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("test");
		
		for(int i=0;i<=5;i++) {
			HSSFRow row = sheet.createRow(i);
			for(int j=0;j<=5;j++) {
				
				row.createCell(j).setCellValue(Integer.toString(i) + Integer.toString(j));
			}
		}
		
		wb.write(fos);
		
	}

}
