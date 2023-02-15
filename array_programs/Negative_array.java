package array_programs;

import java.util.Scanner;

public class Negative_array {
                                                  ///////   Finding only negative numbers in given array /////
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A length =");
		int d = sc.nextInt();

		int a[] = new int[d];

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the A value =  " + i);
			a[i] = sc.nextInt();
		}
		int negative = 0;
		int no = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < 0) {
				no = a[i];
				System.out.println("negative =" + no);
				negative++;
			}
		}

	}

}
