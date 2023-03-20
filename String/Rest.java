package String;

public class Rest {

	public static void main(String[] args) {
		// Object hai;
		// Rest obj=new Rest();

		// String b=new String("PRAVEEN");

		// System.out.println(a+" "+b);

		// System.out.println(obj);
		// System.out.println(obj.());

		String a = "PRAVEEN";
		int count = 0;
		for (int i = 0; i < 7; i++) {

			System.out.print(a.charAt(i) + "  ");
			if (a.charAt(i) == 'E') {
				count++;
			}
		}
		System.out.println(count);
	}

}