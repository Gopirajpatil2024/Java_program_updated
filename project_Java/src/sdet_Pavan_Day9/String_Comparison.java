package sdet_Pavan_Day9;

public class String_Comparison {

	public static void main(String[] args) {
		String s1 ="Welcome";
		String s2="Welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		String s3= new String("Welcome");
		String s4 =  new String("Welcome");
		System.out.println(s3==s4);  //To compare the objects
		System.out.println(s3.equals(s4)); //To compare value of the object
		
		String s5="abc";
		String s6=new String("abc");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		String s7="abc";
		String s8 = new String("abc");
		String s9=s8;
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
		System.out.println(s8==s9);
		
	}

}
