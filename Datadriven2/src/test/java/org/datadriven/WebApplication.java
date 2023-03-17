package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebApplication {
	
	public static void main(String[] args) throws IOException {
		
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://adactinhotelapp.com/Logout.php");
		   
		   File file = new File("C:\\Users\\seenuvasan\\Desktop\\Adactin Hotels.xlsx");
		   FileInputStream stream = new FileInputStream(file);
		   Workbook workbook = new XSSFWorkbook(stream);
		   Sheet sheet=workbook.getSheet("Sheet1");
		   int rowcount=sheet.getLastRowNum();
		  int columncount = sheet.getRow(rowcount).getLastCellNum();
		     System.out.println("Rowcount:"+rowcount+"Columncount:"+columncount);
		     
		     for(int i=0; i<rowcount;i++)
		     {
		    	 Row row=sheet.getRow(i);
		    	 
		    	   String mail=row.getCell(0).getStringCellValue();
		    	   String masterpassword=row.getCell(1).getStringCellValue();
		    	   String confirmpassword=row.getCell(2).getStringCellValue();
		    	   String fullname=row.getCell(3).getStringCellValue();
		    	    
		     
		    	   driver.findElement(By.xpath("//input[@id='email']")).clear();
		     
		        WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		        element.sendKeys(mail);
		        
		        driver.findElement(By.xpath("//input[@id='signup_password']")).clear();
		        
		        WebElement element1 = driver.findElement(By.xpath("//input[@id='signup_password']"));
		        element1.sendKeys(masterpassword);
		        driver.findElement(By.xpath("//input[@id='password_retype']")).clear();
		        WebElement element2 = driver.findElement(By.xpath("//input[@id='password_retype']"));
		        element2.sendKeys(confirmpassword);
		        driver.findElement(By.xpath("//input[@id='name']")).clear();
		        WebElement element3 = driver.findElement(By.xpath("//input[@id='name']"));
		        element3 .sendKeys(fullname);
		        
		        
		        
		     }       
		
		   
	}

}
