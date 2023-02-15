package array_programs;

import java.util.Scanner;

public class Negative_store_another_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A length =");
		int d = sc.nextInt();

		int a[] = new int[d];
		                         /////// Copying only the negative numbers in given array - to another array /////////
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the A value =  " + i);
			a[i] = sc.nextInt();
		}
		int negative = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				negative++;
			}
		}
		int b[] = new int[negative];
		int j = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] < 0) {
				b[j] = a[i];
				System.out.println("negative value b[j] = " + b[j]);
				j++;
			}
	}
}
