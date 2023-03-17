package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {
		
		
		    File file = new File("C:\\Users\\seenuvasan\\Desktop\\ABCD.xlsx");
		         Workbook workbook = new XSSFWorkbook();
		         
		            Sheet createSheet = workbook.createSheet("Sheet1");
		                 Row createRow = createSheet.createRow(0);
		                        Cell createCell = createRow.createCell(0);
		                        createCell.setCellValue("mava");
		                        FileOutputStream stream = new FileOutputStream(file);
		                        workbook.write(stream);
	}

}
