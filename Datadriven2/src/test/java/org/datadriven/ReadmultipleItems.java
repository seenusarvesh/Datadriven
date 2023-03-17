package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadmultipleItems {
	public static void main(String[] args) throws IOException {
		
	
	
	File file = new File("C:\\Users\\seenuvasan\\Desktop\\ABCD.xlsx");
	
	     FileInputStream stream = new FileInputStream(file);
	        
	          Workbook workbook = new XSSFWorkbook(stream);
	          
	        Sheet sheet=  workbook.getSheet("Sheet1");
	           int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	           
	                for(int i=0;i<physicalNumberOfRows;i++)
	                {
	                	Row row = sheet.getRow(i);
	                	int cell=row.getPhysicalNumberOfCells();
	                	for(int j=0;j<cell;j++)
	                	{
	                		Cell cells=row.getCell(j);
	                	CellType cellType = cells.getCellType();
	                		
	                		switch (cellType) {
							case STRING:
								String cellvalue=cells.getStringCellValue();
	                		System.out.println(cellvalue);
								break;
								
							case NUMERIC:
								double cellvaluea=cells.getNumericCellValue();
               		   long l = (long)cellvaluea;
		                		   System.out.println(l);
							default:
								break;
							}
//	                		String cellvalue=cells.getStringCellValue();
//	                		System.out.println(cellvalue);
//	                		
//	                		double cellvaluea=cells.getNumericCellValue();
//	                		   long l = (long)cellvaluea;
//	                		   System.out.println(l);
	                	}
	                	
	                	
	                	
	                }

}
}
