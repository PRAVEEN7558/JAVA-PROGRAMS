package File_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileio {

	public void Creatfile() {

		File oo = new File("/home/praveen/Documents/Demofile.txt");
		try {
			System.out.println(oo.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(oo.exists());
		System.out.println(oo.getName());
		System.out.println(oo.canRead());
		System.out.println(oo.canWrite());
		
		if (oo.canWrite()) {
			String msg="I love Payilagam";
			byte [] massage=msg.getBytes();
			
			
			try {
				FileOutputStream fs=new FileOutputStream(oo);
			  //	fs.write(45);
			
					fs.write(massage);
					//System.out.println(fs.);
				fs.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Fileio obj = new Fileio();
		obj.Creatfile();
	}

}
