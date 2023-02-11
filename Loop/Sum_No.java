package Loop;

public class Sum_No {
	void data(int base,int pow) {   // double base, double pow
		double product = base;         // double product = base;
		int n = 2;
		while (n <= pow) {
			product = product * base;
			n++;
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		Sum_No obj = new Sum_No();
		obj.data(2,33);
	}
}