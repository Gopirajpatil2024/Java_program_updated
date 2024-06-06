package project_Java;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=scanner.nextInt();
		int rev=0;
		while(num!=0) //87654  //8765  876  87   8
		{
			rev=rev*10+num%10;  //0+87654%10=4  4*10+8765%10=45  450+876%10=456  4560+87%10=4567    45670+8%10=45678
			num= num/10;  //87654/10=8765  8765/10=876  876/10=87  87/10=8   8/10=0
		}
		System.out.println("Reverse of number : "+rev);
		
//		StringBuffer stringbuffer = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = stringbuffer.reverse();
//		System.out.println("Reverse of number  : "+rev);
		
//		StringBuilder stringBuilder = new StringBuilder();
//		StringBuilder rev = stringBuilder.append(num).reverse();
//		System.out.println("Reverse of number  : "+rev);
		
	}

}
