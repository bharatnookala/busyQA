package class4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
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

public class SeleniumTest_ReadWrite {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Personal\\Bharat\\BusyQA\\Week03_07102023\\readwrite.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rownum = sheet.getLastRowNum();
		int colnum = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=rownum;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colnum;j++) {
				String value = row.getCell(j).toString();
				System.out.println("the value is::::"+value);
				
			}
			if(i%2==0) {
				row.createCell(3).setCellValue("Pass");
			}else {
				row.createCell(3).setCellValue("Fail");
			}
			
		}
		System.out.println("excel operation completed!!");
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\Bharat\\BusyQA\\Week03_07102023\\readwrite.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("write completed!!!!");
		
		
		
	}

}
