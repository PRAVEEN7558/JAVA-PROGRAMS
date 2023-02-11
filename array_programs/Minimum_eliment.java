package array_programs;

import java.util.Scanner;

public class Minimum_eliment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int p = sc.nextInt();
		int a[] = new int[p];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min < a[i]) { // (max < a[i] --->maximum) ( min > a[i]---> minimum)
				min = a[i];

			}
		}
		System.out.print(min + "   ");

	}
}