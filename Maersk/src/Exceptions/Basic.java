package Exceptions;

public class Basic {

	static void Test () {
		throw new NullPointerException();
	}
	
	static void demo () {
		throw new ArithmeticException ();
		
	}
	static void prithvi() {
		throw new UnsupportedOperationException();
	}
	
	public static void main (String[] args) {
		System.out.println("Main Method Running");
      prithvi();
	 demo();
	
	 Test();
	}
}
