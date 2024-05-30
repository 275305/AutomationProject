package concept.of.java;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("one");
		
		Iterator<String> itr = set.iterator();
		
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
		 }
	}

}
