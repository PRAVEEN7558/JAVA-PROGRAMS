package array_programs;

import java.util.Scanner;

public class Joining_two_arrays {                          //Joining two arrays and store it in new array ?
	public static void main(String[] args) {
                                                                
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the A size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the b size of the array");
		int e = sc.nextInt();
		int b[] = new int[e];
		int c[] = new int[n + e];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter  A the array");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter B the array");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		for (int i = 0; i < c.length; i++)

			System.out.print(c[i] + "  ");
	}
}