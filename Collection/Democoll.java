package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Democoll {

	public static void main(String[] args) {

		List<Collections1> l = new ArrayList<>();

		l.add(new Collections1(33, 22, 455, "praveen"));
		l.add(new Collections1(31, 21, 423, "nihil"));
		l.add(new Collections1(23, 25, 454, "ram"));
		l.add(new Collections1(28, 25, 468, "vicky"));
		l.add(new Collections1(30, 27, 489, "chandru"));

		System.out.println("Add to List : ");              //////// List
		System.out.println(l);

		Comparator<Collections1> mark = new MyComparator();
		Collections.sort(l, mark);                          ///// Mark wise compare

		System.out.println("\n"+"Sort to Mark : ");  
		System.out.println(l);

		Comparator<Collections1> age = new Comparator<Collections1>() {

			public int compare(Collections1 o1, Collections1 o2) {  //////////  Anonymous class

				if (o1.getAge() > o2.getAge()) {
					return 9;
				} else if (o1.getAge() < o2.getAge()) {             ////// ////Age wise compare
					return -9;
				} else {
					return 0;         
				}
			}
		};
		Collections.sort(l, age);                   
		System.out.println("\n"+"Sort to age : ");
		System.out.println(l);
		
		Comparator<Collections1> Roll = (Collections1 aa,Collections1 ab) -> {
			
			if (aa.getRoll() > ab.getRoll()) {                /////////   Lamda expression
				return 9;
			} else if (aa.getRoll() < ab.getRoll()) {
				return -9;
			} else {                                         ////  Roll wise compare
				return 0;
			}
	    };  
	    Collections.sort(l, Roll);
		System.out.println("\n"+"Sort to RollNo : ");
		System.out.println(l);
	
		Comparator<Collections1> Name = (Collections1 nam1,Collections1 nam2) -> {
			
			if(nam1.getName().compareTo(nam2.getName())>0) {       /////////   Lamda expression
				return 21;
			}else if(nam1.getName().compareTo(nam2.getName())<0){  ///// Name wise compare
			    return -1;	
			}else {
			return 0;
			}
		};
		 Collections.sort(l, Name);
			System.out.println("\n"+"Sort to Name : ");
			System.out.println(l);
	
}}

