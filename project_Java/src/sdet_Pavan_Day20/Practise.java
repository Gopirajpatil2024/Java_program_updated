package sdet_Pavan_Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		
		hm.put(101, "Java");
		hm.put(102,"Python");
		hm.put(103, "Rust");
		hm.put(104, "Golang");
		hm.put(105,"Mearn");
		
		Iterator itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
