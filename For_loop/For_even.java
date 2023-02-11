package For_loop;

public class For_even {
	public static void main(String arg[]) {
		int even;
		int count=0;
		for (even = 1; even <= 20; even++)
			if (even % 2 == 0) {
				count=count+even;
				System.out.println(even);
			}
		System.out.println(count);
	}
}
