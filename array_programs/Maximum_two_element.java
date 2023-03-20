package array_programs;

import java.util.Scanner;

public class Maximum_two_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int p = sc.nextInt();
		int a[] = new int[p];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		int max = a[0];

		int i;
		for (i = 0; i < a.length; i++) {
			if (max < a[i] && max != a[i]) {
				max = a[i];
			}

		}
	//	System.out.print("maximum first element  =" + max + "   ");
		int smax = 0;
		for (i = 0; i < a.length; i++) {
			if (max != a[i] && a[i] > smax) {
				smax = a[i];
			}

		}
		System.out.println("maximum second  element  =" + smax + "   ");
		int tmax = 0;
		for (i = 0; i < a.length; i++) {
			if (max != a[i] && smax != a[i] && a[i] > tmax) {
				tmax = a[i];
			}
		}
		System.out.println("maximum therd  element  =" + tmax + "   ");
	}
}
