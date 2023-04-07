package JAVA_Programs;

import java.util.Scanner;

public class Scan1 {
	
	public static void main(String[] args) {
		
		Scanner Prithvi = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = Prithvi.next();
		
		System.out.println("Enter the Mobile No :");
		long mobile = Prithvi.nextLong();
		
		System.out.println("Enter the Position :");
		String position = Prithvi.next();
		
		System.out.println("Enter the Gender :");
		char gender = Prithvi.next().charAt(0);
		
		System.out.println("Entter the Company Name :");
		String company = Prithvi.next();
		
		System.out.println("...........................................................");
		System.out.println(" name :" +name);
		System.out.println(" mobile :" +mobile);
		System.out.println(" Position :" +position);
		System.out.println("gender:" +gender);
		System.out.println(" company :" +company);
		
	}

}
