package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amazon extends BaseClass {
public static void main(String[] args) {
	getDriver();
	enterUrl("https://www.amazon.in/");
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	enterText(search, "Dell Laptop");
	WebElement btn = driver.findElement(By.id("nav-search-submit-text"));
	elementClick(btn);
	WebElement s1 = driver.findElement(By.xpath("//span[text()='HP 14 10th Gen Intel Core i5 14-inch HD Laptop (i5-10210U/8GB/512GB SSD/Win 10/MS Office/Win 10/Jet Black/1.5 kg), 14-ck2018tu']"));
	gettText(s1);
	WebElement s2 = driver.findElement(By.xpath("(//span[text()='Dell Vostro 3401 14inch FHD AG 2 Side Narrow Border Display Laptop (10th gen i3-1005G1 / 4GB / 1TB / Integrated Graphics/ Win 10 + MS Office H&S 2019 / Black) D552124WIN9BE'])[1]"));
	gettText(s2);
	WebElement s3 = driver.findElement(By.xpath("(//span[text()='Dell Inspiron 3595 15.6-inch HD Laptop (A9-9425/4GB/1TB HDD/Win 10 + MS Office/Radeon R5 Integrated Graphics/Silver) D560167WIN9SE'])[1]"));
	gettText(s3);
	WebElement s4 = driver.findElement(By.xpath("(//span[text()='DELL Inspiron 3583 15.6inch HD Laptop (Pentium Gold 5405U/4GB/1TB HDD/Win10 + MS Office/Intel UHD Graphics/ Silver) SLV-C563119WIN9'])[1]"));
	gettText(s4);
	WebElement s5 = driver.findElement(By.xpath("(//span[text()='DELL Inspiron 3595 15.6-inch HD Laptop (A6-9225/4GB/1TB HDD/Win 10 + MS Office/Integrated Graphics/Platinum Silver) D560166WIN9SE'])[1]"));
	gettText(s5);
	WebElement s6 = driver.findElement(By.xpath("(//span[text()='Dell Vostro 3401 14inch FHD AG 2 Side Narrow Border Display Laptop (10th gen i3-1005G1 / 4GB / 1TB / Integrated Graphics/ Win 10 + MS Office H&S 2019 / Black) D552124WIN9BE'])[1]"));
	gettText(s6);
	WebElement s7 = driver.findElement(By.xpath("(//span[text()='Dell Inspiron 3505 15inch FHD AG Display Laptop (Ryzen-5 3500U / 8GB / 512 SSD / Vega Graphics / 1 Yr NBD Warranty / Win 10 + MS Office H&S 2019 / Soft Mint) D560341WIN9S'])[1]"));
	gettText(s7);
	WebElement s8 = driver.findElement(By.xpath("(//span[text()='DELL Inspiron 3593 15.6-inch FHD Laptop (10th Gen Core i3-1035G1/4GB/1TB HDD/Window 10 + Microsoft Office/NoDvD/Integrated Graphics), Black'])[1]"));
	gettText(s8);
	WebElement s9 = driver.findElement(By.xpath("(//span[text()='VOSTRO 3405 14inch HD AG Laptop (Ryzen-3 3250U / 4 GB / 1TB / Vega Graphics / 1 Yr NBD / Win 10 + MS Office H&S 2019) D552134WIN9BE'])[1]"));
	gettText(s9);
	WebElement s10 = driver.findElement(By.xpath("(//span[text()='HP 14s core i5 10th Gen 14 inch FHD Laptop (8 GB/256 GB SSD/1TB HDD/Windows 10/MS Office 2019/Natural Silver /1.43kg) 14s-cr2000tu'])[1]"));
	gettText(s10);
	WebElement s11 = driver.findElement(By.xpath("(//span[text()='HP 15 db1069AU 15.6-inch Laptop (3rd Gen Ryzen 3 3200U/4GB/1TB HDD/Windows 10/MS Office/Radeon Vega 3 Graphics), Jet Black'])[1]"));
	gettText(s11);
	WebElement s12 = driver.findElement(By.xpath("(//span[text()='Dell Vostro 3491 14-inch FHD Laptop (10th Gen i3-1005G1/4GB/1TB HDD + 256GB SSD/Win 10 + MS Office/Intel HD Graphics/Black) D552115WIN9BE'])[1]"));
	gettText(s12);
	
}
}
