package org.cdacnoida.course.Test;

public class Addition {

	private static void add(int... arr) {
		
		int result =0 ;
		
		for(int element:arr)
			result =  result + element ;
		System.out.println("result = "+result);
		
		
	}
	
	public static void main(String[] args) {
		
		add(10,20);
		add(20,49,90);
		add(78,56,89,90);
		add(44,44,55,6,7,77);
		
	}
}
