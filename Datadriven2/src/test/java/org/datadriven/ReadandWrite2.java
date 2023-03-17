package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWrite2 {
	public static void main(String[] args) throws IOException {
		
		 File file = new File("C:\\Users\\seenuvasan\\Desktop\\ABCD.xlsx");
		 
		    FileInputStream stream = new FileInputStream(file);
		    Workbook workbook = new XSSFWorkbook(stream);
		        Sheet sheet=workbook.getSheet("Sheet1");
		        Sheet createSheet = workbook.createSheet("Sheet4");
		        
		  int rows= sheet.getPhysicalNumberOfRows();
		  
		  for(int i=0;i<rows;i++)
		  {
			  Row row=sheet.getRow(i);
			 Row createrow= createSheet.createRow(i);
			 
			        int cell=row.getPhysicalNumberOfCells();
			        for(int j=0;j<cell;j++)
			        {
			        	Cell cells=row.getCell(j);
			        	Cell createcell=createrow.createCell(j);
			   
			        }
			        
			        
		  }
		 
		
	}

}
