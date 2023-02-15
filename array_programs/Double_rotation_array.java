package array_programs;

import java.util.Scanner;

public class Double_rotation_array {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in); ////////////  Double rotation of a array and store it in same array   //////////
		System.out.println("enter the a length = ");
		int m = sc.nextInt();
		int a[] = new int[m];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		int num = 2;
		int index = 1;
		while (index <= num) {
			int count = a[0];
			for (int i = 1; i < a.length; i++) {
				a[i - 1] = a[i];
			}
			index++;
			a[a.length - 1] = count;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}

	}
}