package sdet_Pavan_Day6;

public class Demo1 {

	public static void main(String[] args) {
		//Approach 1
		int a  [] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//Approach 2
		int b []= {10,20,30,40,50};
		
		System.out.println("Size of an Array : "+b.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		

	}

}
