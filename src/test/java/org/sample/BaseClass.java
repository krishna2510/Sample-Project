package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
   
	public static WebDriver driver;
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\ExampleWork\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void enterUrl(String data) {
		driver.get(data);
	}
	public static void enterText(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void elementClick(WebElement element) {
		element.click();
	}
	public static void getUrl() {
		String s = driver.getCurrentUrl();
		System.out.println(s);
	}
	public static void gettTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void gettText(WebElement element) {
		String txt = element.getText();
		System.out.println(txt);
	}
	public static void gettAttribute(WebElement element) {
		String txt = element.getAttribute("value");
        System.out.println(txt);
	}
	public static void Close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void mouseOver(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public static void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
        ac.doubleClick(element).perform();
	}
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public static void dragAnddrop(WebElement element1, WebElement element2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element1, element2);
	}
	public static String getDataFromExcel(String data,int rowno,int cellno) throws IOException {
		File f = new File("D:\\Eclipse\\JunitFrameWork\\Datafile\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sh = wb.getSheet(data);
		Row rw = sh.getRow(rowno);
		Cell cell = rw.getCell(cellno);
		int ctt = cell.getCellType();
		String value = "";
		if (ctt==1) {
			value=cell.getStringCellValue();
		}
			else if (DateUtil.isCellDateFormatted(cell)) {
				 java.util.Date dc = cell.getDateCellValue();
				SimpleDateFormat sp = new SimpleDateFormat("DD/MM/YYYY");
				value = sp.format(dc);
			}
		else {
			double ncv = cell.getNumericCellValue();
			long l = (long) ncv;
			value = String.valueOf(l);
		}
		return value;
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void wait(WebElement element) throws InterruptedException {
		element.wait(2000);
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);

	}
	public static  String passData(String data1,String data,int rowno,int cellno) throws IOException {
		File f = new File("D:\\Eclipse\\ExampleWork\\DataFile\\Data.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sh = wb.getSheet(data1);
		Row r = sh.getRow(rowno);
		Cell cl = r.createCell(cellno);
		cl.setCellValue(data);
		FileOutputStream w = new FileOutputStream(f);
        wb.write(w);
		return data;

	}
	}

	

