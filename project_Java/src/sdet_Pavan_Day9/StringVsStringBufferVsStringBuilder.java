package sdet_Pavan_Day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		String s =  new String("Welcome");
		s.concat(" to java ");
		System.out.println(s);  // Welcome immutale : we can not change
		
		StringBuffer sbr = new StringBuffer("Welcome");
		sbr.append(" to java ");
		System.out.println(sbr); //Welcome to java  Mutable : we can change
		
		StringBuilder sb = new StringBuilder("Welcome");
		sb.append(" to java");
		System.out.println(sb); //Welcome to java mutable : we can change
		
	}

}
