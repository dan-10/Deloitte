package pack1;
interface in{
	public void num();
}

class imle implements in{
	public void num() {
		System.out.println("This is C");
	}
}
public class Intr {
public static void main(String[] args) {
	imle c = new imle();
	c.num();
}
}
