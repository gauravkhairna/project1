package basic_programe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hii");





















































//WebElement btn = driver.findElement(By.xpath("(//button[@id='demo_basic-dropdown-selected'])[1]"));
///btn.click();
///btn.sendKeys(Keys.ARROW_DOWN);
///btn.sendKeys(Keys.ARROW_DOWN);
//btn.click();




///WebElement selcts = driver.findElement(By.xpath("//select[@country-data-region-id='gds-cr-one']"));
   //Select s = new Select(selcts);
   ///s.selectByVisibleText("India");
   ///Thread.sleep(2000);
    //s.selectByIndex(2);

//WebElement input = driver.findElement(By.xpath("//select[@ country-data-region-id='gds-cr-one']"));
//System.out.println(input.isDisplayed());
//select[@country-data-region-id='gds-cr-one']

//Select s = new Select(input);
//s.selectByIndex(8);
//System.out.println(s.isMultiple());
//List<WebElement> data = s.getAllSelectedOptions();


}

	}


