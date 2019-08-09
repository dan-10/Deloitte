package pack1;

import java.util.StringTokenizer;

public class Str {
/**
 * @param args
 */
	@Override
	protected void finalize() throws Throwable{
		System.out.println("This is finalize");
	}
	
public static void main(String[] args) {
	/*String name = "hello";
	name = "asdf";
	StringBuilder st = new StringBuilder("This is String Builder");
	System.out.println(st);
	//System.out.println(st.substring(4,1));
	name = name + "a";
	System.out.println(name);*/
	
	String n = new String("hello");
	String s = n;
	Str st = new Str();
	st = new Str();
	System.gc();
	System.out.println(s.length());
	String name = "Rama:Sita:Gita:Laxman";
	StringTokenizer tokenizer = new StringTokenizer(name,":");
	
	int x = tokenizer.countTokens();
	String arr[] = new String[x];
	
	int i = 0; 
	
	while(tokenizer.hasMoreTokens()) {
		arr[i] = tokenizer.nextToken();
		++i;
	}
	
	for(i = x-1; i >= 0 ; --i) {
		System.out.print(arr[i] + " ");
	}
}

}
