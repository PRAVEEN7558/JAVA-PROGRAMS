//without using while loop;
package Pattern_program;

public class pattern {
	public static int Number(int no) {
		if (no > 0) {
			System.out.println(no);
			Number(no - 1);
			return no;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		pattern obj = new pattern();
		obj.Number(5);
	}

}
