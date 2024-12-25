package basicTestngConcepts;

import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingwindow {

	@Test
	public void handlingwindow() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//button[@id='openwindow']"));
		
		click.click();
		System.out.println(driver.getCurrentUrl());
		Set<String> window = driver.getWindowHandles();
		Iterator<String> page = window.iterator();
		String win1 = page.next();
		String win2=page.next();
		
		driver.switchTo().window(win2);
		
		driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Courses']")).click();
		
		
	}
}
