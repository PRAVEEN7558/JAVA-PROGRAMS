
//sum of 

package array_programs;

import java.util.Scanner;

public class Array_even_program {
	public int odd(int a[]) {
		int d = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the  " + i + " A index number");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i <= a.length - 1; i++) {
			if (i % 2 != 0) {
				d = d + a[i];
			}
		}
		System.out.println(d);
		return d;

	}

	public int even(int b[]) {
		int c = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= b.length - 1; i++) {
			System.out.println("Enter the " + i + "  B index  number");
			b[i] = sc.nextInt();
		}
		for (int i = 0; i <= b.length - 1; i++) {
			if (i % 2 == 0) {
				c = c + b[i];
			}
		}
		System.out.println(c);
		return c;

//	int z=a-b;
		// System.out.println(z);

	}

	public void product(int e[]) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= e.length - 1; i++) {
			System.out.println("Enter the" + i + " e index value");
			e[i] = sc.nextInt();
		}
		int f = 1;
		for (int i = 0; i <= e.length - 1; i++) {
			// int f=0;
			f = f * e[i];
		}
		System.out.println(f);
	}

	public static void main(String arg[]) {
		Array_even_program obj = new Array_even_program();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a =  ");
		int t = sc.nextInt();
		int a[] = new int[t];

		System.out.println("Enters the value b =  ");
		int s = sc.nextInt();
		int b[] = new int[s];

		System.out.println("Enter the value e =   ");
		int y = sc.nextInt();
		int e[] = new int[y];

		obj.odd(a);
		obj.even(b);
		obj.product(e);
	}
}
