package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Character,String> hm= new TreeMap<>();
		hm.put('x',"xerox");
		hm.put('a',null);
		hm.put('b',"boolean" );
		hm.put('c',null );
		hm.put('m',"method");
		hm.put('d',"devops" );
		hm.put('e',"entryset" );
		hm.putIfAbsent('a',"apple" );
		
		System.out.println(hm.getOrDefault('a', "hello"));
		
		Set s = hm.entrySet();
		Set key = hm.keySet();
		Collection values = hm.values();
		System.out.println(hm);
		System.out.println(s);
		Iterator itr = s.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(key);
		System.out.println(values);
		
		
	}

}
