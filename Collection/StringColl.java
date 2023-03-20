package Collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class StringColl {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		ArrayList aa = new ArrayList();
		
		String dd = "";
		
		System.out.println("Enter the 10 value :");
		for (int t = 0; t < 5; t++) {

			aa.add(sc.next());

		}
		ArrayList<String> g = new <String>ArrayList();

		ListIterator str = aa.listIterator();

		while (str.hasNext()) {

			dd = dd + str.next();

		}
		for (int t = 0; t < dd.length(); t++) {

			if (dd.charAt(t) >= 'a' && dd.charAt(t) <= 'z' || dd.charAt(t) >= 'A' && dd.charAt(t) <= 'Z') {

				//g.add(String)(dd.charAt(t));

			} else if (dd.charAt(t) >= 48 && dd.charAt(t) <= 57) {

				//k.add((int) dd.charAt(t)-48);
			}

	}

	}}
