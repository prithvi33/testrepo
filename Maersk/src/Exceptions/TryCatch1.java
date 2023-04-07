package Exceptions;

public class TryCatch1 {
	
	public static void main(String[] args) {
		int a = 16;
		int b = 0;
		int c = 0;
		int d [] = {11, 23, 44, 56, 76, 70};
		
		System.out.println("before try block code started");
			
	 try {
		 System.out.println("try block Risky code");
		
		 
		 
		 System.out.println(d[6]); // event (exception) generated...
		 c = a/b;
	 }
	 
	 catch(ArithmeticException e) {
		 b = 2;
		 c = a/b;
		 System.out.println("arithmetic code");
	 }
	 
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("alternative code");
		 System.out.println(d[4]);
	 }
	
	
	System.out.println(c);
	
	// Exception generated & not get handled,
	// try block executed.
	
	// Exception generated & get handled,
	// try & catch block & final block & normal flow.
	
	//Exception not generated,
	// try & normal flow.
	
	}

}
