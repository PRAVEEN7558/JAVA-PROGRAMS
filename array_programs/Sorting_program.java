package array_programs;

import java.util.Scanner;

public class Sorting_program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int l = sc.nextInt();
		int a[] = new int[l];                                  // sorting program?

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {     // (a[i] > a[j]---> ascending)    //(a[i] < a[j]---> descending)
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + "   ");
		}

	}

}
