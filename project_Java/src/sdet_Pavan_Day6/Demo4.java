package sdet_Pavan_Day6;

public class Demo4 {

	public static void main(String[] args) {
		int a [] = {1,2,5,4,6,8,3};
		System.out.println("Even numbers");
		for(int i=0;i<a.length;i++)
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("odd numbers ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	
	}

}
