package array_programs;

import java.util.Scanner;

public class Sum_of_two_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int k = sc.nextInt();
		int a[] = new int[k];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}

		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] + a[j] == 10) {
					System.out.println("Sum of 2 elements in a single =  " + a[i] + " + " + a[j] + " = " + (a[i] + a[j]));

				}
			}
		}
	}
}
