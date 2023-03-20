package array_programs;

import java.lang.Math;

public class Random_method {
	public static void main(String[] arg) {

		for (int i = 1; i <= 4; i++) {
			double a = Math.random();

			int b = (int) (a * 10);

			System.out.print(b);

		}
	}
}
