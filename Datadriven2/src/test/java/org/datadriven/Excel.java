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

public class Excel {
	
	   public static void main(String[] args) throws IOException {
		   
		   File file = new File("C:\\New folder\\Excel\\ABC.xlsx");
		     FileInputStream stream = new FileInputStream(file);
		     Workbook workbook = new XSSFWorkbook(stream);
		     
		     Sheet sheet = workbook.getSheet("Sheet3");
		    
		    int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		    for(int i=0;i<physicalNumberOfRows;i++)
		    {
		    	Row row =sheet.getRow(i);
		    	int cells =row.getPhysicalNumberOfCells();
		    	for(int j=0;j<cells;j++)
		    	{
		    		Cell cell=row.getCell(j);
		    		
//		    		CellType cellType = cell.getCellType();
//		    		switch (cellType) {
//					case STRING:
//						 String stringCellValue = cell.getStringCellValue();
//						System.out.println(stringCellValue);
//						break;
//					case NUMERIC:
//						double numbericvlaue=cell.getNumericCellValue();
//						    long l = (long)numbericvlaue;
//						    System.out.println(l);
//						
//					
//
//					default:
//						break;
//					}
		    		
		    		
					 
						
				
		    	
		    		
		    		
		    		String stringCellValue = cell.getStringCellValue();
	    		System.out.println(stringCellValue);
		    		
		    		double numericCellValue = cell.getNumericCellValue();
		    		long l= (long) numericCellValue;
		    		System.out.println(l);
		    		
		    		boolean booleanCellValue = cell.getBooleanCellValue();
		    		  System.out.println(booleanCellValue);
		    		
		    	}
		    }
		     
}
}


		  