package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Collection.Collections1;

public class AmazonRef {
	static List<AmazonDemo> Redmi = new ArrayList<AmazonDemo>();
	
	static List<AmazonDemo> Vivo = new ArrayList<AmazonDemo>();
	
	static List<AmazonDemo> mobile = new ArrayList<AmazonDemo>();
	
	Scanner sc = new Scanner(System.in);
	
	public void mobileList() {

		Redmi.add(new AmazonDemo(50000, 8, 5300, "RedmiNote15", "Red", 254));
		Redmi.add(new AmazonDemo(10000, 6, 4500, "RedmiNote10", "black", 32));
		Redmi.add(new AmazonDemo(20000, 4, 4700, "RedmiNote11", "blue", 64));
		Redmi.add(new AmazonDemo(40000, 8, 5000, "Redmik20", "green", 128));
		Redmi.add(new AmazonDemo(15000, 3, 4500, "Redmik10", "white", 64));
		Vivo.add(new AmazonDemo(45000, 8, 6000, "vivov70", "white", 254));
		Vivo.add(new AmazonDemo(15000, 4, 4000, "vivoi20", "black", 32));
		Vivo.add(new AmazonDemo(20000, 6, 4700, "viviv51", "red", 128));
		Vivo.add(new AmazonDemo(35000, 6, 5500, "viviv90", "blue", 64));
		Vivo.add(new AmazonDemo(17000, 4, 4500, "vivo9", "green", 32));

		System.out.println("Redmi Mobile List : ");
		System.out.println(Redmi);
		
		System.out.println("Vivo Mobile List : ");
		System.out.println(Vivo);
		mobile.addAll(Redmi);
		mobile.addAll(Vivo);
		}
	 
	//List<AmazonDemo> Vivo = new ArrayList<AmazonDemo>();



	public void priceRange() {
		ListIterator<AmazonDemo> str = mobile.listIterator();
      System.out.println("pleace enter your  amount :");
	   int pri=sc.nextInt();
		while (str.hasNext()) {
			AmazonDemo d = str.next();

			if (d.getPrice() > 1000 && d.getPrice() <=pri ) {

				System.out.println( d);
			}else {
				System.out.println("pis enter min 1000 ");
			}
		}
	}

//	public void samNext() {
//		ListIterator<AmazonDemo> ltr = Vivo.listIterator();
//
//		while (ltr.hasNext()) {
//			AmazonDemo f = ltr.next();
//
//			if (f.getPrice() > 15000 && f.getPrice() < 30000) {
//
//				System.out.println("Vivo"+f);
//
//			}

	public void AllRam_WiseList() {
		Comparator<AmazonDemo> redmi = (AmazonDemo ac, AmazonDemo ab) -> {

			if (ac.getRam() > ab.getRam()) {        ///   Lamda expression
				return 9;
			} else if (ac.getRam() < ab.getRam()) {
				return -9;
			} else {
				return 0;
			}
		};
		Collections.sort(mobile, redmi);
		System.out.println("\n" + "Sort by Redmi mobile - RAM : ");
		System.out.println(mobile);
	}

	public void AllPrice_wiseList() {
		Comparator<AmazonDemo> rem = new Comparator<AmazonDemo>() {

			public int compare(AmazonDemo o1, AmazonDemo o2) { ////////// Anonymous class

				if (o1.getPrice() > o2.getPrice()) {
					return 9;
				} else if (o1.getPrice() < o2.getPrice()) {
					return -9;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(mobile, rem);
		System.out.println("\n" + "Sort by Redmi mobile - Price : ");
		System.out.println(mobile);
	}

	public void AllBattery_WiseList() {
		Comparator<AmazonDemo> batterySorting  = new Comparator<AmazonDemo>() {

			public int compare(AmazonDemo s1, AmazonDemo s2) {

				if (s1.getBattery() > s2.getBattery()) {
					return 9;
				} else if (s1.getBattery() < s2.getBattery()) {
					return -9;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(mobile, batterySorting);
		System.out.println("\n" + "Sort by Redmi mobile - Battery : ");
		System.out.println(mobile);
	}

	public static void main(String[] args) {
		AmazonRef aa = new AmazonRef();
		//System.out.println(mobile);
		Scanner sc = new Scanner(System.in);
		
		aa.mobileList();
		//aa.vivo();
		System.out.println("\n" + "If you give the number --> 1, the price wise will happen : ");
		System.out.println("If you give the number --> 2, the Ram wise will happen : ");
		System.out.println("If you give the number --> 3, the Battery wise will happen : ");
		System.out.println("If you give the number --> 3, the price Range  your choice : ");
		int j = sc.nextInt();
		switch (j) {

		case 1:
			aa.AllPrice_wiseList();
			break;

		case 2:
			aa.AllRam_WiseList();
			break;

		case 3:
			aa.AllBattery_WiseList();
			break;
		case 4:
			aa.priceRange();
		break;
		
		}
		
	}

}
