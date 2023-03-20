package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Project.AmazonDemo;

public class LinkedListdemo {

	public static void main(String[] args) {
		
		LinkedList<String> name = new LinkedList<>();
		
		name.add("benito");
		name.add("praveen");
		name.add("kumar");
		name.add("nihil");
		name.add("ram");
		
		Iterator <String> i =name.descendingIterator();
		
		while (i.hasNext()){
			System.out.println(i.next());
			
		}  
		
		
		name.add(4,"kavin");
		System.out.println(name);
		
		
		
		
	}

}
