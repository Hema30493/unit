package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UseNameLength {
	NameLength n=new NameLength();
	
	String name1="Ashok";
	
	@Test 
	public void testcase() {
		n.nameTest();
	}

}
