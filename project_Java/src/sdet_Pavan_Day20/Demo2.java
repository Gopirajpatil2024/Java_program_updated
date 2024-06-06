package sdet_Pavan_Day20;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add('a');
		list.add('m');
		list.add('c');
		list.add('z');
		list.add('x');
		list.add('b');
		list.add('d');
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);

	}

}
