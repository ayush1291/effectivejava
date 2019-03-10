package chap3;

import java.util.Arrays;

public class Basics {

	//Just check all the methods of object class
	// The methods are non final
	
//	Object
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] a = new int[10];
		a.clone();
	
		//This is used as no auto boxing happens and performance is more
//		Float.compare(f1, f2);
		
		
	}
	
	
	static class A{
		Exception a(RuntimeException e) throws InterruptedException{
			Thread.sleep(1000);
			return null;
		}
	}
	
	static class B extends A{
		
		
		RuntimeException a(RuntimeException e, int b) {
			return null;
		}
	}
	
}
