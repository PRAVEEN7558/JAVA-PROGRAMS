package array_programs; //Divide all the elements in an array by 3 and store it in the same array 

import java.util.Scanner;

public class Divide_allthe_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a length = ");
		int r = sc.nextInt();
		int a[] = new int[r];

		for (int i = 0; i < a.length; i++) {
			System.out.println("this is a value =   " + i);
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] / 3;
			System.out.println("Divide of 2 elements in stored  =  " + a[i]);
		}

	}
}
