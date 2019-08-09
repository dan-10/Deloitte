package pack1;

class Demo{
	int i = 10;
	
	public void display() {
		try {
			i = i/10;
		}catch(Exception e) {
			System.out.println("Some exception occured");
		}
	}
}

public class Excep {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
}
