package Collection;

import java.util.ArrayList;    ///////remove the duplicates in an list.output should be in an list.
                               ///////(try with using set and without using set).
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

import Project.AmazonDemo;

public class Remove_Duplicate_List {

	public static void main(String[] args) {
		List aa = new ArrayList();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 Digit Number :");
		for (int i = 1; i <= 10; i++) {
			aa.add(sc.nextInt());
		}
		System.out.println(aa);

		// Set bb=new HashSet(aa);

		// System.out.println(bb);

		ArrayList cc = new ArrayList();

		Iterator itr = aa.listIterator();

		while (itr.hasNext()) {                  ///////Remove the duplicates in an list
			Integer i = (Integer) itr.next();
			if (!cc.contains(i))
				cc.add(i);
		}
		System.out.println(cc);
	}

}
