package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class WordsColl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList l = new ArrayList();
		String d = "";
		System.out.println("Enter the 10 value :");
		for (int t = 0; t < 10; t++) {

			l.add(sc.next());

		}
		ArrayList<Character> g = new <Character>ArrayList();

		ArrayList<Integer> k = new <Integer>ArrayList();

		ArrayList<Character> j = new <Character>ArrayList();

		ListIterator str = l.listIterator();

		while (str.hasNext()) {

			d = d + str.next();

		}

		for (int t = 0; t < d.length(); t++) {

			if (d.charAt(t) >= 'a' && d.charAt(t) <= 'z' || d.charAt(t) >= 'A' && d.charAt(t) <= 'Z') {

				g.add(d.charAt(t));

			} else if (d.charAt(t) >= 48 && d.charAt(t) <= 57) {

				k.add((int) d.charAt(t)-48);

			} else if (d.charAt(t) >= 32 && d.charAt(t) <= 47 || d.charAt(t) >= 58 && d.charAt(t) <= 64) {

				j.add(d.charAt(t));

			} else {
				System.out.println(d);
			}

		}
		System.out.println("\n" + d);
		
		System.out.println(g);
		
		System.out.println(k);
		
		System.out.println(j);

	}

}
