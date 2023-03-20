package String;

import java.util.Scanner;

public class Password_validate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Password =");

		String aa = sc.nextLine();

		char f[] = aa.toCharArray();
		boolean valid = false;

		if (f.length < 8) {
			System.out.println("Password must have at least 8 characters");
			System.exit(0);
		}

		for (int i = 0; i < f.length; i++) {
			if (f[i] >= 'a' && f[i] <= 'z' || f[i] >= 'A' && f[i] <= 'Z' || f[i] >= '0' && f[i] <= '9') {
				valid = true;
			} else {
				valid = false;
				break;
			}
		}
		if (valid == true) {
			System.out.println(" Password is valid ");
		} 
		else if (valid == false) {
			System.out.println(" Password  is in valid ");
		}
	}
}
