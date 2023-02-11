package array_programs;

import java.util.Scanner;

public class Firstrepeated_array {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value = ");
		int g = sc.nextInt();
		int a[] = new int[g]; // Program to find first repeated element in an array?

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the number" + i);
			a[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == a[i]) {
					System.out.println("first repated  value  " + a[i]);
					count++;
					break;
				}
			}
			if (count == 1)
				break;
		}

	}
}