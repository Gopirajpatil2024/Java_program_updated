package project_Java;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number : ");
	int num=sc.nextInt();
	int original_Number=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	if(original_Number==rev)
	{
		System.out.println(rev +" is palindrome number");
	}
	else
	{
		System.out.println(rev + " is not palindrome number");
	}
	
	}

}
