package basic_programe;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstprogram {
	
	public static  void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
	//	WebElement female = driver.findElement(By.xpath("//input[@value='f' ]"));
		//female.click();
		
		
		
		
		
		
		
///	WebElement input = driver.findElement(By.xpath(	"//select[ @name='date_day']"));
//	Select s = new Select(input);
//	s.selectByIndex(2);

	


	
	//	WebElement inpit1 = driver.findElement(By.xpath("//input[@name='fullname']"));
	//	System.out.println(inpit1);
//	System.out.println(input.isDisplayed());

		// driver.findElement(By.xpath( " //input[@id='sex']"    )).sendKeys("a");
// driver.findElement(By.xpath( "//input[@value='Sign up']")).click(); 
		
	
		//.sendKeys("abc");;
//input[@id='password']
		////input[@name='name68e61ebb']
//input[@value="Sign up"]
		
}

}