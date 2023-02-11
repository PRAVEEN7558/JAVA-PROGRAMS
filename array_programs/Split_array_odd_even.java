package array_programs;

import java.util.Scanner;

public class Split_array_odd_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array");
		n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int m = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				m++;
		}
		int even[] = new int[m];

		int k = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				k++;
			}

		}

		int odd[] = new int[k];

		for (int i = 0; i < m; i++) {

			System.out.print("The array with even elements..." + even[i] + " ");
		}

		for (int i = 0; i < k; i++) {
			System.out.print("The array with odd elements..." + odd[i] + " ");
		}

	}
}
