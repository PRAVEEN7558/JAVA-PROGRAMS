package Collection;

import java.util.Map;
import java.util.TreeMap;

import Project.AmazonDemo;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<AmazonDemo,String> tm= new TreeMap<>();
		
		tm.put(new AmazonDemo(45000, 8, 6000, "vivov70", "white", 254), "fourth");
		tm.put(new AmazonDemo(10000, 6, 4500, "RedmiNote10", "black", 32), "first");
		tm.put(new AmazonDemo(20000, 4, 4700, "RedmiNote11", "blue", 64), "second");
		tm.put(new AmazonDemo(15000, 3, 4500, "Redmik10", "white", 64),"third");
		
		
		System.out.println(tm);
	}

}
