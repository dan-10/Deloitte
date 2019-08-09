package Pack;

public class Count {
	static int i = 0;
	int j;
	Count(){
		++i;
	}
	static void p() {
		System.out.println("just same");
		i = 100;
	}
	public void print() {
		p();
		System.out.println("You have created " + i + " objects");
	}
	
	public static void main(String[] args) {
		Count c = new Count();
		c.print();
		Count c1 = new Count();
		c1.print();
		Count c2 = new Count();
		c2.print();
		Count c3 = new Count();
		c3.print();
		Count c4 = new Count();
		c4.print();
		Count.i = 555;
	}

}
