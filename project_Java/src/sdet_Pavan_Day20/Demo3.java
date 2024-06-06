package sdet_Pavan_Day20;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add("Java");
		hs.add('a');
		hs.add(true);
		hs.add(10.34);
		hs.add(null);
		hs.add(null);
		hs.add(100);
		
		System.out.println(hs);
		
		for(Object x : hs)
		{
			System.out.print(x+" ");
		}
        System.out.println();
		Iterator itr  =hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("Is hashet is empty ? "+ hs.isEmpty());
		
		System.out.println("Is Hashset contains Java ? "+hs.contains("Java"));
		
		hs.remove("Java");
		System.out.println(hs);
		
		hs.clear();
		System.out.println("Is hashset is clear ? "+hs.isEmpty());
	}

}
