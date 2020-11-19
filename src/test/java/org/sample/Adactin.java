package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	getDriver();
	enterUrl("http://adactinhotelapp.com/index.php");
	WebElement txtUser = driver.findElement(By.id("username"));
	enterText(txtUser, getDataFromExcel("Sheet1", 1, 0));
	WebElement txtpass = driver.findElement(By.id("password"));
	enterText(txtpass, getDataFromExcel("Sheet1", 1, 1));
	WebElement btn1 = driver.findElement(By.id("login"));
	elementClick(btn1);
	WebElement location = driver.findElement(By.id("location"));
	enterText(location, getDataFromExcel("Sheet1", 1,2));
	WebElement norooms = driver.findElement(By.id("room_nos"));
	enterText(norooms, getDataFromExcel("Sheet1", 1, 3));
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	enterText(checkIn, getDataFromExcel("Sheet1", 1, 4));
	WebElement chechOut = driver.findElement(By.id("datepick_out"));
	enterText(chechOut, getDataFromExcel("Sheet1", 1, 5));		
	WebElement adultNo = driver.findElement(By.id("adult_room"));
	enterText(adultNo, getDataFromExcel("Sheet1", 1, 6));
	WebElement search = driver.findElement(By.id("Submit"));
	elementClick(search);
	WebElement radio = driver.findElement(By.id("radiobutton_1"));
	elementClick(radio);
	WebElement cont = driver.findElement(By.id("continue"));
	elementClick(cont);
	WebElement fiName = driver.findElement(By.id("first_name"));
	enterText(fiName, getDataFromExcel("Sheet1", 1, 7));
	WebElement lName = driver.findElement(By.id("last_name"));
	enterText(lName, getDataFromExcel("Sheet1", 1, 8));
	WebElement address = driver.findElement(By.id("address"));
	enterText(address, getDataFromExcel("Sheet1", 1, 9));
	WebElement ccNo = driver.findElement(By.id("cc_num"));
	enterText(ccNo, getDataFromExcel("Sheet1", 1, 10));
	WebElement ccType = driver.findElement(By.id("cc_type"));
	enterText(ccType, getDataFromExcel("Sheet1", 1, 11));
	WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
	enterText(expMonth, getDataFromExcel("Sheet1", 1, 12));
	WebElement expYear = driver.findElement(By.id("cc_exp_year"));
	enterText(expYear, getDataFromExcel("Sheet1", 1, 13));
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	enterText(cvv, getDataFromExcel("Sheet1", 1, 14));
	WebElement book = driver.findElement(By.id("book_now"));
	elementClick(book);
    passData("Sheet1", "Order no", 0, 15);
    passData("Sheet1", "91JJXJY7EB", 1, 15);
}
}