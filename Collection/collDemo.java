package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collDemo {

	public static void main(String[] args) {
		List a=new ArrayList();
		a.add(1);
		a.add(233); 
		a.add(8996); 
		a.add(922); 
		a.add(94); 
		a.add(77); 
		a.add(78);
		a.add(989);
		a.add("77");
		
		ArrayList l = new ArrayList(a);
		System.out.println(a);
		//l.remove(4);
		//System.out.println(l);
		Integer i=77;
		l.remove(i);
		System.out.println(l);
		
//		
//		Iterator itr=l.iterator();
//		
//		while() {
//			
//		}
		
	}

}
