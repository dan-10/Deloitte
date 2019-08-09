package pack2;

public class Singleton {
	static Singleton object = new Singleton();
	static Singleton oj = new Singleton();
	 
	private Singleton() {
		System.out.println("Object created");
	}
	
	public static Singleton getObject() {
		return object;
	}
	
	public void display(int n) {
		System.out.println("this is new " + n);
	}
}
