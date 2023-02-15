package Two_dimensional_array;

public class Two_dimensional {
	public static void main(String arg[]) {

		int arr[][] = new int[3][3];
		int val = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {            ////output is :
				arr[i][j] = val;                                          ////   1  2  3
				val += 1;                                                 ////   4  5  6  
			}                                                             ////   7  8  9
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("  ");
		int a[][] = new int[3][3];
		int count = 1;
		{
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {       //// Transpose 
					a[i][j] = count;                          ///output is:
					count += 1;                                         ///  1  4  7
				}                                                       ///  2  5  8
			}                                                           ///  3  6  9
			for (int k = 0; k < a.length; k++) {
				for (int j = 0; j < a[k].length; j++) {
					System.out.print(a[j][k] + " ");
				}
	
				System.out.println();
			}
		}
	}
}