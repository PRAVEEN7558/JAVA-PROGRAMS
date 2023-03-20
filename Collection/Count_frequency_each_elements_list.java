package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Count_frequency_each_elements_list {

	public static void main(String[] args) {
	
		List<Integer> all = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 Digit Number :");
		for (int i = 1; i <= 10; i++) {
			all.add(sc.nextInt());
		}
		System.out.println("List" + all);

		Set <Integer> co=new HashSet<>(all);
		System.out.println(co);
		
	Map ii=new HashMap();
	
	
		
		Iterator ltr=all.listIterator();
		
		while(ltr.hasNext()) {
			int count=1;
			int i=(int)ltr.next();
			if(!ii.containsKey(i))
				ii.put(i, count);
			else
				ii.put(i,(int) (ii.get(i))+1);
			
		}
		System.out.println(ii);
		
	}

}
