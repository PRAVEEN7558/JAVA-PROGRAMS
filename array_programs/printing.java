
// sum of two array ? c[i]=a[i]+[i] ?

package array_programs;

import java.util.Scanner;

public class printing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		int a[] = new int[d];
		int b[] = new int[d];

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the A value =  " + i);
			a[i] = sc.nextInt();
		}

		for (int i = 0; i <= b.length - 1; i++) {
	
			b[i] = a[i] * b[i];
	}
		for (int i = 0; i <= a.length; i++) {
			System.out.println();
			
	}
	
}}