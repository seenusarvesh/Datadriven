package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File ("C:\\\\New folder\\\\Excel\\\\ABC.xlsx");

		   FileInputStream stream = new FileInputStream(file);

		                Workbook workbook = new XSSFWorkbook(stream);
		            
		                Sheet sheet = workbook. getSheet("Sheet1");

		                Row row = sheet. getRow(0);

		                Cell cell = row. getCell(0);

		                 String stringCellValue = cell.getStringCellValue();

		                  System.out.println(stringCellValue);

		
		

	}

}
