package org.locator;

import java.io.IOException;

import org.sample.BaseClass;

public class Sample1 extends BaseClass{
public static void main(String[] args) throws IOException {
	getDriver();
	enterUrl("http://adactinhotelapp.com/index.php");
	Login log = new Login();
	
	enterText(log.getUsername(), getDataFromExcel("Sheet1", 1, 0));
	enterText(log.getPassword(), getDataFromExcel("Sheet1", 1, 1));
	elementClick(log.getLoginbtn());
}
private void work() {
	System.out.println("Krishna Updated");
	System.out.println("Work done");

}
}
