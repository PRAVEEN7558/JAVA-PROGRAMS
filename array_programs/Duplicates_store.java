package array_programs;

import java.util.Scanner;

public class Duplicates_store {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value = ");
		int j = sc.nextInt();
		int a[] = new int[j]; 
		
		                          //////////    In 2 arrays remove the duplicates and store it in new array?    ////////////
		System.out.println("enter the value = ");
		int f = sc.nextInt();
		int b[] = new int[f]; 
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the number" + i);
			a[i] = sc.nextInt();
		    }
		
		for (int i = 0; i < a.length; i++) { 
			System.out.println("enter the number" + i);
			b[i] = sc.nextInt();
	        }
		
		int n=0;
		int c[]=new int[n];
		for (int i = 0; i < a.length; i++) { 
			for (int k = i; i < b.length; k++) { 
				if(a[i]!=b[i]) {
					c[i]=a[i]+b[i];
					n++;
				   }
				}
			}
		
		    for (int i = 0; i < a.length; i++) {
			System.out.print(c[i]);
			
			}
}}
