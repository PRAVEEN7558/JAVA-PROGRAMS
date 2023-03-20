package String;

public class Duplicate_characters_string {

	public static void main(String[] args) {

		String ka = "going to class on monday";
		char a[] = ka.toCharArray();

		for (int i = 0; i < ka.length(); i++) {
			for (int j = i+1; j < ka.length(); j++) {
				if (a[i] == a[j]) {

					System.out.println("Duplicate character in string  ="+a[i]);
				}
			}
		}
//	String s="12c";
//	int i=Integer.parseInt(s);
//	System.out.println("hgfhgsxsajjx"+i );
}}
