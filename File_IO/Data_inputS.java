package File_IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_inputS {
public static void main(String [] agg) throws IOException {
	File f=new File("/home/praveen/Documents/jio.txt");
	//f.createNewFile();
	
	FileOutputStream dd=new FileOutputStream (f); ///(f,true)-->write pannadhu thirumba add aagum..
	DataInputStream aa= new DataInputStream (System.in); ///(f)-->writ pannadha delete pannitu thrimba write pannum..
	
	char alpaa;
	System.out.println("enter the message :");
	while((alpaa=(char)aa.read())!='#') {      ///type--> 1 approach (or) type 2 
		dd.write(alpaa);
		
//	int a=aa.read();
//	while ((char)a!='!') {                   ///type--> 2
//		dd.write(a);
//		a=aa.read();
		
	}

	}
	
}

