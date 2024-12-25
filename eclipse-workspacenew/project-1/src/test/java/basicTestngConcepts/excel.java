package basicTestngConcepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class excel {
	
	@Test
	public void handlingExcelSheet() throws IOException, InterruptedException {
		FileInputStream fs= new FileInputStream("C:\\Users\\gaura\\OneDrive\\Desktop\\mybook.xlsx");
		//@SuppressWarnings("resource")
		XSSFWorkbook worksheet= new XSSFWorkbook(fs);
		XSSFSheet sheet= worksheet.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell1=row.getCell(0);
		
		///String userName=cell1.toString();
		
		  System.out.println(cell1);
		
	    XSSFCell cell2=row.getCell(1);
	    System.out.println(cell2);
		
		///String password=cell2.toString();
		
		///	System.out.println(cell2);
		
		///	WebDriver driver = new ChromeDriver();
		
		///System.out.println(driver.getCurrentUrl());

		///driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		///driver.manage().window().maximize();

		///Thread.sleep(2000);
		
		///WebElement un= driver.findElement(By.xpath("//input[@name='username']"));
		///	un.sendKeys(userName);
		///	Thread.sleep(2000);
		
		///WebElement ps= driver.findElement(By.xpath("//input[@name='password']"));
		///ps.sendKeys(password);
		///Thread.sleep(2000);
		
		///WebElement lg= driver.findElement(By.xpath("//button[@type='submit']"));
		///	lg.click();
		///	Thread.sleep(2000);
		
		///	String expectedUrl=driver.getCurrentUrl();
		
		///String urlAfterLogin="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		///Assert.assertEquals(urlAfterLogin, expectedUrl);
		
		///	System.out.println("Test Case Passed Successfully");
		
	///	driver.quit();


		
		
		
		
		
	}

}