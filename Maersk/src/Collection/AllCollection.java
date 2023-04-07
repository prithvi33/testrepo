package Collection;

import java.util.ArrayList;

public class AllCollection {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Prithviraj");
		list.add(12.12f);
		list.add("@");
		list.add(7768813816l);
		list.add("zprithvi@gmail.com");
		
		  int size1 = list.size();
		System.out.println(size1);
		
	for (int i = 0; i<size1; i++) {
		System.out.println(list.get(i));
	}
	
	
	
	System.out.println("********************************************************");
	
	list.remove(3);

	for (int i = 0; i<size1; i++) {
		System.out.println(list.get(i));
	}
	
	
	
	
	}

}
