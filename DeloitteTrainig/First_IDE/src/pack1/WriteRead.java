package pack1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteRead {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Practicing\\Deloitte\\Java\\t.txt");
		fw.write("This is a file ");
		fw.close();
		
		System.out.println("File Written");
		
		FileReader fr = new FileReader("C:\\Practicing\\Deloitte\\Java\\t.txt");
		int i = 0;
		while( (i = fr.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
