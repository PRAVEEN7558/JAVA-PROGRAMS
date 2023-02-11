//Reverse the given number? Sum of the digits for the given numbers?
package While_programs;

public class Reverse {
	void rev(int number) {
		int num = number;
		int reverse = 0;
		int count = 0;
		while (num >= 1) {
			int x = num % 10;
			reverse = reverse * 10 + x;
			 count=count+x;
			//count++;
			num = num / 10;
		}
		System.out.println("Reversed number: " + reverse);
		System.out.println("Sum of digits: " + count);
	}

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.rev(146573);
	}
}
