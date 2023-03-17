package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rj123456");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		File file = new File("C:\\Users\\seenuvasan\\Desktop\\Adactin HotelS.xlsx");
		   FileInputStream stream = new FileInputStream(file);
		   Workbook workbook = new XSSFWorkbook(stream);
		   Sheet sheet=workbook.getSheet("Sheet1");
		   int rowcount=sheet.getLastRowNum();
		  int columncount = sheet.getRow(rowcount).getLastCellNum();
		     System.out.println("Rowcount:"+rowcount+"Columncount:"+columncount);
		     
		    
	

		   
			  
			 WebElement chooseoption= driver.findElement(By.xpath("//select[@id='location']"));
			 chooseoption.click();
			 Select dd = new Select(chooseoption);
			 dd.selectByVisibleText("Sydney");
			 WebElement hotel= driver.findElement(By.xpath("//select[@id='hotels']"));
			 hotel.click();
			 Select dd1= new Select(hotel);
			 dd1.selectByVisibleText("Hotel Sunshine");
			 
			 WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
			 roomtype.click();
			 Select dd2 = new Select(roomtype);
			 dd2.selectByVisibleText("Super Deluxe");
			 
			WebElement roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
			roomnos.click();
			Select dd3 = new Select(roomnos);
			dd3.selectByVisibleText("8 - Eight");
			
			Thread.sleep(3000);
			
		    WebElement datepick=driver.findElement(By.xpath("//input[@id='datepick_in']"));
	  	    datepick.sendKeys("22/02/2023");

	  	  
	  	     Thread.sleep(3000);
	  	     WebElement datepicks=driver.findElement(By.xpath("//input[@id='datepick_out']"));
	  	     datepicks.sendKeys("24/02/2023");

	  	  
	  	     WebElement adult=driver.findElement(By.xpath("//select[@id='adult_room']"));
	  	     adult.click();
	  	     Select dd6 = new Select(adult);
	  	     dd6.selectByVisibleText("2 - Two");
	 	     WebElement child=driver.findElement(By.xpath("//select[@id='child_room']"));
	 	     child.click();
	    	  Select dd7 = new Select(child);
	 	     dd7.selectByVisibleText("4 - Four");
	 	 
	         driver.findElement(By.xpath("//input[@id='Submit']")).click();
	     
	         driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	         driver.findElement(By.xpath("//input[@id='continue']")).click();
		 
	    	 
	    	 driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Seenuvasan");
	    	 driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("pandurangan");
	    	 driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Chennai velachery");
	    	 driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567899876512");
	    	 WebElement cctype=driver.findElement(By.xpath("//select[@id='cc_type']"));
	    	 cctype.click();
	    	 Select se = new Select(cctype);
	    	 se.selectByVisibleText("VISA");
	    	 
	    	 WebElement expmonth=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	    	 expmonth.click();
	    	 Select see = new Select(expmonth);
	    	 see.selectByVisibleText("September");
	    	 
	    	 WebElement expyear=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	    	 expyear.click();
	    	 Select seee = new Select(expyear);
	    	 seee.selectByVisibleText("2022");
	    	 
	    	 
	    	 driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
	    	 driver.findElement(By.xpath("//input[@id='book_now']")).click();
	    	 
	    	 
	    	 String s= driver.findElement(By.xpath("//input[@id='order_no']")).getAttribute("value");
                
               System.out.println(s);
          
}
}