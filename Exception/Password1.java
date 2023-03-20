package Exception;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class Password1 {
	Scanner sc = new Scanner(System.in);
	static int i = 1;

	public void pas1() {
		System.out.println("Place enter your pin");
		int pin;
		int atempt = 4;

		try {
			pin = sc.nextInt();
			if (pin >= 1000 && pin <= 9999) {
				System.out.println("Pin valid");
			} else {
				throw new NumberRangeLessException("pin number must be 4 digit.");

			}
		} catch (InputMismatchException e) {

			System.out.println("pin is incorrect");
		} catch (NumberRangeLessException e) {
			
			System.out.println(e.getMessage());
			for (; i < atempt;) {

				i++;
				if (i <= 3) {
					pas1();
					break;
				} else {
					System.out.println("Better luck nest time");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Password1 obj = new Password1();
		obj.pas1();
	}

}