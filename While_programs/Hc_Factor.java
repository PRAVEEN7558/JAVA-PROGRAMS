//write a program to hcf for two number ? 
//write a program to hcf for three number ? 
package While_programs;

public class Hc_Factor {
	public static void main(String arg[]) {
		int i = 1;
		int hcf = 0;
		int a = 244;
		int b = 24;
		int c = 142;
		int smallest;
		int largest;
		int middlist;

		if (a < b) {
			smallest = a;
			middlist = b;
			largest = c;
		} else {
			largest = a;
			middlist = b;
			smallest = c;
		}
		while (i <= smallest) {
			if (smallest % i == 0 && middlist % i == 0 && largest % i == 0) {
				hcf = i;
			}
			i++;
		}
		System.out.println(hcf);
	}
}
