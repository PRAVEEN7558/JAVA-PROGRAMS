package While_programs;

public class Fibonaci_without_3variable {
	public static void main(String[] arg) {
		int count = 1;
		int first = 0;
		int second = 1;
		while (count <= 10) {
			System.out.println(first);
			second = first + second;
			first = second - first;
			count++;
		}
	}
}
