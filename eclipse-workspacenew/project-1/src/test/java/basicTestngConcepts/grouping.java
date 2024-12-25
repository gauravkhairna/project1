package basicTestngConcepts;

import org.testng.annotations.Test;

public class grouping {
	private static final boolean test3 = false;
	@Test(groups = "SMOKING")
	public void test1() {
		System.out.println("test 1");
		
		
	}
	@Test(groups = "SMOKING")
	public void test2() {
		System.out.println("test 2");
		
			
	}
	@Test(enabled=test3)
	public void test3() {
		System.out.println("test 3");
		
	}
	@Test(groups = "INERGRATION")
	public void test4() {
		System.out.println("test 4");
		
	}
	
}
