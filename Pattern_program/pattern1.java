package Pattern_program;

public class pattern1 {

	public static void main(String[] args) {
		for (int row = 5; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + "  ");
			}
			System.out.println();
		}

		System.out.println("  ");

		for (int row = 5; row >= 1; row--) {
			for (int col = 5; col >= row; col--) {
				System.out.print(row + "  ");
			}
			System.out.println();
		}

		System.out.println("  ");

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + "  ");
			}
			System.out.println();
		}
		System.out.println("  ");

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + "  ");
			}
			System.out.println();
		}
//		int a = 5;
//		for (int row = 1; row <= a; row++) {
//			int col;
//			for (col = 1; col <= a; col++) {
//				if (col == 2 || col == 4) {
//					col = a + 5;
//					System.out.print(col + "  ");
//				} else if(col == 3 || col == 5){
//					col = a + 5 + 1;
//
//					System.out.println(col + "  ");
//				}
//			
//
//			System.out.println();
//		}

	
}}