package test;

import java.util.Scanner;
                                        ////////////    Rotation of a array  and store it in same array   //////////////   
public class Rotation_same_array {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int m = sc.nextInt();
		int a[] = new int[m];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}
		int count = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];

		}
		a[a.length - 1] = count;
		for (int i = 0; i < a.length; i++) { 
			System.out.print(a[i]);
		}
	}

}
