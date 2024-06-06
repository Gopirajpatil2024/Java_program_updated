package sdet_Pavan_Day9;

public class Demo1 {

	public static void main(String[] args) {
//	    Approach 1
		String s =  "Selenium";
		String rev =" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev +s.charAt(i);
		}
		System.out.println("Reverse of string s is : "+rev);
		
//		Approach 2
		String s2="Welcome";
		String rev2 = " ";
		char c [ ] = s2.toCharArray();
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev2 = rev2 +c[i];
		}
		System.out.println("Reverse of String s2 is "+rev2);
		
//		Approach 3 : Using stringBuffer class
		
		StringBuffer s6= new StringBuffer("gopiraj");
		System.out.println("Reverse of String is "+s6.reverse());
		
//		Approach 4: using Stringbuilder class
		StringBuilder sb = new StringBuilder("patil");
		System.out.println("Reverse of String is "+sb.reverse());
		
		
		
	}

}
