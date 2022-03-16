package org.cdacnoida.course.Marks;

public class Swap {
    
	static int num1 =10;
	static  int num2=22;
	 
	
	static void change() {
		 
		
		int temp1 = num1;
		 num1 =num2;
		 num2 = temp1;
	 }
	public static void main(String[] args) {
		
		
		change();
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);

	}

}
