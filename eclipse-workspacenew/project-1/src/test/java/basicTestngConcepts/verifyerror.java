package basicTestngConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyerror {
	
	@Test
	public void verifyErrorMessage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin123");
		
		driver.findElement(By.id("Login")).click();
		
		String expectedErrorMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	    Thread.sleep(2000);
		String actualErrorMessage = driver.findElement(By.id("error")).getText();
		
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		
		System.out.println("passed!!");
	}

}