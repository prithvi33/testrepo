package String_Java_Programs;

public class Reversed_String {

	public static void main(String[] args) {
		String  a = "PRITHVIRAJ";
		String reverse = "";
		
		System.out.print("original word :");
		System.out.println("Prithviraj");
		
		for(int i=a.length()-1; i>=0; i--) {
			reverse = reverse + a.charAt(i);
		}
		
		System.out.println(reverse);
	}
}
