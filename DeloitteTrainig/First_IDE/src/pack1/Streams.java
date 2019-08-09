package pack1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Streams implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee e = new Employee();
		e.id = 3;
		e.name = "Name ";
		e.department = "CA";
		ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Serial.txt"))));
		stream.writeObject(e);
		stream.close();
		
		ObjectInputStream str = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Serial.txt"))));
		Employee emp = (Employee) str.readObject();
		str.close();
		System.out.println(emp);
	}
}
