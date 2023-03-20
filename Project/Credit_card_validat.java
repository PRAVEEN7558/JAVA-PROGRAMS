package Project;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Credit_card_validat {
	long a = 0;
	int arr[];

	public void crd_No() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Place Enter Debit Number : ");
		try {
			a = sc.nextLong();
			total_No();
		} catch (InputMismatchException e) {

			System.out.println("Place enter must Number : ");
		}

	}

	public void total_No() {
		int count = 0;
		long num = a;

		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println("card total number :  " + count);

		arr = new int[count];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = (int) (a % 10);
			a = a / 10;
		}

		System.out.println("");

		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("");
		validation();
	}

	public void validation() {

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] * 2;
				// System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			if (arr[i] >= 10) {
				sum = (int) (arr[i] % 10 + arr[i] / 10);
				arr[i] = sum;
			}
			// System.out.println(arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = (int) (arr[i] + sum);
		}

		System.out.println("\n" + "sum of card number :  " + sum);

		if (sum % 10 == 0) {

			System.out.println("\n" + "Debit card valid");

		} else {

			System.out.println("\n" + "invalid");

		}
	}

	public static void main(String[] args) {
		Credit_card_validat oo = new Credit_card_validat();
		oo.crd_No();
		// oo.total_No();
		// oo.validation(); ////// 6080235308018359
	}

}
