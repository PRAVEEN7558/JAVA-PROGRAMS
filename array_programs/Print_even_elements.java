package array_programs;

import java.util.Scanner;

                                 //Print even elements present in odd index of any array?
public class Print_even_elements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array");
		n = sc.nextInt();

		int a[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0; i<a.length;i++) {
			if(i%2!=0) {
				if(a[i]%2==0) {
					System.out.println(i+"  "+a[i]);
				}
			}
		}
		
} 
	}