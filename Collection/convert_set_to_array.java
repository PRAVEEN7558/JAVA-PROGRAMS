package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class convert_set_to_array {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		
		set.add(14);
		set.add(452);
		set.add(56);       ///System.out.println(aa[i]);
		set.add(123);
		set.add(897);
		
		//System.out.println(set);
		//System.out.println(set.toArray());
		
		Integer [] aa =new Integer[set.size()];
		
		Iterator ab=set.iterator();
		int i=0;
		while(ab.hasNext()) {
			Integer con=(Integer)ab.next();
				aa[i]=con;
				i++;
			
		}
		for(int j=0;j<aa.length;j++) {
		System.out.println(aa[j]);
	}
	}
}
