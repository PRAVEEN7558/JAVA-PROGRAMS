package String;

public class Mystring {

	public static void main(String[] args) {
		String ka = "going to class";
		char a[] = ka.toCharArray();                        //////// Upper case ///////
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ') {
				int b = a[i] - 32;
				System.out.print((char) b);
			} else {
				System.out.print("  ");
			}
		}
		System.out.println("  ");                        /////// count of vowels ///////

		System.out.println("4 index ascii value = " + ka.codePointAt(4));

		int vCount = 0;
		for (int i = 0; i < ka.length(); i++) {

			if (ka.charAt(i) == 'a' || ka.charAt(i) == 'e' || ka.charAt(i) == 'i' || ka.charAt(i) == 'o'
					|| ka.charAt(i) == 'u') {
				vCount++;
			}
		}
		System.out.println("count of vowels  = " + vCount);

		String s1 = "h172b89we3j92bbdtsa7";         ///////// print the number in string ////////
		char b[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {

			if (b[i] >= 48 && b[i] <= 57) {

				System.out.println("print the number in string = " + b[i]);
			}
		}

		String s2 = "asa!sd#ff@sds%efdf&dfd$u";

		char f[] = s2.toCharArray();           /////// print the Special characters in string /////
		for (int i = 0; i < s2.length(); i++) {

			if (f[i] >= 33 && f[i] <= 47) {

				System.out.println("print the Spcial characters in string = " + f[i]);
			}
		}

		String s = "abcdefghijklmnopqrstuvwxyz";    ////// Reverse the given string //////

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(" " + s.charAt(i));
		}
		System.out.println(" ");
		String ter = "";                
		String s3 = "AmMa";                    //////// Palindrome string  /////
		String h = s3.toLowerCase();
		for (int i = h.length() - 1; i >= 0; i--) {
			ter = ter + h.charAt(i);
		}
		    System.out.println(ter);
		if (h.equals(ter)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("not a palindrome");
		}
		
		String no="12345";
		char[] num =no.toCharArray();
		int i=Integer.parseInt(no);          ////// String to--> integer ///////
		i=i+50;
		System.out.println("string to integer = "+i);
		
		
		String l="10002";
		char[] v =l.toCharArray();             ////// Float to--> integer //////
		float g=Float.parseFloat(l);
		System.out.println("string to fl)oat = "+g);
		
	}

}
