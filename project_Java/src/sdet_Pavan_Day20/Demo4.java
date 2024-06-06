package sdet_Pavan_Day20;

import java.util.HashMap;
import java.util.Iterator;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap hs = new HashMap();
		HashMap<Integer, String>  hs  = new HashMap<Integer, String>();
		hs.put(101, "Prashant");
		hs.put(102, "Radhe");
		hs.put(103, "Praful");
		hs.put(104, "Vasu");
		hs.put(105, "Gopiraj");
		System.out.println(hs);
		
		for(Object a : hs.keySet())
		{
			System.out.println(a);
		}
		
		for(Object b :hs.values())
		{
			System.out.println(b);
		}
		
		for(Object x :hs.entrySet())
		{
			System.out.println(x);
		}
		System.out.println("===========================");
		Iterator itr  = hs.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
