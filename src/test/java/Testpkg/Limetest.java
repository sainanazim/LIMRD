package Testpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basepkg.Basecls;
import Pagepkg.Limepage;
import utilities.Excelutils;


public class Limetest extends Basecls {
	
	@Test(priority = 1)
	public void verifytest() throws IOException, InterruptedException
	{

		Limepage ob = new Limepage(driver);
		String xl = "G:\\lime.xlsx";
		String Sheet = "Sheet1";
		int rowcount = Excelutils.getRowCount(xl, Sheet);
		for(int i =1;i<= rowcount;i++)
		{
			String mobno =  Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("mobile no: "+mobno);
			ob.profile();
			driver.navigate().refresh();
		    ob.setvalues(mobno);
		    Thread.sleep(9000);
			
			
	     }
	}
	@Test(priority = 2)
	public void logo()
	{
		Limepage ob = new Limepage(driver);
	    ob.logo();
    
	}
	
	@Test(priority = 3)
	public void menus()
	{
		Limepage ob = new Limepage(driver);
		ob.menus();
	}
	
	
	@Test(priority = 4)
	public void bagsearch()
	{
		
		Limepage ob = new Limepage(driver);
		ob.search();
	    
	    
	}
	
	
	
	@Test(priority = 5)
	public void titleverify() throws InterruptedException
	{
		Limepage ob = new Limepage(driver);
		ob.titleverfctn();
	  
	}
	
		
	@Test(priority = 6)
	public void kids() throws InterruptedException
	{
		Limepage ob = new Limepage(driver);
		ob.kids();
	}
	
	
	@Test(priority =  7)
	public void women()
	{
		Limepage ob = new Limepage(driver);
		ob.women();
		 
	}
	
	@Test(priority = 8)
	public void men()
	{
		
		Limepage ob = new Limepage(driver);
		ob.men();
        
	}
	
	@Test(priority = 9)
	public void scrnsht() throws IOException
	{
		
		Limepage ob = new Limepage(driver);
		ob.screenshot();
	  
	    
	}
	
	
	
	
	
}
