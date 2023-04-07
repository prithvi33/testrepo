package String_Java_Programs;

public class Reversed_String_1 {
	public static void main(String[] args) {
		
		String a = "JARIVHTIRP";
		String reverse = "";
		
		
		
		for(int i = a.length()-1; i>=0; i--) {
			reverse = reverse + a.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
