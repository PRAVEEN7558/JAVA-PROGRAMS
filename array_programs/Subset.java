package array_programs;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the A length =  ");
		int k = sc.nextInt();
		int a[] = new int[k];
		System.out.println("Enter the B length =  ");
		int g = sc.nextInt();
		int b[] = new int[g];

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the A value =  " + i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i <= b.length - 1; i++) {

			System.out.println("Enter the b value =  " + i);
			b[i] = sc.nextInt();

		}
		
		for (int i = 0; i < b.length; i++) 
		{
			for( int s=0;s<a.length;s++) 
			{
			if (b[i] == a[s]) {
				count++;
			} 
			}
		}
		if (count==b.length) {
			System.out.println("this is subset ");
		}else {
			System.out.println("this is  not subset ");
		}
		
	}
}