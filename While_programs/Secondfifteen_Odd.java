//print the sum of second15 odd number?
package While_programs;
public class Secondfifteen_Odd {

	public static void main(String[] args) {
		int sum = 0;
		int i = 16;   // int i=1   print the sum of first 15 odd number?
		while (i <= 30) {  //i <= 15
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("The sum of the second 15 odd numbers is: " + sum);
	}
}
