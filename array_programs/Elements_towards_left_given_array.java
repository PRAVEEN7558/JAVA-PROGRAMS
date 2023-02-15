package array_programs;

import java.util.Scanner;

public class Elements_towards_left_given_array {

	public static void main(String[] args) { /////// Moving all elements towards left in a given array //////

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int m = sc.nextInt();
		int a[] = new int[m];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		int count = 1;
		while (count <= 2) {
			int temp = a[0];
			for (int i = 1; i < a.length; i++) {
				a[i - 1] = a[i];
			}
			a[a.length - 1] = temp;
			count++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
