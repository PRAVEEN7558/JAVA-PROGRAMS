//0 3 8 15 24 35 48 63 80 99.....
package While_programs;
public class empty {

	public static void main(String[] args) {
		int n = 1;
		int i = 1;
		int sum = 0;
		while (n <= 10) {
			System.out.print(sum + " ");
			i = i + 2;
			sum = sum + i;
			n++;
		}

	}
}
