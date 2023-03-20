package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class All_the_integers_list_contain {

	public static void main(String[] args) {
		
		List all=new LinkedList();
		
		all.add(48);
		all.add("hi");
		all.add("hello 123");
		all.add(432);
		all.add('A');
		all.add(155);
		all.add('%');
		all.add("praveen");
		
		System.out.println(all);
		
		
		List num = new ArrayList();
		List character = new ArrayList();
		List str = new ArrayList();

		Iterator nn=all.listIterator();
		while(nn.hasNext()) {
		Object v =nn.next();
		
		if( v instanceof  Integer) {
		  num.add(v);
		
		} else if(v instanceof Character ) {

		 character.add(v);
		
		}else if(v instanceof String ) {
		str.add(v);
		
		}else{
			
		}
		
		}
		System.out.println("Integer-->"+num);
		System.out.println("Character-->"+character);
		System.out.println("String-->"+str);
	}
	}


