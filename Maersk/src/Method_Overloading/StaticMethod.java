package Method_Overloading;

public class StaticMethod {
	
	public static void substraction(int a, int b , int c) {
		System.out.println(a-b-c);
	}
	
	public static void substraction(int d, int e) {
		System.out.println(d-e);
	}
	
	public static void substraction(int f, int g, int h, int i) {
		System.out.println(f-g-h-i);
	}
	
	public static void main(String[] args) {
		StaticMethod.substraction(90, 10, 10);
		StaticMethod.substraction(50, 10);
		StaticMethod.substraction(100, 20, 10, 20);
	}

}
