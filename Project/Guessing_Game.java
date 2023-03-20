package Project;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

	int range = 4;
	int[] arr;
	int b1;

	public void rand() {
		Random rd = new Random();
		arr = new int[range];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(1, 9);
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

		System.out.println(" ");
	}

	public void user() {
		System.out.println("enter the user input : ");
		Scanner sc = new Scanner(System.in);
		try {
			b1 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Pls must enter the number ");
			user();
		}
		int brr[] = new int[range];
		int index = brr.length - 1;
		while (b1 > 0) {
			brr[index] = b1 % 10;
			// System.out.println(brr[index]);
			b1 /= 10;
			index--;
		}
		char aa[] = new char[range];

		int u = 0;
		for (int j = 0; j < brr.length; j++) {
			for (u = j; u < arr.length; u++) {
				if (brr[j] == arr[u] && j == u) {
					aa[j] = 'c';
					break;
				}
			}
		}

		for (int j = 0; j < brr.length; j++) {
			if (aa[j] != 'c') {
				for (u = 0; u < arr.length; u++) {

					if (brr[j] == arr[u] && aa[u] != 'c') {
						aa[j] = 'p';

						break;
					}
				}

				if (u == brr.length && aa[j] != 'c') {
					aa[j] = 'x';
				}
			}
		}
		boolean flag = true;

		for (int j = 0; j < aa.length; j++) {
			if (aa[j] != 'c')
				flag = false;
		}
		if (flag == false) {
			System.out.println("false");
			for (int j = 0; j < aa.length; j++) {
				System.out.print(aa[j] + " ");
			}
			System.out.println(" ");
			user();
		} else {
			for (int j = 0; j < aa.length; j++) {
				System.out.print(aa[j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Guessing_Game obj = new Guessing_Game();
		obj.rand();
		obj.user();

	}
}