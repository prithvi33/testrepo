package Exceptions;

import java.util.NoSuchElementException;

public class Basic1 {

	public void demo1 () {
		throw new ArrayStoreException();
	}
	
	public void test1 () {
		throw new IllegalArgumentException();
	}
	public void prithvi() {
		throw new ArrayIndexOutOfBoundsException();
	}
	public void sups() {
		throw new NoSuchElementException();
		
	}
	public static void main(String[] args) {
		Basic1 p = new Basic1();
		p.sups();
		p.demo1();
		p.test1();
		p.prithvi();
		
	}
	
	
}
