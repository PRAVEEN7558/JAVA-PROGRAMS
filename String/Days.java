package String;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours = ");
		int no=sc.nextInt();
		
		int day=no/24;
		System.out.println("Days = "+ day);
		
//		int hour =no%60;
//		System.out.println("hours = "+ hour);
		
		int mins =no*60;
		System.out.println("mins = "+ mins);
	}

}
