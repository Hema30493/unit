package Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestExample {
	String value="Ram";
	String value1="Ram";
	String value2="Priya";
	boolean isEqual=value.equals(value1);
	boolean isNotEqual=value1.equals(value2);
	String value3=null;
	int[] num1= {4,5,6};
	int[] num2= {4,5,6};
	@Test
	public void testcase() {
		assertEquals(value,value1);
	}
	@Test
	public void testcase1() {
		assertNotEquals(value,value2);
	}
	@Test 
	public void testcase2() {
		assertTrue(isEqual);
	}
	@Test 
	public void testcase3() {
		assertFalse(isNotEqual);
	}
	@Test
	public void testcase4() {
		assertNull(value3);
	}
	@Test
	public void testcase5() {
		assertNotNull(value);
	}
	@Test
	public void testcase6() {
		assertSame(value,value1);
	}
	@Test
	public void testcase7() {
		assertNotSame(value1,value2); 
			
		}
	@Test
	public void testcase8() {
		
		Assert.assertArrayEquals(num1,num2);
	}
	}



