package pack1;

import java.util.LinkedList;
import java.util.List;

public class Coll {
public static void main(String[] args) {
	List<Integer> a = new LinkedList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	
	for(int i : a) {
		System.out.println(i);
	}
	
	
}
}
