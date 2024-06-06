package sdet_Pavan_Day8;

public class Demo1 {

	public static void main(String[] args) {
		String s = "Welcome";
//		String s1= new String("Welcome");
		
		System.out.println("length of string is " +s.length());
//		System.out.println("length of string is "+"Welcome".length());
		
//		concat() = Joining two strings
		String s1="Welcome ";
		String s2=" to ";
		String s3="java";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("Welcome ".concat("to java"));
		
		String a1="12";
		String a2="23";
		int a3=43;
		System.out.println(a1+a2);
		System.out.println(a1+a2+a3);
		System.out.println(a3+a1+a2);
		
//		trim() :  remove spaces from the string
		String s4 = "    Welcome to java     ";
		System.out.println("Before trim : "+s4.length());
		System.out.println("After trim : "+s4.trim().length());
		
//		charAt() : returns character based on index
		s="Welcome";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		
//		contains() : return true or false and also check whether part of string or not
		System.out.println(s.contains("Wel"));  //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("wel"));   //false
		
//		equals() and equalIgnorecase() method
		s1="welcome";
		s2="welcome";
		s3="Welcome";
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
//		replace() : replace 
		String s5 = "Selenium with java Selenium with python and Selenium with JavaScript";
		System.out.println(s5.replace("Selenium", "playwright"));
		
		
	}

}
