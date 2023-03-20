package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Get_Repeated_elements_list {

	public static void main(String[] args) {
		List<Integer> ab = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 Digit Number :");
		for (int i = 1; i <= 10; i++) {
			ab.add(sc.nextInt());
		}
		System.out.println("List" + ab);

		
		Set cc = new HashSet();
		Set<Integer> set = new HashSet<>();
		for (Integer rep : ab) {
			if (!set.add(rep)) {
				cc.add(rep);
			}
		}
		System.out.println("Repeated elements " + cc);

		
		List non = new ArrayList();
		Iterator dd = ab.listIterator();

		while (dd.hasNext()) {
			Integer nrep = (Integer) dd.next();
			if (!cc.contains(nrep)) {
				non.add(nrep);
			}

		}
		System.out.println("Non Repeated elements " + non);
	}
}
