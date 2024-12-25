package basic_programe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("    https://www.google.com/  ");
		//textarea[@class='gLFyf']

		WebElement auto = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		auto.sendKeys("sal");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
		}
		
	
	}

	}
