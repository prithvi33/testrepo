package Exceptions;

public class TryCatch {
	public static void main(String[] args) {
		int a = 30;
		int b = 0;
		int c = 0;
		 
		try {
			System.out.println("Risky Code ");
			
	      c = a/b;
		}
		
		catch (ArithmeticException e) {
			b = 2;
			c = a/b;
			System.out.println("alterantive code");
			System.out.println(c);
			
		}
	}

}
