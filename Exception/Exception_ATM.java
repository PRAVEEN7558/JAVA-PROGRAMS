package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_ATM {
	Scanner sc = new Scanner(System.in);

	public void pin() {

		System.out.println("Enter the Pin ");
		try {
			int a = sc.nextInt();

			if (a >= 1000 && a <= 9999) {
				System.out.println("pin accepted ");
			} else {
				throw new NumberRangeLessException("Pin number must 4 digit with positive ");
			}
		} catch (NumberRangeLessException ee) {

			System.out.println(ee.getMessage());
			pin();
		} catch (InputMismatchException a) {
			System.out.println("Pleace enter the only number :");
			pin();
		}
		System.out.println(" ");
	}

	public void amount() {
		System.out.println("Enter the Amount :");

		int balance = 150000;
		try {
			int amt = sc.nextInt();
			if (amt >= 1 && amt <= balance) {
				System.out.println("Balance = " + balance);
			} else {
				throw new NumberRangeLessException(Error_cls.Err2);

			}
			if (amt % 100 == 0) {
				System.out.println("Widdral amount = " + amt);
			} else {
				throw new NumberRangeLessException(Error_cls.Err1);

			}

		} catch (NumberRangeLessException ae) {

			System.out.println(ae.getMessage());

		} catch (InputMismatchException a) {
			System.out.println("Pleace enter the only number :");
		}

		System.out.println(" ");
	}

	public static void main(String[] args) {
		Exception_ATM obj = new Exception_ATM();
		obj.pin();
		obj.amount();

	}

}
