package For_loop;

public class Happy_number {
	public static void main(String arg[]) {

		Happy_number OBJ = new Happy_number();
	}

	int n = 0;
	int r = 1;
	int sum = 0;
	int num = 13;
	{
		while (0 < num) {
			while (num > 0) {
				r = num % 10;
				sum = sum + (r * r);
				num = num / 10;
			}
			num = sum;
			sum = 0;
		}
		if (num == 1) {
			System.out.println(" Happy Number");
		} else {
			System.out.println(" Not Happy Number");
		}
	}
}
