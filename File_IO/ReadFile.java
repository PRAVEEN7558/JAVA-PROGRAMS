package File_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		ReaderInto("payilagam");

	}
	public static void ReaderInto(String string) throws IOException {

		FileReader ff = new FileReader("demo.txt");
		int a = ff.read();
		while (a != -1) {

			System.out.print((char) a);
			a = ff.read();
		}
		//FileWriter ab = new FileWriter("demo.txt");
	}
}
