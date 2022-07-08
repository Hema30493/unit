package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample {
	@Before
	public void beforeCase() {
		System.out.println("Welcome");
	}
	@Test
	public void testCase() {
		System.out.println("Hello");
		System.out.println("Hi");
	}
	@After
	public void afterCase() {
		System.out.println("Thanks");
	}

}
