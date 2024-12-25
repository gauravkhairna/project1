package basic_programe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("  https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
	
		
		//WebElement path = driver.findElement(By.xpath("  //frame[@cd_frame_id_='e9cf0fc1aa9a8551ee1b4e3949d0ea97']"));
		WebElement frame = driver.findElement(By.xpath("//div[@class='top']//div[@class='row']"));
		
		
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hii");
	  // driver.switchTo().frame(3);	
		//driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("hello");
		   
	  
	   
		

}	
}

//    driver.get("    https://demo.automationtesting.in/Frames.html");
//WebElement search = driver.findElement(By.xpath("//input[@id='s']"));
//search.sendKeys("ok");
//li[@id='iFrame']


//driver.switchTo().frame(2);
//driver.switchTo().frame("frame_3.html");
//	WebElement iframe = driver.findElement(By.xpath("//frame[@ src='frame_3.html']"));
//driver.switchTo().frame(iframe);

//WebElement input = driver.findElement(By.xpath("//input[@name='mytext3']"));
//input.sendKeys("myname");
