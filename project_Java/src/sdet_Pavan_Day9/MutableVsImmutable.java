package sdet_Pavan_Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
//		Mutable :  We can change original values
		int a [ ] = {20,40,10,30,50};
		System.out.println(Arrays.toString(a)); //[20, 40, 10, 30, 50]
		Arrays.sort(a);  //Mutable
		System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]
		
//		Immutable : we can not change
		String s  =new String("Welcome ");
		System.out.println(s);  //Welcome
		String concatString = s.concat(" to java");
		System.out.println(s); //Welcome  -immutable : we cannot change
		System.out.println(concatString);  //Welcome  to java

	}

}
