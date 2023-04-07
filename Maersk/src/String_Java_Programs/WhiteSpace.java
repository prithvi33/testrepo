package String_Java_Programs;

public class WhiteSpace {
	
	public static void main(String[] args) {
		
		String add = "PRI THH VI RAJ  ZA NJ UR NE";
		int total = 0;
		
		for (int i = 0; i<=add.length()-1; i++) {
			
		
		char p = add.charAt(i);
		System.out.println(p);
	
	   	
		
		if (p==' ') {
			
			total++;
		}
		}
		
		System.out.println(total);
		
		}

}
