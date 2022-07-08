package Junit;

import org.junit.Test;

public class UseExample {
	Example e=new Example();
	@Test
	public void testCase() {
		e.primeNo();
	}
	@Test
	public void palindrome() {
		e.palindrome();
	}
	

}
