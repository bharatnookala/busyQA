package class3;

import java.io.FileInputStream;
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

public class SeleniumTest_ReadFromXLS2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Personal\\Bharat\\BusyQA\\Week03_07102023\\sampletesting1.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		
		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(0).getLastCellNum();
		
		for(int i = 0;i<= rownum;i++) {
			HSSFRow row = sheet.getRow(i);
			
			for(int j=0;j< colnum;j++){
				String value = row.getCell(j).toString();
				System.out.println(value);
				
			}
		}
	}

}
