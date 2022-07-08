package Junit;

public class Example {
	
	public void primeNo() {
		int num=12;
		boolean value=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				value=false;
				
			}
		}
		if(value) {
			System.out.println(num+" is a prime No");
		}
		else {
			System.out.println(num+" is not a Prime No");
		}
		
	}
	public void palindrome() {
		String valueName="wow";
		String a="";
		for(int i=valueName.length()-1;i>=0;i--) {
			a=a+valueName.charAt(i);
		}
		if(valueName.equals(a)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
}