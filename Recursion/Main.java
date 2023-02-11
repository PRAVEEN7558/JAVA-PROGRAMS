package Recursion;

public class Main {
	public static int fact(int no) {
		int sum;
		if (no != 0) {
			no = no * fact(no - 1);

			return no;

		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.fact(4);
		System.out.println(obj.fact(4));
		//System.out.println(obj.getClass());
	}
}
