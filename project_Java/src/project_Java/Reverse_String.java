package project_Java;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ABCDF";
		String rev="";
		//Using char Array Method
		char a[]=string.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse of String : "+rev);
		
		//Using CharAt method
//		for(int i=string.length()-1;i>=0;i--)
//		{
//			rev=rev+string.charAt(i);
//		}
//		System.out.println("Reverse of String : "+rev);
		
//		      StringBuffer sb = new StringBuffer(string);
//	           StringBuffer rev1 = sb.reverse();
//	           System.out.println("Reverse of String is : "+rev1);
		
//		StringBuilder sb = new StringBuilder(string);
//		StringBuilder rev2 = sb.reverse();
//		System.out.println("Reverse of String : "+rev2);

	
		
	}

}
