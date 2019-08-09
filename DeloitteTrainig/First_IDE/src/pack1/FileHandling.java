package pack1;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File f = new File("C:\\Practicing\\Deloitte");
		File f1 = new File("C:\\Practicing\\Deloitte\\Java");
		File f4 = new File("C:\\Practicing\\Deloitte\\Java\\New");
		File f2 = new File("C:\\Practicing\\Deloitte\\Java\\j.txt");
		File f3 = new File("C:\\Practicing\\Deloitte\\Java\\t.txt");
		if(!f.exists()) {
			f.mkdir();
			f1.mkdir();
			
			try {
				f2.createNewFile();
				f3.createNewFile();
				f4.mkdir();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			File[] F = f1.listFiles();
			String[] s = f1.list();
			for(File temp: F) {
				System.out.println(temp.isDirectory()? temp.getName() + " is directory" : temp.getName() + " is file");
			}
			
			for(String st: s) {
				System.out.println(st);
			}
		}else {
			System.out.println("File does not exists");
		}
		
		}
}
