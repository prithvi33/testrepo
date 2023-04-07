package String_Java_Programs;

public class ArmStrong_String {
	
	public static void main(String[] args) {
		
		int original = 371;  // 3*3*3= 27, 7*7*7=343, 1*1*1= 1 so, 27+343+1=371...
		int add = 0;
		
		for(int i = original; i>0; i=i/10) {
			int remaider= i%10; //1
			 
			add = add + (remaider*remaider*remaider);
			}
		if (original==add) {
			System.out.println("given number is armstrong number");
		}
		else {
			System.out.println("given number is not armstrong nuumber");
		}
		
		
		
	}

}
