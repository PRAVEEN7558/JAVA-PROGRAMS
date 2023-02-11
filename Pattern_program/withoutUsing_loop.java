//without using while loop;
package Pattern_program;

public class withoutUsing_loop {
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
		withoutUsing_loop obj = new withoutUsing_loop();
		obj.Number(5);
		// obj.printNo(5);
	}

}
