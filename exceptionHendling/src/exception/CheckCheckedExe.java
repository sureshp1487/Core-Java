 package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckCheckedExe {
	public static void main(String[] args) throws IOException {
		try {
		File f=new File("D:\\name.txt");

	     FileReader fr=new FileReader(f);
	     
//	     pending the task
//	     FileWriter doc=new FileWriter("D:\\Onesoft1.doc");
		
	     int text=0;
		while((text=fr.read())!=-1) {
			System.out.print((char)(text)+",");
		}}
		catch(IOException ee) {
			System.err.println("canot find the doc file");
		}
	}

}
