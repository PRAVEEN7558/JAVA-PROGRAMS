
//

package array_programs;

import java.util.Scanner;

public class Square {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
		int a[]=new int[r];
		int b[]=new int[r];
		
		
		for (int i=0; i<=a.length-1;i++) {
			System.out.println("Enter the A value =  " + i);
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<=b.length-1;i++) {
			System.out.println("Enter the b value =  " + i);
			b[i] = a[i]*a[i];
		}
		for(int i=0; i<=b.length-1;i++) {
			System.out.println(b[i]);
		}
	}

}
