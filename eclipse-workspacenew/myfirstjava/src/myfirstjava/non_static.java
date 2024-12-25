package myfirstjava;

public class non_static {

	 void add() {
		
		int a=80;
		int b=80;
		int c=a+b;
		System.out.println(c);
	
	}
	
	
	
	public static void main(String[] args) {
	   
		non_static obj =new  non_static();
		
		obj.add();
			}



	

}

