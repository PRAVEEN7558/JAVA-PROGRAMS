package array_programs;

import java.util.Scanner;

public class First_nonrepated_array {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value = ");
		int g = sc.nextInt();
		int a[] = new int[g];              // ///////////    Program to find first non repeated element in an array?    /////////

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the number" + i);
			a[i] = sc.nextInt();
		}

		int count = 0;
		int j;
		for (int i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				if (i != j && a[j] == a[i]) {
					break;
				}
			}
			if (j == a.length) {
				System.out.println("first non repated  value  " + a[i]);
				break;

			}

		}
	}
}
