package File_IO;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Filewritter {

	public static void main(String[] args) throws IOException {

		WritingIntoFile("Payilagam");
	}

	public static void WritingIntoFile(String massage) throws IOException {

		FileWriter ab = new FileWriter("demo.txt");
		DataInputStream aa = new DataInputStream(System.in);
		System.out.println("Enter the message :");

		int a = aa.read();
		while ((char) a != '!') {
			if (a > 'a' && a < 'z' || a > 'A' && a < 'z') {
				ab.write(a);
			}
			a = aa.read();
		}
		// char c[]=massage.toCharArray();
		// ab.write(c);
		// ab.write(c,4,6);

		// ab.write(massage);
		ab.flush();
		ab.close();
	}
}
