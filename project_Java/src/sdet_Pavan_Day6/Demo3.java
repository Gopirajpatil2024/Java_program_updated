package sdet_Pavan_Day6;

public class Demo3 {

	public static void main(String[] args) {
		Object a[ ]= {100,10.25,'a',"Java",true,null};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("=========================");
		
		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
