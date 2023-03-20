package File_IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class One {

	public static void oneOutputStream() throws IOException {
		File aa=new File("/home/praveen/Documents/Har.txt");
		
		System.out.println( aa.exists());
		
		FileOutputStream bb = new FileOutputStream(aa);
		DataOutputStream cc = new DataOutputStream(bb);
		cc.writeBytes("Hai hello");
		//cc.writeDouble(234.324);
		//cc.writeBoolean(false);
		cc.writeBytes("  i am going to payilagam");
		cc.flush();
		cc.close();
		
		System.out.println("welcome");
	}
	
	
	
	public static void main(String[] args) throws IOException {
	
		oneOutputStream();
	}

	

}
