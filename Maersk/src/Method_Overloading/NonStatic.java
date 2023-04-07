package Method_Overloading;

public class NonStatic {
	
	public void addition (int a, int b) {
		System.out.println(a+b);
		
	}
	
	public void addition (int c, int d, int e, int f) {
		System.out.println(c+d+e+f);
		}
	
	public static void main(String[] args) {
		NonStatic p = new NonStatic();
		p.addition(35, 40);
		p.addition(25, 50, 20, 10);
		
	}

}
