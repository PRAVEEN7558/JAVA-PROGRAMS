//check the given number is prime or not prime?
package While_programs;
public class primecheck {
	public static void main(String[] args) {
		primecheck obj = new primecheck();
		obj.prime(23);
	}

	void prime(int pri) {
		int num = pri;
		boolean isPrime = true;
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
