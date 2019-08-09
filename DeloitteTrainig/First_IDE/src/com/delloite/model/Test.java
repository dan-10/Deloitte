package com.delloite.model;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog");
		String s =  "The quick brown fox jumps over the lazy dog";
		
		System.out.println(sb.charAt(12));
		System.out.println(sb.indexOf("is") == -1? "is not present ": "is present");
		System.out.println(sb.append("and killed it"));
		s = s + " and killed it";
		System.out.println(s.endsWith("dogs"));
		System.out.println(s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println(s.length());
		System.out.println(s.matches("The quick brown Fox jumps over the lazy Dog"));
		String ss = s.replaceFirst("The", "A");
		System.out.println(ss);
		String[] ar = s.split("jumps");
		//System.out.println(s.split("jumps"));
		for(String str:ar) {
			System.out.println(str);
		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("e"));
	}
}
