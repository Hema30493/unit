package Junit;

import org.junit.Test;

public class NameLength {
	String name="Ram";
	String name1="Raja";
	String name2="Ashok";
	
	String value1="";
	String value2="";
	String value3="";
	
	public void nameTest() {
		
		if(name.length()>name1.length() || name.length()>name2.length()) {
			value1=name;
			System.out.println(value1);
		}
		else if(name1.length()>name.length() || name1.length()>name2.length()) {
			value2=name1;
			System.out.println(value2);
		}
		else {
			value3=name2;
			System.out.println(value3);
		}
		
	}

}
