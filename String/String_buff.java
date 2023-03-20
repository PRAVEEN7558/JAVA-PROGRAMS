package String;

public class String_buff {
	public static void main(String[] arg) {

		String s = "I Iove India";

		String[] words = s.split(" ");
		String ss ="";

		for (int i = words.length-1; i>=0; i--) {
			ss = ss + words[i]+" ";
			
		    }
		System.out.print(ss);
		
	}
}
