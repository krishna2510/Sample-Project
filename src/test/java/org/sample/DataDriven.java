package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws IOException {
	File f = new File("D:\\Eclipse\\ExampleWork\\DataFile\\DtaExcel.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(stream);
	Sheet cs = wb.getSheet("Sheet1");
	Row rw = cs.getRow(0);
	Cell c = rw.getCell(0);
   int r =	cs.getPhysicalNumberOfRows();
    System.out.println(r);
	int s = rw.getPhysicalNumberOfCells();
	System.out.println(s);
	int noofrows = cs.getLastRowNum();
	System.out.println(noofrows);
	for (int i = 0; i <=noofrows; i++) {
		System.out.println(cs.getRow(i).getCell(0));
		System.out.println(cs.getRow(i).getCell(1));
	}

}
}
