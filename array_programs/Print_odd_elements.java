package array_programs;

import java.util.Scanner;

public class Print_odd_elements {
	public static void main(String[] args) {
		                                             // Print odd elements present in even index of an array
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array");
		n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				if (a[i] % 2 != 0) {
					System.out.println(i + "  " + a[i]);
				}
			}
		}

	}
} // Print odd elements present in even index of an array
