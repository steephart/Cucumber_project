package com.base.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	
	public static void url(String url) {
		driver.get(url);
	}
	public static void sendkeys(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static WebElement findelementid(String id) {
		return driver.findElement(By.id(id));	
	}
	public static WebElement findelementname(String name) {
		return driver.findElement(By.name(name));	
	}
	public static WebElement findelemntclass(String classname) {
		return driver.findElement(By.className(classname));
		
	}
	public static WebElement findelementcss(String css) {
		return driver.findElement(By.cssSelector(css));
		
	}
	public static WebElement find_xpath(String xpathlocator) {
		return driver.findElement(By.xpath(xpathlocator));
		
	}
	public static void wait(int x) {
		driver.manage().timeouts().implicitlyWait(x,TimeUnit.SECONDS);
	}
	public static void selectbyvalue(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByValue(data);
	}
	public static void selectbyindex(WebElement element,int data) {
		Select s=new Select(element);
		s.selectByIndex(data);
	}
	public static void javascriptexecute(int from,long to) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window,scrollBy(from,to)");
	}
	//Abstract method
	public static WebElement findelement(By by) {
		return driver.findElement(by);	
	}
	public static String excelRead(int row,int cell) {
		String value=null;
		try {
		File f=new File("C:\\Users\\alexs\\eclipse-workspace\\"
				+ "Alex_project\\src\\test\\resources\\Test_data\\excel.xlsx");
			FileInputStream fis =new FileInputStream(f);
			Workbook wo=new XSSFWorkbook(fis);
			Sheet sh=wo.getSheet("Sheet1");
			Row row1=sh.getRow(row);
			Cell cell1=row1.getCell(cell);
			System.out.println(cell);
			CellType cellType=cell1.getCellType();
			if(cellType==cellType.STRING) {
				value=cell1.getStringCellValue();
			}
			else if(cellType==cellType.NUMERIC) {
				double numericCellvalue=cell1.getNumericCellValue();
				long l=(long)numericCellvalue;
				value=String.valueOf(l);
			}
			else if(DateUtil.isCellDateFormatted(cell1)){
				Date dateCellvalue=cell1.getDateCellValue();
				SimpleDateFormat sf=new SimpleDateFormat("dd-mm-yy");
				value=sf.format(dateCellvalue);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
	

}
