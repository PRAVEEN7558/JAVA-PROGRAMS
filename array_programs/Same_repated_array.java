package array_programs;

import java.util.Scanner;

public class Same_repated_array {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value = ");
		int g = sc.nextInt();
		int a[] = new int[g];                ///////////    Same repated array   //////////////

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the number" + i);
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("same value  " + a[i]);
				}
			}
		}
	}
}