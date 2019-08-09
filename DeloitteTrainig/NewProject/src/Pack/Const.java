package Pack;

public class Const {
	int i;
	
	public Const() {
		System.out.println("This is default constructor");
	}
	public Const(int i) {
		System.out.println("This is parametarized constructor");
		this.i = i;
		System.out.println("The value of i is " + i);
	}
	
	public static void main(String[] args) {
		Const c = new Const();
		Const c1 = new Const(3);
	}
}
