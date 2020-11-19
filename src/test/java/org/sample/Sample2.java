package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample2 extends BaseClass {
public static void main(String[] args) {
	getDriver();
	enterUrl("http://demo.guru99.com/test/drag_drop.html");
	WebElement drag = driver.findElement(By.id("credit2"));
	WebElement drop = driver.findElement(By.id("bank"));
	dragAnddrop(drag, drop);
}
}
