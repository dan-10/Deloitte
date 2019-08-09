package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.delloite.CustomerApp;
//import com.delloite.CustomerBillComparator;
import com.delloite.CustomerIdComparator;
import com.delloite.CustomerNameComparator;

public class Wrapper {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"c","x"));
		list.add(new Employee(2,"e","y"));
		list.add(new Employee(2,"a","y"));
		list.add(new Employee(2,"b","y"));
		
		//System.out.println(list);
		
		List<CustomerApp> c = new ArrayList<CustomerApp>();
		c.add(new CustomerApp(1,"ww",105));
		c.add(new CustomerApp(2,"aa",102));
		//System.out.println(c);
		
		Iterator<Employee> it = list.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			//System.out.println(emp);
			if(emp.id < 2)
				System.out.println(emp);
		}
		
		Iterator<CustomerApp> itr = c.iterator();
		while(itr.hasNext()) {
			CustomerApp ca = itr.next();
			if(ca.getCustomerId() > 1)
				System.out.println(ca);
		}
		
		List<String> st = new ArrayList<String>();
		st.add("hello");
		st.add("world");
		st.add("Apple");
		
		Collections.sort(st);
		Collections.sort(list);
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for Name, 2 for Id, 3 for BillNo :-");
		System.out.print("Enter your options : ");
		
		int opt = sc.nextInt();
		
		if(opt == 1)
		Collections.sort(c, new CustomerNameComparator());
		
		if(opt == 2)
		Collections.sort(c, new CustomerIdComparator());
		
		if(opt == 3)
		Collections.sort(c, new Comparator<CustomerApp>() {

			@Override
			public int compare(CustomerApp o1, CustomerApp o2) {
				if(o1.getBillNo() < o2.getBillNo())
					return -1;
				return 0;
			}
			
			
		});
		System.out.println(c);
	}
}
