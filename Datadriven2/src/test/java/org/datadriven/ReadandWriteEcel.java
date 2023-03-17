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

public class ReadandWriteEcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\New folder\\Excel\\ABC.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("Sheet1");
		int physicsrows=sheet.getPhysicalNumberOfRows();
		
		for(int i =0;i<physicsrows;i++)
		{
			Row row=sheet.getRow(i);
			
		     int cell= row.getPhysicalNumberOfCells();
		     for(int j=0;j<cell;j++)
		    	 
		     {
		    	Cell cells=row.getCell(j);
		    	CellType cellType = cells.getCellType();
		    	
		    	switch (cellType) {
				case STRING:
					String value=cells.getStringCellValue();
					System.out.println(value);
					break;
				case NUMERIC:
					double valuemk=cells.getNumericCellValue();
			    	long l =(long)valuemk;
			    	System.out.println(l);
				default:
					break;
				}
//		    	double valuemk=cells.getNumericCellValue();
//		    	long l =(long)valuemk;
//		    	System.out.println(l);
	     }
		     
		 
		     
		        
	
//		Row row =sheet.getRow(0);
//		Cell cell=row.getCell(0);
//		String valus=cell.getStringCellValue();
//		System.out.println(valus);
		

}
		}
	}

