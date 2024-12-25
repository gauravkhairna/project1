package basicTestngConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this code will execute before execution of all code in the class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this code will execute after execution of all code in the class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this code will execute before the acual method/@Test is executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this code will execute after the acual method/@Test is executed");
	}
	
	@Test
	public void m1()
	{
		System.out.println("i m actual code m1");
	}
	
}
