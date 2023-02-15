package Two_dimensional_array;

import java.util.Scanner;   ////////////////  Sum of column ///////////////////

public class Sum_of_column {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row =");
		int k = sc.nextInt();
		System.out.println("Enter the column =");
		int o = sc.nextInt();

		int arr[][] = new int[k][o];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the row "+i+"  "+j);
				arr[i][j] = sc.nextInt();
			}
		
		}
			
			for (int i = 0; i < arr[0].length; i++) {
				int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					sum = sum + arr[j][i];
				}
				System.out.println();
				System.out.println("sum of  column =  " + sum);

			}
		}
	}
