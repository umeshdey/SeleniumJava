package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list =  new ArrayList<String>();
		
		list.add("Vivek");
		list.add("Subilash");
		
//		System.out.println(list.get(1));
		
		for(String s : list) {
			System.out.println(s);
			
		}
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println(list.contains("Vivek"));
		
		

	}

}
