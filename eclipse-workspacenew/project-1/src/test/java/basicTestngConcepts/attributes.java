package basicTestngConcepts;

import org.testng.annotations.Test;

public class attributes {
	@Test(dependsOnMethods = {"test3"})
public void	test1(){
		System.out.println("one");
		
	}

	@Test(enabled = false )
public void	test2(){
		System.out.println("two");
		
	}
	@Test()
	public void	test3(){
		System.out.println("three");
		
	}
	
	@Test(enabled = false)
	public void	test4(){
		System.out.println("four");
		
	}
	
	
	
	
}
