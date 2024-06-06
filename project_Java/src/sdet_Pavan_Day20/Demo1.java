package sdet_Pavan_Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
//		List list = new ArrayList();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("Java");
		list.add(3);
		list.add(12.23);
		list.add('a');
		list.add(true);
		list.add("Java");
		list.add(null);
		list.add(null);
		
		System.out.println("Size of an arraylist "+list.size());
		
		System.out.println("Printing Elements in arraylist "+list);
		
		list.remove(3); //removing value as per index
		System.out.println("After removing  " +list);
		
		list.add(2,"Python");  //Inserting element at index 2 
		System.out.println("After Inserting  "+list);
		
		list.set(2, "Golang");  //modify or replace or change
		System.out.println(("After replacing "+list));
		
		//Access specific element from arraylist
		System.out.println("Specific element : "+list.get(2));  //here index is 2 
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println(" ");
		for(Object x:list)
		{
			System.out.print(x+" ");
		}
		System.out.println(" ");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println( " ");
		//To check arraylist is empty or not
		System.out.println("Is arraylist empty ? "+list.isEmpty());
		
		//To remove multiple elements from an arraylist
		
		ArrayList list1  =  new ArrayList();
		list1.add(null);
		list1.add('a');
		
		list.removeAll(list1);
		System.out.println("After removing few elements "+list);
		
		
		//to clear all elements 
		list.clear();
		System.out.println("Is arraylist empty ? "+list.isEmpty());

		

		
	}

}
