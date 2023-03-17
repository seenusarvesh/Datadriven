package org.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollupandDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://echoecho.com/tooldropdown.htm");
		   
		   JavascriptExecutor executor = (JavascriptExecutor)driver;
//		   executor.executeScript("window.scroll(0,450)", "");
//		   executor.executeScript("window.scroll(0,-450)", "");
//		   Thread.sleep(5000);
//		   executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
//		   Thread.sleep(5000);
//		   executor.executeScript("window.scrollTo(0,0)", "");
		   Thread.sleep(3000);
		   
		  WebElement target= driver.findElement(By.xpath("//input[@type='reset']"));
		  executor.executeScript("arguments[0].scrollIntoView(true)", target);
		  //Thread.sleep(3000);
		//  executor.executeScript("window.scrollTo(0,0)", "");
		  
		  
	}

}
