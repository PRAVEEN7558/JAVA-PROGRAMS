package Two_dimensional_array;

import java.util.Scanner;

public class Addition_two_array {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arr row =");
		int p = sc.nextInt();
		System.out.println("Enter the  brr column =");
		int o = sc.nextInt();

			int arr[][] = new int[p][o];
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the row " + i + "  " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the brr row =");
		int k = sc.nextInt();
		System.out.println("Enter the brr column =");
		int y = sc.nextInt();
		
			int brr[][] = new int[k][y];
			
		for (int g = 0; g < brr.length; g++) {
			for (int d = 0; d < brr[g].length; d++) {
					System.out.println("Enter the row " + g + "  " + d);
					brr[g][d] = sc.nextInt();
		            }
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
			System.out.println();
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(brr[i][j] + " ");
				}
			}
			System.out.println();
		
		int c[][]=new int [p][o];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				c[i][j]=arr[i][j]+brr[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
}
}
}