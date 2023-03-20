package array_programs;

import java.util.Scanner;

//////////////     Rotation of a array  and store it in new array  /////////////  
public class Rotation_new_array {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int m = sc.nextInt();
		int a[] = new int[m];
		int b[] = new int[m];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		for (int i = 1; i < a.length; i++) {
			b[i - 1] = a[i];
		}
		b[a.length - 1] = a[0];

		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]);
		}
	}
}

