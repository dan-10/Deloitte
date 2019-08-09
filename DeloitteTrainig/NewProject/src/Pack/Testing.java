package Pack;

public class Testing {
	int i = 0;
	private Testing(){
		System.out.println("Just testing ");
	}
	Testing(int i){
		i = i;
		System.out.println("This is " + i);
	}
	public static void main(String args[]) {
		Testing t1 = new Testing(3);
		System.out.println("Print" + " " +t1.i);
	}
	
}
