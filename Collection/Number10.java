package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Number10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 value :");

		List a = new ArrayList();

		for (int t = 0; t < 10; t++) {
			a.add(sc.nextInt());
		}
		ArrayList l = new ArrayList(a);

		System.out.println(a);

		ListIterator aa = l.listIterator();

		ArrayList Reverse = new ArrayList();
		while (aa.hasNext()) {
			aa.next();
		}
		while (aa.hasPrevious()) {
			Reverse.add(aa.previous());
			
		}
		System.out.println("\n"+"Reverse"+Reverse);
		
	}

}
