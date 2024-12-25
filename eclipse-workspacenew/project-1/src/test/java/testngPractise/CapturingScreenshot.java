package testngPractise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingScreenshot {
	@Test
	public void screenshot() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver.findElement(By.xpath("//img[@ alt='company-branding']"));
		File ss = screenshot.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\gaura\\eclipse-workspacenew\\project-1\\screenshot//logo.jpeg");
		
       FileUtils.copyFile(ss, desti);
       System.out.println("  logo print");
		
	}
	
	

}