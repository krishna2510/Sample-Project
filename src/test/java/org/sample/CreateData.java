package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateData {
public static void main(String[] args) throws IOException {
     File f = new File("D:\\Eclipse\\ExampleWork\\DataFile\\DtaExcel.xlsx");
     FileInputStream stream = new FileInputStream(f);
     Workbook wb = new XSSFWorkbook(stream);
     Sheet sh = wb.getSheet("Sheet1");
     Row rw = sh.createRow(0);
     Cell cl = rw.createCell(2);
     cl.setCellValue("DataDrivenFramework"); 
     		System.out.println("done");
     		FileOutputStream w = new FileOutputStream(f);
     		wb.write(w);
}
}
