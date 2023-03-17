package org.datadriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\New folder\\Excel\\ABC.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		Sheet createsheet=workbook.createSheet("Sheet4");
		Row createrow=createsheet.createRow(0);
		Cell createcell=createrow.createCell(0);
		createcell.setCellValue("kava");
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
		
		
		
		
		

	}

}
